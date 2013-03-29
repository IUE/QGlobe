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
 * $Id: EventFilterSupport.java,v 1.4 2005/11/03 17:02:19 jeffsuttor Exp $
 * %W% %E%
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream;

import java.util.NoSuchElementException;
import com.qq.javax.xml.stream.EventFilter;
import com.qq.javax.xml.stream.XMLEventReader;
import com.qq.javax.xml.stream.XMLStreamException;
import com.qq.javax.xml.stream.events.XMLEvent;
import com.qq.javax.xml.stream.util.EventReaderDelegate;

/**
 *
 * @author  Neeraj Bajaj, Sun Microsystems
 *
 */
public class EventFilterSupport extends EventReaderDelegate {
    
    //maintain a reference to EventFilter
    EventFilter fEventFilter ;
    /** Creates a new instance of EventFilterSupport */
    public EventFilterSupport(XMLEventReader eventReader, EventFilter eventFilter) {
        setParent(eventReader);
        fEventFilter = eventFilter;
    }
    
    public Object next(){
        try{
            return nextEvent();
        }catch(XMLStreamException ex){
            throw new NoSuchElementException();
        }
    }
    
    public boolean hasNext(){
        try{
            return peek() != null ? true : false ;
        }catch(XMLStreamException ex){
            return false;
        }
    }
    
    public XMLEvent nextEvent()throws XMLStreamException{
        if(super.hasNext()){
            //get the next event by calling XMLEventReader
            XMLEvent event = super.nextEvent();
            
            //if this filter accepts this event then return this event
            if(fEventFilter.accept(event)){
                return event;
            }
            else{
                return nextEvent();
            }
        }else{
            throw new NoSuchElementException();
        }
    }//nextEvent()
    
     public XMLEvent nextTag() throws XMLStreamException{
         if(super.hasNext()){
             XMLEvent event = super.nextTag();
             //if the filter accepts this event return this event.
             if(fEventFilter.accept(event)){
                return event;
             }
             else{
                return nextTag();
             }    
         }else{
             throw new NoSuchElementException();
         }         
     }
     
     public XMLEvent peek() throws XMLStreamException{
         
         XMLEvent event = super.peek();
         if(event == null)return null;
         //if the filter accepts this event return this event.
         if(fEventFilter.accept(event)){
            return event;
         }
         else{
             //call super.next(), and then peek again.
             super.next();
             return peek();
         }             
         
     }
     
}//EventFilterSupport