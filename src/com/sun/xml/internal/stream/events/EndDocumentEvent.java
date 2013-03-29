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
 * $Id: EndDocumentEvent.java,v 1.2 2005/11/03 17:23:29 jeffsuttor Exp $
 * @(#)EndDocumentEvent.java    1.1 05/12/02
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.events ;

import com.qq.javax.xml.stream.events.EndDocument;
import java.io.Writer;
import com.qq.javax.xml.stream.XMLStreamConstants;

/**
 * This class contains information about EndDocument event.
 *
 * @author Neeraj Bajaj, Sun Microsystems.
 */


public class EndDocumentEvent extends DummyEvent
implements EndDocument {
    
    public EndDocumentEvent() {
        init();
    }
    
    protected void init() {
        setEventType(XMLStreamConstants.END_DOCUMENT);
    }
    
    public String toString() {
        return "ENDDOCUMENT";
    }
    
    protected void writeAsEncodedUnicodeEx(java.io.Writer writer) 
    throws java.io.IOException
    {
        //end document
    }    
    
    
}