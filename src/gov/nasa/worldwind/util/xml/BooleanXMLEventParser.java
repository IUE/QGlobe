/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind.util.xml;

import gov.nasa.worldwind.util.WWUtil;


import com.qq.javax.xml.stream.XMLStreamException;
import com.qq.javax.xml.stream.events.XMLEvent;

/**
 * @author tag
 * @version $Id: BooleanXMLEventParser.java 1 2011-07-16 23:22:47Z dcollins $
 */
public class BooleanXMLEventParser extends AbstractXMLEventParser
{
    public BooleanXMLEventParser()
    {
    }

    public BooleanXMLEventParser(String namespaceUri)
    {
        super(namespaceUri);
    }

    public Object parse(XMLEventParserContext ctx, XMLEvent booleanEvent, Object... args) throws XMLStreamException
    {
        String s = this.parseCharacterContent(ctx, booleanEvent);
        if (s == null)
            return false;

        s = s.trim();

        if (s.length() > 1)
            return s.equalsIgnoreCase("true");

        return WWUtil.convertNumericStringToBoolean(s);
    }
}
