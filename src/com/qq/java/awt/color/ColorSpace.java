package com.qq.java.awt.color;

public class ColorSpace {

	static final long serialVersionUID = -409452704308689724L;

    private int type;
    private int numComponents;
    private transient String [] compName = null;

    // Cache of singletons for the predefined color spaces.
    private static ColorSpace sRGBspace;
    private static ColorSpace XYZspace;
    private static ColorSpace PYCCspace;
    private static ColorSpace GRAYspace;
    private static ColorSpace LINEAR_RGBspace;
    
    /**
     * Any of the family of XYZ color spaces.
     */
    public static final int TYPE_XYZ = 0;

    /**
     * Any of the family of Lab color spaces.
     */
    public static final int TYPE_Lab = 1;

    /**
     * Any of the family of Luv color spaces.
     */
    public static final int TYPE_Luv = 2;

    /**
     * Any of the family of YCbCr color spaces.
     */
    public static final int TYPE_YCbCr = 3;

    /**
     * Any of the family of Yxy color spaces.
     */
    public static final int TYPE_Yxy = 4;

    /**
     * Any of the family of RGB color spaces.
     */
    public static final int TYPE_RGB = 5;

    /**
     * Any of the family of GRAY color spaces.
     */
    public static final int TYPE_GRAY = 6;

    /**
     * Any of the family of HSV color spaces.
     */
    public static final int TYPE_HSV = 7;

    /**
     * Any of the family of HLS color spaces.
     */
    public static final int TYPE_HLS = 8;

    /**
     * Any of the family of CMYK color spaces.
     */
    public static final int TYPE_CMYK = 9;

    /**
     * Any of the family of CMY color spaces.
     */
    public static final int TYPE_CMY = 11;

    /**
     * Generic 2 component color spaces.
     */
    public static final int TYPE_2CLR = 12;

    /**
     * Generic 3 component color spaces.
     */
    public static final int TYPE_3CLR = 13;

    /**
     * Generic 4 component color spaces.
     */
    public static final int TYPE_4CLR = 14;

    /**
     * Generic 5 component color spaces.
     */
    public static final int TYPE_5CLR = 15;

    /**
     * Generic 6 component color spaces.
     */
    public static final int TYPE_6CLR = 16;

    /**
     * Generic 7 component color spaces.
     */
    public static final int TYPE_7CLR = 17;

    /**
     * Generic 8 component color spaces.
     */
    public static final int TYPE_8CLR = 18;

    /**
     * Generic 9 component color spaces.
     */
    public static final int TYPE_9CLR = 19;

    /**
     * Generic 10 component color spaces.
     */
    public static final int TYPE_ACLR = 20;

    /**
     * Generic 11 component color spaces.
     */
    public static final int TYPE_BCLR = 21;

    /**
     * Generic 12 component color spaces.
     */
    public static final int TYPE_CCLR = 22;

    /**
     * Generic 13 component color spaces.
     */
    public static final int TYPE_DCLR = 23;

    /**
     * Generic 14 component color spaces.
     */
    public static final int TYPE_ECLR = 24;

    /**
     * Generic 15 component color spaces.
     */
    public static final int TYPE_FCLR = 25;

    /**
     * The sRGB color space defined at
     * <A href="http://www.w3.org/pub/WWW/Graphics/Color/sRGB.html">
     * http://www.w3.org/pub/WWW/Graphics/Color/sRGB.html
     * </A>.
     */
    public static final int CS_sRGB = 1000;

    /**
     * A built-in linear RGB color space.  This space is based on the
     * same RGB primaries as CS_sRGB, but has a linear tone reproduction curve.
     */
    public static final int CS_LINEAR_RGB = 1004;

    /**
     * The CIEXYZ conversion color space defined above.
     */
    public static final int CS_CIEXYZ = 1001;

    /**
     * The Photo YCC conversion color space.
     */
    public static final int CS_PYCC = 1002;

    /**
     * The built-in linear gray scale color space.
     */
    public static final int CS_GRAY = 1003;
    
    public static ColorSpace getInstance (int colorspace)
    {
    	return null;
    }

}
