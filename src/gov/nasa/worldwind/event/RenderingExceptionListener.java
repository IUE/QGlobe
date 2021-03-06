/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind.event;

import java.util.EventListener;

import com.qq.java.util.*;

/**
 * @author tag
 * @version $Id: RenderingExceptionListener.java 1 2011-07-16 23:22:47Z dcollins $
 */
public interface RenderingExceptionListener extends EventListener
{
    public void exceptionThrown(Throwable t);
}
