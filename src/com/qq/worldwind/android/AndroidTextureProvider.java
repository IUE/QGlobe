package com.qq.worldwind.android;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.Buffer;
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;

import com.sun.opengl.util.BufferUtil;
import com.sun.opengl.util.texture.TextureData;
import com.sun.opengl.util.texture.spi.TextureProvider;

public class AndroidTextureProvider implements TextureProvider {

	@Override
	public TextureData newTextureData(File file, int internalFormat, int pixelFormat, boolean mipmap, String fileSuffix) throws IOException {
		Bitmap bitmap = BitmapFactory.decodeFile(file.getPath());
		return newTextureData(bitmap, internalFormat, pixelFormat, mipmap, fileSuffix);
	}

	@Override
	public TextureData newTextureData(InputStream stream, int internalFormat, int pixelFormat, boolean mipmap, String fileSuffix) throws IOException {
		Bitmap bitmap = BitmapFactory.decodeStream(stream);
		return newTextureData(bitmap, internalFormat, pixelFormat, mipmap, fileSuffix);
	}

	@Override
	public TextureData newTextureData(URL url, int internalFormat, int pixelFormat, boolean mipmap, String fileSuffix) throws IOException {
		Bitmap bitmap = BitmapFactory.decodeStream(url.openStream());
		return newTextureData(bitmap, internalFormat, pixelFormat, mipmap, fileSuffix);
	}

	private TextureData newTextureData(Bitmap bitmap, int internalFormat, int pixelFormat, boolean mipmap, String fileSuffix) {
		int width = bitmap.getWidth();
		int height = bitmap.getHeight();
		int pixelType = 0;
		Config config = bitmap.getConfig();
		Buffer buffer = null;
		if (Config.ARGB_8888.equals(config)){
			buffer = BufferUtil.newByteBuffer(width * height * 4);
			bitmap.copyPixelsToBuffer(buffer);
			buffer.rewind();
			internalFormat = GL.GL_RGBA;
			pixelFormat = GL.GL_RGBA;
			pixelType = GL.GL_UNSIGNED_BYTE;
		} else if (Config.RGB_565.equals(config)) {
			buffer = BufferUtil.newByteBuffer(width * height * 2);
			bitmap.copyPixelsToBuffer(buffer);
			buffer.rewind();
			internalFormat = GL.GL_RGB;
			pixelFormat = GL.GL_RGB;
			pixelType = GL.GL_UNSIGNED_SHORT_5_6_5;
		}
		bitmap.recycle();
		TextureData retval = new TextureData(internalFormat, width, height, 0, pixelFormat, pixelType, mipmap, false, true, buffer, null);
		//retval.setBitmap(bitmap);
		return retval;
	}

}
