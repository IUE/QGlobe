/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind.ogc.kml;

import gov.nasa.worldwind.util.xml.*;


import com.qq.java.util.*;
import com.qq.javax.xml.stream.XMLStreamException;
import com.qq.javax.xml.stream.events.XMLEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the KML <i>Delete</i> element and provides access to its contents.
 *
 * @author tag
 * @version $Id: KMLDelete.java 1 2011-07-16 23:22:47Z dcollins $
 */
public class KMLDelete extends AbstractXMLEventParser
{
    protected List<KMLAbstractFeature> features = new ArrayList<KMLAbstractFeature>();

    /**
     * Construct an instance.
     *
     * @param namespaceURI the qualifying namespace URI. May be null to indicate no namespace qualification.
     */
    public KMLDelete(String namespaceURI)
    {
        super(namespaceURI);
    }

    @Override
    protected void doAddEventContent(Object o, XMLEventParserContext ctx, XMLEvent event, Object... args)
        throws XMLStreamException
    {
        if (o instanceof KMLAbstractFeature)
            this.addFeature((KMLAbstractFeature) o);
        else
            super.doAddEventContent(o, ctx, event, args);
    }

    protected void addFeature(KMLAbstractFeature o)
    {
        this.features.add(o);
    }

    public List<KMLAbstractFeature> getFeatures()
    {
        return this.features;
    }
}
