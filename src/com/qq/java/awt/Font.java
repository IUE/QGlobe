package com.qq.java.awt;

import java.io.Serializable;
import java.text.CharacterIterator;

import android.graphics.Paint;
import android.graphics.Rect;

import com.qq.java.awt.font.FontRenderContext;
import com.qq.java.awt.font.GlyphVector;
import com.qq.java.awt.font.LineMetrics;
import com.qq.java.awt.font.SimpleGlyphVector;
import com.qq.java.awt.geom.Rectangle2D;

public class Font implements Serializable {

	public static final int BOLD = 0;
	public static final int ITALIC = 0;
	public static final int PLAIN = 0;
	private String name;
	private int style;
	private int size;
	private int pointSize;
	private Paint paint;

	/**
	 * Creates a new <code>Font</code> from the specified name, style and point
	 * size.
	 * <p>
	 * The font name can be a font face name or a font family name. It is used
	 * together with the style to find an appropriate font face. When a font
	 * family name is specified, the style argument is used to select the most
	 * appropriate face from the family. When a font face name is specified, the
	 * face's style and the style argument are merged to locate the best
	 * matching font from the same family. For example if face name "Arial Bold"
	 * is specified with style <code>Font.ITALIC</code>, the font system looks
	 * for a face in the "Arial" family that is bold and italic, and may
	 * associate the font instance with the physical font face
	 * "Arial Bold Italic". The style argument is merged with the specified
	 * face's style, not added or subtracted. This means, specifying a bold face
	 * and a bold style does not double-embolden the font, and specifying a bold
	 * face and a plain style does not lighten the font.
	 * <p>
	 * If no face for the requested style can be found, the font system may
	 * apply algorithmic styling to achieve the desired style. For example, if
	 * <code>ITALIC</code> is requested, but no italic face is available, glyphs
	 * from the plain face may be algorithmically obliqued (slanted).
	 * <p>
	 * Font name lookup is case insensitive, using the case folding rules of the
	 * US locale.
	 * <p>
	 * If the <code>name</code> parameter represents something other than a
	 * logical font, i.e. is interpreted as a physical font face or family, and
	 * this cannot be mapped by the implementation to a physical font or a
	 * compatible alternative, then the font system will map the Font instance
	 * to "Dialog", such that for example, the family as reported by
	 * {@link #getFamily() getFamily} will be "Dialog".
	 * <p>
	 * 
	 * @param name
	 *            the font name. This can be a font face name or a font family
	 *            name, and may represent either a logical font or a physical
	 *            font found in this <code>GraphicsEnvironment</code>. The
	 *            family names for logical fonts are: Dialog, DialogInput,
	 *            Monospaced, Serif, or SansSerif. Pre-defined String constants
	 *            exist for all of these names, eg @see #DIALOG. If
	 *            <code>name</code> is <code>null</code>, the
	 *            <em>logical font name</em> of the new <code>Font</code> as
	 *            returned by <code>getName()</code>is set to the name
	 *            "Default".
	 * @param style
	 *            the style constant for the <code>Font</code> The style
	 *            argument is an integer bitmask that may be PLAIN, or a bitwise
	 *            union of BOLD and/or ITALIC (for example, ITALIC or
	 *            BOLD|ITALIC). If the style argument does not conform to one of
	 *            the expected integer bitmasks then the style is set to PLAIN.
	 * @param size
	 *            the point size of the <code>Font</code>
	 * @see GraphicsEnvironment#getAllFonts
	 * @see GraphicsEnvironment#getAvailableFontFamilyNames
	 * @since JDK1.0
	 */
	public Font(String name, int style, int size) {
		this.name = (name != null) ? name : "Default";
		this.style = (style & ~0x03) == 0 ? style : 0;
		this.size = size;
		this.pointSize = size;
		paint = new Paint();
	}

	public static Font decode(String string) {
		return new Font(string,0,12);
	}

	/**
	 * Returns the logical name of this <code>Font</code>. Use
	 * <code>getFamily</code> to get the family name of the font. Use
	 * <code>getFontName</code> to get the font face name of the font.
	 * 
	 * @return a <code>String</code> representing the logical name of this
	 *         <code>Font</code>.
	 * @see #getFamily
	 * @see #getFontName
	 * @since JDK1.0
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the style of this <code>Font</code>. The style can be PLAIN,
	 * BOLD, ITALIC, or BOLD+ITALIC.
	 * 
	 * @return the style of this <code>Font</code>
	 * @see #isPlain
	 * @see #isBold
	 * @see #isItalic
	 * @since JDK1.0
	 */
	public int getStyle() {
		return style;
	}

	/**
	 * Returns the point size of this <code>Font</code>, rounded to an integer.
	 * Most users are familiar with the idea of using <i>point size</i> to
	 * specify the size of glyphs in a font. This point size defines a
	 * measurement between the baseline of one line to the baseline of the
	 * following line in a single spaced text document. The point size is based
	 * on <i>typographic points</i>, approximately 1/72 of an inch.
	 * <p>
	 * The Java(tm)2D API adopts the convention that one point is equivalent to
	 * one unit in user coordinates. When using a normalized transform for
	 * converting user space coordinates to device space coordinates 72 user
	 * space units equal 1 inch in device space. In this case one point is 1/72
	 * of an inch.
	 * 
	 * @return the point size of this <code>Font</code> in 1/72 of an inch
	 *         units.
	 * @see #getSize2D
	 * @see GraphicsConfiguration#getDefaultTransform
	 * @see GraphicsConfiguration#getNormalizingTransform
	 * @since JDK1.0
	 */
	public int getSize() {
		return size;
	}

	public Font deriveFont(int fontStyle) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isItalic() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isBold() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getNumGlyphs() {
		return 1; //draw everything in one glyph
	}

	public GlyphVector createGlyphVector(FontRenderContext frc, CharacterIterator ci) {
		return new SimpleGlyphVector(this,frc,ci);
	}

	public GlyphVector createGlyphVector(FontRenderContext frc, String str) {
		// TODO Auto-generated method stub
		return null;
	}

	public GlyphVector createGlyphVector(FontRenderContext fontRenderContext, char[] singleUnicode) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasUniformLineMetrics() {
		// TODO Auto-generated method stub
		return false;
	}

	public LineMetrics getLineMetrics(String str, FontRenderContext myFRC) {
		// TODO Auto-generated method stub
		return null;
	}

	public LineMetrics getLineMetrics(String str, int beginIndex, int limit, FontRenderContext myFRC) {
		// TODO Auto-generated method stub
		return null;
	}

	public LineMetrics getLineMetrics(char[] chars, int beginIndex, int limit, FontRenderContext myFRC) {
		// TODO Auto-generated method stub
		return null;
	}

	public LineMetrics getLineMetrics(CharacterIterator ci, int beginIndex, int limit, FontRenderContext myFRC) {
		// TODO Auto-generated method stub
		return null;
	}

	public Rectangle2D getStringBounds(String str, FontRenderContext frc) {
		char[] array = str.toCharArray();
        return getStringBounds(array, 0, array.length, frc);
	}

	public Rectangle2D getStringBounds(String str, int beginIndex, int limit, FontRenderContext frc) {
		String substr = str.substring(beginIndex, limit);
        return getStringBounds(substr, frc);
	}

	public Rectangle2D getStringBounds(char[] chars, int beginIndex, int limit, FontRenderContext myFRC) {
		Rect bounds = new Rect();
		paint.getTextBounds(chars, beginIndex, limit, bounds);
		Rectangle2D retval = new Rectangle2D.Float(bounds.left, bounds.top, bounds.right - bounds.left, bounds.bottom - bounds.top);
		return retval;
	}

	/**
     * Returns the logical bounds of the characters indexed in the
     * specified {@link CharacterIterator} in the
     * specified <code>FontRenderContext</code>.  The logical bounds
     * contains the origin, ascent, advance, and height, which includes   
     * the leading.  The logical bounds does not always enclose all the
     * text.  For example, in some languages and in some fonts, accent
     * marks can be positioned above the ascent or below the descent. 
     * To obtain a visual bounding box, which encloses all the text, 
     * use the {@link TextLayout#getBounds() getBounds} method of 
     * <code>TextLayout</code>.
     * <p>Note: The returned bounds is in baseline-relative coordinates
     * (see {@link java.awt.Font class notes}).
     * @param ci the specified <code>CharacterIterator</code>
     * @param beginIndex the initial offset in <code>ci</code>
     * @param limit the end offset in <code>ci</code>
     * @param frc the specified <code>FontRenderContext</code>   
     * @return a <code>Rectangle2D</code> that is the bounding box of the
     * characters indexed in the specified <code>CharacterIterator</code>
     * in the specified <code>FontRenderContext</code>.
     * @see FontRenderContext
     * @see Font#createGlyphVector
     * @since 1.2
     * @throws IndexOutOfBoundsException if <code>beginIndex</code> is
     *         less than the start index of <code>ci</code>, or 
     *         <code>limit</code> is greater than the end index of 
     *         <code>ci</code>, or <code>beginIndex</code> is greater 
     *         than <code>limit</code>
     */
    public Rectangle2D getStringBounds(CharacterIterator ci,
                                    int beginIndex, int limit,
                                       FontRenderContext frc) {
        int start = ci.getBeginIndex();
        int end = ci.getEndIndex();

        if (beginIndex < start) {
            throw new IndexOutOfBoundsException("beginIndex: " + beginIndex);
        } 
        if (limit > end) {
            throw new IndexOutOfBoundsException("limit: " + limit);
        }
        if (beginIndex > limit) {
            throw new IndexOutOfBoundsException("range length: " + 
                                                (limit - beginIndex));
        }

        char[]  arr = new char[limit - beginIndex];

        ci.setIndex(beginIndex);
        for(int idx = 0; idx < arr.length; idx++) {
            arr[idx] = ci.current();
            ci.next();
        }

        return getStringBounds(arr,0,arr.length,frc);
    }

	public Rectangle2D getMaxCharBounds(FontRenderContext myFRC) {
		// TODO Auto-generated method stub
		return null;
	}

}
