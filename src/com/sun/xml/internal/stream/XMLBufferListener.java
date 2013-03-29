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
 * $Id: XMLBufferListener.java,v 1.2 2005/11/03 17:02:20 jeffsuttor Exp $
 * %W% %E%
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream;

/**
 * XMLBufferListerner should be implemented by classes which wish to receive
 * call backs from XMLEntityReader.
 *
 * @author k.venugopal@sun.com,
 * @author Neeraj.bajaj@sun.com
 */
public interface XMLBufferListener {
    
    /**
     * Will be invoked by XMLEntityReader before it tries to resize,load new data
     * into current ScannedEntities buffer.
     */
    public void refresh();
    
    /**
     * receives callbacks from {@link XMLEntityReader } when buffer
     * is being changed.
     * @param refreshPosition
     */
    public void refresh(int loadPosition);
    
}