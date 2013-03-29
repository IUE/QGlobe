package com.qq.worldwind.android;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

import javax.media.opengl.GL;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

import com.qq.worldwind.android.util.ConversionUtil;


public class AndroidGLImpl implements GL {

	private GL10 gl10;
	private GL11 gl11;

	public AndroidGLImpl(GL10 gl10) {
		this.gl10 = gl10;
	}

	public AndroidGLImpl(GL11 gl11) {
		this((GL10) gl11);
		this.gl11 = gl11;
	}
	
	private void unauthorizedCall(){
		//System.out.println("Unauthorized Call");
		throw new UnsupportedOperationException();
	}

	@Override
	public void glAccum(int op, float value) {
		unauthorizedCall();
	}

	@Override
	public void glActiveStencilFaceEXT(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glActiveTexture(int mode) {
		gl10.glActiveTexture(mode);
	}

	@Override
	public void glActiveVaryingNV(int program, ByteBuffer name) {
		unauthorizedCall();

	}

	@Override
	public void glActiveVaryingNV(int program, byte[] name, int name_offset) {
		unauthorizedCall();

	}

	@Override
	public void glAlphaFragmentOp1ATI(int stage, int portion, int variable, int input, int mapping, int componentUsage) {
		unauthorizedCall();

	}

	@Override
	public void glAlphaFragmentOp2ATI(int op, int dst, int dstMod, int arg1, int arg1Rep, int arg1Mod, int arg2, int arg2Rep, int arg2Mod) {
		unauthorizedCall();

	}

	@Override
	public void glAlphaFragmentOp3ATI(int op, int dst, int dstMod, int arg1, int arg1Rep, int arg1Mod, int arg2, int arg2Rep, int arg2Mod, int arg3,
			int arg3Rep, int arg3Mod) {
		unauthorizedCall();

	}

	@Override
	public void glAlphaFunc(int func, float ref) {
		gl10.glAlphaFunc(func, ref);
	}

	@Override
	public void glApplyTextureEXT(int mode) {
		unauthorizedCall();

	}

	@Override
	public boolean glAreProgramsResidentNV(int n, IntBuffer textures, ByteBuffer residences) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glAreProgramsResidentNV(int n, int[] textures, int textures_offset, byte[] residences, int residences_offset) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glAreTexturesResident(int n, IntBuffer textures, ByteBuffer residences) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glAreTexturesResident(int n, int[] textures, int textures_offset, byte[] residences, int residences_offset) {
		unauthorizedCall();
		return false;
	}

	@Override
	public void glArrayElement(int i) {
		unauthorizedCall();

	}

	@Override
	public void glArrayObjectATI(int array, int size, int type, int stride, int buffer, int offset) {
		unauthorizedCall();

	}

	@Override
	public void glAsyncMarkerSGIX(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glAttachObjectARB(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glAttachShader(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glBegin(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glBeginFragmentShaderATI() {
		unauthorizedCall();

	}

	@Override
	public void glBeginOcclusionQueryNV(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glBeginQuery(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glBeginQueryARB(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glBeginTransformFeedbackNV(int primitiveMode) {
		unauthorizedCall();

	}

	@Override
	public void glBeginVertexShaderEXT() {
		unauthorizedCall();

	}

	@Override
	public void glBindAttribLocation(int program, int index, String name) {
		unauthorizedCall();

	}

	@Override
	public void glBindAttribLocationARB(int program, int index, String name) {
		unauthorizedCall();

	}

	@Override
	public void glBindBuffer(int target, int id) {
		gl11.glBindBuffer(target, id);
	}

	@Override
	public void glBindBufferARB(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glBindBufferBaseNV(int target, int index, int buffer) {
		unauthorizedCall();

	}

	@Override
	public void glBindBufferOffsetNV(int target, int index, int buffer, int offset) {
		unauthorizedCall();

	}

	@Override
	public void glBindBufferRangeNV(int target, int index, int buffer, int offset, int size) {
		unauthorizedCall();

	}

	@Override
	public void glBindFragDataLocationEXT(int program, int color, ByteBuffer name) {
		unauthorizedCall();

	}

	@Override
	public void glBindFragDataLocationEXT(int program, int color, byte[] name, int name_offset) {
		unauthorizedCall();

	}

	@Override
	public void glBindFragmentShaderATI(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glBindFramebufferEXT(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public int glBindLightParameterEXT(int light, int value) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glBindMaterialParameterEXT(int light, int value) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glBindParameterEXT(int type) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glBindProgramARB(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glBindProgramNV(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glBindRenderbufferEXT(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public int glBindTexGenParameterEXT(int unit, int coord, int value) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glBindTexture(int target, int texture) {
		gl10.glBindTexture(target, texture);
	}

	@Override
	public int glBindTextureUnitParameterEXT(int light, int value) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glBindVertexArrayAPPLE(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glBindVertexShaderEXT(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, ByteBuffer bitmap) {
		unauthorizedCall();

	}

	@Override
	public void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, byte[] bitmap, int bitmap_offset) {
		unauthorizedCall();

	}

	@Override
	public void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, long bitmap_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glBlendColor(float red, float green, float blue, float alpha) {
		unauthorizedCall();

	}

	@Override
	public void glBlendEquation(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glBlendEquationSeparate(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glBlendEquationSeparateEXT(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glBlendFunc(int sfactor, int dfactor) {
		gl10.glBlendFunc(sfactor, dfactor);
	}

	@Override
	public void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		unauthorizedCall();

	}

	@Override
	public void glBlendFuncSeparateEXT(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		unauthorizedCall();

	}

	@Override
	public void glBlendFuncSeparateINGR(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		unauthorizedCall();

	}

	@Override
	public void glBlitFramebufferEXT(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		unauthorizedCall();

	}

	@Override
	public void glBufferData(int target, int size, Buffer data, int usage) {
		gl11.glBufferData(target, size, data, usage);
	}

	@Override
	public void glBufferDataARB(int target, int size, Buffer data, int usage) {
		unauthorizedCall();

	}

	@Override
	public void glBufferParameteriAPPLE(int target, int pname, int params) {
		unauthorizedCall();

	}

	@Override
	public int glBufferRegionEnabled() {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glBufferSubData(int target, int offset, int size, Buffer data) {
		gl11.glBufferSubData(target, offset, size, data);
	}

	@Override
	public void glBufferSubDataARB(int target, int offset, int size, Buffer data) {
		unauthorizedCall();

	}

	@Override
	public void glCallList(int list) {
		unauthorizedCall();

	}

	@Override
	public void glCallLists(int n, int type, Buffer lists) {
		unauthorizedCall();

	}

	@Override
	public int glCheckFramebufferStatusEXT(int type) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glClampColorARB(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glClear(int mask) {
		gl10.glClear(mask);
	}

	@Override
	public void glClearAccum(float red, float green, float blue, float alpha) {
		unauthorizedCall();

	}

	@Override
	public void glClearColor(float red, float green, float blue, float alpha) {
		gl10.glClearColor(red, green, blue, alpha);
	}

	@Override
	public void glClearColorIiEXT(int red, int green, int blue, int alpha) {
		unauthorizedCall();

	}

	@Override
	public void glClearColorIuiEXT(int red, int green, int blue, int alpha) {
		unauthorizedCall();

	}

	@Override
	public void glClearDepth(double depth) {
		gl10.glClearDepthf((float) depth);
	}

	@Override
	public void glClearDepthdNV(double depth) {
		unauthorizedCall();

	}

	@Override
	public void glClearIndex(float c) {
		unauthorizedCall();

	}

	@Override
	public void glClearStencil(int s) {
		gl10.glClearStencil(s);
	}

	@Override
	public void glClientActiveTexture(int mode) {
		gl10.glClientActiveTexture(mode);
	}

	@Override
	public void glClientActiveVertexStreamATI(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glClipPlane(int plane, DoubleBuffer equation) {
		double[] doubles = equation.array();
		float[] floats = ConversionUtil.convertToFloatArray(doubles);
		FloatBuffer buffer = FloatBuffer.wrap(floats);
		gl11.glClipPlanef(plane, buffer);
	}

	@Override
	public void glClipPlane(int plane, double[] equation, int equation_offset) {
		float[] floats = ConversionUtil.convertToFloatArray(equation);
		gl11.glClipPlanef(plane, floats, equation_offset);
	}

	@Override
	public void glColor3b(byte red, byte green, byte blue) {
		unauthorizedCall();

	}

	@Override
	public void glColor3bv(ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor3bv(byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor3d(double red, double green, double blue) {
		unauthorizedCall();

	}

	@Override
	public void glColor3dv(DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor3dv(double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor3f(float red, float green, float blue) {
		unauthorizedCall();

	}

	@Override
	public void glColor3fVertex3fSUN(float r, float g, float b, float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glColor3fVertex3fvSUN(FloatBuffer c, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor3fVertex3fvSUN(float[] c, int c_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor3fv(FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor3fv(float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor3hNV(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glColor3hvNV(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor3hvNV(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor3i(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glColor3iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor3iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor3s(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glColor3sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor3sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor3ub(byte red, byte green, byte blue) {
		unauthorizedCall();

	}

	@Override
	public void glColor3ubv(ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor3ubv(byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor3ui(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glColor3uiv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor3uiv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor3us(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glColor3usv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor3usv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor4b(byte red, byte green, byte blue, byte alpha) {
		unauthorizedCall();

	}

	@Override
	public void glColor4bv(ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor4bv(byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor4d(double red, double green, double blue, double alpha) {
		unauthorizedCall();

	}

	@Override
	public void glColor4dv(DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor4dv(double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor4f(float red, float green, float blue, float alpha) {
		gl10.glColor4f(red, green, blue, alpha);
	}

	@Override
	public void glColor4fNormal3fVertex3fSUN(float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glColor4fNormal3fVertex3fvSUN(FloatBuffer c, FloatBuffer n, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor4fNormal3fVertex3fvSUN(float[] c, int c_offset, float[] n, int n_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor4fv(FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor4fv(float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor4hNV(short x, short y, short z, short w) {
		unauthorizedCall();

	}

	@Override
	public void glColor4hvNV(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor4hvNV(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor4i(int red, int green, int blue, int alpha) {
		unauthorizedCall();

	}

	@Override
	public void glColor4iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor4iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor4s(short red, short green, short blue, short alpha) {
		unauthorizedCall();

	}

	@Override
	public void glColor4sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor4sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor4ub(byte red, byte green, byte blue, byte alpha) {
		gl11.glColor4ub(red, green, blue, alpha);
	}

	@Override
	public void glColor4ubVertex2fSUN(byte r, byte g, byte b, byte a, float x, float y) {
		unauthorizedCall();

	}

	@Override
	public void glColor4ubVertex2fvSUN(ByteBuffer c, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor4ubVertex2fvSUN(byte[] c, int c_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor4ubVertex3fSUN(byte r, byte g, byte b, byte a, float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glColor4ubVertex3fvSUN(ByteBuffer c, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor4ubVertex3fvSUN(byte[] c, int c_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor4ubv(ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor4ubv(byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor4ui(int red, int green, int blue, int alpha) {
		unauthorizedCall();

	}

	@Override
	public void glColor4uiv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor4uiv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColor4us(short red, short green, short blue, short alpha) {
		unauthorizedCall();

	}

	@Override
	public void glColor4usv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glColor4usv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColorFragmentOp1ATI(int op, int dst, int dstMask, int dstMod, int arg1, int arg1Rep, int arg1Mod) {
		unauthorizedCall();

	}

	@Override
	public void glColorFragmentOp2ATI(int op, int dst, int dstMask, int dstMod, int arg1, int arg1Rep, int arg1Mod, int arg2, int arg2Rep, int arg2Mod) {
		unauthorizedCall();

	}

	@Override
	public void glColorFragmentOp3ATI(int op, int dst, int dstMask, int dstMod, int arg1, int arg1Rep, int arg1Mod, int arg2, int arg2Rep, int arg2Mod,
			int arg3, int arg3Rep, int arg3Mod) {
		unauthorizedCall();

	}

	@Override
	public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
		gl10.glColorMask(red, green, blue, alpha);
	}

	@Override
	public void glColorMaskIndexedEXT(int index, boolean r, boolean g, boolean b, boolean a) {
		unauthorizedCall();

	}

	@Override
	public void glColorMaterial(int face, int mode) {
		unauthorizedCall();

	}

	@Override
	public void glColorPointer(int size, int type, int stride, Buffer ptr) {
		gl10.glColorPointer(size, type, stride, ptr);
	}

	@Override
	public void glColorPointer(int size, int type, int stride, long ptr_buffer_offset) {
		gl11.glColorPointer(size, type, stride, (int) ptr_buffer_offset);
	}

	@Override
	public void glColorSubTable(int target, int start, int count, int format, int type, Buffer data) {
		unauthorizedCall();

	}

	@Override
	public void glColorSubTable(int target, int start, int count, int format, int type, long data_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColorTable(int target, int internalformat, int width, int format, int type, Buffer table) {
		unauthorizedCall();

	}

	@Override
	public void glColorTable(int target, int internalformat, int width, int format, int type, long table_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColorTableEXT(int target, int internalformat, int width, int format, int type, Buffer table) {
		unauthorizedCall();

	}

	@Override
	public void glColorTableParameterfv(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glColorTableParameterfv(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glColorTableParameteriv(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glColorTableParameteriv(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glCombinerInputNV(int stage, int portion, int variable, int input, int mapping, int componentUsage) {
		unauthorizedCall();

	}

	@Override
	public void glCombinerOutputNV(int stage, int portion, int abOutput, int cdOutput, int sumOutput, int scale, int bias, boolean abDotProduct,
			boolean cdDotProduct, boolean muxSum) {
		unauthorizedCall();

	}

	@Override
	public void glCombinerParameterfNV(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glCombinerParameterfvNV(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glCombinerParameterfvNV(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glCombinerParameteriNV(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glCombinerParameterivNV(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glCombinerParameterivNV(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glCombinerStageParameterfvNV(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glCombinerStageParameterfvNV(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glCompileShader(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glCompileShaderARB(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, Buffer data) {
		unauthorizedCall();

	}

	@Override
	public void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long data_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, Buffer data) {
		gl10.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
	}

	@Override
	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, Buffer data) {
		unauthorizedCall();

	}

	@Override
	public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize,
			long data_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, Buffer data) {
		unauthorizedCall();

	}

	@Override
	public void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long data_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, Buffer data) {
		gl10.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
	}

	@Override
	public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize,
			long data_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format,
			int imageSize, Buffer data) {
		unauthorizedCall();

	}

	@Override
	public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format,
			int imageSize, long data_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, Buffer table) {
		unauthorizedCall();

	}

	@Override
	public void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, long table_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, Buffer image) {
		unauthorizedCall();

	}

	@Override
	public void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, long image_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glConvolutionParameterf(int target, int pname, float params) {
		unauthorizedCall();

	}

	@Override
	public void glConvolutionParameterfv(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glConvolutionParameterfv(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glConvolutionParameteri(int target, int pname, int params) {
		unauthorizedCall();

	}

	@Override
	public void glConvolutionParameteriv(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glConvolutionParameteriv(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glCopyColorSubTable(int target, int start, int x, int y, int width) {
		unauthorizedCall();

	}

	@Override
	public void glCopyColorTable(int target, int internalformat, int x, int y, int width) {
		unauthorizedCall();

	}

	@Override
	public void glCopyConvolutionFilter1D(int target, int internalformat, int x, int y, int width) {
		unauthorizedCall();

	}

	@Override
	public void glCopyConvolutionFilter2D(int target, int internalformat, int x, int y, int width, int height) {
		unauthorizedCall();

	}

	@Override
	public void glCopyPixels(int x, int y, int width, int height, int type) {
		unauthorizedCall();

	}

	@Override
	public void glCopyTexImage1D(int target, int level, int internalformat, int x, int y, int width, int border) {
		unauthorizedCall();

	}

	@Override
	public void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
		gl10.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
	}

	@Override
	public void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
		unauthorizedCall();

	}

	@Override
	public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
		gl10.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
	}

	@Override
	public void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		unauthorizedCall();

	}

	@Override
	public int glCreateProgram() {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glCreateProgramObjectARB() {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glCreateShader(int type) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glCreateShaderObjectARB(int type) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glCullFace(int mode) {
		gl10.glCullFace(mode);
	}

	@Override
	public void glCullParameterdvEXT(int pname, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glCullParameterdvEXT(int pname, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glCullParameterfvEXT(int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glCullParameterfvEXT(int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glCurrentPaletteMatrixARB(int count) {
		unauthorizedCall();

	}

	@Override
	public void glDeformSGIX(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glDeformationMap3dSGIX(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double w1,
			double w2, int wstride, int worder, DoubleBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glDeformationMap3dSGIX(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double w1,
			double w2, int wstride, int worder, double[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDeformationMap3fSGIX(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float w1,
			float w2, int wstride, int worder, FloatBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glDeformationMap3fSGIX(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float w1,
			float w2, int wstride, int worder, float[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteAsyncMarkersSGIX(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteBufferRegion(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteBuffers(int n, IntBuffer ids) {
		gl11.glDeleteBuffers(n, ids);
	}

	@Override
	public void glDeleteBuffers(int n, int[] ids, int ids_offset) {
		gl11.glDeleteBuffers(n, ids, ids_offset);
	}

	@Override
	public void glDeleteBuffersARB(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteBuffersARB(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteFencesAPPLE(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteFencesAPPLE(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteFencesNV(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteFencesNV(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteFragmentShaderATI(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteFramebuffersEXT(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteFramebuffersEXT(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteLists(int list, int range) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteObjectARB(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteOcclusionQueriesNV(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteOcclusionQueriesNV(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteProgram(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteProgramsARB(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteProgramsARB(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteProgramsNV(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteProgramsNV(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteQueries(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteQueries(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteQueriesARB(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteQueriesARB(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteRenderbuffersEXT(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteRenderbuffersEXT(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteShader(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteTextures(int n, IntBuffer textures) {
		gl10.glDeleteTextures(n, textures);
	}

	@Override
	public void glDeleteTextures(int n, int[] textures, int textures_offset) {
		gl10.glDeleteTextures(n, textures, textures_offset);
	}

	@Override
	public void glDeleteVertexArraysAPPLE(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteVertexArraysAPPLE(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDeleteVertexShaderEXT(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glDepthBoundsEXT(double x, double y) {
		unauthorizedCall();

	}

	@Override
	public void glDepthBoundsdNV(double zmin, double zmax) {
		unauthorizedCall();

	}

	@Override
	public void glDepthFunc(int func) {
		gl10.glDepthFunc(func);
	}

	@Override
	public void glDepthMask(boolean flag) {
		gl10.glDepthMask(flag);
	}

	@Override
	public void glDepthRange(double near_val, double far_val) {
		gl10.glDepthRangef((float) near_val, (float) far_val);
	}

	@Override
	public void glDepthRangedNV(double zNear, double zFar) {
		unauthorizedCall();

	}

	@Override
	public void glDetachObjectARB(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glDetachShader(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glDetailTexFuncSGIS(int target, int n, FloatBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glDetailTexFuncSGIS(int target, int n, float[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDisable(int cap) {
		gl10.glDisable(cap);
	}

	@Override
	public void glDisableClientState(int cap) {
		gl10.glDisableClientState(cap);
	}

	@Override
	public void glDisableIndexedEXT(int target, int index) {
		unauthorizedCall();

	}

	@Override
	public void glDisableVariantClientStateEXT(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glDisableVertexAttribAPPLE(int index, int pname) {
		unauthorizedCall();

	}

	@Override
	public void glDisableVertexAttribArray(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glDisableVertexAttribArrayARB(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glDrawArrays(int mode, int first, int count) {
		gl10.glDrawArrays(mode, first, count);
	}

	@Override
	public void glDrawArraysInstancedEXT(int mode, int start, int count, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glDrawBuffer(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glDrawBufferRegion(int region, int x, int y, int width, int height, int xDest, int yDest) {
		unauthorizedCall();

	}

	@Override
	public void glDrawBuffers(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDrawBuffers(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDrawBuffersARB(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDrawBuffersARB(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDrawBuffersATI(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glDrawBuffersATI(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDrawElementArrayAPPLE(int target, int s, int t) {
		unauthorizedCall();

	}

	@Override
	public void glDrawElementArrayATI(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glDrawElements(int mode, int count, int type, Buffer indices) {
		gl10.glDrawElements(mode, count, type, indices);
	}

	@Override
	public void glDrawElements(int mode, int count, int type, long indices_buffer_offset) {
		gl11.glDrawElements(mode, count, type, (int) indices_buffer_offset);
	}

	@Override
	public void glDrawElementsInstancedEXT(int mode, int count, int type, Buffer indices, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glDrawMeshArraysSUN(int target, int s, int t, int r) {
		unauthorizedCall();

	}

	@Override
	public void glDrawPixels(int width, int height, int format, int type, Buffer pixels) {
		unauthorizedCall();

	}

	@Override
	public void glDrawPixels(int width, int height, int format, int type, long pixels_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glDrawRangeElementArrayAPPLE(int mode, int start, int end, int first, int count) {
		unauthorizedCall();

	}

	@Override
	public void glDrawRangeElementArrayATI(int mode, int start, int end, int count) {
		unauthorizedCall();

	}

	@Override
	public void glDrawRangeElements(int mode, int start, int end, int count, int type, Buffer indices) {
		unauthorizedCall();

	}

	@Override
	public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glEdgeFlag(boolean flag) {
		unauthorizedCall();

	}

	@Override
	public void glEdgeFlagPointer(int stride, Buffer ptr) {
		unauthorizedCall();

	}

	@Override
	public void glEdgeFlagPointer(int stride, long ptr_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glEdgeFlagv(ByteBuffer flag) {
		unauthorizedCall();

	}

	@Override
	public void glEdgeFlagv(byte[] flag, int flag_offset) {
		unauthorizedCall();

	}

	@Override
	public void glElementPointerAPPLE(int pname, Buffer params) {
		unauthorizedCall();

	}

	@Override
	public void glElementPointerATI(int pname, Buffer params) {
		unauthorizedCall();

	}

	@Override
	public void glElementPointerATI(int pname, long params_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glEnable(int cap) {
		gl10.glEnable(cap);
	}

	@Override
	public void glEnableClientState(int cap) {
		gl10.glEnableClientState(cap);
	}

	@Override
	public void glEnableIndexedEXT(int target, int index) {
		unauthorizedCall();

	}

	@Override
	public void glEnableVariantClientStateEXT(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glEnableVertexAttribAPPLE(int index, int pname) {
		unauthorizedCall();

	}

	@Override
	public void glEnableVertexAttribArray(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glEnableVertexAttribArrayARB(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glEnd() {
		unauthorizedCall();

	}

	@Override
	public void glEndFragmentShaderATI() {
		unauthorizedCall();

	}

	@Override
	public void glEndList() {
		unauthorizedCall();

	}

	@Override
	public void glEndOcclusionQueryNV() {
		unauthorizedCall();

	}

	@Override
	public void glEndQuery(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glEndQueryARB(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glEndTransformFeedbackNV() {
		unauthorizedCall();

	}

	@Override
	public void glEndVertexShaderEXT() {
		unauthorizedCall();

	}

	@Override
	public void glEvalCoord1d(double u) {
		unauthorizedCall();

	}

	@Override
	public void glEvalCoord1dv(DoubleBuffer u) {
		unauthorizedCall();

	}

	@Override
	public void glEvalCoord1dv(double[] u, int u_offset) {
		unauthorizedCall();

	}

	@Override
	public void glEvalCoord1f(float u) {
		unauthorizedCall();

	}

	@Override
	public void glEvalCoord1fv(FloatBuffer u) {
		unauthorizedCall();

	}

	@Override
	public void glEvalCoord1fv(float[] u, int u_offset) {
		unauthorizedCall();

	}

	@Override
	public void glEvalCoord2d(double u, double v) {
		unauthorizedCall();

	}

	@Override
	public void glEvalCoord2dv(DoubleBuffer u) {
		unauthorizedCall();

	}

	@Override
	public void glEvalCoord2dv(double[] u, int u_offset) {
		unauthorizedCall();

	}

	@Override
	public void glEvalCoord2f(float u, float v) {
		unauthorizedCall();

	}

	@Override
	public void glEvalCoord2fv(FloatBuffer u) {
		unauthorizedCall();

	}

	@Override
	public void glEvalCoord2fv(float[] u, int u_offset) {
		unauthorizedCall();

	}

	@Override
	public void glEvalMapsNV(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glEvalMesh1(int mode, int i1, int i2) {
		unauthorizedCall();

	}

	@Override
	public void glEvalMesh2(int mode, int i1, int i2, int j1, int j2) {
		unauthorizedCall();

	}

	@Override
	public void glEvalPoint1(int i) {
		unauthorizedCall();

	}

	@Override
	public void glEvalPoint2(int i, int j) {
		unauthorizedCall();

	}

	@Override
	public void glExecuteProgramNV(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glExecuteProgramNV(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glExtractComponentEXT(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glFeedbackBuffer(int size, int type, FloatBuffer buffer) {
		unauthorizedCall();

	}

	@Override
	public void glFinalCombinerInputNV(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		unauthorizedCall();

	}

	@Override
	public void glFinish() {
		gl10.glFinish();
	}

	@Override
	public int glFinishAsyncSGIX(IntBuffer markerp) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glFinishAsyncSGIX(int[] markerp, int markerp_offset) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glFinishFenceAPPLE(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glFinishFenceNV(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glFinishObjectAPPLE(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glFinishRenderAPPLE() {
		unauthorizedCall();

	}

	@Override
	public void glFinishTextureSUNX() {
		unauthorizedCall();

	}

	@Override
	public void glFlush() {
		gl10.glFlush();
	}

	@Override
	public void glFlushMappedBufferRangeAPPLE(int target, int s, int t) {
		unauthorizedCall();

	}

	@Override
	public void glFlushPixelDataRangeNV(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glFlushRasterSGIX() {
		unauthorizedCall();

	}

	@Override
	public void glFlushRenderAPPLE() {
		unauthorizedCall();

	}

	@Override
	public void glFlushVertexArrayRangeAPPLE(int length, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glFlushVertexArrayRangeNV() {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordPointer(int type, int stride, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordPointer(int type, int stride, long pointer_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordPointerEXT(int type, int stride, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordPointerEXT(int type, int stride, long pointer_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordd(double coord) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoorddEXT(double coord) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoorddv(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoorddv(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoorddvEXT(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoorddvEXT(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordf(float coord) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordfEXT(float coord) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordfv(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordfv(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordfvEXT(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordfvEXT(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordhNV(short factor) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordhvNV(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glFogCoordhvNV(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFogFuncSGIS(int size, FloatBuffer weights) {
		unauthorizedCall();

	}

	@Override
	public void glFogFuncSGIS(int size, float[] weights, int weights_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFogf(int pname, float param) {
		gl10.glFogf(pname, param);
	}

	@Override
	public void glFogfv(int pname, FloatBuffer params) {
		gl10.glFogfv(pname, params);
	}

	@Override
	public void glFogfv(int pname, float[] params, int params_offset) {
		gl10.glFogfv(pname, params, params_offset);
	}

	@Override
	public void glFogi(int pname, int param) {
		unauthorizedCall();

	}

	@Override
	public void glFogiv(int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glFogiv(int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentColorMaterialSGIX(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentLightModelfSGIX(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentLightModelfvSGIX(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentLightModelfvSGIX(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentLightModeliSGIX(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentLightModelivSGIX(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentLightModelivSGIX(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentLightfSGIX(int target, int pname, float params) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentLightfvSGIX(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentLightfvSGIX(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentLightiSGIX(int target, int pname, int params) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentLightivSGIX(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentLightivSGIX(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentMaterialfSGIX(int target, int pname, float params) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentMaterialfvSGIX(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentMaterialfvSGIX(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentMaterialiSGIX(int target, int pname, int params) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentMaterialivSGIX(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glFragmentMaterialivSGIX(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glFrameZoomSGIX(int count) {
		unauthorizedCall();

	}

	@Override
	public void glFramebufferRenderbufferEXT(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		unauthorizedCall();

	}

	@Override
	public void glFramebufferTexture1DEXT(int target, int attachment, int textarget, int texture, int level) {
		unauthorizedCall();

	}

	@Override
	public void glFramebufferTexture2DEXT(int target, int attachment, int textarget, int texture, int level) {
		unauthorizedCall();

	}

	@Override
	public void glFramebufferTexture3DEXT(int target, int attachment, int textarget, int texture, int level, int zoffset) {
		unauthorizedCall();

	}

	@Override
	public void glFramebufferTextureEXT(int target, int attachment, int texture, int level) {
		unauthorizedCall();

	}

	@Override
	public void glFramebufferTextureFaceEXT(int target, int attachment, int texture, int level, int face) {
		unauthorizedCall();

	}

	@Override
	public void glFramebufferTextureLayerEXT(int target, int attachment, int texture, int level, int layer) {
		unauthorizedCall();

	}

	@Override
	public void glFreeObjectBufferATI(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glFrontFace(int mode) {
		gl10.glFrontFace(mode);
	}

	@Override
	public void glFrustum(double left, double right, double bottom, double top, double near_val, double far_val) {
		gl10.glFrustumf((float) left, (float) right, (float) bottom, (float) top, (float) near_val, (float) far_val);
	}

	@Override
	public int glGenAsyncMarkersSGIX(int range) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glGenBuffers(int n, IntBuffer ids) {
		gl11.glGenBuffers(n, ids);
	}

	@Override
	public void glGenBuffers(int n, int[] ids, int ids_offset) {
		gl11.glGenBuffers(n, ids, ids_offset);
	}

	@Override
	public void glGenBuffersARB(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glGenBuffersARB(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGenFencesAPPLE(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glGenFencesAPPLE(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGenFencesNV(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glGenFencesNV(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public int glGenFragmentShadersATI(int type) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glGenFramebuffersEXT(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glGenFramebuffersEXT(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public int glGenLists(int range) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glGenOcclusionQueriesNV(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glGenOcclusionQueriesNV(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGenProgramsARB(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glGenProgramsARB(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGenProgramsNV(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glGenProgramsNV(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGenQueries(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glGenQueries(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGenQueriesARB(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glGenQueriesARB(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGenRenderbuffersEXT(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glGenRenderbuffersEXT(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public int glGenSymbolsEXT(int datatype, int storagetype, int range, int components) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glGenTextures(int n, IntBuffer textures) {
		gl10.glGenTextures(n, textures);
	}

	@Override
	public void glGenTextures(int n, int[] textures, int textures_offset) {
		gl10.glGenTextures(n, textures, textures_offset);
	}

	@Override
	public void glGenVertexArraysAPPLE(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glGenVertexArraysAPPLE(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public int glGenVertexShadersEXT(int type) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glGenerateMipmapEXT(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glGetActiveAttrib(int program, int index, int bufSize, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		unauthorizedCall();

	}

	@Override
	public void glGetActiveAttrib(int program, int index, int bufSize, int[] length, int length_offset, int[] size, int size_offset, int[] type,
			int type_offset, byte[] name, int name_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetActiveAttribARB(int program, int index, int bufSize, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		unauthorizedCall();

	}

	@Override
	public void glGetActiveAttribARB(int program, int index, int bufSize, int[] length, int length_offset, int[] size, int size_offset, int[] type,
			int type_offset, byte[] name, int name_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetActiveUniform(int program, int index, int bufSize, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		unauthorizedCall();

	}

	@Override
	public void glGetActiveUniform(int program, int index, int bufSize, int[] length, int length_offset, int[] size, int size_offset, int[] type,
			int type_offset, byte[] name, int name_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetActiveUniformARB(int program, int index, int bufSize, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		unauthorizedCall();

	}

	@Override
	public void glGetActiveUniformARB(int program, int index, int bufSize, int[] length, int length_offset, int[] size, int size_offset, int[] type,
			int type_offset, byte[] name, int name_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetActiveVaryingNV(int program, int index, int bufSize, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		unauthorizedCall();

	}

	@Override
	public void glGetActiveVaryingNV(int program, int index, int bufSize, int[] length, int length_offset, int[] size, int size_offset, int[] type,
			int type_offset, byte[] name, int name_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetArrayObjectfvATI(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetArrayObjectfvATI(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetArrayObjectivATI(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetArrayObjectivATI(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetAttachedObjectsARB(int program, int maxCount, IntBuffer count, IntBuffer obj) {
		unauthorizedCall();

	}

	@Override
	public void glGetAttachedObjectsARB(int program, int maxCount, int[] count, int count_offset, int[] obj, int obj_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetAttachedShaders(int program, int maxCount, IntBuffer count, IntBuffer obj) {
		unauthorizedCall();

	}

	@Override
	public void glGetAttachedShaders(int program, int maxCount, int[] count, int count_offset, int[] obj, int obj_offset) {
		unauthorizedCall();

	}

	@Override
	public int glGetAttribLocation(int program, String name) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glGetAttribLocationARB(int program, String name) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glGetBooleanIndexedvEXT(int target, int index, ByteBuffer data) {
		unauthorizedCall();

	}

	@Override
	public void glGetBooleanIndexedvEXT(int target, int index, byte[] data, int data_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetBooleanv(int pname, ByteBuffer params) {
		byte[] bytes = params.array();
		int[] ints = ConversionUtil.convertToIntArray(bytes);
		IntBuffer buffer = IntBuffer.wrap(ints);
		gl11.glGetBooleanv(pname, buffer);
		int[] results = buffer.array();
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) results[i];
		}
	}

	@Override
	public void glGetBooleanv(int pname, byte[] params, int params_offset) {
		boolean[] booleans = ConversionUtil.convertToBooleanArray(params);
		gl11.glGetBooleanv(pname, booleans, params_offset);
		byte[] results = ConversionUtil.convertToByteArray(booleans);
		for (int i = 0; i < params.length; i++) {
			params[i] = results[i];
		}
	}

	@Override
	public void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
		gl11.glGetBufferParameteriv(target, pname, params);
	}

	@Override
	public void glGetBufferParameteriv(int target, int pname, int[] params, int params_offset) {
		gl11.glGetBufferParameteriv(target, pname, params, params_offset);
	}

	@Override
	public void glGetBufferParameterivARB(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetBufferParameterivARB(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetBufferSubData(int target, int offset, int size, Buffer data) {
		unauthorizedCall();

	}

	@Override
	public void glGetBufferSubDataARB(int target, int offset, int size, Buffer data) {
		unauthorizedCall();

	}

	@Override
	public void glGetClipPlane(int plane, DoubleBuffer equation) {
		double[] doubles = equation.array();
		float[] floats = ConversionUtil.convertToFloatArray(doubles);
		FloatBuffer buffer = FloatBuffer.wrap(floats);
		gl11.glGetClipPlanef(plane, buffer);
		float[] results = buffer.array();
		for (int i = 0; i < doubles.length; i++) {
			doubles[i] = results[i];
		}
	}

	@Override
	public void glGetClipPlane(int plane, double[] equation, int equation_offset) {
		float[] floats = ConversionUtil.convertToFloatArray(equation);
		gl11.glGetClipPlanef(plane, floats, equation_offset);
		for (int i = 0; i < equation.length; i++) {
			equation[i] = floats[i];
		}
	}

	@Override
	public void glGetColorTable(int target, int format, int type, Buffer table) {
		unauthorizedCall();

	}

	@Override
	public void glGetColorTable(int target, int format, int type, long table_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetColorTableEXT(int target, int format, int type, Buffer table) {
		unauthorizedCall();

	}

	@Override
	public void glGetColorTableParameterfv(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetColorTableParameterfv(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetColorTableParameterfvEXT(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetColorTableParameterfvEXT(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetColorTableParameteriv(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetColorTableParameteriv(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetColorTableParameterivEXT(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetColorTableParameterivEXT(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetCombinerInputParameterfvNV(int stage, int portion, int variable, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetCombinerInputParameterfvNV(int stage, int portion, int variable, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetCombinerInputParameterivNV(int stage, int portion, int variable, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetCombinerInputParameterivNV(int stage, int portion, int variable, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetCombinerOutputParameterfvNV(int stage, int portion, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetCombinerOutputParameterfvNV(int stage, int portion, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetCombinerOutputParameterivNV(int stage, int portion, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetCombinerOutputParameterivNV(int stage, int portion, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetCombinerStageParameterfvNV(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetCombinerStageParameterfvNV(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetCompressedTexImage(int target, int level, Buffer img) {
		unauthorizedCall();

	}

	@Override
	public void glGetCompressedTexImage(int target, int level, long img_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetConvolutionFilter(int target, int format, int type, Buffer table) {
		unauthorizedCall();

	}

	@Override
	public void glGetConvolutionFilter(int target, int format, int type, long table_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetConvolutionParameterfv(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetConvolutionParameterfv(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetConvolutionParameteriv(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetConvolutionParameteriv(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetDetailTexFuncSGIS(int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetDetailTexFuncSGIS(int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetDoublev(int pname, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetDoublev(int pname, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public int glGetError() {
		return gl10.glGetError();
	}

	@Override
	public void glGetFenceivNV(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetFenceivNV(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetFinalCombinerInputParameterfvNV(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetFinalCombinerInputParameterfvNV(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetFinalCombinerInputParameterivNV(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetFinalCombinerInputParameterivNV(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetFloatv(int pname, FloatBuffer params) {
		gl11.glGetFloatv(pname, params);
	}

	@Override
	public void glGetFloatv(int pname, float[] params, int params_offset) {
		gl11.glGetFloatv(pname, params, params_offset);
	}

	@Override
	public void glGetFogFuncSGIS(FloatBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glGetFogFuncSGIS(float[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public int glGetFragDataLocationEXT(int program, ByteBuffer name) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glGetFragDataLocationEXT(int program, byte[] name, int name_offset) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glGetFragmentLightfvSGIX(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetFragmentLightfvSGIX(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetFragmentLightivSGIX(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetFragmentLightivSGIX(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetFragmentMaterialfvSGIX(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetFragmentMaterialfvSGIX(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetFragmentMaterialivSGIX(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetFragmentMaterialivSGIX(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetFramebufferAttachmentParameterivEXT(int stage, int portion, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetFramebufferAttachmentParameterivEXT(int stage, int portion, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public int glGetHandleARB(int type) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glGetHistogram(int target, boolean reset, int format, int type, Buffer values) {
		unauthorizedCall();

	}

	@Override
	public void glGetHistogram(int target, boolean reset, int format, int type, long values_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetHistogramParameterfv(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetHistogramParameterfv(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetHistogramParameteriv(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetHistogramParameteriv(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetImageTransformParameterfvHP(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetImageTransformParameterfvHP(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetImageTransformParameterivHP(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetImageTransformParameterivHP(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetInfoLogARB(int program, int bufSize, IntBuffer length, ByteBuffer infoLog) {
		unauthorizedCall();

	}

	@Override
	public void glGetInfoLogARB(int program, int bufSize, int[] length, int length_offset, byte[] infoLog, int infoLog_offset) {
		unauthorizedCall();

	}

	@Override
	public int glGetInstrumentsSGIX() {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glGetIntegerIndexedvEXT(int target, int index, IntBuffer data) {
		unauthorizedCall();

	}

	@Override
	public void glGetIntegerIndexedvEXT(int target, int index, int[] data, int data_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetIntegerv(int pname, IntBuffer params) {
		gl10.glGetIntegerv(pname, params);
	}

	@Override
	public void glGetIntegerv(int pname, int[] params, int params_offset) {
		gl10.glGetIntegerv(pname, params, params_offset);
	}

	@Override
	public void glGetInvariantBooleanvEXT(int id, int pname, ByteBuffer program) {
		unauthorizedCall();

	}

	@Override
	public void glGetInvariantBooleanvEXT(int id, int pname, byte[] program, int program_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetInvariantFloatvEXT(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetInvariantFloatvEXT(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetInvariantIntegervEXT(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetInvariantIntegervEXT(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetLightfv(int light, int pname, FloatBuffer params) {
		gl11.glGetLightfv(light, pname, params);
	}

	@Override
	public void glGetLightfv(int light, int pname, float[] params, int params_offset) {
		gl11.glGetLightfv(params_offset, pname, params, params_offset);
	}

	@Override
	public void glGetLightiv(int light, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetLightiv(int light, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetListParameterfvSGIX(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetListParameterfvSGIX(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetListParameterivSGIX(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetListParameterivSGIX(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetLocalConstantBooleanvEXT(int id, int pname, ByteBuffer program) {
		unauthorizedCall();

	}

	@Override
	public void glGetLocalConstantBooleanvEXT(int id, int pname, byte[] program, int program_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetLocalConstantFloatvEXT(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetLocalConstantFloatvEXT(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetLocalConstantIntegervEXT(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetLocalConstantIntegervEXT(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapAttribParameterfvNV(int stage, int portion, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapAttribParameterfvNV(int stage, int portion, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapAttribParameterivNV(int stage, int portion, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapAttribParameterivNV(int stage, int portion, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapControlPointsNV(int target, int index, int type, int ustride, int vstride, boolean packed, Buffer points) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapParameterfvNV(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapParameterfvNV(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapParameterivNV(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapParameterivNV(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapdv(int target, int query, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapdv(int target, int query, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapfv(int target, int query, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapfv(int target, int query, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapiv(int target, int query, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glGetMapiv(int target, int query, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetMaterialfv(int face, int pname, FloatBuffer params) {
		gl11.glGetMaterialfv(face, pname, params);
	}

	@Override
	public void glGetMaterialfv(int face, int pname, float[] params, int params_offset) {
		gl11.glGetMaterialfv(face, pname, params, params_offset);
	}

	@Override
	public void glGetMaterialiv(int face, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetMaterialiv(int face, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetMinmax(int target, boolean reset, int format, int type, Buffer values) {
		unauthorizedCall();

	}

	@Override
	public void glGetMinmax(int target, boolean reset, int format, int type, long values_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetMinmaxParameterfv(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetMinmaxParameterfv(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetMinmaxParameteriv(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetMinmaxParameteriv(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetObjectBufferfvATI(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetObjectBufferfvATI(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetObjectBufferivATI(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetObjectBufferivATI(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetObjectParameterfvARB(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetObjectParameterfvARB(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetObjectParameterivARB(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetObjectParameterivARB(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetOcclusionQueryivNV(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetOcclusionQueryivNV(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetOcclusionQueryuivNV(int id, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetOcclusionQueryuivNV(int id, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetPixelMapfv(int map, FloatBuffer values) {
		unauthorizedCall();

	}

	@Override
	public void glGetPixelMapfv(int map, float[] values, int values_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetPixelMapfv(int map, long values_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetPixelMapuiv(int map, IntBuffer values) {
		unauthorizedCall();

	}

	@Override
	public void glGetPixelMapuiv(int map, int[] values, int values_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetPixelMapuiv(int map, long values_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetPixelMapusv(int map, ShortBuffer values) {
		unauthorizedCall();

	}

	@Override
	public void glGetPixelMapusv(int map, short[] values, int values_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetPixelMapusv(int map, long values_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetPixelTexGenParameterfvSGIS(int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetPixelTexGenParameterfvSGIS(int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetPixelTexGenParameterivSGIS(int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetPixelTexGenParameterivSGIS(int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetPolygonStipple(ByteBuffer mask) {
		unauthorizedCall();

	}

	@Override
	public void glGetPolygonStipple(byte[] mask, int mask_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetPolygonStipple(long mask_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramEnvParameterIivNV(int target, int index, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramEnvParameterIivNV(int target, int index, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramEnvParameterIuivNV(int target, int index, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramEnvParameterIuivNV(int target, int index, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramEnvParameterdvARB(int index, int pname, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramEnvParameterdvARB(int index, int pname, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramEnvParameterfvARB(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramEnvParameterfvARB(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramInfoLog(int program, int bufSize, IntBuffer length, ByteBuffer infoLog) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramInfoLog(int program, int bufSize, int[] length, int length_offset, byte[] infoLog, int infoLog_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramLocalParameterIivNV(int target, int index, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramLocalParameterIivNV(int target, int index, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramLocalParameterIuivNV(int target, int index, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramLocalParameterIuivNV(int target, int index, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramLocalParameterdvARB(int index, int pname, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramLocalParameterdvARB(int index, int pname, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramLocalParameterfvARB(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramLocalParameterfvARB(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramNamedParameterdvNV(int id, int len, String name, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramNamedParameterdvNV(int id, int len, String name, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramNamedParameterfvNV(int id, int len, String name, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramNamedParameterfvNV(int id, int len, String name, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramParameterdvNV(int target, int index, int pname, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramParameterdvNV(int target, int index, int pname, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramParameterfvNV(int stage, int portion, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramParameterfvNV(int stage, int portion, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramStringARB(int target, int pname, Buffer string) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramStringNV(int id, int pname, ByteBuffer program) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramStringNV(int id, int pname, byte[] program, int program_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramiv(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramiv(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramivARB(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramivARB(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramivNV(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetProgramivNV(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryObjecti64vEXT(int id, int pname, LongBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryObjecti64vEXT(int id, int pname, long[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryObjectiv(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryObjectiv(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryObjectivARB(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryObjectivARB(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryObjectui64vEXT(int id, int pname, LongBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryObjectui64vEXT(int id, int pname, long[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryObjectuiv(int id, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryObjectuivARB(int id, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryObjectuivARB(int id, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryiv(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryiv(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryivARB(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetQueryivARB(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetRenderbufferParameterivEXT(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetRenderbufferParameterivEXT(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetSeparableFilter(int target, int format, int type, Buffer row, Buffer column, Buffer span) {
		unauthorizedCall();

	}

	@Override
	public void glGetSeparableFilter(int target, int format, int type, long row_buffer_offset, long column_buffer_offset, long span_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetShaderInfoLog(int program, int bufSize, IntBuffer length, ByteBuffer infoLog) {
		unauthorizedCall();

	}

	@Override
	public void glGetShaderInfoLog(int program, int bufSize, int[] length, int length_offset, byte[] infoLog, int infoLog_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetShaderSource(int program, int bufSize, IntBuffer length, ByteBuffer infoLog) {
		unauthorizedCall();

	}

	@Override
	public void glGetShaderSource(int program, int bufSize, int[] length, int length_offset, byte[] infoLog, int infoLog_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetShaderSourceARB(int program, int bufSize, IntBuffer length, ByteBuffer infoLog) {
		unauthorizedCall();

	}

	@Override
	public void glGetShaderSourceARB(int program, int bufSize, int[] length, int length_offset, byte[] infoLog, int infoLog_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetShaderiv(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetShaderiv(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetSharpenTexFuncSGIS(int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetSharpenTexFuncSGIS(int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public String glGetString(int name) {
		return gl10.glGetString(name);
	}

	@Override
	public void glGetTexBumpParameterfvATI(int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexBumpParameterfvATI(int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexBumpParameterivATI(int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexBumpParameterivATI(int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexEnvfv(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexEnvfv(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexEnviv(int target, int pname, IntBuffer params) {
		gl11.glGetTexEnviv(target, pname, params);
	}

	@Override
	public void glGetTexEnviv(int target, int pname, int[] params, int params_offset) {
		gl11.glGetTexEnviv(target, pname, params, params_offset);
	}

	@Override
	public void glGetTexFilterFuncSGIS(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexFilterFuncSGIS(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexGendv(int coord, int pname, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexGendv(int coord, int pname, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexGenfv(int coord, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexGenfv(int coord, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexGeniv(int coord, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexGeniv(int coord, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexImage(int target, int level, int format, int type, Buffer pixels) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexImage(int target, int level, int format, int type, long pixels_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexLevelParameterfv(int target, int level, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexLevelParameteriv(int target, int level, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexParameterIivEXT(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexParameterIivEXT(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexParameterIuivEXT(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexParameterIuivEXT(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
		gl11.glGetTexParameterfv(target, pname, params);
	}

	@Override
	public void glGetTexParameterfv(int target, int pname, float[] params, int params_offset) {
		gl11.glGetTexParameterfv(target, pname, params, params_offset);
	}

	@Override
	public void glGetTexParameteriv(int target, int pname, IntBuffer params) {
		gl11.glGetTexParameteriv(target, pname, params);
	}

	@Override
	public void glGetTexParameteriv(int target, int pname, int[] params, int params_offset) {
		gl11.glGetTexParameteriv(target, pname, params, params_offset);
	}

	@Override
	public void glGetTrackMatrixivNV(int stage, int portion, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetTrackMatrixivNV(int stage, int portion, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetTransformFeedbackVaryingNV(int program, int index, IntBuffer location) {
		unauthorizedCall();

	}

	@Override
	public void glGetTransformFeedbackVaryingNV(int program, int index, int[] location, int location_offset) {
		unauthorizedCall();

	}

	@Override
	public int glGetUniformBufferSizeEXT(int program, int location) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glGetUniformLocation(int program, String name) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glGetUniformLocationARB(int program, String name) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glGetUniformOffsetEXT(int program, int location) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glGetUniformfv(int program, int location, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetUniformfv(int program, int location, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetUniformfvARB(int program, int location, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetUniformfvARB(int program, int location, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetUniformiv(int program, int location, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetUniformiv(int program, int location, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetUniformivARB(int program, int location, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetUniformivARB(int program, int location, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetUniformuivEXT(int program, int location, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetUniformuivEXT(int program, int location, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVariantArrayObjectfvATI(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVariantArrayObjectfvATI(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVariantArrayObjectivATI(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVariantArrayObjectivATI(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVariantBooleanvEXT(int id, int pname, ByteBuffer program) {
		unauthorizedCall();

	}

	@Override
	public void glGetVariantBooleanvEXT(int id, int pname, byte[] program, int program_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVariantFloatvEXT(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVariantFloatvEXT(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVariantIntegervEXT(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVariantIntegervEXT(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public int glGetVaryingLocationNV(int program, ByteBuffer name) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glGetVaryingLocationNV(int program, byte[] name, int name_offset) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glGetVertexAttribArrayObjectfvATI(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribArrayObjectfvATI(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribArrayObjectivATI(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribArrayObjectivATI(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribIivEXT(int index, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribIivEXT(int index, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribIuivEXT(int index, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribIuivEXT(int index, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribdv(int index, int pname, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribdv(int index, int pname, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribdvARB(int index, int pname, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribdvARB(int index, int pname, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribdvNV(int index, int pname, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribdvNV(int index, int pname, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribfv(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribfv(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribfvARB(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribfvARB(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribfvNV(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribfvNV(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribiv(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribiv(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribivARB(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribivARB(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribivNV(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glGetVertexAttribivNV(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glGlobalAlphaFactorbSUN(byte factor) {
		unauthorizedCall();

	}

	@Override
	public void glGlobalAlphaFactordSUN(double coord) {
		unauthorizedCall();

	}

	@Override
	public void glGlobalAlphaFactorfSUN(float coord) {
		unauthorizedCall();

	}

	@Override
	public void glGlobalAlphaFactoriSUN(int count) {
		unauthorizedCall();

	}

	@Override
	public void glGlobalAlphaFactorsSUN(short factor) {
		unauthorizedCall();

	}

	@Override
	public void glGlobalAlphaFactorubSUN(byte factor) {
		unauthorizedCall();

	}

	@Override
	public void glGlobalAlphaFactoruiSUN(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glGlobalAlphaFactorusSUN(short factor) {
		unauthorizedCall();

	}

	@Override
	public void glHint(int target, int mode) {
		gl10.glHint(target, mode);
	}

	@Override
	public void glHintPGI(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glHistogram(int target, int width, int internalformat, boolean sink) {
		unauthorizedCall();

	}

	@Override
	public void glIglooInterfaceSGIX(int pname, Buffer params) {
		unauthorizedCall();

	}

	@Override
	public void glImageTransformParameterfHP(int target, int pname, float params) {
		unauthorizedCall();

	}

	@Override
	public void glImageTransformParameterfvHP(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glImageTransformParameterfvHP(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glImageTransformParameteriHP(int target, int pname, int params) {
		unauthorizedCall();

	}

	@Override
	public void glImageTransformParameterivHP(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glImageTransformParameterivHP(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glIndexFuncEXT(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glIndexMask(int mask) {
		unauthorizedCall();

	}

	@Override
	public void glIndexMaterialEXT(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glIndexPointer(int type, int stride, Buffer ptr) {
		unauthorizedCall();

	}

	@Override
	public void glIndexd(double c) {
		unauthorizedCall();

	}

	@Override
	public void glIndexdv(DoubleBuffer c) {
		unauthorizedCall();

	}

	@Override
	public void glIndexdv(double[] c, int c_offset) {
		unauthorizedCall();

	}

	@Override
	public void glIndexf(float c) {
		unauthorizedCall();

	}

	@Override
	public void glIndexfv(FloatBuffer c) {
		unauthorizedCall();

	}

	@Override
	public void glIndexfv(float[] c, int c_offset) {
		unauthorizedCall();

	}

	@Override
	public void glIndexi(int c) {
		unauthorizedCall();

	}

	@Override
	public void glIndexiv(IntBuffer c) {
		unauthorizedCall();

	}

	@Override
	public void glIndexiv(int[] c, int c_offset) {
		unauthorizedCall();

	}

	@Override
	public void glIndexs(short c) {
		unauthorizedCall();

	}

	@Override
	public void glIndexsv(ShortBuffer c) {
		unauthorizedCall();

	}

	@Override
	public void glIndexsv(short[] c, int c_offset) {
		unauthorizedCall();

	}

	@Override
	public void glIndexub(byte c) {
		unauthorizedCall();

	}

	@Override
	public void glIndexubv(ByteBuffer c) {
		unauthorizedCall();

	}

	@Override
	public void glIndexubv(byte[] c, int c_offset) {
		unauthorizedCall();

	}

	@Override
	public void glInitNames() {
		unauthorizedCall();

	}

	@Override
	public void glInsertComponentEXT(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glInstrumentsBufferSGIX(int size, IntBuffer buffer) {
		unauthorizedCall();

	}

	@Override
	public void glInstrumentsBufferSGIX(int size, int[] buffer, int buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glInterleavedArrays(int format, int stride, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glInterleavedArrays(int format, int stride, long pointer_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public boolean glIsAsyncMarkerSGIX(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsBuffer(int id) {
		return gl11.glIsBuffer(id);
	}

	@Override
	public boolean glIsBufferARB(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsEnabled(int cap) {
		return gl11.glIsEnabled(cap);
	}

	@Override
	public boolean glIsEnabledIndexedEXT(int target, int index) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsFenceAPPLE(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsFenceNV(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsFramebufferEXT(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsList(int list) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsObjectBufferATI(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsOcclusionQueryNV(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsProgram(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsProgramARB(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsProgramNV(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsQuery(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsQueryARB(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsRenderbufferEXT(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsShader(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsTexture(int texture) {
		return gl11.glIsTexture(texture);
	}

	@Override
	public boolean glIsVariantEnabledEXT(int id, int cap) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsVertexArrayAPPLE(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glIsVertexAttribEnabledAPPLE(int index, int pname) {
		unauthorizedCall();
		return false;
	}

	@Override
	public void glLightEnviSGIX(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glLightModelf(int pname, float param) {
		gl10.glLightModelf(pname, param);
	}

	@Override
	public void glLightModelfv(int pname, FloatBuffer params) {
		gl10.glLightModelfv(pname, params);
	}

	@Override
	public void glLightModelfv(int pname, float[] params, int params_offset) {
		gl10.glLightModelfv(pname, params, params_offset);
	}

	@Override
	public void glLightModeli(int pname, int param) {
		unauthorizedCall();

	}

	@Override
	public void glLightModeliv(int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glLightModeliv(int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glLightf(int light, int pname, float param) {
		gl10.glLightf(light, pname, param);
	}

	@Override
	public void glLightfv(int light, int pname, FloatBuffer params) {
		gl10.glLightfv(light, pname, params);
	}

	@Override
	public void glLightfv(int light, int pname, float[] params, int params_offset) {
		gl10.glLightfv(light, pname, params, params_offset);
	}

	@Override
	public void glLighti(int light, int pname, int param) {
		unauthorizedCall();

	}

	@Override
	public void glLightiv(int light, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glLightiv(int light, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glLineStipple(int factor, short pattern) {
		unauthorizedCall();

	}

	@Override
	public void glLineWidth(float width) {
		gl10.glLineWidth(width);
	}

	@Override
	public void glLinkProgram(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glLinkProgramARB(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glListBase(int base) {
		unauthorizedCall();

	}

	@Override
	public void glListParameterfSGIX(int target, int pname, float params) {
		unauthorizedCall();

	}

	@Override
	public void glListParameterfvSGIX(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glListParameterfvSGIX(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glListParameteriSGIX(int target, int pname, int params) {
		unauthorizedCall();

	}

	@Override
	public void glListParameterivSGIX(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glListParameterivSGIX(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glLoadIdentity() {
		gl10.glLoadIdentity();
	}

	@Override
	public void glLoadIdentityDeformationMapSGIX(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glLoadMatrixd(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glLoadMatrixd(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glLoadMatrixf(FloatBuffer m) {
		gl10.glLoadMatrixf(m);
	}

	@Override
	public void glLoadMatrixf(float[] m, int m_offset) {
		gl10.glLoadMatrixf(m, m_offset);
	}

	@Override
	public void glLoadName(int name) {
		unauthorizedCall();

	}

	@Override
	public void glLoadProgramNV(int target, int id, int len, String program) {
		unauthorizedCall();

	}

	@Override
	public void glLoadTransposeMatrixd(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glLoadTransposeMatrixd(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glLoadTransposeMatrixf(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glLoadTransposeMatrixf(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glLockArraysEXT(int x, int y) {
		unauthorizedCall();

	}

	@Override
	public void glLogicOp(int opcode) {
		gl10.glLogicOp(opcode);
	}

	@Override
	public void glMap1d(int target, double u1, double u2, int stride, int order, DoubleBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glMap1d(int target, double u1, double u2, int stride, int order, double[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMap1f(int target, float u1, float u2, int stride, int order, FloatBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glMap1f(int target, float u1, float u2, int stride, int order, float[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double[] points,
			int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public ByteBuffer glMapBuffer(int target, int access) {
		unauthorizedCall();
		return null;
	}

	@Override
	public ByteBuffer glMapBufferARB(int target, int access) {
		unauthorizedCall();
		return null;
	}

	@Override
	public void glMapControlPointsNV(int target, int index, int type, int ustride, int vstride, int uorder, int vorder, boolean packed, Buffer points) {
		unauthorizedCall();

	}

	@Override
	public void glMapGrid1d(int un, double u1, double u2) {
		unauthorizedCall();

	}

	@Override
	public void glMapGrid1f(int un, float u1, float u2) {
		unauthorizedCall();

	}

	@Override
	public void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2) {
		unauthorizedCall();

	}

	@Override
	public void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2) {
		unauthorizedCall();

	}

	@Override
	public void glMapParameterfvNV(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glMapParameterfvNV(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMapParameterivNV(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glMapParameterivNV(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMapVertexAttrib1dAPPLE(int index, int size, double u1, double u2, int stride, int order, DoubleBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glMapVertexAttrib1dAPPLE(int index, int size, double u1, double u2, int stride, int order, double[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMapVertexAttrib1fAPPLE(int index, int size, float u1, float u2, int stride, int order, FloatBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glMapVertexAttrib1fAPPLE(int index, int size, float u1, float u2, int stride, int order, float[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMapVertexAttrib2dAPPLE(int index, int size, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder,
			DoubleBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glMapVertexAttrib2dAPPLE(int index, int size, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder,
			double[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMapVertexAttrib2fAPPLE(int index, int size, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder,
			FloatBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glMapVertexAttrib2fAPPLE(int index, int size, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder,
			float[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMaterialf(int face, int pname, float param) {
		gl10.glMaterialf(face, pname, param);
	}

	@Override
	public void glMaterialfv(int face, int pname, FloatBuffer params) {
		gl10.glMaterialfv(face, pname, params);
	}

	@Override
	public void glMaterialfv(int face, int pname, float[] params, int params_offset) {
		gl10.glMaterialfv(face, pname, params, params_offset);
	}

	@Override
	public void glMateriali(int face, int pname, int param) {
		unauthorizedCall();

	}

	@Override
	public void glMaterialiv(int face, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glMaterialiv(int face, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMatrixIndexPointerARB(int size, int type, int stride, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glMatrixIndexPointerARB(int size, int type, int stride, long pointer_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMatrixIndexubvARB(int size, ByteBuffer weights) {
		unauthorizedCall();

	}

	@Override
	public void glMatrixIndexubvARB(int size, byte[] weights, int weights_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMatrixIndexuivARB(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glMatrixIndexuivARB(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMatrixIndexusvARB(int size, ShortBuffer weights) {
		unauthorizedCall();

	}

	@Override
	public void glMatrixIndexusvARB(int size, short[] weights, int weights_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMatrixMode(int mode) {
		gl10.glMatrixMode(mode);
	}

	@Override
	public void glMinmax(int target, int internalformat, boolean sink) {
		unauthorizedCall();

	}

	@Override
	public void glMultMatrixd(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glMultMatrixd(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultMatrixf(FloatBuffer m) {
		gl10.glMultMatrixf(m);

	}

	@Override
	public void glMultMatrixf(float[] m, int m_offset) {
		gl10.glMultMatrixf(m, m_offset);
	}

	@Override
	public void glMultTransposeMatrixd(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glMultTransposeMatrixd(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultTransposeMatrixf(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glMultTransposeMatrixf(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiDrawArrays(int mode, IntBuffer first, IntBuffer count, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glMultiDrawArrays(int mode, int[] first, int first_offset, int[] count, int count_offset, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glMultiDrawArraysEXT(int mode, IntBuffer first, IntBuffer count, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glMultiDrawArraysEXT(int mode, int[] first, int first_offset, int[] count, int count_offset, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glMultiDrawElementArrayAPPLE(int mode, IntBuffer first, IntBuffer count, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glMultiDrawElementArrayAPPLE(int mode, int[] first, int first_offset, int[] count, int count_offset, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glMultiDrawElements(int mode, IntBuffer count, int type, Buffer[] indices, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glMultiDrawElements(int mode, int[] count, int count_offset, int type, Buffer[] indices, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glMultiDrawElementsEXT(int mode, IntBuffer count, int type, Buffer[] indices, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glMultiDrawElementsEXT(int mode, int[] count, int count_offset, int type, Buffer[] indices, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glMultiDrawRangeElementArrayAPPLE(int mode, int start, int end, IntBuffer first, IntBuffer count, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glMultiDrawRangeElementArrayAPPLE(int mode, int start, int end, int[] first, int first_offset, int[] count, int count_offset, int primcount) {
		unauthorizedCall();

	}

	@Override
	public void glMultiModeDrawArraysIBM(IntBuffer mode, IntBuffer first, IntBuffer count, int primcount, int modestride) {
		unauthorizedCall();

	}

	@Override
	public void glMultiModeDrawArraysIBM(int[] mode, int mode_offset, int[] first, int first_offset, int[] count, int count_offset, int primcount,
			int modestride) {
		unauthorizedCall();

	}

	@Override
	public void glMultiModeDrawElementsIBM(IntBuffer mode, IntBuffer count, int type, Buffer[] indices, int primcount, int modestride) {
		unauthorizedCall();

	}

	@Override
	public void glMultiModeDrawElementsIBM(int[] mode, int mode_offset, int[] count, int count_offset, int type, Buffer[] indices, int primcount, int modestride) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1d(int target, double s) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1dv(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1dv(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1f(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1fv(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1fv(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1hNV(int target, short s) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1hvNV(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1hvNV(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1i(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1iv(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1iv(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1s(int target, short s) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1sv(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord1sv(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2d(int target, double s, double t) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2dv(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2dv(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2f(int target, float s, float t) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2fv(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2fv(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2hNV(int target, short s, short t) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2hvNV(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2hvNV(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2i(int target, int s, int t) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2iv(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2iv(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2s(int target, short s, short t) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2sv(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord2sv(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3d(int target, double s, double t, double r) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3dv(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3dv(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3f(int target, float s, float t, float r) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3fv(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3fv(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3hNV(int target, short s, short t, short r) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3hvNV(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3hvNV(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3i(int target, int s, int t, int r) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3iv(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3iv(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3s(int target, short s, short t, short r) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3sv(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord3sv(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4d(int target, double s, double t, double r, double q) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4dv(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4dv(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4f(int target, float s, float t, float r, float q) {
		gl10.glMultiTexCoord4f(target, s, t, r, q);
	}

	@Override
	public void glMultiTexCoord4fv(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4fv(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4hNV(int target, short s, short t, short r, short q) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4hvNV(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4hvNV(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4i(int target, int start, int x, int y, int width) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4iv(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4iv(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4s(int target, short s, short t, short r, short q) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4sv(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glMultiTexCoord4sv(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public int glNewBufferRegion(int type) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glNewList(int list, int mode) {
		unauthorizedCall();

	}

	@Override
	public int glNewObjectBufferATI(int size, Buffer pointer, int usage) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glNormal3b(byte nx, byte ny, byte nz) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3bv(ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3bv(byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3d(double nx, double ny, double nz) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3dv(DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3dv(double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3f(float nx, float ny, float nz) {
		gl10.glNormal3f(nx, ny, nz);
	}

	@Override
	public void glNormal3fVertex3fSUN(float r, float g, float b, float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3fVertex3fvSUN(FloatBuffer c, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3fVertex3fvSUN(float[] c, int c_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3fv(FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3fv(float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3hNV(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3hvNV(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3hvNV(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3i(int nx, int ny, int nz) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3s(short nx, short ny, short nz) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glNormal3sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glNormalPointer(int type, int stride, Buffer ptr) {
		gl10.glNormalPointer(type, stride, ptr);
	}

	@Override
	public void glNormalPointer(int type, int stride, long ptr_buffer_offset) {
		gl11.glNormalPointer(type, stride, (int) ptr_buffer_offset);
	}

	@Override
	public void glNormalStream3bATI(int stream, byte nx, byte ny, byte nz) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3bvATI(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3bvATI(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3dATI(int target, double s, double t, double r) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3dvATI(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3dvATI(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3fATI(int target, float s, float t, float r) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3fvATI(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3fvATI(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3iATI(int target, int s, int t, int r) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3ivATI(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3ivATI(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3sATI(int target, short s, short t, short r) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3svATI(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glNormalStream3svATI(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glOrtho(double left, double right, double bottom, double top, double near_val, double far_val) {
		gl10.glOrthof((float) left, (float) right, (float) bottom, (float) top, (float) near_val, (float) far_val);
	}

	@Override
	public void glPNTrianglesfATI(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glPNTrianglesiATI(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glPassTexCoordATI(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glPassThrough(float token) {
		unauthorizedCall();

	}

	@Override
	public void glPixelDataRangeNV(int target, int level, Buffer img) {
		unauthorizedCall();

	}

	@Override
	public void glPixelMapfv(int map, int mapsize, FloatBuffer values) {
		unauthorizedCall();

	}

	@Override
	public void glPixelMapfv(int map, int mapsize, float[] values, int values_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPixelMapfv(int map, int mapsize, long values_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPixelMapuiv(int map, int mapsize, IntBuffer values) {
		unauthorizedCall();

	}

	@Override
	public void glPixelMapuiv(int map, int mapsize, int[] values, int values_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPixelMapuiv(int map, int mapsize, long values_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPixelMapusv(int map, int mapsize, ShortBuffer values) {
		unauthorizedCall();

	}

	@Override
	public void glPixelMapusv(int map, int mapsize, short[] values, int values_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPixelMapusv(int map, int mapsize, long values_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPixelStoref(int pname, float param) {
		unauthorizedCall();

	}

	@Override
	public void glPixelStorei(int pname, int param) {
		gl10.glPixelStorei(pname, param);
	}

	@Override
	public void glPixelTexGenParameterfSGIS(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTexGenParameterfvSGIS(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTexGenParameterfvSGIS(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTexGenParameteriSGIS(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTexGenParameterivSGIS(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTexGenParameterivSGIS(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTexGenSGIX(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTransferf(int pname, float param) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTransferi(int pname, int param) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTransformParameterfEXT(int target, int pname, float params) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTransformParameterfvEXT(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTransformParameterfvEXT(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTransformParameteriEXT(int target, int pname, int params) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTransformParameterivEXT(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glPixelTransformParameterivEXT(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPixelZoom(float xfactor, float yfactor) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameterf(int target, float s) {
		gl11.glPointParameterf(target, s);
	}

	@Override
	public void glPointParameterfARB(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameterfEXT(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameterfSGIS(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameterfv(int target, FloatBuffer v) {
		gl11.glPointParameterfv(target, v);
	}

	@Override
	public void glPointParameterfv(int target, float[] v, int v_offset) {
		gl11.glPointParameterfv(target, v, v_offset);
	}

	@Override
	public void glPointParameterfvARB(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameterfvARB(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameterfvEXT(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameterfvEXT(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameterfvSGIS(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameterfvSGIS(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameteri(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameteriNV(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameteriv(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameteriv(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameterivNV(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glPointParameterivNV(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPointSize(float size) {
		gl10.glPointSize(size);
	}

	@Override
	public int glPollAsyncSGIX(IntBuffer markerp) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glPollAsyncSGIX(int[] markerp, int markerp_offset) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glPollInstrumentsSGIX(IntBuffer marker_p) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public int glPollInstrumentsSGIX(int[] marker_p, int marker_p_offset) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glPolygonMode(int face, int mode) {
		unauthorizedCall();

	}

	@Override
	public void glPolygonOffset(float factor, float units) {
		gl10.glPolygonOffset(factor, units);
	}

	@Override
	public void glPolygonStipple(ByteBuffer mask) {
		unauthorizedCall();

	}

	@Override
	public void glPolygonStipple(byte[] mask, int mask_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPolygonStipple(long mask_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glPopAttrib() {
		unauthorizedCall();

	}

	@Override
	public void glPopClientAttrib() {
		unauthorizedCall();

	}

	@Override
	public void glPopMatrix() {
		gl10.glPopMatrix();
	}

	@Override
	public void glPopName() {
		unauthorizedCall();

	}

	@Override
	public void glPrimitiveRestartIndexNV(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glPrimitiveRestartNV() {
		unauthorizedCall();

	}

	@Override
	public void glPrioritizeTextures(int n, IntBuffer textures, FloatBuffer priorities) {
		unauthorizedCall();

	}

	@Override
	public void glPrioritizeTextures(int n, int[] textures, int textures_offset, float[] priorities, int priorities_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramBufferParametersIivNV(int target, int buffer, int index, int count, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramBufferParametersIivNV(int target, int buffer, int index, int count, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramBufferParametersIuivNV(int target, int buffer, int index, int count, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramBufferParametersIuivNV(int target, int buffer, int index, int count, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramBufferParametersfvNV(int target, int buffer, int index, int count, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramBufferParametersfvNV(int target, int buffer, int index, int count, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameter4dARB(int target, int index, double x, double y, double z, double w) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameter4dvARB(int target, int index, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameter4dvARB(int target, int index, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameter4fARB(int target, int index, float x, float y, float z, float w) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameter4fvARB(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameter4fvARB(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameterI4iNV(int target, int index, int x, int y, int z, int w) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameterI4ivNV(int target, int index, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameterI4ivNV(int target, int index, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameterI4uiNV(int target, int index, int x, int y, int z, int w) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameterI4uivNV(int target, int index, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameterI4uivNV(int target, int index, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameters4fvEXT(int target, int filter, int n, FloatBuffer weights) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParameters4fvEXT(int target, int filter, int n, float[] weights, int weights_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParametersI4ivNV(int target, int index, int count, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParametersI4ivNV(int target, int index, int count, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParametersI4uivNV(int target, int index, int count, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramEnvParametersI4uivNV(int target, int index, int count, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameter4dARB(int target, int index, double x, double y, double z, double w) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameter4dvARB(int target, int index, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameter4dvARB(int target, int index, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameter4fARB(int target, int index, float x, float y, float z, float w) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameter4fvARB(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameter4fvARB(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameterI4iNV(int target, int index, int x, int y, int z, int w) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameterI4ivNV(int target, int index, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameterI4ivNV(int target, int index, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameterI4uiNV(int target, int index, int x, int y, int z, int w) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameterI4uivNV(int target, int index, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameterI4uivNV(int target, int index, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameters4fvEXT(int target, int filter, int n, FloatBuffer weights) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParameters4fvEXT(int target, int filter, int n, float[] weights, int weights_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParametersI4ivNV(int target, int index, int count, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParametersI4ivNV(int target, int index, int count, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParametersI4uivNV(int target, int index, int count, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramLocalParametersI4uivNV(int target, int index, int count, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramNamedParameter4dNV(int id, int len, String name, double x, double y, double z, double w) {
		unauthorizedCall();

	}

	@Override
	public void glProgramNamedParameter4dvNV(int id, int len, String name, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glProgramNamedParameter4dvNV(int id, int len, String name, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramNamedParameter4fNV(int id, int len, String name, float x, float y, float z, float w) {
		unauthorizedCall();

	}

	@Override
	public void glProgramNamedParameter4fvNV(int id, int len, String name, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glProgramNamedParameter4fvNV(int id, int len, String name, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramParameter4dNV(int target, int index, double x, double y, double z, double w) {
		unauthorizedCall();

	}

	@Override
	public void glProgramParameter4dvNV(int target, int index, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramParameter4dvNV(int target, int index, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramParameter4fNV(int target, int index, float x, float y, float z, float w) {
		unauthorizedCall();

	}

	@Override
	public void glProgramParameter4fvNV(int target, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glProgramParameter4fvNV(int target, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramParameteriEXT(int program, int pname, int value) {
		unauthorizedCall();

	}

	@Override
	public void glProgramParameters4dvNV(int target, int index, int count, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glProgramParameters4dvNV(int target, int index, int count, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramParameters4fvNV(int target, int index, int count, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glProgramParameters4fvNV(int target, int index, int count, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glProgramStringARB(int target, int format, int len, String string) {
		unauthorizedCall();

	}

	@Override
	public void glProgramVertexLimitNV(int target, int limit) {
		unauthorizedCall();

	}

	@Override
	public void glPushAttrib(int mask) {
		unauthorizedCall();

	}

	@Override
	public void glPushClientAttrib(int mask) {
		unauthorizedCall();

	}

	@Override
	public void glPushMatrix() {
		gl10.glPushMatrix();
	}

	@Override
	public void glPushName(int name) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos2d(double x, double y) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos2dv(DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos2dv(double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos2f(float x, float y) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos2fv(FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos2fv(float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos2i(int x, int y) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos2iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos2iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos2s(short x, short y) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos2sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos2sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos3d(double x, double y, double z) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos3dv(DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos3dv(double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos3f(float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos3fv(FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos3fv(float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos3i(int x, int y, int z) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos3iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos3iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos3s(short x, short y, short z) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos3sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos3sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos4d(double x, double y, double z, double w) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos4dv(DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos4dv(double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos4f(float x, float y, float z, float w) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos4fv(FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos4fv(float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos4i(int x, int y, int z, int w) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos4iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos4iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos4s(short x, short y, short z, short w) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos4sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glRasterPos4sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glReadBuffer(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glReadBufferRegion(int target, int start, int x, int y, int width) {
		unauthorizedCall();

	}

	@Override
	public void glReadInstrumentsSGIX(int count) {
		unauthorizedCall();

	}

	@Override
	public void glReadPixels(int x, int y, int width, int height, int format, int type, Buffer pixels) {
		gl10.glReadPixels(x, y, width, height, format, type, pixels);
	}

	@Override
	public void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRectd(double x1, double y1, double x2, double y2) {
		unauthorizedCall();

	}

	@Override
	public void glRectdv(DoubleBuffer v1, DoubleBuffer v2) {
		unauthorizedCall();

	}

	@Override
	public void glRectdv(double[] v1, int v1_offset, double[] v2, int v2_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRectf(float x1, float y1, float x2, float y2) {
		unauthorizedCall();

	}

	@Override
	public void glRectfv(FloatBuffer v1, FloatBuffer v2) {
		unauthorizedCall();

	}

	@Override
	public void glRectfv(float[] v1, int v1_offset, float[] v2, int v2_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRecti(int x1, int y1, int x2, int y2) {
		unauthorizedCall();

	}

	@Override
	public void glRectiv(IntBuffer v1, IntBuffer v2) {
		unauthorizedCall();

	}

	@Override
	public void glRectiv(int[] v1, int v1_offset, int[] v2, int v2_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRects(short x1, short y1, short x2, short y2) {
		unauthorizedCall();

	}

	@Override
	public void glRectsv(ShortBuffer v1, ShortBuffer v2) {
		unauthorizedCall();

	}

	@Override
	public void glRectsv(short[] v1, int v1_offset, short[] v2, int v2_offset) {
		unauthorizedCall();

	}

	@Override
	public void glReferencePlaneSGIX(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glReferencePlaneSGIX(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public int glRenderMode(int mode) {
		unauthorizedCall();
		return 0;
	}

	@Override
	public void glRenderbufferStorageEXT(int target, int internalformat, int width, int height) {
		unauthorizedCall();

	}

	@Override
	public void glRenderbufferStorageMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalformat, int width, int height) {
		unauthorizedCall();

	}

	@Override
	public void glRenderbufferStorageMultisampleEXT(int target, int samples, int internalformat, int width, int height) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiColor3fVertex3fSUN(int rc, float r, float g, float b, float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiColor3fVertex3fvSUN(IntBuffer rc, FloatBuffer c, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiColor3fVertex3fvSUN(int[] rc, int rc_offset, float[] c, int c_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiColor4fNormal3fVertex3fSUN(int rc, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y,
			float z) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiColor4fNormal3fVertex3fvSUN(IntBuffer rc, FloatBuffer c, FloatBuffer n, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiColor4fNormal3fVertex3fvSUN(int[] rc, int rc_offset, float[] c, int c_offset, float[] n, int n_offset, float[] v,
			int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiColor4ubVertex3fSUN(int rc, byte r, byte g, byte b, byte a, float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiColor4ubVertex3fvSUN(IntBuffer rc, ByteBuffer c, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiColor4ubVertex3fvSUN(int[] rc, int rc_offset, byte[] c, int c_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiNormal3fVertex3fSUN(int rc, float r, float g, float b, float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiNormal3fVertex3fvSUN(IntBuffer rc, FloatBuffer c, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiNormal3fVertex3fvSUN(int[] rc, int rc_offset, float[] c, int c_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN(int rc, float s, float t, float r, float g, float b, float a, float nx, float ny,
			float nz, float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN(IntBuffer rc, FloatBuffer tc, FloatBuffer c, FloatBuffer n, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN(int[] rc, int rc_offset, float[] tc, int tc_offset, float[] c, int c_offset,
			float[] n, int n_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN(int rc, float s, float t, float nx, float ny, float nz, float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN(IntBuffer rc, FloatBuffer c, FloatBuffer n, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN(int[] rc, int rc_offset, float[] c, int c_offset, float[] n, int n_offset, float[] v,
			int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiTexCoord2fVertex3fSUN(int rc, float s, float t, float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiTexCoord2fVertex3fvSUN(IntBuffer rc, FloatBuffer c, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiTexCoord2fVertex3fvSUN(int[] rc, int rc_offset, float[] c, int c_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiVertex3fSUN(int target, float s, float t, float r) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiVertex3fvSUN(IntBuffer rc, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glReplacementCodeuiVertex3fvSUN(int[] rc, int rc_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glRequestResidentProgramsNV(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glRequestResidentProgramsNV(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glResetHistogram(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glResetMinmax(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glResizeBuffersMESA() {
		unauthorizedCall();

	}

	@Override
	public void glRotated(double angle, double x, double y, double z) {
		unauthorizedCall();

	}

	@Override
	public void glRotatef(float angle, float x, float y, float z) {
		gl10.glRotatef(angle, x, y, z);
	}

	@Override
	public void glSampleCoverage(float value, boolean invert) {
		gl10.glSampleCoverage(value, invert);
	}

	@Override
	public void glSampleMapATI(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glSampleMaskEXT(float value, boolean invert) {
		unauthorizedCall();

	}

	@Override
	public void glSampleMaskSGIS(float value, boolean invert) {
		unauthorizedCall();

	}

	@Override
	public void glSamplePatternEXT(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glSamplePatternSGIS(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glScaled(double x, double y, double z) {
		unauthorizedCall();

	}

	@Override
	public void glScalef(float x, float y, float z) {
		gl10.glScalef(x, y, z);
	}

	@Override
	public void glScissor(int x, int y, int width, int height) {
		gl10.glScissor(x, y, width, height);
	}

	@Override
	public void glSecondaryColor3b(byte red, byte green, byte blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3bEXT(byte red, byte green, byte blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3bv(ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3bv(byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3bvEXT(ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3bvEXT(byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3d(double red, double green, double blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3dEXT(double red, double green, double blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3dv(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3dv(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3dvEXT(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3dvEXT(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3f(float red, float green, float blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3fEXT(float red, float green, float blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3fv(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3fv(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3fvEXT(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3fvEXT(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3hNV(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3hvNV(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3hvNV(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3i(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3iEXT(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3ivEXT(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3ivEXT(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3s(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3sEXT(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3svEXT(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3svEXT(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3ub(byte red, byte green, byte blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3ubEXT(byte red, byte green, byte blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3ubv(ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3ubv(byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3ubvEXT(ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3ubvEXT(byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3ui(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3uiEXT(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3uiv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3uiv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3uivEXT(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3uivEXT(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3us(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3usEXT(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3usv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3usv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3usvEXT(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColor3usvEXT(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColorPointer(int size, int type, int stride, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColorPointer(int size, int type, int stride, long pointer_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColorPointerEXT(int size, int type, int stride, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glSecondaryColorPointerEXT(int size, int type, int stride, long pointer_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSelectBuffer(int size, IntBuffer buffer) {
		unauthorizedCall();

	}

	@Override
	public void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, Buffer row, Buffer column) {
		unauthorizedCall();

	}

	@Override
	public void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, long row_buffer_offset,
			long column_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSetFenceAPPLE(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glSetFenceNV(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glSetFragmentShaderConstantATI(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSetFragmentShaderConstantATI(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSetInvariantEXT(int id, int type, Buffer addr) {
		unauthorizedCall();

	}

	@Override
	public void glSetLocalConstantEXT(int id, int type, Buffer addr) {
		unauthorizedCall();

	}

	@Override
	public void glShadeModel(int mode) {
		gl10.glShadeModel(mode);
	}

	@Override
	public void glShaderOp1EXT(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glShaderOp2EXT(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		unauthorizedCall();

	}

	@Override
	public void glShaderOp3EXT(int op, int res, int arg1, int arg2, int arg3) {
		unauthorizedCall();

	}

	@Override
	public void glShaderSource(int shader, int count, String[] string, IntBuffer length) {
		unauthorizedCall();

	}

	@Override
	public void glShaderSource(int shader, int count, String[] string, int[] length, int length_offset) {
		unauthorizedCall();

	}

	@Override
	public void glShaderSourceARB(int shader, int count, String[] string, IntBuffer length) {
		unauthorizedCall();

	}

	@Override
	public void glShaderSourceARB(int shader, int count, String[] string, int[] length, int length_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSharpenTexFuncSGIS(int target, int n, FloatBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glSharpenTexFuncSGIS(int target, int n, float[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSpriteParameterfSGIX(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glSpriteParameterfvSGIX(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSpriteParameterfvSGIX(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glSpriteParameteriSGIX(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glSpriteParameterivSGIX(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glSpriteParameterivSGIX(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glStartInstrumentsSGIX() {
		unauthorizedCall();

	}

	@Override
	public void glStencilClearTagEXT(int stencilTagBits, int stencilClearTag) {
		unauthorizedCall();

	}

	@Override
	public void glStencilFunc(int func, int ref, int mask) {
		gl10.glStencilFunc(func, ref, mask);
	}

	@Override
	public void glStencilFuncSeparate(int frontfunc, int backfunc, int ref, int mask) {
		unauthorizedCall();

	}

	@Override
	public void glStencilFuncSeparateATI(int frontfunc, int backfunc, int ref, int mask) {
		unauthorizedCall();

	}

	@Override
	public void glStencilMask(int mask) {
		gl10.glStencilMask(mask);
	}

	@Override
	public void glStencilMaskSeparate(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glStencilOp(int fail, int zfail, int zpass) {
		gl10.glStencilOp(fail, zfail, zpass);
	}

	@Override
	public void glStencilOpSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		unauthorizedCall();

	}

	@Override
	public void glStencilOpSeparateATI(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		unauthorizedCall();

	}

	@Override
	public void glStopInstrumentsSGIX(int count) {
		unauthorizedCall();

	}

	@Override
	public void glStringMarkerGREMEDY(int length, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glSwapAPPLE() {
		unauthorizedCall();

	}

	@Override
	public void glSwizzleEXT(int stage, int portion, int variable, int input, int mapping, int componentUsage) {
		unauthorizedCall();

	}

	@Override
	public void glTagSampleBufferSGIX() {
		unauthorizedCall();

	}

	@Override
	public void glTbufferMask3DFX(int mode) {
		unauthorizedCall();

	}

	@Override
	public boolean glTestFenceAPPLE(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glTestFenceNV(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glTestObjectAPPLE(int id, int cap) {
		unauthorizedCall();
		return false;
	}

	@Override
	public void glTexBufferEXT(int target, int internalformat, int buffer) {
		unauthorizedCall();

	}

	@Override
	public void glTexBumpParameterfvATI(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexBumpParameterfvATI(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexBumpParameterivATI(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexBumpParameterivATI(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1d(double s) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1dv(DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1dv(double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1f(float s) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1fv(FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1fv(float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1hNV(short factor) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1hvNV(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1hvNV(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1i(int s) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1s(short s) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord1sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2d(double s, double t) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2dv(DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2dv(double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2f(float s, float t) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fColor3fVertex3fSUN(float s, float t, float p, float q, float x, float y, float z, float w) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fColor3fVertex3fvSUN(FloatBuffer c, FloatBuffer n, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fColor3fVertex3fvSUN(float[] c, int c_offset, float[] n, int n_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fColor4fNormal3fVertex3fSUN(float s, float t, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y,
			float z) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fColor4fNormal3fVertex3fvSUN(FloatBuffer tc, FloatBuffer c, FloatBuffer n, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fColor4fNormal3fVertex3fvSUN(float[] tc, int tc_offset, float[] c, int c_offset, float[] n, int n_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fColor4ubVertex3fSUN(float s, float t, byte r, byte g, byte b, byte a, float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fColor4ubVertex3fvSUN(FloatBuffer tc, ByteBuffer c, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fColor4ubVertex3fvSUN(float[] tc, int tc_offset, byte[] c, int c_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fNormal3fVertex3fSUN(float s, float t, float p, float q, float x, float y, float z, float w) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fNormal3fVertex3fvSUN(FloatBuffer c, FloatBuffer n, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fNormal3fVertex3fvSUN(float[] c, int c_offset, float[] n, int n_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fVertex3fSUN(float s, float t, float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fVertex3fvSUN(FloatBuffer c, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fVertex3fvSUN(float[] c, int c_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fv(FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2fv(float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2hNV(short x, short y) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2hvNV(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2hvNV(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2i(int s, int t) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2s(short s, short t) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord2sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3d(double s, double t, double r) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3dv(DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3dv(double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3f(float s, float t, float r) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3fv(FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3fv(float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3hNV(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3hvNV(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3hvNV(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3i(int s, int t, int r) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3s(short s, short t, short r) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord3sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4d(double s, double t, double r, double q) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4dv(DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4dv(double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4f(float s, float t, float r, float q) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4fColor4fNormal3fVertex4fSUN(float s, float t, float p, float q, float r, float g, float b, float a, float nx, float ny, float nz,
			float x, float y, float z, float w) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4fColor4fNormal3fVertex4fvSUN(FloatBuffer tc, FloatBuffer c, FloatBuffer n, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4fColor4fNormal3fVertex4fvSUN(float[] tc, int tc_offset, float[] c, int c_offset, float[] n, int n_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4fVertex4fSUN(float s, float t, float p, float q, float x, float y, float z, float w) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4fVertex4fvSUN(FloatBuffer c, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4fVertex4fvSUN(float[] c, int c_offset, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4fv(FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4fv(float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4hNV(short x, short y, short z, short w) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4hvNV(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4hvNV(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4i(int s, int t, int r, int q) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4s(short s, short t, short r, short q) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoord4sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexCoordPointer(int size, int type, int stride, Buffer ptr) {
		gl10.glTexCoordPointer(size, type, stride, ptr);
	}

	@Override
	public void glTexCoordPointer(int size, int type, int stride, long ptr_buffer_offset) {
		gl11.glTexCoordPointer(size, type, stride, (int) ptr_buffer_offset);
	}

	@Override
	public void glTexEnvf(int target, int pname, float param) {
		gl10.glTexEnvf(target, pname, param);
	}

	@Override
	public void glTexEnvfv(int target, int pname, FloatBuffer params) {
		gl10.glTexEnvfv(target, pname, params);
	}

	@Override
	public void glTexEnvfv(int target, int pname, float[] params, int params_offset) {
		gl10.glTexEnvfv(target, pname, params, params_offset);
	}

	@Override
	public void glTexEnvi(int target, int pname, int param) {
		gl11.glTexEnvi(target, pname, param);
	}

	@Override
	public void glTexEnviv(int target, int pname, IntBuffer params) {
		gl11.glTexEnviv(target, pname, params);
	}

	@Override
	public void glTexEnviv(int target, int pname, int[] params, int params_offset) {
		gl11.glTexEnviv(target, pname, params, params_offset);
	}

	@Override
	public void glTexFilterFuncSGIS(int target, int filter, int n, FloatBuffer weights) {
		unauthorizedCall();

	}

	@Override
	public void glTexFilterFuncSGIS(int target, int filter, int n, float[] weights, int weights_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexGend(int coord, int pname, double param) {
		unauthorizedCall();

	}

	@Override
	public void glTexGendv(int coord, int pname, DoubleBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glTexGendv(int coord, int pname, double[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexGenf(int coord, int pname, float param) {
		unauthorizedCall();

	}

	@Override
	public void glTexGenfv(int coord, int pname, FloatBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glTexGenfv(int coord, int pname, float[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexGeni(int coord, int pname, int param) {
		unauthorizedCall();

	}

	@Override
	public void glTexGeniv(int coord, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glTexGeniv(int coord, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, Buffer pixels) {
		unauthorizedCall();

	}

	@Override
	public void glTexImage1D(int target, int level, int internalFormat, int width, int border, int format, int type, long pixels_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, Buffer pixels) {
		gl10.glTexImage2D(target, level, internalFormat, width, height, border, format, type, pixels);
	}

	@Override
	public void glTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, long pixels_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, Buffer pixels) {
		unauthorizedCall();

	}

	@Override
	public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type,
			long pixels_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexImage4DSGIS(int target, int level, int internalformat, int width, int height, int depth, int size4d, int border, int format, int type,
			Buffer pixels) {
		unauthorizedCall();

	}

	@Override
	public void glTexParameterIivEXT(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glTexParameterIivEXT(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexParameterIuivEXT(int target, int pname, IntBuffer params) {
		unauthorizedCall();

	}

	@Override
	public void glTexParameterIuivEXT(int target, int pname, int[] params, int params_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexParameterf(int target, int pname, float param) {
		gl10.glTexParameterf(target, pname, param);
	}

	@Override
	public void glTexParameterfv(int target, int pname, FloatBuffer params) {
		gl11.glTexParameterfv(target, pname, params);
	}

	@Override
	public void glTexParameterfv(int target, int pname, float[] params, int params_offset) {
		gl11.glTexParameterfv(target, pname, params, params_offset);
	}

	@Override
	public void glTexParameteri(int target, int pname, int param) {
		gl11.glTexParameteri(target, pname, param);
	}

	@Override
	public void glTexParameteriv(int target, int pname, IntBuffer params) {
		gl11.glTexParameteriv(target, pname, params);
	}

	@Override
	public void glTexParameteriv(int target, int pname, int[] params, int params_offset) {
		gl11.glTexParameteriv(target, pname, params, params_offset);
	}

	@Override
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, Buffer pixels) {
		unauthorizedCall();

	}

	@Override
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Buffer pixels) {
		gl10.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	@Override
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type,
			Buffer pixels) {
		unauthorizedCall();

	}

	@Override
	public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type,
			long pixels_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glTexSubImage4DSGIS(int target, int level, int xoffset, int yoffset, int zoffset, int woffset, int width, int height, int depth, int size4d,
			int format, int type, Buffer pixels) {
		unauthorizedCall();

	}

	@Override
	public void glTextureColorMaskSGIS(boolean red, boolean green, boolean blue, boolean alpha) {
		unauthorizedCall();

	}

	@Override
	public void glTextureLightEXT(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glTextureMaterialEXT(int target, int id) {
		unauthorizedCall();

	}

	@Override
	public void glTextureNormalEXT(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glTextureRangeAPPLE(int target, int length, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glTrackMatrixNV(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		unauthorizedCall();

	}

	@Override
	public void glTransformFeedbackAttribsNV(int count, IntBuffer attribs, int bufferMode) {
		unauthorizedCall();

	}

	@Override
	public void glTransformFeedbackAttribsNV(int count, int[] attribs, int attribs_offset, int bufferMode) {
		unauthorizedCall();

	}

	@Override
	public void glTransformFeedbackVaryingsNV(int program, int count, IntBuffer locations, int bufferMode) {
		unauthorizedCall();

	}

	@Override
	public void glTransformFeedbackVaryingsNV(int program, int count, int[] locations, int locations_offset, int bufferMode) {
		unauthorizedCall();

	}

	@Override
	public void glTranslated(double x, double y, double z) {
		unauthorizedCall();

	}

	@Override
	public void glTranslatef(float x, float y, float z) {
		gl10.glTranslatef(x, y, z);
	}

	@Override
	public void glUniform1f(int location, float v0) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1fARB(int location, float v0) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1fv(int location, int count, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1fv(int location, int count, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1fvARB(int location, int count, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1fvARB(int location, int count, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1i(int x, int y) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1iARB(int x, int y) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1iv(int location, int count, IntBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1iv(int location, int count, int[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1ivARB(int location, int count, IntBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1ivARB(int location, int count, int[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1uiEXT(int location, int v0) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1uivEXT(int location, int count, IntBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform1uivEXT(int location, int count, int[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2f(int location, float v0, float v1) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2fARB(int location, float v0, float v1) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2fv(int location, int count, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2fv(int location, int count, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2fvARB(int location, int count, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2fvARB(int location, int count, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2i(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2iARB(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2iv(int location, int count, IntBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2iv(int location, int count, int[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2ivARB(int location, int count, IntBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2ivARB(int location, int count, int[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2uiEXT(int location, int v0, int v1) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2uivEXT(int location, int count, IntBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform2uivEXT(int location, int count, int[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3f(int location, float v0, float v1, float v2) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3fARB(int location, float v0, float v1, float v2) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3fv(int location, int count, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3fv(int location, int count, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3fvARB(int location, int count, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3fvARB(int location, int count, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3i(int location, int v0, int v1, int v2) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3iARB(int location, int v0, int v1, int v2) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3iv(int location, int count, IntBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3iv(int location, int count, int[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3ivARB(int location, int count, IntBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3ivARB(int location, int count, int[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3uiEXT(int location, int v0, int v1, int v2) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3uivEXT(int location, int count, IntBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform3uivEXT(int location, int count, int[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4f(int location, float v0, float v1, float v2, float v3) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4fARB(int location, float v0, float v1, float v2, float v3) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4fv(int location, int count, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4fv(int location, int count, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4fvARB(int location, int count, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4fvARB(int location, int count, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4i(int location, int v0, int v1, int v2, int v3) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4iARB(int location, int v0, int v1, int v2, int v3) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4iv(int location, int count, IntBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4iv(int location, int count, int[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4ivARB(int location, int count, IntBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4ivARB(int location, int count, int[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4uiEXT(int location, int v0, int v1, int v2, int v3) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4uivEXT(int location, int count, IntBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniform4uivEXT(int location, int count, int[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniformBufferEXT(int program, int location, int buffer) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix2fv(int location, int count, boolean transpose, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix2fv(int location, int count, boolean transpose, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix2fvARB(int location, int count, boolean transpose, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix2fvARB(int location, int count, boolean transpose, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix2x3fv(int location, int count, boolean transpose, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix2x3fv(int location, int count, boolean transpose, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix2x4fv(int location, int count, boolean transpose, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix2x4fv(int location, int count, boolean transpose, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix3fv(int location, int count, boolean transpose, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix3fvARB(int location, int count, boolean transpose, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix3fvARB(int location, int count, boolean transpose, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix3x2fv(int location, int count, boolean transpose, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix3x2fv(int location, int count, boolean transpose, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix3x4fv(int location, int count, boolean transpose, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix3x4fv(int location, int count, boolean transpose, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix4fv(int location, int count, boolean transpose, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix4fvARB(int location, int count, boolean transpose, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix4fvARB(int location, int count, boolean transpose, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix4x2fv(int location, int count, boolean transpose, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix4x2fv(int location, int count, boolean transpose, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix4x3fv(int location, int count, boolean transpose, FloatBuffer value) {
		unauthorizedCall();

	}

	@Override
	public void glUniformMatrix4x3fv(int location, int count, boolean transpose, float[] value, int value_offset) {
		unauthorizedCall();

	}

	@Override
	public void glUnlockArraysEXT() {
		unauthorizedCall();

	}

	@Override
	public boolean glUnmapBuffer(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public boolean glUnmapBufferARB(int id) {
		unauthorizedCall();
		return false;
	}

	@Override
	public void glUpdateObjectBufferATI(int buffer, int offset, int size, Buffer pointer, int preserve) {
		unauthorizedCall();

	}

	@Override
	public void glUseProgram(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glUseProgramObjectARB(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glValidateProgram(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glValidateProgramARB(int mode) {
		unauthorizedCall();

	}

	@Override
	public void glVariantArrayObjectATI(int id, int type, int stride, int buffer, int offset) {
		unauthorizedCall();

	}

	@Override
	public void glVariantPointerEXT(int id, int type, int stride, Buffer addr) {
		unauthorizedCall();

	}

	@Override
	public void glVariantPointerEXT(int id, int type, int stride, long addr_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVariantbvEXT(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVariantbvEXT(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVariantdvEXT(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVariantdvEXT(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVariantfvEXT(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVariantfvEXT(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVariantivEXT(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVariantivEXT(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVariantsvEXT(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVariantsvEXT(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVariantubvEXT(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVariantubvEXT(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVariantuivEXT(int index, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVariantuivEXT(int index, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVariantusvEXT(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVariantusvEXT(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2d(double x, double y) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2dv(DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2dv(double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2f(float x, float y) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2fv(FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2fv(float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2hNV(short x, short y) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2hvNV(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2hvNV(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2i(int x, int y) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2s(short x, short y) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex2sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3d(double x, double y, double z) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3dv(DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3dv(double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3f(float x, float y, float z) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3fv(FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3fv(float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3hNV(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3hvNV(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3hvNV(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3i(int x, int y, int z) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3s(short x, short y, short z) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex3sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4d(double x, double y, double z, double w) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4dv(DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4dv(double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4f(float x, float y, float z, float w) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4fv(FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4fv(float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4hNV(short x, short y, short z, short w) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4hvNV(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4hvNV(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4i(int x, int y, int z, int w) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4s(short x, short y, short z, short w) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertex4sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexArrayParameteriAPPLE(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexArrayRangeAPPLE(int length, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glVertexArrayRangeNV(int length, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1d(int target, double s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1dARB(int target, double s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1dNV(int target, double s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1dv(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1dv(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1dvARB(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1dvARB(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1dvNV(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1dvNV(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1f(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1fARB(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1fNV(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1fv(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1fv(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1fvARB(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1fvARB(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1fvNV(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1fvNV(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1hNV(int target, short s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1hvNV(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1hvNV(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1s(int target, short s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1sARB(int target, short s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1sNV(int target, short s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1sv(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1sv(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1svARB(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1svARB(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1svNV(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib1svNV(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2d(int target, double s, double t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2dARB(int target, double s, double t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2dNV(int target, double s, double t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2dv(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2dv(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2dvARB(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2dvARB(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2dvNV(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2dvNV(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2f(int target, float s, float t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2fARB(int target, float s, float t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2fNV(int target, float s, float t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2fv(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2fv(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2fvARB(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2fvARB(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2fvNV(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2fvNV(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2hNV(int target, short s, short t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2hvNV(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2hvNV(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2s(int target, short s, short t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2sARB(int target, short s, short t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2sNV(int target, short s, short t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2sv(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2sv(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2svARB(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2svARB(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2svNV(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib2svNV(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3d(int target, double s, double t, double r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3dARB(int target, double s, double t, double r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3dNV(int target, double s, double t, double r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3dv(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3dv(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3dvARB(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3dvARB(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3dvNV(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3dvNV(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3f(int target, float s, float t, float r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3fARB(int target, float s, float t, float r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3fNV(int target, float s, float t, float r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3fv(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3fv(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3fvARB(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3fvARB(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3fvNV(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3fvNV(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3hNV(int target, short s, short t, short r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3hvNV(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3hvNV(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3s(int target, short s, short t, short r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3sARB(int target, short s, short t, short r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3sNV(int target, short s, short t, short r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3sv(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3sv(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3svARB(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3svARB(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3svNV(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib3svNV(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4Nbv(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4Nbv(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4NbvARB(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4NbvARB(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4Niv(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4Niv(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4NivARB(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4NivARB(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4Nsv(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4Nsv(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4NsvARB(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4NsvARB(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4NubARB(int index, byte x, byte y, byte z, byte w) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4Nubv(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4Nubv(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4NubvARB(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4NubvARB(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4Nuiv(int index, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4Nuiv(int index, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4NuivARB(int index, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4NuivARB(int index, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4Nusv(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4Nusv(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4NusvARB(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4NusvARB(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4bv(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4bv(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4bvARB(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4bvARB(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4d(int target, double s, double t, double r, double q) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4dARB(int target, double s, double t, double r, double q) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4dNV(int target, double s, double t, double r, double q) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4dv(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4dv(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4dvARB(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4dvARB(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4dvNV(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4dvNV(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4f(int target, float s, float t, float r, float q) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4fARB(int target, float s, float t, float r, float q) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4fNV(int target, float s, float t, float r, float q) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4fv(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4fv(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4fvARB(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4fvARB(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4fvNV(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4fvNV(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4hNV(int target, short s, short t, short r, short q) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4hvNV(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4hvNV(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4iv(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4iv(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4ivARB(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4ivARB(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4s(int target, short s, short t, short r, short q) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4sARB(int target, short s, short t, short r, short q) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4sNV(int target, short s, short t, short r, short q) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4sv(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4sv(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4svARB(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4svARB(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4svNV(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4svNV(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4ubNV(int index, byte x, byte y, byte z, byte w) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4ubv(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4ubv(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4ubvARB(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4ubvARB(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4ubvNV(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4ubvNV(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4uiv(int index, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4uiv(int index, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4uivARB(int index, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4uivARB(int index, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4usv(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4usv(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4usvARB(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttrib4usvARB(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribArrayObjectATI(int index, int size, int type, boolean normalized, int stride, int buffer, int offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI1iEXT(int index, int x) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI1ivEXT(int index, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI1ivEXT(int index, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI1uiEXT(int index, int x) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI1uivEXT(int index, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI1uivEXT(int index, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI2iEXT(int index, int x, int y) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI2ivEXT(int index, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI2ivEXT(int index, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI2uiEXT(int index, int x, int y) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI2uivEXT(int index, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI2uivEXT(int index, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI3iEXT(int index, int x, int y, int z) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI3ivEXT(int index, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI3ivEXT(int index, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI3uiEXT(int index, int x, int y, int z) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI3uivEXT(int index, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI3uivEXT(int index, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4bvEXT(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4bvEXT(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4iEXT(int index, int x, int y, int z, int w) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4ivEXT(int index, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4ivEXT(int index, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4svEXT(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4svEXT(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4ubvEXT(int index, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4ubvEXT(int index, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4uiEXT(int index, int x, int y, int z, int w) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4uivEXT(int index, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4uivEXT(int index, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4usvEXT(int index, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribI4usvEXT(int index, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribIPointerEXT(int index, int size, int type, int stride, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, long pointer_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribPointerNV(int index, int fsize, int type, int stride, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribPointerNV(int index, int fsize, int type, int stride, long pointer_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs1dvNV(int index, int count, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs1dvNV(int index, int count, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs1fvNV(int target, int n, FloatBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs1fvNV(int target, int n, float[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs1hvNV(int index, int n, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs1hvNV(int index, int n, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs1svNV(int index, int count, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs1svNV(int index, int count, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs2dvNV(int index, int count, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs2dvNV(int index, int count, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs2fvNV(int target, int n, FloatBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs2fvNV(int target, int n, float[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs2hvNV(int index, int n, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs2hvNV(int index, int n, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs2svNV(int index, int count, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs2svNV(int index, int count, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs3dvNV(int index, int count, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs3dvNV(int index, int count, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs3fvNV(int target, int n, FloatBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs3fvNV(int target, int n, float[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs3hvNV(int index, int n, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs3hvNV(int index, int n, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs3svNV(int index, int count, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs3svNV(int index, int count, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs4dvNV(int index, int count, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs4dvNV(int index, int count, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs4fvNV(int target, int n, FloatBuffer points) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs4fvNV(int target, int n, float[] points, int points_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs4hvNV(int index, int n, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs4hvNV(int index, int n, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs4svNV(int index, int count, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs4svNV(int index, int count, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs4ubvNV(int index, int count, ByteBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexAttribs4ubvNV(int index, int count, byte[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexBlendARB(int count) {
		unauthorizedCall();

	}

	@Override
	public void glVertexBlendEnvfATI(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexBlendEnviATI(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexPointer(int size, int type, int stride, Buffer ptr) {
		gl10.glVertexPointer(size, type, stride, ptr);
	}

	@Override
	public void glVertexPointer(int size, int type, int stride, long ptr_buffer_offset) {
		gl11.glVertexPointer(size, type, stride, (int) ptr_buffer_offset);
	}

	@Override
	public void glVertexStream1dATI(int target, double s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream1dvATI(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream1dvATI(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream1fATI(int target, float s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream1fvATI(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream1fvATI(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream1iATI(int target, int s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream1ivATI(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream1ivATI(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream1sATI(int target, short s) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream1svATI(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream1svATI(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream2dATI(int target, double s, double t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream2dvATI(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream2dvATI(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream2fATI(int target, float s, float t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream2fvATI(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream2fvATI(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream2iATI(int target, int s, int t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream2ivATI(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream2ivATI(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream2sATI(int target, short s, short t) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream2svATI(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream2svATI(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream3dATI(int target, double s, double t, double r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream3dvATI(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream3dvATI(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream3fATI(int target, float s, float t, float r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream3fvATI(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream3fvATI(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream3iATI(int target, int s, int t, int r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream3ivATI(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream3ivATI(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream3sATI(int target, short s, short t, short r) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream3svATI(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream3svATI(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream4dATI(int target, double s, double t, double r, double q) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream4dvATI(int target, DoubleBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream4dvATI(int target, double[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream4fATI(int target, float s, float t, float r, float q) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream4fvATI(int target, FloatBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream4fvATI(int target, float[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream4iATI(int target, int start, int x, int y, int width) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream4ivATI(int target, IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream4ivATI(int target, int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream4sATI(int target, short s, short t, short r, short q) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream4svATI(int target, ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexStream4svATI(int target, short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexWeightPointerEXT(int size, int type, int stride, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glVertexWeightPointerEXT(int size, int type, int stride, long pointer_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexWeightfEXT(float coord) {
		unauthorizedCall();

	}

	@Override
	public void glVertexWeightfvEXT(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glVertexWeightfvEXT(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glVertexWeighthNV(short factor) {
		unauthorizedCall();

	}

	@Override
	public void glVertexWeighthvNV(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glVertexWeighthvNV(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glViewport(int x, int y, int width, int height) {
		gl10.glViewport(x, y, width, height);
	}

	@Override
	public void glWeightPointerARB(int size, int type, int stride, Buffer pointer) {
		unauthorizedCall();

	}

	@Override
	public void glWeightPointerARB(int size, int type, int stride, long pointer_buffer_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWeightbvARB(int size, ByteBuffer weights) {
		unauthorizedCall();

	}

	@Override
	public void glWeightbvARB(int size, byte[] weights, int weights_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWeightdvARB(int size, DoubleBuffer weights) {
		unauthorizedCall();

	}

	@Override
	public void glWeightdvARB(int size, double[] weights, int weights_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWeightfvARB(int size, FloatBuffer weights) {
		unauthorizedCall();

	}

	@Override
	public void glWeightfvARB(int size, float[] weights, int weights_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWeightivARB(int size, IntBuffer weights) {
		unauthorizedCall();

	}

	@Override
	public void glWeightivARB(int size, int[] weights, int weights_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWeightsvARB(int size, ShortBuffer weights) {
		unauthorizedCall();

	}

	@Override
	public void glWeightsvARB(int size, short[] weights, int weights_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWeightubvARB(int size, ByteBuffer weights) {
		unauthorizedCall();

	}

	@Override
	public void glWeightubvARB(int size, byte[] weights, int weights_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWeightuivARB(int n, IntBuffer ids) {
		unauthorizedCall();

	}

	@Override
	public void glWeightuivARB(int n, int[] ids, int ids_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWeightusvARB(int size, ShortBuffer weights) {
		unauthorizedCall();

	}

	@Override
	public void glWeightusvARB(int size, short[] weights, int weights_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2d(double x, double y) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2dARB(double x, double y) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2dMESA(double x, double y) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2dv(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2dv(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2dvARB(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2dvARB(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2dvMESA(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2dvMESA(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2f(float x, float y) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2fARB(float x, float y) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2fMESA(float x, float y) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2fv(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2fv(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2fvARB(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2fvARB(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2fvMESA(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2fvMESA(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2i(int x, int y) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2iARB(int x, int y) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2iMESA(int x, int y) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2ivARB(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2ivARB(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2ivMESA(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2ivMESA(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2s(short x, short y) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2sARB(short x, short y) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2sMESA(short x, short y) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2svARB(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2svARB(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2svMESA(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos2svMESA(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3d(double red, double green, double blue) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3dARB(double red, double green, double blue) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3dMESA(double red, double green, double blue) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3dv(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3dv(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3dvARB(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3dvARB(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3dvMESA(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3dvMESA(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3f(float red, float green, float blue) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3fARB(float red, float green, float blue) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3fMESA(float red, float green, float blue) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3fv(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3fv(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3fvARB(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3fvARB(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3fvMESA(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3fvMESA(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3i(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3iARB(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3iMESA(int red, int green, int blue) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3iv(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3iv(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3ivARB(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3ivARB(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3ivMESA(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3ivMESA(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3s(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3sARB(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3sMESA(short red, short green, short blue) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3sv(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3sv(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3svARB(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3svARB(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3svMESA(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos3svMESA(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos4dMESA(double x, double y, double z, double w) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos4dvMESA(DoubleBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos4dvMESA(double[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos4fMESA(float red, float green, float blue, float alpha) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos4fvMESA(FloatBuffer m) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos4fvMESA(float[] m, int m_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos4iMESA(int location, int v0, int v1, int v2) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos4ivMESA(IntBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos4ivMESA(int[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos4sMESA(short x, short y, short z, short w) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos4svMESA(ShortBuffer v) {
		unauthorizedCall();

	}

	@Override
	public void glWindowPos4svMESA(short[] v, int v_offset) {
		unauthorizedCall();

	}

	@Override
	public void glWriteMaskEXT(int stage, int portion, int variable, int input, int mapping, int componentUsage) {
		unauthorizedCall();

	}

	@Override
	public boolean isFunctionAvailable(String glFunctionName) {
		if ("glActiveTexture".equals(glFunctionName) || "glClientActiveTexture".equals(glFunctionName)){
			return true;
		}
		return false;
	}

	@Override
	public boolean isExtensionAvailable(String glExtensionName) {
		//unauthorizedCall();
		return false;
	}

	@Override
	public ByteBuffer glAllocateMemoryNV(int arg0, float arg1, float arg2, float arg3) {
		unauthorizedCall();
		return null;
	}

	@Override
	public void setSwapInterval(int interval) {
		unauthorizedCall();

	}

	@Override
	public Object getPlatformGLExtensions() {
		unauthorizedCall();
		return null;
	}

	@Override
	public Object getExtension(String extensionName) {
		unauthorizedCall();
		return null;
	}
}
