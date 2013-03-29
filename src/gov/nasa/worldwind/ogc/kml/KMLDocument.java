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
 * Represents the KML <i>Document</i> element and provides access to its contents.
 *
 * @author tag
 * @version $Id: KMLDocument.java 1 2011-07-16 23:22:47Z dcollins $
 */
public class KMLDocument extends KMLAbstractContainer
{
    protected List<KMLSchema> schemas = new ArrayList<KMLSchema>();

    /**
     * Construct an instance.
     *
     * @param namespaceURI the qualifying namespace URI. May be null to indicate no namespace qualification.
     */
    public KMLDocument(String namespaceURI)
    {
        super(namespaceURI);
    }

    @Override
    protected void doAddEventContent(Object o, XMLEventParserContext ctx, XMLEvent event, Object... args)
        throws XMLStreamException
    {
        if (o instanceof KMLSchema)
            this.addSchema((KMLSchema) o);
        else
            super.doAddEventContent(o, ctx, event, args);
    }

    protected void addSchema(KMLSchema o)
    {
        this.schemas.add(o);
    }

    public List<KMLSchema> getSchemas()
    {
        return this.schemas;
    }
}
