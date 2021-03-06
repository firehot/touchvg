/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package touchvg.jni;

public class MgShapesLock {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MgShapesLock(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgShapesLock obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        graph2dJNI.delete_MgShapesLock(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDoc(MgShapeDoc value) {
    graph2dJNI.MgShapesLock_doc_set(swigCPtr, this, MgShapeDoc.getCPtr(value), value);
  }

  public MgShapeDoc getDoc() {
    long cPtr = graph2dJNI.MgShapesLock_doc_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapeDoc(cPtr, false);
  }

  public MgShapesLock(MgShapeDoc doc, int flags, int timeout) {
    this(graph2dJNI.new_MgShapesLock__SWIG_0(MgShapeDoc.getCPtr(doc), doc, flags, timeout), true);
  }

  public MgShapesLock(MgShapeDoc doc, int flags) {
    this(graph2dJNI.new_MgShapesLock__SWIG_1(MgShapeDoc.getCPtr(doc), doc, flags), true);
  }

  public boolean locked() {
    return graph2dJNI.MgShapesLock_locked(swigCPtr, this);
  }

  public static boolean lockedForRead(MgShapeDoc doc) {
    return graph2dJNI.MgShapesLock_lockedForRead(MgShapeDoc.getCPtr(doc), doc);
  }

  public static boolean lockedForWrite(MgShapeDoc doc) {
    return graph2dJNI.MgShapesLock_lockedForWrite(MgShapeDoc.getCPtr(doc), doc);
  }

  public int getEditFlags() {
    return graph2dJNI.MgShapesLock_getEditFlags(swigCPtr, this);
  }

  public void resetEditFlags() {
    graph2dJNI.MgShapesLock_resetEditFlags(swigCPtr, this);
  }

  public final static int Unknown = graph2dJNI.MgShapesLock_Unknown_get();
  public final static int ReadOnly = graph2dJNI.MgShapesLock_ReadOnly_get();
  public final static int Add = graph2dJNI.MgShapesLock_Add_get();
  public final static int Remove = graph2dJNI.MgShapesLock_Remove_get();
  public final static int Edit = graph2dJNI.MgShapesLock_Edit_get();
  public final static int Load = graph2dJNI.MgShapesLock_Load_get();

}
