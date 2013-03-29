package com.qq.java.awt.image;

import android.graphics.Bitmap;

public class WritableRaster extends Raster{

	private Bitmap bitmap;

	public WritableRaster(Bitmap bitmap) {
		this.bitmap = bitmap;
	}

	public int getWidth() {
		return bitmap.getWidth();
	}

	public int getHeight() {
		return bitmap.getHeight();
	}

	public void getSamples(int i, int j, int width, int height, int k, int[] samples) {
		// TODO Auto-generated method stub
		
	}

	public SampleModel getSampleModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getDataElements(int i, int i2, int width, int j, Object scanline1) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDataElements(int i, int i2, int width, int j, Object scanline2) {
		// TODO Auto-generated method stub
		
	}

}
