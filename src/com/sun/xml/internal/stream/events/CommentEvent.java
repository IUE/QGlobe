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
 * $Id: CommentEvent.java,v 1.2 2005/11/03 17:23:30 jeffsuttor Exp $
 * @(#)CommentEvent.java    1.1 05/12/02
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.events ;

import com.qq.javax.xml.stream.events.Comment;
import com.qq.javax.xml.stream.events.XMLEvent;

/**
 * This class contains information about Comment event.
 *
 * @author Neeraj Bajaj, Sun Microsystems.
 */
public class CommentEvent extends DummyEvent implements Comment {
    
    /* String data for this event */
    private String fText ;
    
    public CommentEvent() {
        init();
    }
    
    public CommentEvent(String text) {
        init();
        fText = text;
    }
    
    protected void init() {
        setEventType(XMLEvent.COMMENT);
    }
    
    /**
     * @return String String representation of this event
     */
    public String toString() {
        return "<!--" + getText() + "-->";
    }
    
    
    /** Return the string data of the comment, returns empty string if it
     * does not exist
     * @return String
     */
    public String getText() {
        return fText ;
    }

    protected void writeAsEncodedUnicodeEx(java.io.Writer writer) 
    throws java.io.IOException
    {
        writer.write("<!--" + getText() + "-->");
    }    
    
}