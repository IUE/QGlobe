/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */
package gov.nasa.worldwind.render;

import gov.nasa.worldwind.Exportable;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.geom.*;
import gov.nasa.worldwind.globes.Globe;
import gov.nasa.worldwind.ogc.kml.KMLConstants;
import gov.nasa.worldwind.ogc.kml.impl.KMLExportUtil;
import gov.nasa.worldwind.util.*;

import com.qq.java.util.*;
import com.qq.javax.xml.stream.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dcollins
 * @version $Id: SurfaceSector.java 1 2011-07-16 23:22:47Z dcollins $
 */
public class SurfaceSector extends AbstractSurfaceShape implements Exportable
{
    protected Sector sector = Sector.EMPTY_SECTOR;

    /** Constructs a new surface sector with the default attributes and the {@link gov.nasa.worldwind.geom.Sector#EMPTY_SECTOR}. */
    public SurfaceSector()
    {
    }

    /**
     * Constructs a new surface sector with the specified normal (as opposed to highlight) attributes and the {@link
     * gov.nasa.worldwind.geom.Sector#EMPTY_SECTOR}. Modifying the attribute reference after calling this constructor
     * causes this shape's appearance to change accordingly.
     *
     * @param normalAttrs the normal attributes. May be null, in which case default attributes are used.
     */
    public SurfaceSector(ShapeAttributes normalAttrs)
    {
        super(normalAttrs);
    }

    /**
     * Constructs a new surface sector with the specified sector.
     *
     * @param sector the shape's sector.
     *
     * @throws IllegalArgumentException if the sector is null.
     */
    public SurfaceSector(Sector sector)
    {
        if (sector == null)
        {
            String message = Logging.getMessage("nullValue.SectorIsNull");
            Logging.logger().severe(message);
            throw new IllegalArgumentException(message);
        }

        this.sector = sector;
    }

    /**
     * Constructs a new surface sector with the specified normal (as opposed to highlight) attributes and the specified
     * sector. Modifying the attribute reference after calling this constructor causes this shape's appearance to change
     * accordingly.
     *
     * @param normalAttrs the normal attributes. May be null, in which case default attributes are used.
     * @param sector      the shape's sector.
     *
     * @throws IllegalArgumentException if the sector is null.
     */
    public SurfaceSector(ShapeAttributes normalAttrs, Sector sector)
    {
        super(normalAttrs);

        if (sector == null)
        {
            String message = Logging.getMessage("nullValue.SectorIsNull");
            Logging.logger().severe(message);
            throw new IllegalArgumentException(message);
        }

        this.sector = sector;
    }

    public Sector getSector()
    {
        return this.sector;
    }

    public void setSector(Sector sector)
    {
        if (sector == null)
        {
            String message = Logging.getMessage("nullValue.SectorIsNull");
            Logging.logger().severe(message);
            throw new IllegalArgumentException(message);
        }

        this.sector = sector;
        this.onShapeChanged();
    }

    public Position getReferencePosition()
    {
        return new Position(this.sector.getCentroid(), 0);
    }

    public Iterable<? extends LatLon> getLocations(Globe globe)
    {
        if (this.sector.equals(Sector.EMPTY_SECTOR))
            return null;

        LatLon[] locations = new LatLon[5];
        System.arraycopy(this.sector.getCorners(), 0, locations, 0, 4);
        locations[4] = locations[0];

        return Arrays.asList(locations);
    }

    protected List<List<LatLon>> createGeometry(Globe globe, SurfaceTileDrawContext sdc)
    {
        Iterable<? extends LatLon> originalLocations = this.getLocations(globe);
        if (originalLocations == null)
            return null;

        ArrayList<LatLon> drawLocations = new ArrayList<LatLon>();
        double edgeIntervalsPerDegree = this.computeEdgeIntervalsPerDegree(sdc);
        this.generateIntermediateLocations(originalLocations, edgeIntervalsPerDegree, false, drawLocations);

        ArrayList<List<LatLon>> geom = new ArrayList<List<LatLon>>();
        geom.add(drawLocations);

        return geom;
    }

    protected void doMoveTo(Position oldReferencePosition, Position newReferencePosition)
    {
        LatLon[] locations = new LatLon[]
            {
                new LatLon(this.sector.getMinLatitude(), this.sector.getMinLongitude()),
                new LatLon(this.sector.getMaxLatitude(), this.sector.getMaxLongitude())
            };

        LatLon[] newLocations = new LatLon[2];
        for (int i = 0; i < 2; i++)
        {
            Angle heading = LatLon.greatCircleAzimuth(oldReferencePosition, locations[i]);
            Angle pathLength = LatLon.greatCircleDistance(oldReferencePosition, locations[i]);
            newLocations[i] = LatLon.greatCircleEndPosition(newReferencePosition, heading, pathLength);
        }

        this.setSector(new Sector(
            newLocations[0].getLatitude(), newLocations[1].getLatitude(),
            newLocations[0].getLongitude(), newLocations[1].getLongitude()));
    }

    //**************************************************************//
    //******************** Restorable State  ***********************//
    //**************************************************************//

    protected void doGetRestorableState(RestorableSupport rs, RestorableSupport.StateObject context)
    {
        super.doGetRestorableState(rs, context);

        rs.addStateValueAsSector(context, "sector", this.getSector());
    }

    protected void doRestoreState(RestorableSupport rs, RestorableSupport.StateObject context)
    {
        super.doRestoreState(rs, context);

        Sector sector = rs.getStateValueAsSector(context, "sector");
        if (sector != null)
            this.setSector(sector);
    }

    protected void legacyRestoreState(RestorableSupport rs, RestorableSupport.StateObject context)
    {
        super.legacyRestoreState(rs, context);

        // Previous versions of SurfaceSector would have stored the locations produced by treating the sector as a list
        // of polygon locations. To restore an shape saved from the previous version, we compute the bounding sector of
        // those locations to define a sector.
        List<LatLon> locations = rs.getStateValueAsLatLonList(context, "locations");
        if (locations != null)
            this.setSector(Sector.boundingSector(locations));
    }

    /** {@inheritDoc} */
    public String isExportFormatSupported(String format)
    {
        if (KMLConstants.KML_MIME_TYPE.equalsIgnoreCase(format))
            return Exportable.FORMAT_SUPPORTED;
        else
            return Exportable.FORMAT_NOT_SUPPORTED;
    }

    /**
     * Export the Surface Sector. The {@code output} object will receive the exported data. The type of this object
     * depends on the export format. The formats and object types supported by this class are:
     * <p/>
     * <pre>
     * Format                                         Supported output object types
     * ================================================================================
     * KML (application/vnd.google-earth.kml+xml)     java.io.Writer
     *                                                java.io.OutputStream
     *                                                javax.xml.stream.XMLStreamWriter
     * </pre>
     *
     * @param mimeType MIME type of desired export format.
     * @param output   An object that will receive the exported data. The type of this object depends on the export
     *                 format (see above).
     *
     * @throws java.io.IOException If an exception occurs writing to the output object.
     */
    public void export(String mimeType, Object output) throws IOException
    {
        if (mimeType == null)
        {
            String message = Logging.getMessage("nullValue.Format");
            Logging.logger().severe(message);
            throw new IllegalArgumentException(message);
        }

        if (output == null)
        {
            String message = Logging.getMessage("nullValue.OutputBufferIsNull");
            Logging.logger().severe(message);
            throw new IllegalArgumentException(message);
        }

        if (KMLConstants.KML_MIME_TYPE.equalsIgnoreCase(mimeType))
        {
            try
            {
                exportAsKML(output);
            }
            catch (XMLStreamException e)
            {
                Logging.logger().throwing(getClass().getName(), "export", e);
                throw new IOException(e);
            }
        }
        else
        {
            String message = Logging.getMessage("Export.UnsupportedFormat", mimeType);
            Logging.logger().warning(message);
            throw new UnsupportedOperationException(message);
        }
    }

    /**
     * Export the sector to KML as a {@code <Placemark>} element. The {@code output} object will receive the data. This
     * object must be one of: java.io.Writer java.io.OutputStream javax.xml.stream.XMLStreamWriter
     *
     * @param output Object to receive the generated KML.
     *
     * @throws XMLStreamException If an exception occurs while writing the KML
     * @throws IOException        if an exception occurs while exporting the data.
     * @see #export(String, Object)
     */
    protected void exportAsKML(Object output) throws IOException, XMLStreamException
    {
        XMLStreamWriter xmlWriter = null;
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        boolean closeWriterWhenFinished = true;

        if (output instanceof XMLStreamWriter)
        {
            xmlWriter = (XMLStreamWriter) output;
            closeWriterWhenFinished = false;
        }
        else if (output instanceof Writer)
        {
            xmlWriter = factory.createXMLStreamWriter((Writer) output);
        }
        else if (output instanceof OutputStream)
        {
            xmlWriter = factory.createXMLStreamWriter((OutputStream) output);
        }

        if (xmlWriter == null)
        {
            String message = Logging.getMessage("Export.UnsupportedOutputObject");
            Logging.logger().warning(message);
            throw new IllegalArgumentException(message);
        }

        xmlWriter.writeStartElement("Placemark");

        String property = (String) getValue(AVKey.DISPLAY_NAME);
        if (property != null)
        {
            xmlWriter.writeStartElement("name");
            xmlWriter.writeCharacters(property);
            xmlWriter.writeEndElement();
        }

        xmlWriter.writeStartElement("visibility");
        xmlWriter.writeCharacters(KMLExportUtil.kmlBoolean(this.isVisible()));
        xmlWriter.writeEndElement();

        String shortDescription = (String) getValue(AVKey.SHORT_DESCRIPTION);
        if (shortDescription != null)
        {
            xmlWriter.writeStartElement("Snippet");
            xmlWriter.writeCharacters(shortDescription);
            xmlWriter.writeEndElement();
        }

        String description = (String) getValue(AVKey.BALLOON_TEXT);
        if (description != null)
        {
            xmlWriter.writeStartElement("description");
            xmlWriter.writeCharacters(description);
            xmlWriter.writeEndElement();
        }

        final ShapeAttributes normalAttributes = this.getAttributes();
        final ShapeAttributes highlightAttributes = this.getHighlightAttributes();

        // Write style map
        if (normalAttributes != null || highlightAttributes != null)
        {
            xmlWriter.writeStartElement("StyleMap");
            KMLExportUtil.exportAttributesAsKML(xmlWriter, KMLConstants.NORMAL, normalAttributes);
            KMLExportUtil.exportAttributesAsKML(xmlWriter, KMLConstants.HIGHLIGHT, highlightAttributes);
            xmlWriter.writeEndElement(); // StyleMap
        }

        // Write geometry
        xmlWriter.writeStartElement("Polygon");

        xmlWriter.writeStartElement("extrude");
        xmlWriter.writeCharacters("0");
        xmlWriter.writeEndElement();

        xmlWriter.writeStartElement("altitudeMode");
        xmlWriter.writeCharacters("clampToGround");
        xmlWriter.writeEndElement();

        Sector sector = this.getSector();
        LatLon[] corners = sector.getCorners();

        xmlWriter.writeStartElement("outerBoundaryIs");
        KMLExportUtil.exportBoundaryAsLinearRing(xmlWriter, Arrays.asList(corners), null);
        xmlWriter.writeEndElement(); // outerBoundaryIs

        xmlWriter.writeEndElement(); // Polygon
        xmlWriter.writeEndElement(); // Placemark

        xmlWriter.flush();
        if (closeWriterWhenFinished)
            xmlWriter.close();
    }
}
