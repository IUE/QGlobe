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
 * $Id: NamespaceImpl.java,v 1.2 2005/11/03 17:23:27 jeffsuttor Exp $
 * %W% %E%
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.events;

import com.qq.javax.xml.stream.events.Namespace;
import com.qq.javax.xml.stream.events.XMLEvent;
import javax.xml.namespace.QName;

import javax.xml.XMLConstants;
/**
 *
 * @author  Neeraj Bajaj,K.Venugopal@sun.com  Sun Microsystems.
 */
public class NamespaceImpl extends AttributeImpl implements Namespace{
    
    public NamespaceImpl( ) {
        init();
    }
    
    /** Creates a new instance of NamespaceImpl */
    public NamespaceImpl(String namespaceURI) {
        super(XMLConstants.XMLNS_ATTRIBUTE,XMLConstants.XMLNS_ATTRIBUTE_NS_URI,XMLConstants.DEFAULT_NS_PREFIX,namespaceURI,null);
        init();
    }
    
    public NamespaceImpl(String prefix, String namespaceURI){
        super(XMLConstants.XMLNS_ATTRIBUTE,XMLConstants.XMLNS_ATTRIBUTE_NS_URI,prefix,namespaceURI,null);
        init();
    }
    
    public boolean isDefaultNamespaceDeclaration() {
        QName name = this.getName();
        
        if(name != null && (name.getLocalPart().equals(XMLConstants.DEFAULT_NS_PREFIX)))
            return true;
        return false;
    }
    
    void setPrefix(String prefix){
        if(prefix == null)
            setName(new QName(XMLConstants.XMLNS_ATTRIBUTE_NS_URI,XMLConstants.DEFAULT_NS_PREFIX,XMLConstants.XMLNS_ATTRIBUTE));
        else// new QName(uri, localpart, prefix)
            setName(new QName(XMLConstants.XMLNS_ATTRIBUTE_NS_URI,prefix,XMLConstants.XMLNS_ATTRIBUTE));
    }
    
    public String getPrefix() {
        //for a namespace declaration xmlns:prefix="uri" to get the prefix we have to get the
        //local name if this declaration is stored as QName.
        QName name = this.getName();
        if(name != null)
            return name.getLocalPart();
        return null;
    }
    
    public String getNamespaceURI() {
        //we are treating namespace declaration as attribute -- so URI is stored as value
        //xmlns:prefix="Value"
        return this.getValue();
    }
    
    void setNamespaceURI(String uri) {
        //we are treating namespace declaration as attribute -- so URI is stored as value
        //xmlns:prefix="Value"
        this.setValue(uri);
    }
    
    protected void init(){
        setEventType(XMLEvent.NAMESPACE);
    }
    
    public int getEventType(){
        return XMLEvent.NAMESPACE;
    }
    
    public boolean isNamespace(){
        return true;
    }
}