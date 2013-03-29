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
 * $Id: StartDocumentEvent.java,v 1.2 2005/11/03 17:23:31 jeffsuttor Exp $
 * @(#)StartDocumentEvent.java  1.1 05/12/02
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.events ;

import com.qq.javax.xml.stream.events.StartDocument;
import com.qq.javax.xml.stream.Location;
import com.qq.javax.xml.stream.XMLStreamConstants;

/** Implementation of StartDocumentEvent.
 *
 * @author Neeraj Bajaj Sun Microsystems,Inc.
 * @author K.Venugopal Sun Microsystems,Inc.
 *
 */

public class StartDocumentEvent extends DummyEvent
implements StartDocument {
    
    protected String fSystemId;
    protected String fEncodingScheam;
    protected boolean fStandalone;
    protected String fVersion;
    private boolean fEncodingSchemeSet;
    private boolean fStandaloneSet;
    
    public StartDocumentEvent() {
        this("UTF-8","1.0",true,null);
    }
    
    public StartDocumentEvent(String encoding){
        this(encoding,"1.0",true,null);
    }
    
    public StartDocumentEvent(String encoding, String version){
        this(encoding,version,true,null);
    }
    
    public StartDocumentEvent(String encoding, String version, boolean standalone){
        this(encoding,version,standalone,null);
    }
    
    public StartDocumentEvent(String encoding, String version, boolean standalone,Location loc){
        init();
        this.fEncodingScheam = encoding;
        this.fVersion = version;
        this.fStandalone = standalone;
        this.fEncodingSchemeSet = false;
        this.fStandaloneSet = false;
        if (loc != null) {
            this.fLocation = loc;
        }
    }
    protected void init() {
        setEventType(XMLStreamConstants.START_DOCUMENT);
    }
    
    public String getSystemId() {
        if(fLocation == null )
            return "";
        else
            return fLocation.getSystemId();
    }
    
    
    public String getCharacterEncodingScheme() {
        return fEncodingScheam;
    }
    
    public boolean isStandalone() {
        return fStandalone;
    }
    
    public String getVersion() {
        return fVersion;
    }
    
    public void setStandalone(boolean flag) {
        fStandaloneSet = true;
        fStandalone = flag;
    }
    
    public void setStandalone(String s) {
        fStandaloneSet = true;
        if(s == null) {
            fStandalone = true;
            return;
        }
        if(s.equals("yes"))
            fStandalone = true;
        else
            fStandalone = false;
    }
    
    public boolean encodingSet() {
        return fEncodingSchemeSet;
    }
    
    public boolean standaloneSet() {
        return fStandaloneSet;
    }
    
    public void setEncoding(String encoding) {
        fEncodingScheam = encoding;
    }
    
    void setDeclaredEncoding(boolean value){
        fEncodingSchemeSet = value;
    }
    
    public void setVersion(String s) {
        fVersion = s;
    }
    
    void clear() {
        fEncodingScheam = "UTF-8";
        fStandalone = true;
        fVersion = "1.0";
        fEncodingSchemeSet = false;
        fStandaloneSet = false;
    }
    
    public String toString() {
        String s = "<?xml version=\"" + fVersion + "\"";
        s = s + " encoding='" + fEncodingScheam + "'";
        if(fStandaloneSet) {
            if(fStandalone)
                s = s + " standalone='yes'?>";
            else
                s = s + " standalone='no'?>";
        } else {
            s = s + "?>";
        }
        return s;
    }
    
    public boolean isStartDocument() {
        return true;
    }
    
    protected void writeAsEncodedUnicodeEx(java.io.Writer writer) 
    throws java.io.IOException
    {
        writer.write(toString());
    }
}