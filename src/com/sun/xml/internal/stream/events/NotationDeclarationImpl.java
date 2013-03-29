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
 * $Id: NotationDeclarationImpl.java,v 1.2 2005/11/03 17:23:31 jeffsuttor Exp $
 * @(#)NotationDeclarationImpl.java 1.1 05/12/02
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.events;

import com.qq.javax.xml.stream.events.NotationDeclaration;
import com.qq.javax.xml.stream.events.XMLEvent;
import com.sun.xml.internal.stream.dtd.nonvalidating.XMLNotationDecl;

/**
 * Implementation of NotationDeclaration event.
 *
 * @author k.venugopal@sun.com
 */
public class NotationDeclarationImpl extends DummyEvent implements NotationDeclaration {
    
    String fName = null;
    String fPublicId = null;
    String fSystemId = null;
    
    /** Creates a new instance of NotationDeclarationImpl */
    public NotationDeclarationImpl() {
        setEventType(XMLEvent.NOTATION_DECLARATION);
    }
    
    public NotationDeclarationImpl(String name,String publicId,String systemId){
        this.fName = name;
        this.fPublicId = publicId;
        this.fSystemId = systemId;
        setEventType(XMLEvent.NOTATION_DECLARATION);
    }
    
    public NotationDeclarationImpl(XMLNotationDecl notation){
        this.fName = notation.name;
        this.fPublicId = notation.publicId;
        this.fSystemId = notation.systemId;
        setEventType(XMLEvent.NOTATION_DECLARATION);
    }
    
    public String getName() {
        return fName;
    }
    
    public String getPublicId() {
        return fPublicId;
    }
    
    public String getSystemId() {
        return fSystemId;
    }
    
    void setPublicId(String publicId){
        this.fPublicId = publicId;
    }
    
    void setSystemId(String systemId){
        this.fSystemId = systemId;
    }
    
    void setName(String name){
        this.fName = name;
    }
    
    protected void writeAsEncodedUnicodeEx(java.io.Writer writer) 
    throws java.io.IOException
    {
        writer.write("<!NOTATION ");
        writer.write(getName());
        if (fPublicId != null) {
            writer.write(" PUBLIC \"");
            writer.write(fPublicId);
            writer.write("\"");
        } else if (fSystemId != null) {
            writer.write(" SYSTEM");
            writer.write(" \"");
            writer.write(fSystemId);
            writer.write("\"");
        }
        writer.write('>');
    }
}