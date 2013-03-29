package com.qq.worldwind.android.util;

public class ConversionUtil {

	public static float[] convertToFloatArray(double[] doubles) {
		float[] floats = new float[doubles.length];
		for (int i = 0; i < doubles.length; i++) {
			floats[i] = (float) doubles[i];
		}
		return floats;
	}

	public static boolean[] convertToBooleanArray(byte[] bytes) {
		boolean[] booleans = new boolean[bytes.length];
		for (int i = 0; i < bytes.length; i++) {
			if (bytes[i] == 0) {
				booleans[i] = false;
			} else {
				booleans[i] = true;
			}
		}
		return booleans;
	}

	public static byte[] convertToByteArray(boolean[] booleans) {
		byte[] bytes = new byte[booleans.length];
		for (int i = 0; i < booleans.length; i++) {
			if (booleans[i]) {
				bytes[i] = 1;
			} else {
				bytes[i] = 0;
			}
		}
		return bytes;
	}

	public static int[] convertToIntArray(byte[] bytes) {
		int[] ints = new int[bytes.length];
		for (int i = 0; i < bytes.length; i++) {
			ints[i] = bytes[i];
		}
		return ints;
	}
	
}
