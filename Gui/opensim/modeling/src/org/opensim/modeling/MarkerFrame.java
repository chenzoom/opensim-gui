/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MarkerFrame extends OpenSimObject {
  private long swigCPtr;

  public MarkerFrame(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.MarkerFrame_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MarkerFrame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_MarkerFrame(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MarkerFrame safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelCommonJNI.MarkerFrame_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MarkerFrame(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelCommonJNI.MarkerFrame_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelCommonJNI.MarkerFrame_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelCommonJNI.MarkerFrame_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MarkerFrame(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelCommonJNI.MarkerFrame_getConcreteClassName(swigCPtr, this);
  }

  public MarkerFrame() {
    this(opensimModelCommonJNI.new_MarkerFrame__SWIG_0(), true);
  }

  public MarkerFrame(int aNumMarkers, int aFrameNumber, double aTime, Units aUnits) {
    this(opensimModelCommonJNI.new_MarkerFrame__SWIG_1(aNumMarkers, aFrameNumber, aTime, Units.getCPtr(aUnits), aUnits), true);
  }

  public MarkerFrame(MarkerFrame aFrame) {
    this(opensimModelCommonJNI.new_MarkerFrame__SWIG_2(MarkerFrame.getCPtr(aFrame), aFrame), true);
  }

  public void addMarker(Vec3 aCoords) {
    opensimModelCommonJNI.MarkerFrame_addMarker(swigCPtr, this, Vec3.getCPtr(aCoords), aCoords);
  }

  public Vec3 getMarker(int aIndex) {
    return new Vec3(opensimModelCommonJNI.MarkerFrame_getMarker(swigCPtr, this, aIndex), true);
  }

  public Vec3 updMarker(int aIndex) {
    return new Vec3(opensimModelCommonJNI.MarkerFrame_updMarker(swigCPtr, this, aIndex), false);
  }

  public int getFrameNumber() {
    return opensimModelCommonJNI.MarkerFrame_getFrameNumber(swigCPtr, this);
  }

  public void setFrameNumber(int aNumber) {
    opensimModelCommonJNI.MarkerFrame_setFrameNumber(swigCPtr, this, aNumber);
  }

  public double getFrameTime() {
    return opensimModelCommonJNI.MarkerFrame_getFrameTime(swigCPtr, this);
  }

  public void scale(double aScaleFactor) {
    opensimModelCommonJNI.MarkerFrame_scale(swigCPtr, this, aScaleFactor);
  }

  public SimTKArrayVec3 getMarkers() {
    return new SimTKArrayVec3(opensimModelCommonJNI.MarkerFrame_getMarkers(swigCPtr, this), false);
  }

}
