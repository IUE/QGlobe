/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind.ogc.kml;

/**
 * Represents the KML <i>Geometry</i> element.
 *
 * @author tag
 * @version $Id: KMLAbstractGeometry.java 1 2011-07-16 23:22:47Z dcollins $
 */
public abstract class KMLAbstractGeometry extends KMLAbstractObject
{
    /**
     * Construct an instance.
     *
     * @param namespaceURI the qualifying namespace URI. May be null to indicate no namespace qualification.
     */
    protected KMLAbstractGeometry(String namespaceURI)
    {
        super(namespaceURI);
    }
}
