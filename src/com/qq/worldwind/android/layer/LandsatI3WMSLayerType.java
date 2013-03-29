package com.qq.worldwind.android.layer;

import java.util.ArrayList;
import java.util.Collection;

import com.qq.worldwind.android.R;

import gov.nasa.worldwind.layers.CompassLayer;
import gov.nasa.worldwind.layers.Layer;
import gov.nasa.worldwind.layers.SkyGradientLayer;
import gov.nasa.worldwind.layers.Earth.BMNGOneImage;
import gov.nasa.worldwind.layers.Earth.BMNGWMSLayer;
import gov.nasa.worldwind.layers.Earth.LandsatI3WMSLayer;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class LandsatI3WMSLayerType implements ILayerType {

	private View expandedView;

	@Override
	public String getCategory() {
		return "i-cubed Landsat";
	}

	@Override
	public Collection<Layer> createLayers() {
		ArrayList<Layer> retval = new ArrayList<Layer>();
		EditText nameText = (EditText) expandedView.findViewById(R.id.nameText);
		LandsatI3WMSLayer layer = new LandsatI3WMSLayer();
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
