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
 * $Id: EntityReferenceEvent.java,v 1.2 2005/11/03 17:23:29 jeffsuttor Exp $
 * @(#)EntityReferenceEvent.java    1.1 05/12/02
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.events ;

import com.qq.javax.xml.stream.events.EntityReference;
import java.io.Writer;
import com.qq.javax.xml.stream.events.EntityDeclaration;
import com.qq.javax.xml.stream.events.XMLEvent;

/** Implements EntityReference event.
 *
 *@author Neeraj Bajaj, Sun Microsystems,
 */
public class EntityReferenceEvent extends DummyEvent
implements EntityReference {
    private EntityDeclaration fEntityDeclaration ;
    private String fEntityName;
    
    public EntityReferenceEvent() {
        init();
    }
    
    public EntityReferenceEvent(String entityName , EntityDeclaration entityDeclaration) {
        init();
        fEntityName = entityName;
        fEntityDeclaration = entityDeclaration ;
    }
    
    public String getName() {
        return fEntityName;
    }
    
    public String toString() {
        String text = fEntityDeclaration.getReplacementText();
        if(text == null)
            text = "";
        return "&" + getName() + ";='" + text + "'";
    }
    
    protected void writeAsEncodedUnicodeEx(java.io.Writer writer) 
    throws java.io.IOException
    {
        writer.write('&');
        writer.write(getName());
        writer.write(';');
    }    
    
    public EntityDeclaration getDeclaration(){
        return fEntityDeclaration ;
    }
    
    protected void init() {
        setEventType(XMLEvent.ENTITY_REFERENCE);
    }
    
    
}