package com.qq.worldwind.android.layer;

import gov.nasa.worldwind.WorldWindow;
import gov.nasa.worldwind.layers.Layer;
import gov.nasa.worldwind.layers.LayerList;

import java.util.ArrayList;
import java.util.Collection;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.qq.worldwind.android.R;
import com.qq.worldwind.android.WorldWindGLSurfaceView;

public class AddLayerActivity extends Activity {
	
	private static ArrayList<ILayerType> layerTypes = new ArrayList<ILayerType>();
	
	static{
		layerTypes.add(new SkyGradientLayerType());
		layerTypes.add(new BMNGOneImageLayerType());
		layerTypes.add(new BMNGWMSLayerType());
		layerTypes.add(new CompassLayerType());
		layerTypes.add(new LandsatI3WMSLayerType());
		layerTypes.add(new ScalebarLayerType());
		layerTypes.add(new StarsLayerType());
		layerTypes.add(new MSVirtualEarthLayerType());
		layerTypes.add(new WMSLayerType());
		layerTypes.add(new WorldMapLayerType());
	}
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addlayerview);
		final Spinner layerSpinner = (Spinner) findViewById(R.id.layerType);
		final LinearLayout expandedLayout = (LinearLayout) findViewById(R.id.expandedLayout);
		final Button addButton = (Button) findViewById(R.id.addButton);
		ArrayList<String> layerTypeCategories = new ArrayList<String>();
		for (ILayerType type : layerTypes){
			layerTypeCategories.add(type.getCategory());
		}
		layerSpinner.setAdapter(new LayerArrayAdapter(this, layerTypeCategories));
		layerSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
				ILayerType layerType = layerTypes.get(pos);
				expandedLayout.removeAllViews();
				View expandedView = layerType.getExpandedView(AddLayerActivity.this);
				if (expandedView != null){
					if (expandedView.getParent() != null){
						((LinearLayout)expandedView.getParent()).removeView(expandedView);
					}
					expandedLayout.addView(expandedView);
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});
		addButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ILayerType layerType = layerTypes.get(layerSpinner.getSelectedItemPosition());
				Collection<Layer> newLayers = layerType.createLayers();
				WorldWindow wwd = WorldWindGLSurfaceView.getWorldWindow();
				LayerList layers = wwd.getModel().getLayers();
				layers.addAll(newLayers);
				finish();
			}
		});
	}

	private class LayerArrayAdapter extends ArrayAdapter<String> implements SpinnerAdapter {

		private final ArrayList<String> types;

		public LayerArrayAdapter(Activity context, ArrayList<String> types) {
			super(context, R.layout.addlayerspinner, types);
			this.types = types;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			final String layerType = types.get(position);
			View retval = convertView;
			if (retval == null) {
				LayoutInflater inflator = getLayoutInflater();
				retval = inflator.inflate(R.layout.addlayerspinner, null);
			}
			((TextView) retval).setText(layerType);
			return retval;
		}
	}

}
