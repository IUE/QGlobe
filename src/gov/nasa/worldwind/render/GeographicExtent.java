/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind.render;

import gov.nasa.worldwind.geom.Sector;

/**
 * An interface for objects that can provide an extent in latitude and longitude.
 *
 * @author tag
 * @version $Id: GeographicExtent.java 1 2011-07-16 23:22:47Z dcollins $
 */
public interface GeographicExtent extends Renderable//, AVList
{
    /**
     * Returns the object's geographic extent.
     *
     * @return the object's geographic extent.
     */
    Sector getSector();
}
