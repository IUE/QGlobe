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
 * Represents the KML <i>Change</i> element and provides access to its contents.
 *
 * @author tag
 * @version $Id: KMLChange.java 1 2011-07-16 23:22:47Z dcollins $
 */
public class KMLChange extends AbstractXMLEventParser
{
    protected List<KMLAbstractObject> objects = new ArrayList<KMLAbstractObject>();

    /**
     * Construct an instance.
     *
     * @param namespaceURI the qualifying namespace URI. May be null to indicate no namespace qualification.
     */
    public KMLChange(String namespaceURI)
    {
        super(namespaceURI);
    }

    @Override
    protected void doAddEventContent(Object o, XMLEventParserContext ctx, XMLEvent event, Object... args)
        throws XMLStreamException
    {
        if (o instanceof KMLAbstractObject)
            this.addObject((KMLAbstractObject) o);
        else
            super.doAddEventContent(o, ctx, event, args);
    }

    protected void addObject(KMLAbstractObject o)
    {
        this.objects.add(o);
    }

    public List<KMLAbstractObject> getObjects()
    {
        return this.objects;
    }
}
