/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayIndexUnsigned {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ArrayIndexUnsigned(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ArrayIndexUnsigned obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_ArrayIndexUnsigned(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static long max_size() {
    return opensimSimbodyJNI.ArrayIndexUnsigned_max_size();
  }

  public ArrayIndexUnsigned() {
    this(opensimSimbodyJNI.new_ArrayIndexUnsigned(), true);
  }

}
