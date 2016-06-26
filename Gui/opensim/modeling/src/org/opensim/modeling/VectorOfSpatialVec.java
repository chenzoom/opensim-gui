/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class VectorOfSpatialVec {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected VectorOfSpatialVec(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VectorOfSpatialVec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_VectorOfSpatialVec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VectorOfSpatialVec() {
    this(opensimSimbodyJNI.new_VectorOfSpatialVec__SWIG_0(), true);
  }

  public VectorOfSpatialVec(VectorOfSpatialVec src) {
    this(opensimSimbodyJNI.new_VectorOfSpatialVec__SWIG_1(VectorOfSpatialVec.getCPtr(src), src), true);
  }

  public VectorOfSpatialVec(int m, SpatialVec initialValue) {
    this(opensimSimbodyJNI.new_VectorOfSpatialVec__SWIG_2(m, SpatialVec.getCPtr(initialValue), initialValue), true);
  }

  public String toString() {
    return opensimSimbodyJNI.VectorOfSpatialVec_toString(swigCPtr, this);
  }

  public SpatialVec get(int i) {
    return new SpatialVec(opensimSimbodyJNI.VectorOfSpatialVec_get(swigCPtr, this, i), false);
  }

  public void set(int i, SpatialVec value) {
    opensimSimbodyJNI.VectorOfSpatialVec_set(swigCPtr, this, i, SpatialVec.getCPtr(value), value);
  }

}
