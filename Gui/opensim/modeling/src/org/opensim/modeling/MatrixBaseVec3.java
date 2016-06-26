/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MatrixBaseVec3 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MatrixBaseVec3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MatrixBaseVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_MatrixBaseVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int nrow() {
    return opensimSimbodyJNI.MatrixBaseVec3_nrow(swigCPtr, this);
  }

  public int ncol() {
    return opensimSimbodyJNI.MatrixBaseVec3_ncol(swigCPtr, this);
  }

  public boolean isResizeable() {
    return opensimSimbodyJNI.MatrixBaseVec3_isResizeable(swigCPtr, this);
  }

  public MatrixBaseVec3() {
    this(opensimSimbodyJNI.new_MatrixBaseVec3__SWIG_0(), true);
  }

  public MatrixBaseVec3(int m, int n) {
    this(opensimSimbodyJNI.new_MatrixBaseVec3__SWIG_1(m, n), true);
  }

  public void clear() {
    opensimSimbodyJNI.MatrixBaseVec3_clear(swigCPtr, this);
  }

  public MatrixBaseVec3 elementwiseAssign(int s) {
    return new MatrixBaseVec3(opensimSimbodyJNI.MatrixBaseVec3_elementwiseAssign(swigCPtr, this, s), false);
  }

  public MatrixBaseVec3 setTo(Vec3 t) {
    return new MatrixBaseVec3(opensimSimbodyJNI.MatrixBaseVec3_setTo(swigCPtr, this, Vec3.getCPtr(t), t), false);
  }

  public MatrixBaseVec3 setToNaN() {
    return new MatrixBaseVec3(opensimSimbodyJNI.MatrixBaseVec3_setToNaN(swigCPtr, this), false);
  }

  public MatrixBaseVec3 setToZero() {
    return new MatrixBaseVec3(opensimSimbodyJNI.MatrixBaseVec3_setToZero(swigCPtr, this), false);
  }

  public Vec3 getElt(int i, int j) {
    return new Vec3(opensimSimbodyJNI.MatrixBaseVec3_getElt(swigCPtr, this, i, j), false);
  }

  public MatrixBaseVec3 negateInPlace() {
    return new MatrixBaseVec3(opensimSimbodyJNI.MatrixBaseVec3_negateInPlace(swigCPtr, this), false);
  }

  public MatrixBaseVec3 resize(int m, int n) {
    return new MatrixBaseVec3(opensimSimbodyJNI.MatrixBaseVec3_resize(swigCPtr, this, m, n), false);
  }

  public MatrixBaseVec3 resizeKeep(int m, int n) {
    return new MatrixBaseVec3(opensimSimbodyJNI.MatrixBaseVec3_resizeKeep(swigCPtr, this, m, n), false);
  }

  public void lockShape() {
    opensimSimbodyJNI.MatrixBaseVec3_lockShape(swigCPtr, this);
  }

  public void unlockShape() {
    opensimSimbodyJNI.MatrixBaseVec3_unlockShape(swigCPtr, this);
  }

  public final static int NScalarsPerElement = opensimSimbodyJNI.MatrixBaseVec3_NScalarsPerElement_get();
  public final static int CppNScalarsPerElement = opensimSimbodyJNI.MatrixBaseVec3_CppNScalarsPerElement_get();

}
