package com.qq.worldwind.android.layer;

import gov.nasa.worldwind.WorldWindow;
import gov.nasa.worldwind.layers.Layer;
import gov.nasa.worldwind.layers.LayerList;

import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import com.qq.worldwind.android.R;
import com.qq.worldwind.android.WorldWindGLSurfaceView;

public class LayerManagerActivity extends ListActivity {

	private com.qq.worldwind.android.layer.LayerManagerActivity.LayerArrayAdapter adapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		WorldWindow wwd = WorldWindGLSurfaceView.getWorldWindow();
		LayerList layers = wwd.getModel().getLayers();
		adapter = new LayerArrayAdapter(this, layers);
		setListAdapter(adapter);

		DragListView tlv = (DragListView) getListView();
		View removerow = findViewById(R.id.removeView);
		tlv.setTrashcan((ImageView) removerow);

		tlv.setDropListener(onDrop);
		tlv.setRemoveListener(onRemove);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.layermanagermenu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.addLayer:
			showAddLayerView();
			return true;
		}
		return false;
	}

	private void showAddLayerView() {
		Intent intent = new Intent(this, AddLayerActivity.class);
		startActivity(intent);
	}

	public void onResume() {
		super.onResume();
		LayerArrayAdapter adapter = (LayerArrayAdapter) getListAdapter();
		if (adapter != null) {
			adapter.notifyDataSetChanged();
		}
	}

	private DragListView.DropListener onDrop = new DragListView.DropListener() {
		@Override
		public void drop(int from, int to) {
			Layer item = adapter.getItem(from);
			adapter.remove(item);
			adapter.insert(item, to);
		}
	};

	private DragListView.RemoveListener onRemove = new DragListView.RemoveListener() {
		@Override
		public void remove(int which) {
			adapter.remove(adapter.getItem(which));
		}
	};

	private class LayerArrayAdapter extends ArrayAdapter<Layer> {

		private final List<Layer> list;

		public LayerArrayAdapter(Activity context, List<Layer> list) {
			super(context, R.layout.layermanagerrow, list);
			this.list = list;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			final Layer layer = list.get(position);
			View retval = convertView;
			if (retval == null) {
				LayoutInflater inflator = getLayoutInflater();
				retval = inflator.inflate(R.layout.layermanagerrow, null);
			}
			CheckBox checkbox = (CheckBox) retval.findViewById(R.id.check);
			checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					layer.setEnabled(buttonView.isChecked());
				}
			});
			checkbox.setChecked(layer.isEnabled());
			checkbox.setText(layer.getName());
			return retval;
		}
	}

}
