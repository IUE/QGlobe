package com.qq.worldwind.android.layer;

import java.util.Collection;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import gov.nasa.worldwind.layers.Layer;

public interface ILayerType {
	
	String getCategory();

	View getExpandedView(Activity context);

	Collection<Layer> createLayers();

}
