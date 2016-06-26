/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class CoordinateAxis {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CoordinateAxis(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CoordinateAxis obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_CoordinateAxis(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CoordinateAxis(int i) {
    this(opensimSimbodyJNI.new_CoordinateAxis(i), true);
  }

  public CoordinateAxis getNextAxis() {
    return new CoordinateAxis(opensimSimbodyJNI.CoordinateAxis_getNextAxis(swigCPtr, this), true);
  }

  public CoordinateAxis getPreviousAxis() {
    return new CoordinateAxis(opensimSimbodyJNI.CoordinateAxis_getPreviousAxis(swigCPtr, this), true);
  }

  public CoordinateAxis getThirdAxis(CoordinateAxis axis2) {
    return new CoordinateAxis(opensimSimbodyJNI.CoordinateAxis_getThirdAxis(swigCPtr, this, CoordinateAxis.getCPtr(axis2), axis2), true);
  }

  public boolean isXAxis() {
    return opensimSimbodyJNI.CoordinateAxis_isXAxis(swigCPtr, this);
  }

  public boolean isYAxis() {
    return opensimSimbodyJNI.CoordinateAxis_isYAxis(swigCPtr, this);
  }

  public boolean isZAxis() {
    return opensimSimbodyJNI.CoordinateAxis_isZAxis(swigCPtr, this);
  }

  public boolean isNextAxis(CoordinateAxis axis2) {
    return opensimSimbodyJNI.CoordinateAxis_isNextAxis(swigCPtr, this, CoordinateAxis.getCPtr(axis2), axis2);
  }

  public boolean isPreviousAxis(CoordinateAxis axis2) {
    return opensimSimbodyJNI.CoordinateAxis_isPreviousAxis(swigCPtr, this, CoordinateAxis.getCPtr(axis2), axis2);
  }

  public boolean isSameAxis(CoordinateAxis axis2) {
    return opensimSimbodyJNI.CoordinateAxis_isSameAxis(swigCPtr, this, CoordinateAxis.getCPtr(axis2), axis2);
  }

  public boolean areAllSameAxes(CoordinateAxis axis2, CoordinateAxis axis3) {
    return opensimSimbodyJNI.CoordinateAxis_areAllSameAxes(swigCPtr, this, CoordinateAxis.getCPtr(axis2), axis2, CoordinateAxis.getCPtr(axis3), axis3);
  }

  public boolean isDifferentAxis(CoordinateAxis axis2) {
    return opensimSimbodyJNI.CoordinateAxis_isDifferentAxis(swigCPtr, this, CoordinateAxis.getCPtr(axis2), axis2);
  }

  public boolean areAllDifferentAxes(CoordinateAxis axis2, CoordinateAxis axis3) {
    return opensimSimbodyJNI.CoordinateAxis_areAllDifferentAxes(swigCPtr, this, CoordinateAxis.getCPtr(axis2), axis2, CoordinateAxis.getCPtr(axis3), axis3);
  }

  public boolean isForwardCyclical(CoordinateAxis axis2) {
    return opensimSimbodyJNI.CoordinateAxis_isForwardCyclical(swigCPtr, this, CoordinateAxis.getCPtr(axis2), axis2);
  }

  public boolean isReverseCyclical(CoordinateAxis axis2) {
    return opensimSimbodyJNI.CoordinateAxis_isReverseCyclical(swigCPtr, this, CoordinateAxis.getCPtr(axis2), axis2);
  }

  public int dotProduct(CoordinateAxis axis2) {
    return opensimSimbodyJNI.CoordinateAxis_dotProduct(swigCPtr, this, CoordinateAxis.getCPtr(axis2), axis2);
  }

  public int crossProductSign(CoordinateAxis axis2) {
    return opensimSimbodyJNI.CoordinateAxis_crossProductSign(swigCPtr, this, CoordinateAxis.getCPtr(axis2), axis2);
  }

  public CoordinateAxis crossProductAxis(CoordinateAxis axis2) {
    return new CoordinateAxis(opensimSimbodyJNI.CoordinateAxis_crossProductAxis(swigCPtr, this, CoordinateAxis.getCPtr(axis2), axis2), true);
  }

  public CoordinateAxis crossProduct(CoordinateAxis axis2, SWIGTYPE_p_int sign) {
    return new CoordinateAxis(opensimSimbodyJNI.CoordinateAxis_crossProduct(swigCPtr, this, CoordinateAxis.getCPtr(axis2), axis2, SWIGTYPE_p_int.getCPtr(sign)), true);
  }

  public static CoordinateAxis getCoordinateAxis(int i) {
    return new CoordinateAxis(opensimSimbodyJNI.CoordinateAxis_getCoordinateAxis(i), false);
  }

  public static boolean isIndexInRange(int i) {
    return opensimSimbodyJNI.CoordinateAxis_isIndexInRange(i);
  }

}
