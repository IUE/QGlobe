/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */
package gov.nasa.worldwind.render;

import gov.nasa.worldwind.layers.Layer;
import gov.nasa.worldwind.geom.Vec4;

import com.qq.java.awt.*;

/**
 * @author Patrick Murris
 * @version $Id: AnnotationRenderer.java 1 2011-07-16 23:22:47Z dcollins $
 */
public interface AnnotationRenderer
{
    void pick(DrawContext dc, Iterable<Annotation> annotations, Point pickPoint, Layer annotationLayer);

    void pick(DrawContext dc, Annotation annotation, Vec4 annotationPoint, Point pickPoint, Layer annotationLayer);

    void render(DrawContext dc, Iterable<Annotation> annotations, Layer layer);

    void render(DrawContext dc, Annotation annotation, Vec4 annotationPoint, Layer layer);
}