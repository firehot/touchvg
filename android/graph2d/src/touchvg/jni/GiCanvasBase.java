/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package touchvg.jni;

public class GiCanvasBase {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GiCanvasBase(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GiCanvasBase obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        graph2dJNI.delete_GiCanvasBase(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    graph2dJNI.GiCanvasBase_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    graph2dJNI.GiCanvasBase_change_ownership(this, swigCPtr, true);
  }

  public GiCanvasBase() {
    this(graph2dJNI.new_GiCanvasBase(), true);
    graph2dJNI.GiCanvasBase_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public GiTransform xf() {
    return new GiTransform(graph2dJNI.GiCanvasBase_xf(swigCPtr, this), false);
  }

  public GiGraphics gs() {
    return new GiGraphics(graph2dJNI.GiCanvasBase_gs(swigCPtr, this), false);
  }

  public static void setScreenDpi(float dpi) {
    graph2dJNI.GiCanvasBase_setScreenDpi(dpi);
  }

  public float getScreenDpi() {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_getScreenDpi(swigCPtr, this) : graph2dJNI.GiCanvasBase_getScreenDpiSwigExplicitGiCanvasBase(swigCPtr, this);
  }

  public GiColor getBkColor() {
    return new GiColor((getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_getBkColor(swigCPtr, this) : graph2dJNI.GiCanvasBase_getBkColorSwigExplicitGiCanvasBase(swigCPtr, this), true);
  }

  public GiColor setBkColor(GiColor color) {
    return new GiColor((getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_setBkColor(swigCPtr, this, GiColor.getCPtr(color), color) : graph2dJNI.GiCanvasBase_setBkColorSwigExplicitGiCanvasBase(swigCPtr, this, GiColor.getCPtr(color), color), true);
  }

  public boolean beginPaint() {
    return graph2dJNI.GiCanvasBase_beginPaint(swigCPtr, this);
  }

  public void endPaint() {
    graph2dJNI.GiCanvasBase_endPaint(swigCPtr, this);
  }

  public void setNeedRedraw() {
    if (getClass() == GiCanvasBase.class) graph2dJNI.GiCanvasBase_setNeedRedraw(swigCPtr, this); else graph2dJNI.GiCanvasBase_setNeedRedrawSwigExplicitGiCanvasBase(swigCPtr, this);
  }

  public boolean drawHandle(float x, float y, int index) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_drawHandle(swigCPtr, this, x, y, index) : graph2dJNI.GiCanvasBase_drawHandleSwigExplicitGiCanvasBase(swigCPtr, this, x, y, index);
  }

  public void penChanged(int argb, float penWidth, int lineStyle) {
    if (getClass() == GiCanvasBase.class) graph2dJNI.GiCanvasBase_penChanged(swigCPtr, this, argb, penWidth, lineStyle); else graph2dJNI.GiCanvasBase_penChangedSwigExplicitGiCanvasBase(swigCPtr, this, argb, penWidth, lineStyle);
  }

  public void brushChanged(int argb) {
    if (getClass() == GiCanvasBase.class) graph2dJNI.GiCanvasBase_brushChanged(swigCPtr, this, argb); else graph2dJNI.GiCanvasBase_brushChangedSwigExplicitGiCanvasBase(swigCPtr, this, argb);
  }

  public boolean isContextActionsVisible() {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_isContextActionsVisible(swigCPtr, this) : graph2dJNI.GiCanvasBase_isContextActionsVisibleSwigExplicitGiCanvasBase(swigCPtr, this);
  }

  public boolean showContextActions(Ints actions, float x, float y, float w, float h) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_showContextActions(swigCPtr, this, Ints.getCPtr(actions), actions, x, y, w, h) : graph2dJNI.GiCanvasBase_showContextActionsSwigExplicitGiCanvasBase(swigCPtr, this, Ints.getCPtr(actions), actions, x, y, w, h);
  }

  public boolean drawLine(float x1, float y1, float x2, float y2) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_drawLine(swigCPtr, this, x1, y1, x2, y2) : graph2dJNI.GiCanvasBase_drawLineSwigExplicitGiCanvasBase(swigCPtr, this, x1, y1, x2, y2);
  }

  public boolean drawLines(Floats pxs) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_drawLines(swigCPtr, this, Floats.getCPtr(pxs), pxs) : graph2dJNI.GiCanvasBase_drawLinesSwigExplicitGiCanvasBase(swigCPtr, this, Floats.getCPtr(pxs), pxs);
  }

  public boolean drawBeziers(Floats pxs) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_drawBeziers(swigCPtr, this, Floats.getCPtr(pxs), pxs) : graph2dJNI.GiCanvasBase_drawBeziersSwigExplicitGiCanvasBase(swigCPtr, this, Floats.getCPtr(pxs), pxs);
  }

  public boolean drawPolygon(Floats pxs, boolean stroke, boolean fill) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_drawPolygon(swigCPtr, this, Floats.getCPtr(pxs), pxs, stroke, fill) : graph2dJNI.GiCanvasBase_drawPolygonSwigExplicitGiCanvasBase(swigCPtr, this, Floats.getCPtr(pxs), pxs, stroke, fill);
  }

  public boolean drawRect(float x, float y, float w, float h, boolean stroke, boolean fill) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_drawRect(swigCPtr, this, x, y, w, h, stroke, fill) : graph2dJNI.GiCanvasBase_drawRectSwigExplicitGiCanvasBase(swigCPtr, this, x, y, w, h, stroke, fill);
  }

  public boolean drawEllipse(float x, float y, float w, float h, boolean stroke, boolean fill) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_drawEllipse(swigCPtr, this, x, y, w, h, stroke, fill) : graph2dJNI.GiCanvasBase_drawEllipseSwigExplicitGiCanvasBase(swigCPtr, this, x, y, w, h, stroke, fill);
  }

  public boolean beginPath() {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_beginPath(swigCPtr, this) : graph2dJNI.GiCanvasBase_beginPathSwigExplicitGiCanvasBase(swigCPtr, this);
  }

  public boolean moveTo(float x, float y) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_moveTo(swigCPtr, this, x, y) : graph2dJNI.GiCanvasBase_moveToSwigExplicitGiCanvasBase(swigCPtr, this, x, y);
  }

  public boolean lineTo(float x, float y) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_lineTo(swigCPtr, this, x, y) : graph2dJNI.GiCanvasBase_lineToSwigExplicitGiCanvasBase(swigCPtr, this, x, y);
  }

  public boolean bezierTo(float c1x, float c1y, float c2x, float c2y, float x, float y) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_bezierTo(swigCPtr, this, c1x, c1y, c2x, c2y, x, y) : graph2dJNI.GiCanvasBase_bezierToSwigExplicitGiCanvasBase(swigCPtr, this, c1x, c1y, c2x, c2y, x, y);
  }

  public boolean closePath() {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_closePath(swigCPtr, this) : graph2dJNI.GiCanvasBase_closePathSwigExplicitGiCanvasBase(swigCPtr, this);
  }

  public boolean endPath(boolean stroke, boolean fill) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_endPath(swigCPtr, this, stroke, fill) : graph2dJNI.GiCanvasBase_endPathSwigExplicitGiCanvasBase(swigCPtr, this, stroke, fill);
  }

  public void clearWindow() {
    if (getClass() == GiCanvasBase.class) graph2dJNI.GiCanvasBase_clearWindow(swigCPtr, this); else graph2dJNI.GiCanvasBase_clearWindowSwigExplicitGiCanvasBase(swigCPtr, this);
  }

  public void clearCachedBitmap(boolean clearAll) {
    if (getClass() == GiCanvasBase.class) graph2dJNI.GiCanvasBase_clearCachedBitmap__SWIG_0(swigCPtr, this, clearAll); else graph2dJNI.GiCanvasBase_clearCachedBitmapSwigExplicitGiCanvasBase__SWIG_0(swigCPtr, this, clearAll);
  }

  public void clearCachedBitmap() {
    if (getClass() == GiCanvasBase.class) graph2dJNI.GiCanvasBase_clearCachedBitmap__SWIG_1(swigCPtr, this); else graph2dJNI.GiCanvasBase_clearCachedBitmapSwigExplicitGiCanvasBase__SWIG_1(swigCPtr, this);
  }

  public boolean drawCachedBitmap(float x, float y, boolean secondBmp) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_drawCachedBitmap__SWIG_0(swigCPtr, this, x, y, secondBmp) : graph2dJNI.GiCanvasBase_drawCachedBitmapSwigExplicitGiCanvasBase__SWIG_0(swigCPtr, this, x, y, secondBmp);
  }

  public boolean drawCachedBitmap(float x, float y) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_drawCachedBitmap__SWIG_1(swigCPtr, this, x, y) : graph2dJNI.GiCanvasBase_drawCachedBitmapSwigExplicitGiCanvasBase__SWIG_1(swigCPtr, this, x, y);
  }

  public boolean drawCachedBitmap(float x) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_drawCachedBitmap__SWIG_2(swigCPtr, this, x) : graph2dJNI.GiCanvasBase_drawCachedBitmapSwigExplicitGiCanvasBase__SWIG_2(swigCPtr, this, x);
  }

  public boolean drawCachedBitmap() {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_drawCachedBitmap__SWIG_3(swigCPtr, this) : graph2dJNI.GiCanvasBase_drawCachedBitmapSwigExplicitGiCanvasBase__SWIG_3(swigCPtr, this);
  }

  public void saveCachedBitmap(boolean secondBmp) {
    if (getClass() == GiCanvasBase.class) graph2dJNI.GiCanvasBase_saveCachedBitmap__SWIG_0(swigCPtr, this, secondBmp); else graph2dJNI.GiCanvasBase_saveCachedBitmapSwigExplicitGiCanvasBase__SWIG_0(swigCPtr, this, secondBmp);
  }

  public void saveCachedBitmap() {
    if (getClass() == GiCanvasBase.class) graph2dJNI.GiCanvasBase_saveCachedBitmap__SWIG_1(swigCPtr, this); else graph2dJNI.GiCanvasBase_saveCachedBitmapSwigExplicitGiCanvasBase__SWIG_1(swigCPtr, this);
  }

  public boolean hasCachedBitmap(boolean secondBmp) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_hasCachedBitmap__SWIG_0(swigCPtr, this, secondBmp) : graph2dJNI.GiCanvasBase_hasCachedBitmapSwigExplicitGiCanvasBase__SWIG_0(swigCPtr, this, secondBmp);
  }

  public boolean hasCachedBitmap() {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_hasCachedBitmap__SWIG_1(swigCPtr, this) : graph2dJNI.GiCanvasBase_hasCachedBitmapSwigExplicitGiCanvasBase__SWIG_1(swigCPtr, this);
  }

  public boolean isBufferedDrawing() {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_isBufferedDrawing(swigCPtr, this) : graph2dJNI.GiCanvasBase_isBufferedDrawingSwigExplicitGiCanvasBase(swigCPtr, this);
  }

  public void clipBoxChanged(float x, float y, float w, float h) {
    if (getClass() == GiCanvasBase.class) graph2dJNI.GiCanvasBase_clipBoxChanged(swigCPtr, this, x, y, w, h); else graph2dJNI.GiCanvasBase_clipBoxChangedSwigExplicitGiCanvasBase(swigCPtr, this, x, y, w, h);
  }

  public void antiAliasModeChanged(boolean antiAlias) {
    if (getClass() == GiCanvasBase.class) graph2dJNI.GiCanvasBase_antiAliasModeChanged(swigCPtr, this, antiAlias); else graph2dJNI.GiCanvasBase_antiAliasModeChangedSwigExplicitGiCanvasBase(swigCPtr, this, antiAlias);
  }

  public boolean drawImage(String name, float xc, float yc, float w, float h, float angle) {
    return (getClass() == GiCanvasBase.class) ? graph2dJNI.GiCanvasBase_drawImage(swigCPtr, this, name, xc, yc, w, h, angle) : graph2dJNI.GiCanvasBase_drawImageSwigExplicitGiCanvasBase(swigCPtr, this, name, xc, yc, w, h, angle);
  }

  public void rawTextCenter(String text, float x, float y, float h) {
    if (getClass() == GiCanvasBase.class) graph2dJNI.GiCanvasBase_rawTextCenter(swigCPtr, this, text, x, y, h); else graph2dJNI.GiCanvasBase_rawTextCenterSwigExplicitGiCanvasBase(swigCPtr, this, text, x, y, h);
  }

}
