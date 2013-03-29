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
 * $Id: ProcessingInstructionEvent.java,v 1.2 2005/11/03 17:23:28 jeffsuttor Exp $
 * @(#)ProcessingInstructionEvent.java  1.1 05/12/02
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.events ;

import java.io.Writer;
import com.qq.javax.xml.stream.Location;
import com.qq.javax.xml.stream.XMLStreamConstants;
import com.qq.javax.xml.stream.XMLStreamException;
import com.qq.javax.xml.stream.events.ProcessingInstruction;

/** Implements Processing Instruction Event
 *
 *@author Neeraj Bajaj, Sun Microsystems.
 *
 */


public class ProcessingInstructionEvent extends DummyEvent
implements ProcessingInstruction {
    
    /** Processing Instruction Name */
    private String fName;
    /** Processsing instruction content */
    private String fContent;
    
    public ProcessingInstructionEvent() {
        init();
    }
    
    public ProcessingInstructionEvent(String targetName, String data) {
        this(targetName,data,null);
    }
    
    public ProcessingInstructionEvent(String targetName, String data,Location loc) {
        init();
        this.fName = targetName;
        fContent = data;
        setLocation(loc);
    }
    
    protected void init() {
        setEventType(XMLStreamConstants.PROCESSING_INSTRUCTION);
    }
    
    public String getTarget() {
        return fName;
    }
    
    public void setTarget(String targetName) {
        fName = targetName;
    }
    
    public void setData(String data) {
        fContent = data;
    }
    
    public String getData() {
        return fContent;
    }
    
    public String toString() {
        if(fContent != null && fName != null)
            return "<?" + fName + " " + fContent + "?>";
        if(fName != null)
            return "<?" + fName + "?>";
        if(fContent != null)
            return "<?" + fContent + "?>";
        else
            return "<??>";
    }
    
    protected void writeAsEncodedUnicodeEx(java.io.Writer writer) 
    throws java.io.IOException
    {
        writer.write(toString());
    }
    
}