package com.qq.worldwind.android;

import gov.nasa.worldwind.Model;
import gov.nasa.worldwind.WorldWind;
import gov.nasa.worldwind.WorldWindow;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.cache.FileStore;
import gov.nasa.worldwind.util.ColorUtil;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

public class WorldWindGLSurfaceView extends GLSurfaceView {

	private static WWAutoRenderer renderer;
	private boolean rendererSet = false;

	public WorldWindGLSurfaceView(Context context) {
		super(context);
		init();
	}
	
	public boolean isRendererSet(){
		return rendererSet ;
	}

	private void init() {
		FileStore fileStore = WorldWind.getDataFileStore();
		if (fileStore instanceof AndroidDataFileStore) {
			((AndroidDataFileStore) fileStore).setContext(getContext());
		}
//		setEGLConfigChooser(8, 8, 8, 8, 0, 0);
//		ColorUtil.setColorMode(ColorUtil.RGBA_8888);
		WWAutoRenderer renderer = getWWRenderer();
		setRenderer(renderer);
		setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
		rendererSet = true;
	}

	public boolean onTouchEvent(final MotionEvent event) {
		//printSamples(event);
		renderer.processEvent(event, this);
		return true;
	}
	
	void printSamples(MotionEvent ev) {
	     final int historySize = ev.getHistorySize();
	     final int pointerCount = ev.getPointerCount();
	     for (int h = 0; h < historySize; h++) {
	         System.out.printf("At time %d:", ev.getHistoricalEventTime(h));
	         for (int p = 0; p < pointerCount; p++) {
	             System.out.printf("  pointer %d: (%f,%f)",
	                 ev.getPointerId(p), ev.getHistoricalX(p, h), ev.getHistoricalY(p, h));
	         }
	     }
	     System.out.printf("At time %d:", ev.getEventTime());
	     for (int p = 0; p < pointerCount; p++) {
	         System.out.printf("  pointer %d: (%f,%f)",
	             ev.getPointerId(p), ev.getX(p), ev.getY(p));
	     }
	     System.out.println();
	 }
	
	private WWAutoRenderer getWWRenderer(){
		if (renderer == null){
			renderer = new WWAutoRenderer(this);
			Model m = (Model) WorldWind.createConfigurationComponent(AVKey.MODEL_CLASS_NAME);
			renderer.setModel(m);
		} else {
			renderer.setView(this);
		}
		return renderer;
	}
	
	public static WorldWindow getWorldWindow(){
		return renderer;
	}


}
