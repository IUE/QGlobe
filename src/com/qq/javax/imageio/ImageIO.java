package com.qq.javax.imageio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;

import android.graphics.Bitmap;

import com.qq.java.awt.image.BufferedImage;
import com.qq.javax.imageio.stream.ImageInputStream;
import com.qq.javax.imageio.stream.ImageOutputStream;

public class ImageIO {
	
	public static BufferedImage read(File tempFile) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public static BufferedImage read(InputStream inputStream) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
    public static BufferedImage read(URL input) throws IOException {
    	// TODO Auto-generated method stub
		return null;
    }

	public static boolean write(BufferedImage image, String string, File outFile) throws IOException {
		if ("png".equals(string)){
			try {
			       FileOutputStream out = new FileOutputStream(outFile);
			       image.getBitmap().compress(Bitmap.CompressFormat.PNG, 100, out);
			       out.close();
			} catch (Exception e) {
			       e.printStackTrace();
			}


		}
		return false;
	}

	public static void write(BufferedImage image, String string, ImageOutputStream ios) {
		// TODO Auto-generated method stub
		
	}

	public static String[] getWriterMIMETypes() {
		// TODO Auto-generated method stub
		return new String[0];
	}

}
