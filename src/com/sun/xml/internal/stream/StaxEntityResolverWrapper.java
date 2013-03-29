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
 * $Id: StaxEntityResolverWrapper.java,v 1.3 2005/11/03 17:02:19 jeffsuttor Exp $
 * %W% %E%
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream;

import java.io.InputStream;
import com.qq.javax.xml.stream.XMLEventReader;
import com.qq.javax.xml.stream.XMLResolver;
import com.qq.javax.xml.stream.XMLStreamException;
import com.qq.javax.xml.stream.XMLStreamReader;
import com.sun.org.apache.xerces.internal.xni.XMLResourceIdentifier;
import com.sun.org.apache.xerces.internal.xni.XNIException;
import com.sun.org.apache.xerces.internal.xni.parser.XMLInputSource;

/**
 *
 * @author  Neeraj Bajaj
 */
public class StaxEntityResolverWrapper {
    
    XMLResolver fStaxResolver ;
    
    /** Creates a new instance of StaxEntityResolverWrapper */
    public StaxEntityResolverWrapper(XMLResolver resolver) {
        fStaxResolver = resolver ;
    }
    
    public void setStaxEntityResolver(XMLResolver resolver ){
        fStaxResolver = resolver ;
    }
    
    public XMLResolver getStaxEntityResolver(){
        return fStaxResolver ;
    }
    
    public StaxXMLInputSource resolveEntity(XMLResourceIdentifier resourceIdentifier)
    throws XNIException, java.io.IOException {
        Object object = null ;
        try{
            object = fStaxResolver.resolveEntity(resourceIdentifier.getPublicId(), resourceIdentifier.getLiteralSystemId(),
            resourceIdentifier.getBaseSystemId(), null);
            return getStaxInputSource(object) ;
        }catch(XMLStreamException streamException){
            throw new XNIException(streamException) ;
        }
    }
    
    StaxXMLInputSource getStaxInputSource(Object object){
        if(object == null) return null ;
        
        if(object  instanceof java.io.InputStream){
            return new StaxXMLInputSource(new XMLInputSource(null, null, null, (InputStream)object, null));
        }
        else if(object instanceof XMLStreamReader){
            return new StaxXMLInputSource((XMLStreamReader)object) ;
        }else if(object instanceof XMLEventReader){
            return new StaxXMLInputSource((XMLEventReader)object) ;
        }
        
        return null ;
    }
}//class StaxEntityResolverWrapper