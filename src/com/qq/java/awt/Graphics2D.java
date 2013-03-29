package com.qq.java.awt;

import java.util.HashMap;

import sun.awt.SunHints;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;

import com.qq.java.awt.RenderingHints.Key;
import com.qq.java.awt.font.FontRenderContext;
import com.qq.java.awt.font.GlyphVector;
import com.qq.java.awt.geom.AffineTransform;
import com.qq.java.awt.image.BufferedImage;

public class Graphics2D extends Graphics {

	/* Transform */
	public static final int TRANSFORM_GENERIC = 4; /* any 3x2 */
	public static final int TRANSFORM_TRANSLATESCALE = 3; /* scale XY */
	public static final int TRANSFORM_ANY_TRANSLATE = 2; /* non-int translate */
	public static final int TRANSFORM_INT_TRANSLATE = 1; /* int translate */
	public static final int TRANSFORM_ISIDENT = 0; /* Identity */
	private static Paint clearPaint;

	private Canvas canvas;
	private Color color;
	private Composite composite;
	private HashMap<Key, Object> renderingHints = new HashMap<Key, Object>();
	private Font font;
	protected FontMetrics fontMetrics;
	public AffineTransform transform;
	public int transX;
	public int transY;
	public int antialiasHint;
	public int textAntialiasHint;
	private int renderHint;
	private int fractionalMetricsHint;
	public int transformState;
	private boolean validFontInfo;
	private FontRenderContext glyphVectorFRC;
	private static Paint paint = new Paint();

	public Graphics2D(Canvas canvas) {
		this.canvas = canvas;
		transform = new AffineTransform();
		renderHint = SunHints.INTVAL_RENDER_DEFAULT;
		antialiasHint = SunHints.INTVAL_ANTIALIAS_OFF;
		textAntialiasHint = SunHints.INTVAL_TEXT_ANTIALIAS_DEFAULT;
		fractionalMetricsHint = SunHints.INTVAL_FRACTIONALMETRICS_OFF;
	}

	public void drawImage(BufferedImage image, int i, int j, int width, int height, Object object) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
		paint.setColor(color.getRGB());
	}

	public void fillRect(int i, int j, int width, int height) {
		//paint.setARGB(255, 255, 0, 0);
//		Paint clearPaint = new Paint();
//		clearPaint.setARGB(255, 255, 0, 0);
//		canvas.drawPaint(clearPaint);
//		canvas.clipRect(0, 0, 128, 128);
//		clearPaint.setARGB(255, 0, 255, 0);
//		canvas.drawPaint(clearPaint);
		if (AlphaComposite.Clear.equals(getComposite())) {
			Paint clearPaint = getClearPaint();
			canvas.drawRect(i, j, i + width, j + height, clearPaint);
		} else {
			canvas.drawRect(i, j, i + width, j + height, paint);
		}
	}
	
	private static Paint getClearPaint(){
		if (clearPaint == null){
			clearPaint = new Paint();
			clearPaint.setColor(android.graphics.Color.TRANSPARENT);
			clearPaint.setXfermode(new PorterDuffXfermode(Mode.SRC_OUT)); 
		}
		return clearPaint;
	}

	public Shape getClip() {
		// TODO Auto-generated method stub
		return null;
	}

	public Composite getComposite() {
		return this.composite;
	}

	public void setComposite(Composite prevComposite) {
		this.composite = prevComposite;
	}

	public void clipRect(int x, int y, int width, int height) {
		// TODO Auto-generated method stub

	}

	public void drawImage(BufferedImage transformedImage, int i, int j, Object object) {
		// TODO Auto-generated method stub

	}

	public void setClip(Shape prevClip) {
		// TODO Auto-generated method stub

	}

	public void translate(double tx, double ty) {
		transform.translate(tx, ty);
		invalidateTransform();
	}

	public void scale(double sx, double sy) {
		transform.scale(sx, sy);
		invalidateTransform();
	}

	public void setRenderingHint(Key keyInterpolation, Object valueInterpolationBilinear) {
		renderingHints.put(keyInterpolation, valueInterpolationBilinear);
	}

	public FontRenderContext getFontRenderContext() {
		if (cachedFRC == null) {
			int aahint = textAntialiasHint;
			if (aahint == SunHints.INTVAL_TEXT_ANTIALIAS_DEFAULT && antialiasHint == SunHints.INTVAL_ANTIALIAS_ON) {
				aahint = SunHints.INTVAL_TEXT_ANTIALIAS_ON;
			}
			// Translation components should be excluded from the FRC transform
			AffineTransform tx = null;
			if (transformState >= TRANSFORM_TRANSLATESCALE) {
				if (transform.getTranslateX() == 0 && transform.getTranslateY() == 0) {
					tx = transform;
				} else {
					tx = new AffineTransform(transform.getScaleX(), transform.getShearY(), transform.getShearX(), transform.getScaleY(), 0, 0);
				}
			}
			cachedFRC = new FontRenderContext(tx, SunHints.Value.get(SunHints.INTKEY_TEXT_ANTIALIASING, aahint), SunHints.Value.get(
					SunHints.INTKEY_FRACTIONALMETRICS, fractionalMetricsHint));
		}
		return cachedFRC;
	}

	private FontRenderContext cachedFRC;

	public void setFont(Font font) {
		this.font = font;
	}

	public void drawRect(int i, int j, int width, int height) {
		// TODO Auto-generated method stub

	}

	public void copyArea(int x, int y, int w, int h, int i, int j) {
		// TODO Auto-generated method stub

	}

	public void drawImage(Image img, int x, int y, int i, int j, int x2, int y2, int k, int l, Object object) {
		// TODO Auto-generated method stub

	}

	public void drawGlyphVector(GlyphVector str, int x, int y) {
		// TODO Auto-generated method stub

	}

	public void drawString(String str, int x, int y) {
//		Paint textPaint = new Paint();
//		textPaint.setARGB(255, 255, 255, 255);
		canvas.drawText(str, x, y, paint);
	}

	protected void invalidateTransform() {
		int type = transform.getType();
		int origTransformState = transformState;
		if (type == AffineTransform.TYPE_IDENTITY) {
			transformState = TRANSFORM_ISIDENT;
			transX = transY = 0;
		} else if (type == AffineTransform.TYPE_TRANSLATION) {
			double dtx = transform.getTranslateX();
			double dty = transform.getTranslateY();
			transX = (int) Math.floor(dtx + 0.5);
			transY = (int) Math.floor(dty + 0.5);
			if (dtx == transX && dty == transY) {
				transformState = TRANSFORM_INT_TRANSLATE;
			} else {
				transformState = TRANSFORM_ANY_TRANSLATE;
			}
		} else if ((type & (AffineTransform.TYPE_FLIP | AffineTransform.TYPE_MASK_ROTATION | AffineTransform.TYPE_GENERAL_TRANSFORM)) == 0) {
			transformState = TRANSFORM_TRANSLATESCALE;
			transX = transY = 0;
		} else {
			transformState = TRANSFORM_GENERIC;
			transX = transY = 0;
		}

		if (transformState >= TRANSFORM_TRANSLATESCALE || origTransformState >= TRANSFORM_TRANSLATESCALE) {
			/*
			 * Its only in this case that the previous or current transform was
			 * more than a translate that font info is invalidated
			 */
			cachedFRC = null;
			this.validFontInfo = false;
			this.fontMetrics = null;
			// this.glyphVectorFontInfo = null;

			if (transformState != origTransformState) {
				// invalidatePipe();
			}
		}
		// if (strokeState != STROKE_CUSTOM) {
		// validateBasicStroke((BasicStroke) stroke);
		// }
	}

	public Object getRenderingHint(Key keyInterpolation) {
		// TODO Auto-generated method stub
		return null;
	}

	public void drawImage(BufferedImage bufferedImage, AffineTransform transform2, Object object) {
		// TODO Auto-generated method stub
		
	}

}
