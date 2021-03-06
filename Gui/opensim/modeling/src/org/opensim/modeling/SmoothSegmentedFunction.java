/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SmoothSegmentedFunction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public SmoothSegmentedFunction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SmoothSegmentedFunction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_SmoothSegmentedFunction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SmoothSegmentedFunction() {
    this(opensimCommonJNI.new_SmoothSegmentedFunction(), true);
  }

  public double calcValue(double x) {
    return opensimCommonJNI.SmoothSegmentedFunction_calcValue(swigCPtr, this, x);
  }

  public double calcDerivative(double x, int order) {
    return opensimCommonJNI.SmoothSegmentedFunction_calcDerivative(swigCPtr, this, x, order);
  }

  public double calcIntegral(double x) {
    return opensimCommonJNI.SmoothSegmentedFunction_calcIntegral(swigCPtr, this, x);
  }

  public boolean isIntegralAvailable() {
    return opensimCommonJNI.SmoothSegmentedFunction_isIntegralAvailable(swigCPtr, this);
  }

  public boolean isIntegralComputedLeftToRight() {
    return opensimCommonJNI.SmoothSegmentedFunction_isIntegralComputedLeftToRight(swigCPtr, this);
  }

  public String getName() {
    return opensimCommonJNI.SmoothSegmentedFunction_getName(swigCPtr, this);
  }

  public void setName(SWIGTYPE_p_std__string name) {
    opensimCommonJNI.SmoothSegmentedFunction_setName(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(name));
  }

  public Vec2 getCurveDomain() {
    return new Vec2(opensimCommonJNI.SmoothSegmentedFunction_getCurveDomain(swigCPtr, this), true);
  }

  public void printMuscleCurveToCSVFile(String path, double domainMin, double domainMax) {
    opensimCommonJNI.SmoothSegmentedFunction_printMuscleCurveToCSVFile(swigCPtr, this, path, domainMin, domainMax);
  }

  public Matrix calcSampledMuscleCurve(int maxOrder, double domainMin, double domainMax) {
    return new Matrix(opensimCommonJNI.SmoothSegmentedFunction_calcSampledMuscleCurve(swigCPtr, this, maxOrder, domainMin, domainMax), true);
  }

}
