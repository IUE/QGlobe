/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 *
 * You can obtain a copy of the license at
 * https://jaxp.dev.java.net/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * HEADER in each file and include the License file at
 * https://jaxp.dev.java.net/CDDLv1.0.html
 * If applicable add the following below this CDDL HEADER
 * with the fields enclosed by brackets "[]" replaced with
 * your own identifying information: Portions Copyright
 * [year] [name of copyright owner]
 */

/*
 * $Id: StaxXMLInputSource.java,v 1.3 2005/11/03 17:02:20 jeffsuttor Exp $
 * %W% %E%
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream;

import com.qq.javax.xml.stream.XMLEventReader;
import com.qq.javax.xml.stream.XMLStreamReader;
import com.sun.org.apache.xerces.internal.xni.parser.XMLInputSource;

/**
 *
 * @author  Neeraj
 *
 * This class wraps XMLInputSource and is also capable of telling wether application
 * returned XMLStreamReader or not when XMLResolver.resolveEnity
 * was called.
 */
public class StaxXMLInputSource {
    
    XMLStreamReader fStreamReader ;
    XMLEventReader fEventReader ;
    XMLInputSource fInputSource ;
    
    /** Creates a new instance of StaxXMLInputSource */
    public StaxXMLInputSource(XMLStreamReader streamReader) {
        fStreamReader = streamReader ;
    }
    
    /** Creates a new instance of StaxXMLInputSource */
    public StaxXMLInputSource(XMLEventReader eventReader) {
        fEventReader = eventReader ;
    }
    
    public StaxXMLInputSource(XMLInputSource inputSource){
        fInputSource = inputSource ;
        
    }
    public XMLStreamReader getXMLStreamReader(){
        return fStreamReader ;
    }
    
    public XMLEventReader getXMLEventReader(){
        return fEventReader ;
    }
    
    public XMLInputSource getXMLInputSource(){
        return fInputSource ;
    }
    
    public boolean hasXMLStreamOrXMLEventReader(){
        return (fStreamReader == null) && (fEventReader == null) ? false : true ;
    }
}