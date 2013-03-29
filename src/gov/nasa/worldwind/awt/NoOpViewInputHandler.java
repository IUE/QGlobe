package gov.nasa.worldwind.awt;


import gov.nasa.worldwind.WorldWindow;
import gov.nasa.worldwind.animation.Animator;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.geom.Vec4;

import com.qq.java.awt.Point;
import com.qq.java.awt.event.FocusEvent;
import com.qq.java.awt.event.KeyEvent;
import com.qq.java.awt.event.MouseEvent;
import com.qq.java.awt.event.MouseWheelEvent;

public class NoOpViewInputHandler implements ViewInputHandler {

	private WorldWindow wwd;

	@Override
	public WorldWindow getWorldWindow() {
		return wwd;
	}

	@Override
	public void setWorldWindow(WorldWindow newWorldWindow) {
		this.wwd = newWorldWindow;
	}

	@Override
	public boolean isEnableSmoothing() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setEnableSmoothing(boolean enable) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLockHeading() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setLockHeading(boolean lock) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isStopOnFocusLost() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setStopOnFocusLost(boolean stop) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getDragSlopeFactor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDragSlopeFactor(double factor) {
		// TODO Auto-generated method stub

	}

	@Override
	public double computeDragSlope(Point point1, Point point2, Vec4 vec1, Vec4 vec2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void goTo(Position lookAtPos, double elevation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopAnimators() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isAnimating() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addAnimator(Animator animator) {
		// TODO Auto-generated method stub

	}

	@Override
	public void apply() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewApplied() {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ViewInputAttributes getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAttributes(ViewInputAttributes attributes) {
		// TODO Auto-generated method stub
		
	}

}
