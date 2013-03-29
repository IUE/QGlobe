/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */
package gov.nasa.worldwind.layers;

import gov.nasa.worldwind.Configuration;
import gov.nasa.worldwind.View;
import gov.nasa.worldwind.WorldWindow;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.exception.WWRuntimeException;
import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.LatLon;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.geom.Vec4;
import gov.nasa.worldwind.layers.AbstractLayer;
import gov.nasa.worldwind.pick.PickSupport;
import gov.nasa.worldwind.render.DrawContext;
import gov.nasa.worldwind.render.OrderedRenderable;
import gov.nasa.worldwind.util.Logging;
import gov.nasa.worldwind.util.OGLStackHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ShortBuffer;
import java.util.ArrayList;

import javax.media.opengl.GL;

import com.qq.java.awt.Color;
import com.qq.java.awt.Dimension;
import com.qq.java.awt.Point;
import com.qq.java.awt.Rectangle;
import com.sun.opengl.util.BufferUtil;
import com.sun.opengl.util.texture.Texture;
import com.sun.opengl.util.texture.TextureCoords;
import com.sun.opengl.util.texture.TextureIO;

/**
 * Displays a world map overlay with a current-position crosshair in a screen corner.
 * <p/>
 * A {@link gov.nasa.worldwind.examples.ClickAndGoSelectListener} can be used in conjunction with this layer to move the
 * view to a selected location when that location is clicked within the layer's map. Specify
 * <code>WorldMapLayer.class</code> when constructing the <code>ClickAndGoSelectListener</code>.
 * <p/>
 * Note: This layer may not be shared among multiple {@link WorldWindow}s.
 *
 * @author Patrick Murris
 * @version $Id: WorldMapLayer.java 1 2011-07-16 23:22:47Z dcollins $
 */
public class WorldMapLayer extends AbstractLayer
{
    protected String iconFilePath;
    protected double toViewportScale = 0.2;
    protected double iconScale = 0.5;
    protected int borderWidth = 20;
    protected String position = AVKey.NORTHWEST;
    protected String resizeBehavior = AVKey.RESIZE_SHRINK_ONLY;
    protected int iconWidth;
    protected int iconHeight;
    protected Vec4 locationCenter = null;
    protected Vec4 locationOffset = null;
    protected Color color = Color.white;
    protected Color backColor = new Color(0f, 0f, 0f, 0.4f);
    protected boolean showFootprint = true;
    protected ArrayList<? extends LatLon> footPrintPositions;
    protected PickSupport pickSupport = new PickSupport();

    // Draw it as ordered with an eye distance of 0 so that it shows up in front of most other things.
    protected OrderedIcon orderedImage = new OrderedIcon();

    protected class OrderedIcon implements OrderedRenderable
    {
        public double getDistanceFromEye()
        {
            return 0;
        }

        public void pick(DrawContext dc, Point pickPoint)
        {
            WorldMapLayer.this.drawIcon(dc);
        }

        public void render(DrawContext dc)
        {
            WorldMapLayer.this.drawIcon(dc);
        }
    }

    /** Displays a world map overlay with a current position crosshair in a screen corner */
    public WorldMapLayer()
    {
        this.setOpacity(0.6);
        this.setIconFilePath(Configuration.getStringValue(AVKey.WORLD_MAP_IMAGE_PATH));
    }

    /**
     * Displays a world map overlay with a current position crosshair in a screen corner
     *
     * @param iconFilePath the world map image path and filename
     */
    public WorldMapLayer(String iconFilePath)
    {
        this.setOpacity(0.6);
        this.setIconFilePath(iconFilePath);
    }

    // Public properties

    /**
     * Returns the layer's current icon file path.
     *
     * @return the icon file path
     */
    public String getIconFilePath()
    {
        return iconFilePath;
    }

    /**
     * Sets the world map icon's image location. The layer first searches for this location in the current Java
     * classpath. If not found then the specified path is assumed to refer to the local file system. found there then
     * the
     *
     * @param iconFilePath the path to the icon's image file
     */
    public void setIconFilePath(String iconFilePath)
    {
        if (iconFilePath == null || iconFilePath.length() == 0)
        {
            String message = Logging.getMessage("nullValue.FilePathIsNull");
            Logging.logger().severe(message);
            throw new IllegalArgumentException(message);
        }
        this.iconFilePath = iconFilePath;
    }

    /**
     * Returns the layer's world map-to-viewport scale factor.
     *
     * @return the world map-to-viewport scale factor
     */
    public double getToViewportScale()
    {
        return toViewportScale;
    }

    /**
     * Sets the scale factor applied to the viewport size to determine the displayed size of the world map icon. This
     * scale factor is used only when the layer's resize behavior is AVKey.RESIZE_STRETCH or AVKey.RESIZE_SHRINK_ONLY.
     * The icon's width is adjusted to occupy the proportion of the viewport's width indicated by this factor. The
     * icon's height is adjusted to maintain the world map image's native aspect ratio.
     *
     * @param toViewportScale the world map to viewport scale factor
     */
    public void setToViewportScale(double toViewportScale)
    {
        this.toViewportScale = toViewportScale;
    }

    /**
     * Returns the icon scale factor. See {@link #setIconScale(double)} for a description of the scale factor.
     *
     * @return the current icon scale
     */
    public double getIconScale()
    {
        return iconScale;
    }

    /**
     * Sets the scale factor defining the displayed size of the world map icon relative to the icon's width and height
     * in its image file. Values greater than 1 magify the image, values less than one minify it. If the layer's resize
     * behavior is other than AVKey.RESIZE_KEEP_FIXED_SIZE, the icon's displayed sized is further affected by the value
     * specified by {@link #setToViewportScale(double)} and the current viewport size.
     *
     * @param iconScale the icon scale factor
     */
    public void setIconScale(double iconScale)
    {
        this.iconScale = iconScale;
    }

    /**
     * Returns the world map icon's resize behavior.
     *
     * @return the icon's resize behavior
     */
    public String getResizeBehavior()
    {
        return resizeBehavior;
    }

    /**
     * Sets the behavior the layer uses to size the world map icon when the viewport size changes, typically when the
     * World Wind window is resized. If the value is AVKey.RESIZE_KEEP_FIXED_SIZE, the icon size is kept to the size
     * specified in its image file scaled by the layer's current icon scale. If the value is AVKey.RESIZE_STRETCH, the
     * icon is resized to have a constant size relative to the current viewport size. If the viewport shrinks the icon
     * size decreases; if it expands then the icon file enlarges. The relative size is determined by the current world
     * map-to-viewport scale and by the icon's image file size scaled by the current icon scale. If the value is
     * AVKey.RESIZE_SHRINK_ONLY (the default), icon sizing behaves as for AVKey.RESIZE_STRETCH but the icon will not
     * grow larger than the size specified in its image file scaled by the current icon scale.
     *
     * @param resizeBehavior the desired resize behavior
     */
    public void setResizeBehavior(String resizeBehavior)
    {
        this.resizeBehavior = resizeBehavior;
    }

    public int getBorderWidth()
    {
        return borderWidth;
    }

    /**
     * Sets the world map icon offset from the viewport border.
     *
     * @param borderWidth the number of pixels to offset the world map icon from the borders indicated by {@link
     *                    #setPosition(String)}.
     */
    public void setBorderWidth(int borderWidth)
    {
        this.borderWidth = borderWidth;
    }

    /**
     * Returns the current relative world map icon position.
     *
     * @return the current world map position
     */
    public String getPosition()
    {
        return position;
    }

    /**
     * Sets the relative viewport location to display the world map icon. Can be one of AVKey.NORTHEAST, AVKey.NORTHWEST
     * (the default), AVKey.SOUTHEAST, or SOUTHWEST. These indicate the corner of the viewport to place the icon.
     *
     * @param position the desired world map position
     */
    public void setPosition(String position)
    {
        if (position == null)
        {
            String message = Logging.getMessage("nullValue.PositionIsNull");
            Logging.logger().severe(message);
            throw new IllegalArgumentException(message);
        }
        this.position = position;
    }

    /**
     * Returns the current worldmap image location.
     *
     * @return the current location center. May be null.
     */
    public Vec4 getLocationCenter()
    {
        return locationCenter;
    }

    /**
     * Specifies the screen location of the worldmap image, relative to the image's center. May be null. If this value
     * is non-null, it overrides the position specified by #setPosition. The location is specified in pixels. The origin
     * is the window's lower left corner. Positive X values are to the right of the origin, positive Y values are
     * upwards from the origin. The final image location will be affected by the currently specified location offset if
     * a non-null location offset has been specified (see #setLocationOffset).
     *
     * @param locationCenter the location center. May be null.
     *
     * @see #locationCenter the screen location at which to place the map.
     */
    public void setLocationCenter(Vec4 locationCenter)
    {
        this.locationCenter = locationCenter;
    }

    /**
     * Returns the current location offset. See #setLocationOffset for a description of the offset and its values.
     *
     * @return the location offset. Will be null if no offset has been specified.
     */
    public Vec4 getLocationOffset()
    {
        return locationOffset;
    }

    /**
     * Specifies a placement offset from the worldmap's position on the screen.
     *
     * @param locationOffset the number of pixels to shift the worldmap image from its specified screen position. A
     *                       positive X value shifts the image to the right. A positive Y value shifts the image up. If
     *                       null, no offset is applied. The default offset is null.
     *
     * @see #setLocationCenter(gov.nasa.worldwind.geom.Vec4)
     * @see #setPosition(String)
     */
    public void setLocationOffset(Vec4 locationOffset)
    {
        this.locationOffset = locationOffset;
    }

    public Color getBackgrounColor()
    {
        return this.backColor;
    }

    public void setBackgroundColor(Color color)
    {
        if (color == null)
        {
            String msg = Logging.getMessage("nullValue.ColorIsNull");
            Logging.logger().severe(msg);
            throw new IllegalArgumentException(msg);
        }
        this.backColor = color;
    }

    public boolean getShowFootprint()
    {
        return this.showFootprint;
    }

    public void setShowFootprint(boolean state)
    {
        this.showFootprint = state;
    }

    /**
     * Get the current view footprint position list. May be null if no footprint is displayed or none has been
     * computed.
     *
     * @return the current view footprint position list - may be null.
     */
    public ArrayList<? extends LatLon> getFootPrintPositions()
    {
        return this.footPrintPositions;
    }

    @Override
    public void doRender(DrawContext dc)
    {
        // Delegate drawing to the ordered renderable list
        dc.addOrderedRenderable(this.orderedImage);
    }

    @Override
    public void doPick(DrawContext dc, Point pickPoint)
    {
        // Delegate drawing to the ordered renderable list
        dc.addOrderedRenderable(this.orderedImage);
    }

    protected void drawIcon(DrawContext dc)
    {
        if (this.getIconFilePath() == null)
            return;

        GL gl = dc.getGL();
        OGLStackHandler ogsh = new OGLStackHandler();

        try
        {
        	gl.glEnableClientState(GL.GL_VERTEX_ARRAY);
            // Initialize texture if necessary
            Texture iconTexture = dc.getTextureCache().getTexture(this.getIconFilePath());
            if (iconTexture == null)
            {
                this.initializeTexture(dc);
                iconTexture = dc.getTextureCache().getTexture(this.getIconFilePath());
                if (iconTexture == null)
                {
                    String msg = Logging.getMessage("generic.ImageReadFailed");
                    Logging.logger().finer(msg);
                    return;
                }
            }
            gl.glDisable(GL.GL_DEPTH_TEST);

            double width = this.getScaledIconWidth();
            double height = this.getScaledIconHeight();

            // Load a parallel projection with xy dimensions (viewportWidth, viewportHeight)
            // into the GL projection matrix.
            com.qq.java.awt.Rectangle viewport = dc.getView().getViewport();
            ogsh.pushProjectionIdentity(gl);
            double maxwh = width > height ? width : height;
            gl.glOrtho(0d, viewport.width, 0d, viewport.height, -0.6 * maxwh, 0.6 * maxwh);

            // Translate and scale
            ogsh.pushModelviewIdentity(gl);
            double scale = this.computeScale(viewport);
            Vec4 locationSW = this.computeLocation(viewport, scale);
            gl.glTranslatef((float)locationSW.x(), (float)locationSW.y(), (float)locationSW.z());
            // Scale to 0..1 space
            gl.glScalef((float)scale, (float)scale, 1);
            gl.glScalef((float)width, (float)height, 1f);

            if (!dc.isPickingMode())
            {
                gl.glEnable(GL.GL_BLEND);
                gl.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
                
                // Draw background color behind the map
                gl.glColor4ub((byte) this.backColor.getRed(), (byte) this.backColor.getGreen(),
                    (byte) this.backColor.getBlue(), (byte) (this.backColor.getAlpha() * this.getOpacity()));
                dc.drawUnitQuad();

                // Draw world map icon
                gl.glColor4f(1f, 1f, 1f, (float)this.getOpacity());
                gl.glEnable(GL.GL_TEXTURE_2D);
                iconTexture.bind();

                TextureCoords texCoords = iconTexture.getImageTexCoords();
                gl.glEnableClientState(GL.GL_TEXTURE_COORD_ARRAY);
                dc.drawUnitQuad(texCoords);
                gl.glDisableClientState(GL.GL_TEXTURE_COORD_ARRAY);
                gl.glBindTexture(GL.GL_TEXTURE_2D, 0);
                gl.glDisable(GL.GL_TEXTURE_2D);

                // Draw crosshair for current location
                gl.glLoadIdentity();
                gl.glTranslatef((float)locationSW.x(), (float)locationSW.y(), (float)locationSW.z());
                // Scale to width x height space
                gl.glScalef((float)scale, (float)scale, 1);
                // Set color
                float[] colorRGB = this.color.getRGBColorComponents(null);
                gl.glColor4f(colorRGB[0], colorRGB[1], colorRGB[2], (float)this.getOpacity());

                // Draw crosshair
                Position groundPos = this.computeGroundPosition(dc, dc.getView());
                if (groundPos != null)
                {
                	short x = (short) (width * (groundPos.getLongitude().degrees + 180) / 360);
                	short y = (short) (height * (groundPos.getLatitude().degrees + 90) / 180);
                	short w = 10; // cross branch length
                    // Draw
                    short[] verts = new short[6];
                    verts[0]=(short) (x - w);
                    verts[1]=y;
                    verts[2]=0;
                    verts[3]=(short) (x + w + 1);
                    verts[4]=y;
                    verts[5]=0;
                    ShortBuffer vertexBuf = BufferUtil.newShortBuffer(verts.length);
                    vertexBuf.put(verts);
                    vertexBuf.rewind();
                    gl.glVertexPointer(3, GL.GL_SHORT, 0, vertexBuf);
                    gl.glDrawArrays(GL.GL_LINE_STRIP, 0, 2);
                    
//                    gl.glBegin(GL.GL_LINE_STRIP);
//                    gl.glVertex3d(x - w, y, 0);
//                    gl.glVertex3d(x + w + 1, y, 0);
//                    gl.glEnd();
                    verts[0]=x;
                    verts[1]=(short) (y - w);
                    verts[2]=0;
                    verts[3]=x;
                    verts[4]=(short) (y + w + 1);
                    verts[5]=0;
                    vertexBuf = BufferUtil.newShortBuffer(verts.length);
                    vertexBuf.put(verts);
                    vertexBuf.rewind();
                    gl.glVertexPointer(3, GL.GL_SHORT, 0, vertexBuf);
                    gl.glDrawArrays(GL.GL_LINE_STRIP, 0, 2);
//                    gl.glBegin(GL.GL_LINE_STRIP);
//                    gl.glVertex3d(x, y - w, 0);
//                    gl.glVertex3d(x, y + w + 1, 0);
//                    gl.glEnd();
                }

                // Draw view footprint in map icon space
                if (this.showFootprint)
                {
                    this.footPrintPositions = this.computeViewFootPrint(dc, 32);
                    if (this.footPrintPositions != null)
                    {
                    	ArrayList<ArrayList<Short>> lineStrips = new ArrayList<ArrayList<Short>>();
                    	ArrayList<Short> curLineStrip =  new ArrayList<Short>();
                    	lineStrips.add(curLineStrip);
//                        gl.glBegin(GL.GL_LINE_STRIP);
                        LatLon p1 = this.footPrintPositions.get(0);
                        for (LatLon p2 : this.footPrintPositions)
                        {
                            short x = (short) (width * (p2.getLongitude().degrees + 180) / 360);
                            short y = (short) (height * (p2.getLatitude().degrees + 90) / 180);
                            // Draw
                            if (LatLon.locationsCrossDateline(p1, p2))
                            {
                                int y1 = (int) (height * (p1.getLatitude().degrees + 90) / 180);
                                curLineStrip.add((short) (x < width / 2 ? width : 0));
                                curLineStrip.add((short) ((y1 + y) / 2));
                                curLineStrip.add((short)0);
//                                gl.glVertex3d(x < width / 2 ? width : 0, (y1 + y) / 2, 0);
//                                gl.glEnd();
//                                gl.glBegin(GL.GL_LINE_STRIP);
                                curLineStrip = new ArrayList<Short>();
                                lineStrips.add(curLineStrip);
                                curLineStrip.add((short) (x < width / 2 ? 0 : width));
                                curLineStrip.add((short) ((y1 + y) / 2));
                                curLineStrip.add((short) 0);
//                                gl.glVertex3d(x < width / 2 ? 0 : width, (y1 + y) / 2, 0);
                            }
                        	curLineStrip.add(x);
                        	curLineStrip.add(y);
                        	curLineStrip.add((short)0);
                            //gl.glVertex3d(x, y, 0);
                            p1 = p2;
                        }
						for (ArrayList<Short> lineStrip : lineStrips) {
							short[] verts = buildShortArray(lineStrip);
							ShortBuffer vertexBuf = BufferUtil.newShortBuffer(verts.length);
							vertexBuf.put(verts);
							vertexBuf.rewind();
							gl.glVertexPointer(3, GL.GL_SHORT, 0, vertexBuf);
							gl.glDrawArrays(GL.GL_LINE_STRIP, 0, verts.length / 3);
						}
//                        gl.glEnd();
                    }
                }
                // Draw 1px border around and inside the map
                short[] verts = new short[]{
                		0,0,0,
                		(short)width,0,0,
                		(short)width,(short)(height - 1),0,
                		0,(short)(height - 1),0,
                		0,0,0
                };
                ShortBuffer vertexBuf = BufferUtil.newShortBuffer(verts.length);
                vertexBuf.put(verts);
                vertexBuf.rewind();
                gl.glVertexPointer(3, GL.GL_SHORT, 0, vertexBuf);
                gl.glDrawArrays(GL.GL_LINE_STRIP, 0, verts.length / 3);
//                gl.glBegin(GL.GL_LINE_STRIP);
//                gl.glVertex3d(0, 0, 0);
//                gl.glVertex3d(width, 0, 0);
//                gl.glVertex3d(width, height - 1, 0);
//                gl.glVertex3d(0, height - 1, 0);
//                gl.glVertex3d(0, 0, 0);
//                gl.glEnd();
            }
            else
            {
                // Picking
                this.pickSupport.clearPickList();
                this.pickSupport.beginPicking(dc);
                // Where in the world are we picking ?
                Position pickPosition =
                    computePickPosition(dc, locationSW, new Dimension((int) (width * scale), (int) (height * scale)));
                Color color = dc.getUniquePickColor();
                int colorCode = color.getRGB();
                this.pickSupport.addPickableObject(colorCode, this, pickPosition, false);
                gl.glColor4ub((byte) color.getRed(), (byte) color.getGreen(), (byte) color.getBlue(),(byte)0xFF);
                dc.drawUnitQuad();
                this.pickSupport.endPicking(dc);
                this.pickSupport.resolvePick(dc, dc.getPickPoint(), this);
            }
        }
        finally
        {
        	gl.glDisableClientState(GL.GL_VERTEX_ARRAY);
            dc.restoreDefaultDepthTesting();
            dc.restoreDefaultCurrentColor();
            if (dc.isPickingMode())
                dc.restoreDefaultBlending();
            ogsh.pop(gl);
        }
    }
    
    private short[] buildShortArray(ArrayList<Short> shorts) {
    	short[] shs = new short[shorts.size()];
        int i = 0;
        for (Short n : shorts) {
        	shs[i++] = n;
        }
        return shs;
    }


    protected double computeScale(com.qq.java.awt.Rectangle viewport)
    {
        if (this.resizeBehavior.equals(AVKey.RESIZE_SHRINK_ONLY))
        {
            return Math.min(1d, (this.toViewportScale) * viewport.width / this.getScaledIconWidth());
        }
        else if (this.resizeBehavior.equals(AVKey.RESIZE_STRETCH))
        {
            return (this.toViewportScale) * viewport.width / this.getScaledIconWidth();
        }
        else if (this.resizeBehavior.equals(AVKey.RESIZE_KEEP_FIXED_SIZE))
        {
            return 1d;
        }
        else
        {
            return 1d;
        }
    }

    protected double getScaledIconWidth()
    {
        return this.iconWidth * this.iconScale;
    }

    protected double getScaledIconHeight()
    {
        return this.iconHeight * this.iconScale;
    }

    protected Vec4 computeLocation(com.qq.java.awt.Rectangle viewport, double scale)
    {
        double width = this.getScaledIconWidth();
        double height = this.getScaledIconHeight();

        double scaledWidth = scale * width;
        double scaledHeight = scale * height;

        double x;
        double y;

        if (this.locationCenter != null)
        {
            x = this.locationCenter.x - scaledWidth / 2;
            y = this.locationCenter.y - scaledHeight / 2;
        }
        else if (this.position.equals(AVKey.NORTHEAST))
        {
            x = viewport.getWidth() - scaledWidth - this.borderWidth;
            y = viewport.getHeight() - scaledHeight - this.borderWidth;
        }
        else if (this.position.equals(AVKey.SOUTHEAST))
        {
            x = viewport.getWidth() - scaledWidth - this.borderWidth;
            y = 0d + this.borderWidth;
        }
        else if (this.position.equals(AVKey.NORTHWEST))
        {
            x = 0d + this.borderWidth;
            y = viewport.getHeight() - scaledHeight - this.borderWidth;
        }
        else if (this.position.equals(AVKey.SOUTHWEST))
        {
            x = 0d + this.borderWidth;
            y = 0d + this.borderWidth;
        }
        else // use North East
        {
            x = viewport.getWidth() - scaledWidth / 2 - this.borderWidth;
            y = viewport.getHeight() - scaledHeight / 2 - this.borderWidth;
        }

        if (this.locationOffset != null)
        {
            x += this.locationOffset.x;
            y += this.locationOffset.y;
        }

        return new Vec4(x, y, 0);
    }

    protected void initializeTexture(DrawContext dc)
    {
        Texture iconTexture = dc.getTextureCache().getTexture(this.getIconFilePath());
        if (iconTexture != null)
            return;

        try
        {
            InputStream iconStream = this.getClass().getResourceAsStream("/" + this.getIconFilePath());
            if (iconStream == null)
            {
                File iconFile = new File(this.iconFilePath);
                if (iconFile.exists())
                {
                    iconStream = new FileInputStream(iconFile);
                }
            }

            iconTexture = TextureIO.newTexture(iconStream, false, null);
            iconTexture.bind();
            this.iconWidth = iconTexture.getWidth();
            this.iconHeight = iconTexture.getHeight();
            dc.getTextureCache().put(this.getIconFilePath(), iconTexture);
        }
        catch (IOException e)
        {
            String msg = Logging.getMessage("layers.IOExceptionDuringInitialization");
            Logging.logger().severe(msg);
            throw new WWRuntimeException(msg, e);
        }

        GL gl = dc.getGL();
        gl.glTexParameterf(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);//_MIPMAP_LINEAR);
        gl.glTexParameterf(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
        gl.glTexParameterf(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_S, GL.GL_CLAMP_TO_EDGE);
        gl.glTexParameterf(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_T, GL.GL_CLAMP_TO_EDGE);
        // Enable texture anisotropy, improves "tilted" world map quality.
//        int[] maxAnisotropy = new int[1];
//        gl.glGetIntegerv(GL.GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT, maxAnisotropy, 0);
//        gl.glTexParameteri(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MAX_ANISOTROPY_EXT, maxAnisotropy[0]);
    }

    /**
     * Compute the lat/lon position of the view center
     *
     * @param dc   the current DrawContext
     * @param view the current View
     *
     * @return the ground position of the view center or null
     */
    protected Position computeGroundPosition(DrawContext dc, View view)
    {
        if (view == null)
            return null;

        Position groundPos = view.computePositionFromScreenPoint(
            view.getViewport().getWidth() / 2, view.getViewport().getHeight() / 2);
        if (groundPos == null)
            return null;

        double elevation = dc.getGlobe().getElevation(groundPos.getLatitude(), groundPos.getLongitude());
        return new Position(
            groundPos.getLatitude(),
            groundPos.getLongitude(),
            elevation * dc.getVerticalExaggeration());
    }

    /**
     * Computes the lat/lon of the pickPoint over the world map
     *
     * @param dc         the current <code>DrawContext</code>
     * @param locationSW the screen location of the bottom left corner of the map
     * @param mapSize    the world map screen dimension in pixels
     *
     * @return the picked Position
     */
    protected Position computePickPosition(DrawContext dc, Vec4 locationSW, Dimension mapSize)
    {
        Position pickPosition = null;
        Point pickPoint = dc.getPickPoint();
        if (pickPoint != null)
        {
            Rectangle viewport = dc.getView().getViewport();
            // Check if pickpoint is inside the map
            if (pickPoint.getX() >= locationSW.getX()
                && pickPoint.getX() < locationSW.getX() + mapSize.width
                && viewport.height - pickPoint.getY() >= locationSW.getY()
                && viewport.height - pickPoint.getY() < locationSW.getY() + mapSize.height)
            {
                double lon = (pickPoint.getX() - locationSW.getX()) / mapSize.width * 360 - 180;
                double lat = (viewport.height - pickPoint.getY() - locationSW.getY()) / mapSize.height * 180 - 90;
                double pickAltitude = 1000e3;
                pickPosition = new Position(Angle.fromDegrees(lat), Angle.fromDegrees(lon), pickAltitude);
            }
        }
        return pickPosition;
    }

    /**
     * Compute the view range footprint on the globe.
     *
     * @param dc    the current <code>DrawContext</code>
     * @param steps the number of steps.
     *
     * @return an array list of <code>LatLon</code> forming a closed shape.
     */
    protected ArrayList<LatLon> computeViewFootPrint(DrawContext dc, int steps)
    {
        ArrayList<LatLon> positions = new ArrayList<LatLon>();
        Position eyePos = dc.getView().getEyePosition();
        Angle distance = Angle.fromRadians(
            Math.asin(dc.getView().getFarClipDistance() / (dc.getGlobe().getRadius() + eyePos.getElevation())));
        if (distance.degrees > 10)
        {
            double headStep = 360d / steps;
            Angle heading = Angle.ZERO;
            for (int i = 0; i <= steps; i++)
            {
                LatLon p = LatLon.greatCircleEndPosition(eyePos, heading, distance);
                positions.add(p);
                heading = heading.addDegrees(headStep);
            }
            return positions;
        }
        else
            return null;
    }

    @Override
    public String toString()
    {
        return Logging.getMessage("layers.Earth.WorldMapLayer.Name");
    }
}
