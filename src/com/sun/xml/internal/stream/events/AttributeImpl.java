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
 * $Id: AttributeImpl.java,v 1.2 2005/11/03 17:23:28 jeffsuttor Exp $
 * @(#)AttributeImpl.java   1.1 05/12/02
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.events;

import javax.xml.namespace.QName;
import com.qq.javax.xml.stream.events.Attribute;
import java.io.Writer;
import com.qq.javax.xml.stream.events.XMLEvent;


//xxx: AttributeEvent is not really a first order event. Should we be renaming the class to AttributeImpl for consistent
//naming convention.

/**
 * Implementation of Attribute Event.
 *
 *@author Neeraj Bajaj, Sun Microsystems
 *@author K.Venugopal, Sun Microsystems
 *
 */

public class AttributeImpl extends DummyEvent implements Attribute

{
    //attribute value
    private String fValue;
    private String fNonNormalizedvalue;
    
    //name of the attribute
    private QName fQName;
    //attribute type
    private String fAttributeType = "CDATA";
    
    
    //A flag indicating whether this attribute was actually specified in the start-tag
    //of its element or was defaulted from the schema.
    private boolean fIsSpecified;
    
    public AttributeImpl(){
        init();
    }
    public AttributeImpl(String name, String value) {
        init();
        fQName = new QName(name);
        fValue = value;
    }
    
    public AttributeImpl(String prefix, String name, String value) {
        this(prefix, null,name, value, null,null,false );
    }
    
    public AttributeImpl(String prefix, String uri, String localPart, String value, String type) {
        this(prefix, uri, localPart, value, null, type, false);
    }
    
    public AttributeImpl(String prefix, String uri, String localPart, String value, String nonNormalizedvalue, String type, boolean isSpecified) {
        this(new QName(uri, localPart, prefix), value, nonNormalizedvalue, type, isSpecified);
    }
    
    
    public AttributeImpl(QName qname, String value, String nonNormalizedvalue, String type, boolean isSpecified) {
        init();
        fQName = qname ;
        fValue = value ;
        if(type != null && !type.equals(""))
            fAttributeType = type;
        
        fNonNormalizedvalue = nonNormalizedvalue;
        fIsSpecified = isSpecified ;
        
    }
    
    public String toString() {
        if( fQName.getPrefix() != null && fQName.getPrefix().length() > 0 )
            return fQName.getPrefix() + ":" + fQName.getLocalPart() + "='" + fValue + "'";
        else
            return fQName.getLocalPart() + "='" + fValue + "'";
    }
    
    public void setName(QName name){
        fQName = name ;
    }
    
    public QName getName() {
        return fQName;
    }
    
    public void setValue(String value){
        fValue = value;
    }
    
    public String getValue() {
        return fValue;
    }
    
    public void setNonNormalizedValue(String nonNormalizedvalue){
        fNonNormalizedvalue = nonNormalizedvalue;
    }
    
    public String getNonNormalizedValue(){
        return fNonNormalizedvalue ;
    }
    
    public void setAttributeType(String attributeType){
        fAttributeType = attributeType ;
    }
    
    /** Gets the type of this attribute, default is "CDATA   */
    // We dont need to take care of default value.. implementation takes care of it.
    public String getDTDType() {
        return fAttributeType;
    }
    
    /** is this attribute is specified in the instance document */
    
    public void setSpecified(boolean isSpecified){
        fIsSpecified = isSpecified ;
    }
    
    public boolean isSpecified() {
        return fIsSpecified ;
    }
    
    protected void writeAsEncodedUnicodeEx(java.io.Writer writer) 
    throws java.io.IOException
    {
        writer.write(toString());
     }

    
    protected void init(){
        setEventType(XMLEvent.ATTRIBUTE);
    }
    
    
    
    
}//AttributeImpl