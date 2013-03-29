package gov.nasa.worldwind.ogc.kml;

import gov.nasa.worldwind.util.xml.XMLEventParserContext;


import com.qq.java.util.*;
import com.qq.javax.xml.stream.XMLStreamException;
import com.qq.javax.xml.stream.events.XMLEvent;


/**
 * Represents the KML <i>Document</i> element and provides access to its contents.
 *
 * @author jfb
 * @version
 *
 */
public class KMLDocumentSource extends KMLAbstractFeature
{
    /**
     * Construct an instance.
     *
     * @param namespaceURI the qualifying namespace URI. May be null to indicate no namespace qualification.
     */
    public KMLDocumentSource(String namespaceURI)
    {
        super(namespaceURI);
    }
 }
