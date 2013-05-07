/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package touchvg.jni;

public class Vector2d {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Vector2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Vector2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        graph2dJNI.delete_Vector2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(float value) {
    graph2dJNI.Vector2d_x_set(swigCPtr, this, value);
  }

  public float getX() {
    return graph2dJNI.Vector2d_x_get(swigCPtr, this);
  }

  public void setY(float value) {
    graph2dJNI.Vector2d_y_set(swigCPtr, this, value);
  }

  public float getY() {
    return graph2dJNI.Vector2d_y_get(swigCPtr, this);
  }

  public static Vector2d kIdentity() {
    return new Vector2d(graph2dJNI.Vector2d_kIdentity(), false);
  }

  public static Vector2d kXAxis() {
    return new Vector2d(graph2dJNI.Vector2d_kXAxis(), false);
  }

  public static Vector2d kYAxis() {
    return new Vector2d(graph2dJNI.Vector2d_kYAxis(), false);
  }

  public Vector2d() {
    this(graph2dJNI.new_Vector2d__SWIG_0(), true);
  }

  public Vector2d(float xx, float yy) {
    this(graph2dJNI.new_Vector2d__SWIG_1(xx, yy), true);
  }

  public Vector2d(Vector2d src) {
    this(graph2dJNI.new_Vector2d__SWIG_2(Vector2d.getCPtr(src), src), true);
  }

  public Vector2d transform(Matrix2d m) {
    return new Vector2d(graph2dJNI.Vector2d_transform(swigCPtr, this, Matrix2d.getCPtr(m), m), true);
  }

  public Vector2d negate() {
    return new Vector2d(graph2dJNI.Vector2d_negate(swigCPtr, this), false);
  }

  public Vector2d perpVector() {
    return new Vector2d(graph2dJNI.Vector2d_perpVector(swigCPtr, this), true);
  }

  public Vector2d scaleBy(float sx, float sy) {
    return new Vector2d(graph2dJNI.Vector2d_scaleBy(swigCPtr, this, sx, sy), false);
  }

  public float dotProduct(Vector2d v) {
    return graph2dJNI.Vector2d_dotProduct(swigCPtr, this, Vector2d.getCPtr(v), v);
  }

  public float crossProduct(Vector2d v) {
    return graph2dJNI.Vector2d_crossProduct(swigCPtr, this, Vector2d.getCPtr(v), v);
  }

  public float angle() {
    return graph2dJNI.Vector2d_angle(swigCPtr, this);
  }

  public float angle2() {
    return graph2dJNI.Vector2d_angle2(swigCPtr, this);
  }

  public float angleTo(Vector2d v) {
    return graph2dJNI.Vector2d_angleTo(swigCPtr, this, Vector2d.getCPtr(v), v);
  }

  public float angleTo2(Vector2d v) {
    return graph2dJNI.Vector2d_angleTo2(swigCPtr, this, Vector2d.getCPtr(v), v);
  }

  public float length() {
    return graph2dJNI.Vector2d_length(swigCPtr, this);
  }

  public float lengthSqrd() {
    return graph2dJNI.Vector2d_lengthSqrd(swigCPtr, this);
  }

  public Vector2d unitVector() {
    return new Vector2d(graph2dJNI.Vector2d_unitVector(swigCPtr, this), true);
  }

  public boolean normalize(Tol tol) {
    return graph2dJNI.Vector2d_normalize__SWIG_0(swigCPtr, this, Tol.getCPtr(tol), tol);
  }

  public boolean normalize() {
    return graph2dJNI.Vector2d_normalize__SWIG_1(swigCPtr, this);
  }

  public boolean isUnitVector(Tol tol) {
    return graph2dJNI.Vector2d_isUnitVector__SWIG_0(swigCPtr, this, Tol.getCPtr(tol), tol);
  }

  public boolean isUnitVector() {
    return graph2dJNI.Vector2d_isUnitVector__SWIG_1(swigCPtr, this);
  }

  public boolean isZeroVector(Tol tol) {
    return graph2dJNI.Vector2d_isZeroVector__SWIG_0(swigCPtr, this, Tol.getCPtr(tol), tol);
  }

  public boolean isZeroVector() {
    return graph2dJNI.Vector2d_isZeroVector__SWIG_1(swigCPtr, this);
  }

  public boolean isEqualTo(Vector2d v, Tol tol) {
    return graph2dJNI.Vector2d_isEqualTo__SWIG_0(swigCPtr, this, Vector2d.getCPtr(v), v, Tol.getCPtr(tol), tol);
  }

  public boolean isEqualTo(Vector2d v) {
    return graph2dJNI.Vector2d_isEqualTo__SWIG_1(swigCPtr, this, Vector2d.getCPtr(v), v);
  }

  public Vector2d set(float xx, float yy) {
    return new Vector2d(graph2dJNI.Vector2d_set(swigCPtr, this, xx, yy), false);
  }

  public Vector2d setAngleLength(float angle, float len) {
    return new Vector2d(graph2dJNI.Vector2d_setAngleLength(swigCPtr, this, angle, len), false);
  }

  public Vector2d setLength(float len) {
    return new Vector2d(graph2dJNI.Vector2d_setLength(swigCPtr, this, len), false);
  }

  public boolean isRightOf(Vector2d vec) {
    return graph2dJNI.Vector2d_isRightOf(swigCPtr, this, Vector2d.getCPtr(vec), vec);
  }

  public boolean isLeftOf(Vector2d vec) {
    return graph2dJNI.Vector2d_isLeftOf(swigCPtr, this, Vector2d.getCPtr(vec), vec);
  }

  public boolean isParallelTo(Vector2d vec, Tol tol) {
    return graph2dJNI.Vector2d_isParallelTo__SWIG_0(swigCPtr, this, Vector2d.getCPtr(vec), vec, Tol.getCPtr(tol), tol);
  }

  public boolean isParallelTo(Vector2d vec) {
    return graph2dJNI.Vector2d_isParallelTo__SWIG_1(swigCPtr, this, Vector2d.getCPtr(vec), vec);
  }

  public boolean isCodirectionalTo(Vector2d vec, Tol tol) {
    return graph2dJNI.Vector2d_isCodirectionalTo__SWIG_0(swigCPtr, this, Vector2d.getCPtr(vec), vec, Tol.getCPtr(tol), tol);
  }

  public boolean isCodirectionalTo(Vector2d vec) {
    return graph2dJNI.Vector2d_isCodirectionalTo__SWIG_1(swigCPtr, this, Vector2d.getCPtr(vec), vec);
  }

  public boolean isOppositeTo(Vector2d vec, Tol tol) {
    return graph2dJNI.Vector2d_isOppositeTo__SWIG_0(swigCPtr, this, Vector2d.getCPtr(vec), vec, Tol.getCPtr(tol), tol);
  }

  public boolean isOppositeTo(Vector2d vec) {
    return graph2dJNI.Vector2d_isOppositeTo__SWIG_1(swigCPtr, this, Vector2d.getCPtr(vec), vec);
  }

  public boolean isPerpendicularTo(Vector2d vec, Tol tol) {
    return graph2dJNI.Vector2d_isPerpendicularTo__SWIG_0(swigCPtr, this, Vector2d.getCPtr(vec), vec, Tol.getCPtr(tol), tol);
  }

  public boolean isPerpendicularTo(Vector2d vec) {
    return graph2dJNI.Vector2d_isPerpendicularTo__SWIG_1(swigCPtr, this, Vector2d.getCPtr(vec), vec);
  }

  public float distanceToVector(Vector2d xAxis) {
    return graph2dJNI.Vector2d_distanceToVector(swigCPtr, this, Vector2d.getCPtr(xAxis), xAxis);
  }

  public float projectScaleToVector(Vector2d xAxis) {
    return graph2dJNI.Vector2d_projectScaleToVector(swigCPtr, this, Vector2d.getCPtr(xAxis), xAxis);
  }

  public float projectResolveVector(Vector2d xAxis, Vector2d proj, Vector2d perp) {
    return graph2dJNI.Vector2d_projectResolveVector(swigCPtr, this, Vector2d.getCPtr(xAxis), xAxis, Vector2d.getCPtr(proj), proj, Vector2d.getCPtr(perp), perp);
  }

  public boolean resolveVector(Vector2d uAxis, Vector2d vAxis, Vector2d uv) {
    return graph2dJNI.Vector2d_resolveVector__SWIG_0(swigCPtr, this, Vector2d.getCPtr(uAxis), uAxis, Vector2d.getCPtr(vAxis), vAxis, Vector2d.getCPtr(uv), uv);
  }

  public boolean resolveVector(Vector2d uAxis, Vector2d vAxis) {
    return graph2dJNI.Vector2d_resolveVector__SWIG_1(swigCPtr, this, Vector2d.getCPtr(uAxis), uAxis, Vector2d.getCPtr(vAxis), vAxis);
  }

}
