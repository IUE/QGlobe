package gov.nasa.worldwind.util;

import javax.media.opengl.GL;

import gov.nasa.worldwind.render.DrawContext;

import com.qq.java.awt.Color;
import com.sun.opengl.util.BufferUtil;

public class ColorUtil {

	public static final int RGB_565 = 0; // used by default

	public static final int RGBA_8888 = 1;

	private static int currentMode = RGB_565;

	public static int getColorMode() {
		return currentMode;
	}

	public static void setColorMode(int mode) {
		currentMode = mode;
	}

	public static int incrementColorCode(int colorCode8888, Color clearColor) {
		if (RGBA_8888 == currentMode) {
			colorCode8888++;
			int clearColorCode = clearColor.getRGB();

			if (clearColorCode == colorCode8888)
				colorCode8888++;

			if (colorCode8888 >= 0x00FFFFFF) {
				colorCode8888 = 1; // no black, no white
				if (clearColorCode == colorCode8888)
					colorCode8888++;
			}
			return colorCode8888;
		} else {
			int colorCode565 = convert8888To565Code(colorCode8888);
			colorCode565++;
			int clearColorCode565 = get565Code(clearColor);

			if (clearColorCode565 == colorCode565)
				colorCode565++;

			if (colorCode565 >= 0xFFFF) {
				colorCode565 = 1; // no black, no white
				if (clearColorCode565 == colorCode565)
					colorCode565++;
			}
			return convert565To8888Code(colorCode565);
		}
	}

	private static int convert8888To565Code(int colorCode) {
		int r = (colorCode >> 16) & 0xFF;
		int g = (colorCode >> 8) & 0xFF;
		int b = colorCode & 0xFF;
		int r5 = (int) (r * .125);
		int g6 = (int) (g * .25);
		int b5 = (int) (b * .125);
		return (r5 << 11) + (g6 << 5) + b5;
	}

	private static int convert565To8888Code(int colorCode) {
		int r = (colorCode & 0xf800) >> 11;
		int g = (colorCode & 0x07E0) >> 5;
		int b = colorCode & 0x001F;
		int r8 = (int) (r * 8);
		int g8 = (int) (g * 4);
		int b8 = (int) (b * 8);
		return (r8 << 16) + (g8 << 8) + b8;
	}

	private static int get565Code(Color clearColor) {
		int r = (int) (clearColor.getRed() * .125);
		int g = (int) (clearColor.getGreen() * .25);
		int b = (int) (clearColor.getBlue() * .125);
		return (r << 11) + (g << 5) + b;
	}

	public static int getColorCode(int x, int y, DrawContext dc) {
		GL gl = dc.getGL();
		if (RGBA_8888 == currentMode) {
			java.nio.ByteBuffer pixel = BufferUtil.newByteBuffer(4);
			gl.glReadPixels(x, y, 1, 1, javax.media.opengl.GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, pixel);
			com.qq.java.awt.Color topColor = null;
			try {
				topColor = new com.qq.java.awt.Color(pixel.get(0) & 0xff, pixel.get(1) & 0xff, pixel.get(2) & 0xff, 0);
			} catch (Exception e) {
				Logging.logger().severe("layers.InvalidPickColorRead");
			}

			return topColor != null ? topColor.getRGB() : 0;
		} else {
			java.nio.ShortBuffer pixel = BufferUtil.newShortBuffer(1);
			gl.glReadPixels(x, y, 1, 1, GL.GL_RGB, GL.GL_UNSIGNED_SHORT_5_6_5, pixel);
			return convert565To8888Code(pixel.get(0));
		}
	}

	/**
	 * returns the number of colors between the color codes;
	 * 
	 * @return
	 */
	public static int getNumColorsBetween(int startCode, int endCode) {
		if (RGBA_8888 == currentMode) {
			return endCode - startCode;
		} else {
			int start565 = convert8888To565Code(startCode);
			int end565 = convert8888To565Code(endCode);
			return end565 - start565;
		}
	}
}
