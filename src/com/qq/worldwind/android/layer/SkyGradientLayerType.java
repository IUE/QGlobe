package com.qq.worldwind.android.layer;

import java.util.ArrayList;
import java.util.Collection;

import com.qq.worldwind.android.R;

import gov.nasa.worldwind.layers.Layer;
import gov.nasa.worldwind.layers.ScalebarLayer;
import gov.nasa.worldwind.layers.SkyGradientLayer;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class SkyGradientLayerType implements ILayerType {

	private View expandedView;

	@Override
	public String getCategory() {
		return "Atmosphere";
	}

	@Override
	public Collection<Layer> createLayers() {
		ArrayList<Layer> retval = new ArrayList<Layer>();
		EditText nameText = (EditText) expandedView.findViewById(R.id.nameText);
		SkyGradientLayer layer = new SkyGradientLayer();
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
