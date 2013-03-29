package com.qq.java.awt.font;

import java.text.CharacterIterator;

import com.qq.java.awt.Font;
import com.qq.java.awt.Shape;
import com.qq.java.awt.geom.AffineTransform;
import com.qq.java.awt.geom.Point2D;
import com.qq.java.awt.geom.Rectangle2D;

public class SimpleGlyphVector extends GlyphVector {

	private Font font;
	private FontRenderContext frc;
	private CharacterIterator ci;

	public SimpleGlyphVector(Font font, FontRenderContext frc, CharacterIterator ci) {
		this.font = font;
		this.frc = frc;
		this.ci=ci;
	}

	@Override
	public Font getFont() {
		return font;
	}

	@Override
	public FontRenderContext getFontRenderContext() {
		return frc;
	}

	@Override
	public void performDefaultLayout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumGlyphs() {
		return 1;
	}

	@Override
	public int getGlyphCode(int glyphIndex) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] getGlyphCodes(int beginGlyphIndex, int numEntries, int[] codeReturn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle2D getLogicalBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle2D getVisualBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getOutline() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getOutline(float x, float y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getGlyphOutline(int glyphIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point2D getGlyphPosition(int glyphIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGlyphPosition(int glyphIndex, Point2D newPos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AffineTransform getGlyphTransform(int glyphIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGlyphTransform(int glyphIndex, AffineTransform newTX) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float[] getGlyphPositions(int beginGlyphIndex, int numEntries, float[] positionReturn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getGlyphLogicalBounds(int glyphIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getGlyphVisualBounds(int glyphIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getLayoutFlags() {
		return 1;
	}

	@Override
	public GlyphMetrics getGlyphMetrics(int glyphIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GlyphJustificationInfo getGlyphJustificationInfo(int glyphIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(GlyphVector set) {
		// TODO Auto-generated method stub
		return false;
	}

}
