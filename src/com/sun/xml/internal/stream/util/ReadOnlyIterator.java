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
 * $Id: ReadOnlyIterator.java,v 1.2 2005/11/03 17:24:16 jeffsuttor Exp $
 * %W% %E%
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.util;
/**
 *
 * @author K.Venugopal ,Neeraj Bajaj Sun Microsystems.
 */

import java.util.Iterator;

public class ReadOnlyIterator implements Iterator {
    
    Iterator iterator = null;
    
    public ReadOnlyIterator(){
    }
    
    public ReadOnlyIterator(Iterator itr){
        iterator = itr;
    }
    
    /**
     * @return
     */
    public boolean hasNext() {
        if(iterator  != null)
            return iterator.hasNext();
        return false;
    }
    
    /**
     * @return
     */
    public Object next() {
        if(iterator  != null)
            return iterator.next();
        return null;
    }
    
    public void remove() {
        throw new  UnsupportedOperationException("Remove operation is not supported");
    }
    
}