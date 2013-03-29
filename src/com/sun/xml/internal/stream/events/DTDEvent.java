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
 * $Id: DTDEvent.java,v 1.2 2005/11/03 17:23:30 jeffsuttor Exp $
 * @(#)DTDEvent.java    1.1 05/12/02
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.events;

import com.qq.javax.xml.stream.events.DTD;
import com.qq.javax.xml.stream.events.XMLEvent;

/**
 *
 * @author  Neeraj Bajaj, Sun Microsystesm.
 *
 */
public class DTDEvent extends DummyEvent implements DTD{
    
    private String fDoctypeDeclaration;
    private java.util.List fNotations;
    private java.util.List fEntities;
    
    /** Creates a new instance of DTDEvent */
    public DTDEvent() {
        init();
    }
    
    public DTDEvent(String doctypeDeclaration){
        init();
        fDoctypeDeclaration = doctypeDeclaration;
    }
    
    public void setDocumentTypeDeclaration(String doctypeDeclaration){
        fDoctypeDeclaration = doctypeDeclaration;
    }
    
    public String getDocumentTypeDeclaration() {
        return fDoctypeDeclaration;
    }
    
    //xxx: we can change the signature if the implementation doesn't store the entities in List Datatype.
    //and then convert that DT to list format here. That way callee dont need to bother about conversion
    
    public void setEntities(java.util.List entites){
        fEntities = entites;
    }
    
    public java.util.List getEntities() {
        return fEntities;
    }
    
    //xxx: we can change the signature if the implementation doesn't store the entities in List Datatype.
    //and then convert that DT to list format here. That way callee dont need to bother about conversion
    
    public void setNotations(java.util.List notations){
        fNotations = notations;
    }
    
    public java.util.List getNotations() {
        return fNotations;
    }
    
    /**
     *Returns an implementation defined representation of the DTD.
     * This method may return null if no representation is available.
     *
     */
    public Object getProcessedDTD() {
        return null;
    }
    
    protected void init(){
        setEventType(XMLEvent.DTD);
    }
    
    public String toString(){
        return fDoctypeDeclaration ;
    }
    
    protected void writeAsEncodedUnicodeEx(java.io.Writer writer) 
    throws java.io.IOException
    {
        writer.write(fDoctypeDeclaration);
    }    
}