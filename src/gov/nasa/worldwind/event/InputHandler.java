/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */
package gov.nasa.worldwind.event;

import gov.nasa.worldwind.WorldWindow;
import gov.nasa.worldwind.avlist.AVList;

import com.qq.java.awt.event.*;

/**
 * @author tag
 * @version $Id: InputHandler.java 1 2011-07-16 23:22:47Z dcollins $
 */
public interface InputHandler extends AVList, java.beans.PropertyChangeListener
{
    void setEventSource(WorldWindow newWorldWindow);

    WorldWindow getEventSource();

    void setHoverDelay(int delay);

    int getHoverDelay();

    void addSelectListener(SelectListener listener);

    void removeSelectListener(SelectListener listener);

    void addKeyListener(KeyListener listener);

    void removeKeyListener(KeyListener listener);

    void addMouseListener(MouseListener listener);

    void removeMouseListener(MouseListener listener);

    void addMouseMotionListener(MouseMotionListener listener);

    void removeMouseMotionListener(MouseMotionListener listener);

    void addMouseWheelListener(MouseWheelListener listener);

    void removeMouseWheelListener(MouseWheelListener listener);

    void dispose();
}
