package com.qq.worldwind.android;

import javax.media.opengl.GL;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLException;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;


public class AndroidGLContext extends GLContext {

	private GLDrawable drawable;
	private GL gl;
	private boolean isSynchonized = false;

	public AndroidGLContext(GLDrawable drawable, javax.microedition.khronos.opengles.GL gl10) {
		this.drawable = drawable;
		if (gl10 instanceof GL11) {
			this.gl = new AndroidGLImpl((GL11) gl10);
		} else {
			this.gl = new AndroidGLImpl((GL10)gl10);
		}
		setCurrent(this);
	}

	@Override
	public GLDrawable getGLDrawable() {
		return drawable;
	}

	@Override
	public int makeCurrent() throws GLException {
		setCurrent(this);
		return 0;
	}

	@Override
	public void release() throws GLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void copy(GLContext source, int mask) throws GLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isSynchronized() {
		return isSynchonized;
	}

	@Override
	public void setSynchronized(boolean isSynchronized) {
		this.isSynchonized = isSynchronized;
	}

	@Override
	public GL getGL() {
		return gl;
	}

	@Override
	public void setGL(GL gl) {
		this.gl = gl;
	}

}
