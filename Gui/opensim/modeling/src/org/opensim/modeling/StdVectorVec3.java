/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class StdVectorVec3 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected StdVectorVec3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StdVectorVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_StdVectorVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StdVectorVec3() {
    this(opensimSimbodyJNI.new_StdVectorVec3__SWIG_0(), true);
  }

  public StdVectorVec3(long n) {
    this(opensimSimbodyJNI.new_StdVectorVec3__SWIG_1(n), true);
  }

  public long size() {
    return opensimSimbodyJNI.StdVectorVec3_size(swigCPtr, this);
  }

  public long capacity() {
    return opensimSimbodyJNI.StdVectorVec3_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    opensimSimbodyJNI.StdVectorVec3_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return opensimSimbodyJNI.StdVectorVec3_isEmpty(swigCPtr, this);
  }

  public void clear() {
    opensimSimbodyJNI.StdVectorVec3_clear(swigCPtr, this);
  }

  public void add(Vec3 x) {
    opensimSimbodyJNI.StdVectorVec3_add(swigCPtr, this, Vec3.getCPtr(x), x);
  }

  public Vec3 get(int i) {
    return new Vec3(opensimSimbodyJNI.StdVectorVec3_get(swigCPtr, this, i), false);
  }

  public void set(int i, Vec3 val) {
    opensimSimbodyJNI.StdVectorVec3_set(swigCPtr, this, i, Vec3.getCPtr(val), val);
  }

}
