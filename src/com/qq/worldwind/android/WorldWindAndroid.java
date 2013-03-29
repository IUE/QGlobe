package com.qq.worldwind.android;

import com.qq.worldwind.android.R;
import com.qq.worldwind.android.layer.LayerManagerActivity;

import gov.nasa.worldwind.Model;
import gov.nasa.worldwind.WorldWind;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.cache.FileStore;
import android.app.Activity;
import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class WorldWindAndroid extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		WorldWindGLSurfaceView view = new WorldWindGLSurfaceView(this);
		// view.setDebugFlags(GLSurfaceView.DEBUG_CHECK_GL_ERROR |
		// GLSurfaceView.DEBUG_LOG_GL_CALLS);
		// FileStore fileStore = WorldWind.getDataFileStore();
		// if (fileStore instanceof AndroidDataFileStore){
		// ((AndroidDataFileStore)fileStore).setContext(this);
		// }
		// WWAutoRenderer renderer = new WWAutoRenderer();
		// Model m = (Model)
		// WorldWind.createConfigurationComponent(AVKey.MODEL_CLASS_NAME);
		// renderer.setModel(m);
		// view.setRenderer(renderer);
		setContentView(view);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.layers:
			showLayerManager();
			return true;
		}

		return false;
	}

	private void showLayerManager() {
		Intent intent = new Intent(this, LayerManagerActivity.class);
		startActivity(intent);
	}
}