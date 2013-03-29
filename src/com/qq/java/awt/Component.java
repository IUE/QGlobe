package com.qq.java.awt;

import android.opengl.GLSurfaceView;
import android.util.FloatMath;
import android.view.MotionEvent;

import com.qq.java.awt.event.FocusListener;
import com.qq.java.awt.event.KeyListener;
import com.qq.java.awt.event.MouseEvent;
import com.qq.java.awt.event.MouseListener;
import com.qq.java.awt.event.MouseMotionListener;
import com.qq.java.awt.event.MouseWheelEvent;
import com.qq.java.awt.event.MouseWheelListener;
import com.qq.javax.swing.event.EventListenerList;

public abstract class Component {

	protected EventListenerList eventListeners = new EventListenerList();
	private float downEventX;
	private float downEventY;
	private static int MODE_NONE = 0;
	private static int MODE_DRAG = 1;
	private static int MODE_TWO_POINTERS = 2;
	private static int MODE_THREE_POINTERS = 3;
	private int mode = MODE_NONE;
	private float oldDist;
	private static int TWO_MODE_UNDECIDED = 0;
	private static int TWO_MODE_ZOOM = 1;
	private static int TWO_MODE_TILT = 2;
	private int twoMode = TWO_MODE_UNDECIDED;

	public abstract String getName();

	public abstract Rectangle getBounds();

	public abstract int getWidth();

	public abstract int getHeight();

	public void removeKeyListener(KeyListener listener) {
		eventListeners.remove(KeyListener.class, listener);
	}

	public void removeMouseMotionListener(MouseMotionListener listener) {
		eventListeners.remove(MouseMotionListener.class, listener);
	}

	public void removeMouseListener(MouseListener listener) {
		eventListeners.remove(MouseListener.class, listener);
	}

	public void removeMouseWheelListener(MouseWheelListener listener) {
		eventListeners.remove(MouseWheelListener.class, listener);
	}

	public void removeFocusListener(FocusListener listener) {
		eventListeners.remove(FocusListener.class, listener);
	}

	public void addKeyListener(KeyListener listener) {
		eventListeners.add(KeyListener.class, listener);
	}

	public void addMouseMotionListener(MouseMotionListener listener) {
		eventListeners.add(MouseMotionListener.class, listener);
	}

	public void addMouseListener(MouseListener listener) {
		eventListeners.add(MouseListener.class, listener);
	}

	public void addMouseWheelListener(MouseWheelListener listener) {
		eventListeners.add(MouseWheelListener.class, listener);
	}

	public void addFocusListener(FocusListener listener) {
		eventListeners.add(FocusListener.class, listener);
	}

	public boolean processEvent(MotionEvent event, GLSurfaceView view) {
		int eventAction = event.getAction() & MotionEvent.ACTION_MASK;
		if (MotionEvent.ACTION_DOWN == eventAction) {
			downEventX = event.getX();
			downEventY = event.getY();
			mode = MODE_DRAG;
			final MouseMotionListener[] mouseMotionListeners = eventListeners.getListeners(MouseMotionListener.class);
			final MouseEvent mouseMovedEvent = new MouseEvent(this, MouseEvent.MOUSE_MOVED, event.getEventTime(), 0, (int) event.getX(), (int) event.getY(), 1,
					false, MouseEvent.BUTTON1);
			view.queueEvent(new Runnable() {

				@Override
				public void run() {
					for (MouseMotionListener listener : mouseMotionListeners) {
						listener.mouseMoved(mouseMovedEvent);
					}
				}
			});
			final MouseEvent mouseEvent = new MouseEvent(this, MouseEvent.MOUSE_PRESSED, event.getEventTime(), 0, (int) event.getX(), (int) event.getY(), 1,
					false, MouseEvent.BUTTON1);
			view.queueEvent(new Runnable() {

				@Override
				public void run() {
					MouseListener[] mouseListeners = eventListeners.getListeners(MouseListener.class);
					for (MouseListener listener : mouseListeners) {
						listener.mousePressed(mouseEvent);
					}
				}
			});
		} else if (MotionEvent.ACTION_POINTER_DOWN == eventAction) {
			downEventX = -1; // never click when multitouched
			downEventY = -1;
			oldDist = spacing(event);
			if (oldDist > 10f) {
				if (event.getPointerCount() == 2) {
					mode = MODE_TWO_POINTERS;
					twoMode = TWO_MODE_UNDECIDED;
				} else if (event.getPointerCount() == 3) {
					mode = MODE_THREE_POINTERS;
				}
			}
		} else if (MotionEvent.ACTION_UP == eventAction) {
			final MouseEvent mouseReleased = new MouseEvent(this, MouseEvent.MOUSE_RELEASED, event.getEventTime(), 0, (int) event.getX(), (int) event.getY(),
					1, false, MouseEvent.BUTTON1);
			final MouseListener[] mouseListeners = eventListeners.getListeners(MouseListener.class);
			view.queueEvent(new Runnable() {

				@Override
				public void run() {
					for (MouseListener listener : mouseListeners) {
						listener.mouseReleased(mouseReleased);
					}
				}
			});
			if (downEventX == event.getX() && downEventY == event.getY()) {
				final MouseEvent mouseClicked = new MouseEvent(this, MouseEvent.MOUSE_CLICKED, event.getEventTime(), 0, (int) event.getX(), (int) event.getY(),
						1, false, MouseEvent.BUTTON1);
				view.queueEvent(new Runnable() {

					@Override
					public void run() {
						for (MouseListener listener : mouseListeners) {
							listener.mouseClicked(mouseClicked);
						}
					}
				});
			}
			mode = MODE_NONE;
		} else if (MotionEvent.ACTION_POINTER_UP == eventAction) {
			mode = MODE_NONE;
			twoMode = TWO_MODE_UNDECIDED;
		} else if (MotionEvent.ACTION_MOVE == eventAction) {
			if (mode == MODE_DRAG) {
				final MouseEvent mouseEvent = new MouseEvent(this, MouseEvent.MOUSE_DRAGGED, event.getEventTime(), MouseEvent.BUTTON1_DOWN_MASK,
						(int) event.getX(), (int) event.getY(), 1, false, MouseEvent.BUTTON1);
				final MouseMotionListener[] mouseListeners = eventListeners.getListeners(MouseMotionListener.class);
				view.queueEvent(new Runnable() {

					@Override
					public void run() {
						for (MouseMotionListener listener : mouseListeners) {
							listener.mouseDragged(mouseEvent);
						}
					}
				});
			} else if (mode == MODE_TWO_POINTERS) {
				if (twoMode == TWO_MODE_UNDECIDED) {
					if (distanceChanged(event)) {
						twoMode = TWO_MODE_ZOOM;
					} else if (midpointChanged(event)) {
						twoMode = TWO_MODE_TILT;
					}
				}
				if (twoMode == TWO_MODE_ZOOM) {
					float newDist = spacing(event);
					if (newDist > 10) {
						float delta = oldDist - newDist;
						int pointX = getWidth() / 2;
						int pointY = (int) ((getHeight() / 2) + delta);
						final MouseEvent mouseEvent = new MouseEvent(this, MouseEvent.MOUSE_DRAGGED, event.getEventTime(), MouseEvent.BUTTON2_DOWN_MASK,
								pointX, pointY, 1, false, MouseEvent.BUTTON2);
						final MouseMotionListener[] mouseListeners = eventListeners.getListeners(MouseMotionListener.class);
						view.queueEvent(new Runnable() {

							@Override
							public void run() {
								for (MouseMotionListener listener : mouseListeners) {
									listener.mouseDragged(mouseEvent);
								}
							}
						});
					}
				} else if (twoMode == TWO_MODE_TILT) {
					float midX = (event.getX(0) + event.getX(1)) / 2;
					float midY = (event.getY(0) + event.getY(1)) / 2;
					final MouseEvent mouseEvent = new MouseEvent(this, MouseEvent.MOUSE_DRAGGED, event.getEventTime(), MouseEvent.BUTTON3_DOWN_MASK,
							(int) midX, (int) midY, 1, false, MouseEvent.BUTTON3);
					final MouseMotionListener[] mouseListeners = eventListeners.getListeners(MouseMotionListener.class);
					view.queueEvent(new Runnable() {

						@Override
						public void run() {
							for (MouseMotionListener listener : mouseListeners) {
								listener.mouseDragged(mouseEvent);
							}
						}
					});
				}

			} else if (mode == MODE_THREE_POINTERS) {
				float avgX = (event.getX(0) + event.getX(1) + event.getX(2)) / 3;
				float avgY = (event.getY(0) + event.getY(1) + event.getY(2)) / 3;
				final MouseEvent mouseEvent = new MouseEvent(this, MouseEvent.MOUSE_DRAGGED, event.getEventTime(), MouseEvent.BUTTON3_DOWN_MASK, (int) avgX,
						(int) avgY, 1, false, MouseEvent.BUTTON3);
				final MouseMotionListener[] mouseListeners = eventListeners.getListeners(MouseMotionListener.class);
				view.queueEvent(new Runnable() {

					@Override
					public void run() {
						for (MouseMotionListener listener : mouseListeners) {
							listener.mouseDragged(mouseEvent);
						}
					}
				});
			}
		}
		return false;
	}

	private boolean midpointChanged(MotionEvent event) {
		int historySize = event.getHistorySize();
		if (historySize < 2) {
			return false;
		}
		float x0 = (event.getHistoricalX(0, 0) + event.getHistoricalX(1, 0)) / 2;
		float y0 = (event.getHistoricalY(0, 0) + event.getHistoricalY(1, 0)) / 2;
		float x1 = (event.getHistoricalX(0, historySize - 1) + event.getHistoricalX(1, historySize - 1)) / 2;
		float y1 = (event.getHistoricalY(0, historySize - 1) + event.getHistoricalY(1, historySize - 1)) / 2;
		float deltaX = x0 - x1;
		float deltaY = y0 - y1;
		float dist = FloatMath.sqrt(deltaX * deltaX + deltaY * deltaY);
		return dist > 5;
	}

	private boolean distanceChanged(MotionEvent event) {
        return true;

//		int historySize = event.getHistorySize();
//		if (historySize < 2) {
//			return false;
//		}
//		float x0 = event.getHistoricalX(0, 0) - event.getHistoricalX(1, 0);
//		float y0 = event.getHistoricalY(0, 0) - event.getHistoricalY(1, 0);
//		float dist0 = FloatMath.sqrt(x0 * x0 + y0 * y0);
//		float x1 = event.getHistoricalX(0, historySize - 1) - event.getHistoricalX(1, historySize - 1);
//		float y1 = event.getHistoricalY(0, historySize - 1) - event.getHistoricalY(1, historySize - 1);
//		float dist1 = FloatMath.sqrt(x1 * x1 + y1 * y1);
//		return Math.abs(dist1 - dist0) > 5;
	}

	/** Determine the space between the first two fingers */
	private float spacing(MotionEvent event) {
		// ...
		float x = event.getX(0) - event.getX(1);
		float y = event.getY(0) - event.getY(1);
		return FloatMath.sqrt(x * x + y * y);
	}

}
