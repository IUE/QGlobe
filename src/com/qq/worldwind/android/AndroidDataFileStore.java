package com.qq.worldwind.android;

import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.avlist.AVListImpl;
import gov.nasa.worldwind.cache.BasicDataFileStore;
import gov.nasa.worldwind.data.DDSRasterReader;
import gov.nasa.worldwind.data.DataRaster;
import gov.nasa.worldwind.data.ImageIORasterWriter;
import gov.nasa.worldwind.geom.Sector;
import gov.nasa.worldwind.util.Logging;
import gov.nasa.worldwind.util.WWIO;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.logging.Level;

import android.content.Context;
import android.os.Environment;


public class AndroidDataFileStore extends BasicDataFileStore {

	protected Context context;
	private InputStream configStream;
	
	public void setContext(Context context) {
		if (this.context == null) {
			this.context = context;
			super.initialize(configStream);
		} else {
			this.context = context;
		}
	}
	
	protected void initialize(java.io.InputStream xmlConfigStream){
		this.configStream = xmlConfigStream;
	}
	
	protected File getFile(String path) {
		if (context != null) {
			try {
				return new File(Environment.getExternalStorageDirectory(),path);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
		return new java.io.File(path);
	}
	
	protected void buildReadPaths(org.w3c.dom.Node dataFileStoreNode)
    {
        javax.xml.xpath.XPathFactory pathFactory = javax.xml.xpath.XPathFactory.newInstance();
        javax.xml.xpath.XPath pathFinder = pathFactory.newXPath();

        try
        {
            org.w3c.dom.NodeList locationNodes = (org.w3c.dom.NodeList) pathFinder.evaluate(
                "/dataFileStore/readLocations/location",
                dataFileStoreNode.getFirstChild(),
                javax.xml.xpath.XPathConstants.NODESET);
            for (int i = 0; i < locationNodes.getLength(); i++)
            {
                org.w3c.dom.Node location = locationNodes.item(i);
                String prop = pathFinder.evaluate("@property", location);
                String wwDir = pathFinder.evaluate("@wwDir", location);
                String append = pathFinder.evaluate("@append", location);
                String isInstall = pathFinder.evaluate("@isInstall", location);
                String isMarkWhenUsed = pathFinder.evaluate("@isMarkWhenUsed", location);

                String path = buildLocationPath(prop, append, wwDir);
                if (path == null)
                {
                    Logging.logger().log(Level.WARNING, "FileStore.LocationInvalid",
                        prop != null ? prop : Logging.getMessage("generic.Unknown"));
                    continue;
                }

                StoreLocation oldStore = this.storeLocationFor(path);
                if (oldStore != null) // filter out duplicates
                    continue;

                // Even paths that don't exist or are otherwise problematic are added to the list because they may
                // become readable during the session. E.g., removable media. So add them to the search list.

                java.io.File pathFile = getFile(wwDir);
                if (pathFile.exists() && !pathFile.isDirectory())
                {
                    Logging.logger().log(Level.WARNING, "FileStore.LocationIsFile", pathFile.getPath());
                }

                boolean pathIsInstall = isInstall != null && (isInstall.contains("t") || isInstall.contains("T"));
                StoreLocation newStore = new StoreLocation(pathFile, pathIsInstall);

                // If the input parameter "markWhenUsed" is null or empty, then the StoreLocation should keep its
                // default value. Otherwise the store location value is set to true when the input parameter contains
                // "t", and is set to false otherwise.
                if (isMarkWhenUsed != null && isMarkWhenUsed.length() > 0)
                    newStore.setMarkWhenUsed(isMarkWhenUsed.toLowerCase().contains("t"));

                this.readLocations.add(newStore);
            }
        }
        catch (javax.xml.xpath.XPathExpressionException e)
        {
            String message = Logging.getMessage("FileStore.ExceptionReadingConfigurationFile");
            Logging.logger().severe(message);
            throw new IllegalStateException(message, e);
        }
    }

    @SuppressWarnings({"ResultOfMethodCallIgnored"})
    protected void buildWritePaths(org.w3c.dom.Node dataFileCacheNode)
    {
        javax.xml.xpath.XPathFactory pathFactory = javax.xml.xpath.XPathFactory.newInstance();
        javax.xml.xpath.XPath pathFinder = pathFactory.newXPath();

        try
        {
            org.w3c.dom.NodeList locationNodes = (org.w3c.dom.NodeList) pathFinder.evaluate(
                "/dataFileStore/writeLocations/location",
                dataFileCacheNode.getFirstChild(),
                javax.xml.xpath.XPathConstants.NODESET);
            for (int i = 0; i < locationNodes.getLength(); i++)
            {
                org.w3c.dom.Node location = locationNodes.item(i);
                String prop = pathFinder.evaluate("@property", location);
                String wwDir = pathFinder.evaluate("@wwDir", location);
                String append = pathFinder.evaluate("@append", location);
                String create = pathFinder.evaluate("@create", location);

                String path = buildLocationPath(prop, append, wwDir);
                if (path == null)
                {
                    Logging.logger().log(Level.WARNING, "FileStore.LocationInvalid",
                        prop != null ? prop : Logging.getMessage("generic.Unknown"));
                    continue;
                }

                Logging.logger().log(Level.FINER, "FileStore.AttemptingWriteDir", path);
                java.io.File pathFile = getFile(wwDir);
                if (!pathFile.exists() && create != null && (create.contains("t") || create.contains("T")))
                {
                    Logging.logger().log(Level.FINER, "FileStore.MakingDirsFor", path);
                    pathFile.mkdirs();
                }

                if (pathFile.isDirectory() && pathFile.canWrite() && pathFile.canRead())
                {
                    Logging.logger().log(Level.FINER, "FileStore.WriteLocationSuccessful", path);
                    this.writeLocation = new StoreLocation(pathFile);

                    // Remove the writable location from search path if it already exists.
                    StoreLocation oldLocation = this.storeLocationFor(path);
                    if (oldLocation != null)
                        this.readLocations.remove(oldLocation);

                    // Writable location is always first in search path.
                    this.readLocations.add(0, this.writeLocation);

                    break; // only need one
                }
            }
        }
        catch (javax.xml.xpath.XPathExpressionException e)
        {
            String message = Logging.getMessage("FileStore.ExceptionReadingConfigurationFile");
            Logging.logger().severe(message);
            throw new IllegalStateException(message, e);
        }
    }
    
    public void addLocation(int index, String newPath, boolean isInstall)
    {
        if (newPath == null || newPath.length() == 0)
        {
            String message = Logging.getMessage("nullValue.FileStorePathIsNull");
            Logging.logger().severe(message);
            throw new IllegalArgumentException(message);
        }

        if (index < 0)
        {
            String message = Logging.getMessage("generic.InvalidIndex", index);
            Logging.logger().fine(message);
            throw new IllegalArgumentException(message);
        }

        StoreLocation oldLocation = this.storeLocationFor(newPath);
        if (oldLocation != null)
            this.readLocations.remove(oldLocation);

        if (index > 0 && index > this.readLocations.size())
            index = this.readLocations.size();
        java.io.File newFile = getFile(newPath);
        StoreLocation newLocation = new StoreLocation(newFile, isInstall);
        this.readLocations.add(index, newLocation);
    }
    
    protected synchronized URL getLocalFileUrl(String address, URL retrievalUrl, boolean searchLocalCache)
    {
		URL retval = super.getLocalFileUrl(address, retrievalUrl, searchLocalCache);
		if (retval != null) {
			String urlPath = retval.getPath();
			if (".dds".equalsIgnoreCase(urlPath.substring(urlPath.length() - 4))) {
				// convert dds to png
				String pngPath = WWIO.replaceIllegalFileNameCharacters(retval.getHost()) + File.separator + retval.getPath() + ".png";
				if (!containsFile(pngPath)) {
					if ("jar".equals(retval.getProtocol())){
						//extract file from jar
						try {
							ByteBuffer urlData = WWIO.readURLContentToBuffer(retval);
							String extractPath = WWIO.replaceIllegalFileNameCharacters(retval.getHost()) + File.separator + retval.getPath();
							File extractFile = newFile(extractPath);
							WWIO.saveBuffer(urlData, extractFile);
							retval = extractFile.toURL();
						} catch (Throwable e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					File pngFile = newFile(pngPath);
					// do conversion
					try {
						DDSRasterReader reader = new DDSRasterReader();
						ImageIORasterWriter writer = new ImageIORasterWriter();
						AVListImpl params = new AVListImpl();
						params.setValue(AVKey.SECTOR, Sector.FULL_SPHERE);
						DataRaster[] rasters = reader.read(retval, params);
						if (rasters.length > 0) {
							writer.write(rasters[0], ".png", pngFile);
						}
						retval = pngFile.toURL();
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					retval = findFile(pngPath, false);
				}
			}
		}
		return retval;
    }
}
