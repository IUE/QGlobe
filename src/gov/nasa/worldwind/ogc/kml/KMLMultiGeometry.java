/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind.ogc.kml;

import gov.nasa.worldwind.util.xml.XMLEventParserContext;


import com.qq.java.util.*;
import com.qq.javax.xml.stream.XMLStreamException;
import com.qq.javax.xml.stream.events.XMLEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the KML <i>MultiGeometry</i> element and provides access to its contents.
 *
 * @author tag
 * @version $Id: KMLMultiGeometry.java 1 2011-07-16 23:22:47Z dcollins $
 */
public class KMLMultiGeometry extends KMLAbstractGeometry
{
    protected List<KMLAbstractGeometry> geometries = new ArrayList<KMLAbstractGeometry>();

    /**
     * Construct an instance.
     *
     * @param namespaceURI the qualifying namespace URI. May be null to indicate no namespace qualification.
     */
    public KMLMultiGeometry(String namespaceURI)
    {
        super(namespaceURI);
    }

    @Override
    protected void doAddEventContent(Object o, XMLEventParserContext ctx, XMLEvent event, Object... args)
        throws XMLStreamException
    {
        if (o instanceof KMLAbstractGeometry)
            this.addGeometry((KMLAbstractGeometry) o);
        else
            super.doAddEventContent(o, ctx, event, args);
    }

    protected void addGeometry(KMLAbstractGeometry o)
    {
        this.geometries.add(o);
    }

    public List<KMLAbstractGeometry> getGeometries()
    {
        return this.geometries;
    }
}
