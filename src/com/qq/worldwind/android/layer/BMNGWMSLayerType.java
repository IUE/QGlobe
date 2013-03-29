package com.qq.worldwind.android.layer;

import java.util.ArrayList;
import java.util.Collection;

import com.qq.worldwind.android.R;

import gov.nasa.worldwind.layers.Layer;
import gov.nasa.worldwind.layers.SkyGradientLayer;
import gov.nasa.worldwind.layers.Earth.BMNGOneImage;
import gov.nasa.worldwind.layers.Earth.BMNGWMSLayer;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class BMNGWMSLayerType implements ILayerType {

	private View expandedView;

	@Override
	public String getCategory() {
		return "Blue Marble WMS";
	}

	@Override
	public Collection<Layer> createLayers() {
		ArrayList<Layer> retval = new ArrayList<Layer>();
		EditText nameText = (EditText) expandedView.findViewById(R.id.nameText);
		BMNGWMSLayer layer = new BMNGWMSLayer();
		layer.setName(nameText.getText().toString());
		retval.add(layer);
		return retval;
	}

	@Override
	public View getExpandedView(Activity context) {
		if (expandedView == null){
			expandedView = context.getLayoutInflater().inflate(R.layout.addlayernameinput, null);
			EditText nameText = (EditText) expandedView.findViewById(R.id.nameText);
			nameText.setText(getCategory());
			nameText.selectAll();
		}
		return expandedView;
	}

}
