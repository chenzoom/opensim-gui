/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SmoothSegmentedFunctionFactory {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public SmoothSegmentedFunctionFactory(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SmoothSegmentedFunctionFactory obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_SmoothSegmentedFunctionFactory(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static SWIGTYPE_p_SmoothSegmentedFunction createFiberActiveForceLengthCurve(double lce0, double lce1, double lce2, double lce3, double minActiveForceLengthValue, double plateauSlope, double curviness, boolean computeIntegral, String curveName) {
    long cPtr = opensimModelCommonJNI.SmoothSegmentedFunctionFactory_createFiberActiveForceLengthCurve(lce0, lce1, lce2, lce3, minActiveForceLengthValue, plateauSlope, curviness, computeIntegral, curveName);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SmoothSegmentedFunction(cPtr, false);
  }

  public static SWIGTYPE_p_SmoothSegmentedFunction createFiberForceVelocityCurve(double fmaxE, double dydxC, double dydxNearC, double dydxIso, double dydxE, double dydxNearE, double concCurviness, double eccCurviness, boolean computeIntegral, String curveName) {
    long cPtr = opensimModelCommonJNI.SmoothSegmentedFunctionFactory_createFiberForceVelocityCurve(fmaxE, dydxC, dydxNearC, dydxIso, dydxE, dydxNearE, concCurviness, eccCurviness, computeIntegral, curveName);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SmoothSegmentedFunction(cPtr, false);
  }

  public static SWIGTYPE_p_SmoothSegmentedFunction createFiberForceVelocityInverseCurve(double fmaxE, double dydxC, double dydxNearC, double dydxIso, double dydxE, double dydxNearE, double concCurviness, double eccCurviness, boolean computeIntegral, String muscleName) {
    long cPtr = opensimModelCommonJNI.SmoothSegmentedFunctionFactory_createFiberForceVelocityInverseCurve(fmaxE, dydxC, dydxNearC, dydxIso, dydxE, dydxNearE, concCurviness, eccCurviness, computeIntegral, muscleName);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SmoothSegmentedFunction(cPtr, false);
  }

  public static SWIGTYPE_p_SmoothSegmentedFunction createFiberCompressiveForcePennationCurve(double phi0, double kiso, double curviness, boolean computeIntegral, String curveName) {
    long cPtr = opensimModelCommonJNI.SmoothSegmentedFunctionFactory_createFiberCompressiveForcePennationCurve(phi0, kiso, curviness, computeIntegral, curveName);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SmoothSegmentedFunction(cPtr, false);
  }

  public static SWIGTYPE_p_SmoothSegmentedFunction createFiberCompressiveForceCosPennationCurve(double cosPhi0, double kiso, double curviness, boolean computeIntegral, String curveName) {
    long cPtr = opensimModelCommonJNI.SmoothSegmentedFunctionFactory_createFiberCompressiveForceCosPennationCurve(cosPhi0, kiso, curviness, computeIntegral, curveName);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SmoothSegmentedFunction(cPtr, false);
  }

  public static SWIGTYPE_p_SmoothSegmentedFunction createFiberCompressiveForceLengthCurve(double l0, double kiso, double curviness, boolean computeIntegral, String curveName) {
    long cPtr = opensimModelCommonJNI.SmoothSegmentedFunctionFactory_createFiberCompressiveForceLengthCurve(l0, kiso, curviness, computeIntegral, curveName);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SmoothSegmentedFunction(cPtr, false);
  }

  public static SWIGTYPE_p_SmoothSegmentedFunction createFiberForceLengthCurve(double eZero, double eIso, double kLow, double kIso, double curviness, boolean computeIntegral, String curveName) {
    long cPtr = opensimModelCommonJNI.SmoothSegmentedFunctionFactory_createFiberForceLengthCurve(eZero, eIso, kLow, kIso, curviness, computeIntegral, curveName);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SmoothSegmentedFunction(cPtr, false);
  }

  public static SWIGTYPE_p_SmoothSegmentedFunction createTendonForceLengthCurve(double eIso, double kIso, double fToe, double curviness, boolean computeIntegral, String curveName) {
    long cPtr = opensimModelCommonJNI.SmoothSegmentedFunctionFactory_createTendonForceLengthCurve(eIso, kIso, fToe, curviness, computeIntegral, curveName);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SmoothSegmentedFunction(cPtr, false);
  }

  public SmoothSegmentedFunctionFactory() {
    this(opensimModelCommonJNI.new_SmoothSegmentedFunctionFactory(), true);
  }

}
