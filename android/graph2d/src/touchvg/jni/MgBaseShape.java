/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package touchvg.jni;

public class MgBaseShape extends MgObject {
  private long swigCPtr;

  protected MgBaseShape(long cPtr, boolean cMemoryOwn) {
    super(graph2dJNI.MgBaseShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgBaseShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static int Type() {
    return graph2dJNI.MgBaseShape_Type();
  }

  public MgBaseShape cloneShape() {
    long cPtr = graph2dJNI.MgBaseShape_cloneShape(swigCPtr, this);
    return (cPtr == 0) ? null : new MgBaseShape(cPtr, false);
  }

  public void setOwner(MgShape arg0) {
    graph2dJNI.MgBaseShape_setOwner(swigCPtr, this, MgShape.getCPtr(arg0), arg0);
  }

  public Box2d getExtent() {
    return new Box2d(graph2dJNI.MgBaseShape_getExtent(swigCPtr, this), true);
  }

  public void update() {
    graph2dJNI.MgBaseShape_update(swigCPtr, this);
  }

  public void transform(Matrix2d mat) {
    graph2dJNI.MgBaseShape_transform(swigCPtr, this, Matrix2d.getCPtr(mat), mat);
  }

  public void clear() {
    graph2dJNI.MgBaseShape_clear(swigCPtr, this);
  }

  public int getPointCount() {
    return graph2dJNI.MgBaseShape_getPointCount(swigCPtr, this);
  }

  public Point2d getPoint(int index) {
    return new Point2d(graph2dJNI.MgBaseShape_getPoint(swigCPtr, this, index), true);
  }

  public void setPoint(int index, Point2d pt) {
    graph2dJNI.MgBaseShape_setPoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt);
  }

  public boolean isClosed() {
    return graph2dJNI.MgBaseShape_isClosed(swigCPtr, this);
  }

  public boolean isCurve() {
    return graph2dJNI.MgBaseShape_isCurve(swigCPtr, this);
  }

  public float hitTest2(Point2d pt, float tol, Point2d nearpt) {
    return graph2dJNI.MgBaseShape_hitTest2(swigCPtr, this, Point2d.getCPtr(pt), pt, tol, Point2d.getCPtr(nearpt), nearpt);
  }

  public boolean hitTestBox(Box2d rect) {
    return graph2dJNI.MgBaseShape_hitTestBox(swigCPtr, this, Box2d.getCPtr(rect), rect);
  }

  public boolean draw(int mode, GiGraphics gs, GiContext ctx, int segment) {
    return graph2dJNI.MgBaseShape_draw__SWIG_0(swigCPtr, this, mode, GiGraphics.getCPtr(gs), gs, GiContext.getCPtr(ctx), ctx, segment);
  }

  public boolean draw(int mode, GiGraphics gs, GiContext ctx) {
    return graph2dJNI.MgBaseShape_draw__SWIG_1(swigCPtr, this, mode, GiGraphics.getCPtr(gs), gs, GiContext.getCPtr(ctx), ctx);
  }

  public boolean save(MgStorage s) {
    return graph2dJNI.MgBaseShape_save(swigCPtr, this, MgStorage.getCPtr(s), s);
  }

  public boolean load(MgStorage s) {
    return graph2dJNI.MgBaseShape_load(swigCPtr, this, MgStorage.getCPtr(s), s);
  }

  public int getHandleCount() {
    return graph2dJNI.MgBaseShape_getHandleCount(swigCPtr, this);
  }

  public Point2d getHandlePoint(int index) {
    return new Point2d(graph2dJNI.MgBaseShape_getHandlePoint(swigCPtr, this, index), true);
  }

  public boolean setHandlePoint(int index, Point2d pt, float tol) {
    return graph2dJNI.MgBaseShape_setHandlePoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt, tol);
  }

  public boolean isHandleFixed(int index) {
    return graph2dJNI.MgBaseShape_isHandleFixed(swigCPtr, this, index);
  }

  public boolean offset(Vector2d vec, int segment) {
    return graph2dJNI.MgBaseShape_offset(swigCPtr, this, Vector2d.getCPtr(vec), vec, segment);
  }

  public boolean getFlag(MgShapeBit bit) {
    return graph2dJNI.MgBaseShape_getFlag(swigCPtr, this, bit.swigValue());
  }

  public void setFlag(MgShapeBit bit, boolean on) {
    graph2dJNI.MgBaseShape_setFlag(swigCPtr, this, bit.swigValue(), on);
  }

  public String getTypeName() {
    return graph2dJNI.MgBaseShape_getTypeName(swigCPtr, this);
  }

}
