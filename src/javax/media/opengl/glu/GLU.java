package javax.media.opengl.glu;

import java.nio.Buffer;

import javax.media.opengl.GL;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLException;
import javax.microedition.khronos.opengles.GL10;

import com.qq.worldwind.android.util.ConversionUtil;
import com.sun.opengl.impl.Project;
import com.sun.opengl.impl.tessellator.GLUtessellatorImpl;

public class GLU {

	// ErrorCode
	public static final int GLU_INVALID_ENUM = 100900;
	public static final int GLU_INVALID_VALUE = 100901;
	public static final int GLU_OUT_OF_MEMORY = 100902;
	public static final int GLU_INVALID_OPERATION = 100904;

	// QuadricNormal
	public static final int GLU_SMOOTH = 100000;
	public static final int GLU_FLAT = 100001;
	public static final int GLU_NONE = 100002;

	// QuadricOrientation
	public static final int GLU_OUTSIDE = 100020;
	public static final int GLU_INSIDE = 100021;

	// TessCallback
	public static final int GLU_TESS_BEGIN = 100100;
	public static final int GLU_BEGIN = 100100;
	public static final int GLU_TESS_VERTEX = 100101;
	public static final int GLU_VERTEX = 100101;
	public static final int GLU_TESS_END = 100102;
	public static final int GLU_END = 100102;
	public static final int GLU_TESS_ERROR = 100103;
	public static final int GLU_TESS_EDGE_FLAG = 100104;
	public static final int GLU_EDGE_FLAG = 100104;
	public static final int GLU_TESS_COMBINE = 100105;
	public static final int GLU_TESS_BEGIN_DATA = 100106;
	public static final int GLU_TESS_VERTEX_DATA = 100107;
	public static final int GLU_TESS_END_DATA = 100108;
	public static final int GLU_TESS_ERROR_DATA = 100109;
	public static final int GLU_TESS_EDGE_FLAG_DATA = 100110;
	public static final int GLU_TESS_COMBINE_DATA = 100111;

	// TessContour
	public static final int GLU_CW = 100120;
	public static final int GLU_CCW = 100121;
	public static final int GLU_INTERIOR = 100122;
	public static final int GLU_EXTERIOR = 100123;
	public static final int GLU_UNKNOWN = 100124;

	// TessProperty
	public static final int GLU_TESS_WINDING_RULE = 100140;
	public static final int GLU_TESS_BOUNDARY_ONLY = 100141;
	public static final int GLU_TESS_TOLERANCE = 100142;

	// TessError
	public static final int GLU_TESS_ERROR1 = 100151;
	public static final int GLU_TESS_ERROR2 = 100152;
	public static final int GLU_TESS_ERROR3 = 100153;
	public static final int GLU_TESS_ERROR4 = 100154;
	public static final int GLU_TESS_ERROR5 = 100155;
	public static final int GLU_TESS_ERROR6 = 100156;
	public static final int GLU_TESS_ERROR7 = 100157;
	public static final int GLU_TESS_ERROR8 = 100158;
	public static final int GLU_TESS_MISSING_BEGIN_POLYGON = 100151;
	public static final int GLU_TESS_MISSING_BEGIN_CONTOUR = 100152;
	public static final int GLU_TESS_MISSING_END_POLYGON = 100153;
	public static final int GLU_TESS_MISSING_END_CONTOUR = 100154;
	public static final int GLU_TESS_COORD_TOO_LARGE = 100155;
	public static final int GLU_TESS_NEED_COMBINE_CALLBACK = 100156;

	// TessWinding
	public static final int GLU_TESS_WINDING_ODD = 100130;
	public static final int GLU_TESS_WINDING_NONZERO = 100131;
	public static final int GLU_TESS_WINDING_POSITIVE = 100132;
	public static final int GLU_TESS_WINDING_NEGATIVE = 100133;
	public static final int GLU_TESS_WINDING_ABS_GEQ_TWO = 100134;
	public static final double GLU_TESS_MAX_COORD = 1.0e150;
	private Project project = new Project();

	public GLUtessellator gluNewTess() {
		return GLUtessellatorImpl.gluNewTess();
	}

	public void gluTessNormal(GLUtessellator tessellator, double x, double y, double z) {
		GLUtessellatorImpl tess = (GLUtessellatorImpl) tessellator;
		tess.gluTessNormal(x, y, z);
	}

	public void gluTessCallback(GLUtessellator tessellator, int which, GLUtessellatorCallback aCallback) {
		GLUtessellatorImpl tess = (GLUtessellatorImpl) tessellator;
		tess.gluTessCallback(which, aCallback);
	}

	public void gluTessBeginPolygon(GLUtessellator tessellator, Object data) {
		GLUtessellatorImpl tess = (GLUtessellatorImpl) tessellator;
		tess.gluTessBeginPolygon(data);
	}

	public void gluTessBeginContour(GLUtessellator tessellator) {
		GLUtessellatorImpl tess = (GLUtessellatorImpl) tessellator;
		tess.gluTessBeginContour();
	}

	public void gluTessVertex(GLUtessellator tessellator, double[] coords, int coords_offset, Object data) {
		GLUtessellatorImpl tess = (GLUtessellatorImpl) tessellator;
		tess.gluTessVertex(coords, coords_offset, data);
	}

	public void gluTessEndContour(GLUtessellator tessellator) {
		GLUtessellatorImpl tess = (GLUtessellatorImpl) tessellator;
		tess.gluTessEndContour();
	}

	public void gluTessEndPolygon(GLUtessellator tessellator) {
		GLUtessellatorImpl tess = (GLUtessellatorImpl) tessellator;
		tess.gluTessEndPolygon();
	}

	public void gluTessProperty(GLUtessellator tessellator, int which, double value) {
		GLUtessellatorImpl tess = (GLUtessellatorImpl) tessellator;
		tess.gluTessProperty(which, value);
	}

	public String gluErrorString(int err) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean gluProject(double objX, double objY, double objZ, double[] model, int model_offset, double[] proj, int proj_offset, int[] view,
			int view_offset, double[] winPos, int winPos_offset) {
		return project.gluProject(objX, objY, objZ, model, model_offset, proj, proj_offset, view, view_offset, winPos, winPos_offset);
	}

	public boolean gluUnProject(double winX, double winY, double winZ, double[] model, int model_offset, double[] proj, int proj_offset, int[] view,
			int view_offset, double[] objPos, int objPos_offset) {
		return project.gluUnProject(winX, winY, winZ, model, model_offset, proj, proj_offset, view, view_offset, objPos, objPos_offset);
	}

	public static GL getCurrentGL() throws GLException {
		GLContext curContext = GLContext.getCurrent();
		if (curContext == null) {
			throw new GLException("No OpenGL context current on this thread");
		}
		return curContext.getGL();
	}

	public void gluBuild2DMipmaps(int texTarget, int internalFormat, int width, int height, int pixelFormat, int pixelType, Buffer buffer) {
		// TODO Auto-generated method stub

	}

	public void gluPerspective(double fovy, double aspect, double zNear, double zFar) {
		project.gluPerspective(getCurrentGL(), fovy, aspect, zNear, zFar);

	}

	public void gluOrtho2D(double left, double right, double bottom, double top) {
		project.gluOrtho2D(getCurrentGL(), left, right, bottom, top);
	}

}
