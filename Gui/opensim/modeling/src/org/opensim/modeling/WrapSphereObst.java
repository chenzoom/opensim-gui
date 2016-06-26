/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WrapSphereObst extends WrapObject {
  private long swigCPtr;

  public WrapSphereObst(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.WrapSphereObst_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapSphereObst obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_WrapSphereObst(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapSphereObst safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.WrapSphereObst_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapSphereObst(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.WrapSphereObst_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.WrapSphereObst_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.WrapSphereObst_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapSphereObst(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.WrapSphereObst_getConcreteClassName(swigCPtr, this);
  }

  public void copyData(WrapSphereObst aWrapSphereObst) {
    opensimModelSimulationJNI.WrapSphereObst_copyData(swigCPtr, this, WrapSphereObst.getCPtr(aWrapSphereObst), aWrapSphereObst);
  }

  public double getRadius() {
    return opensimModelSimulationJNI.WrapSphereObst_getRadius(swigCPtr, this);
  }

  public void setRadius(double aRadius) {
    opensimModelSimulationJNI.WrapSphereObst_setRadius(swigCPtr, this, aRadius);
  }

  public double getLength() {
    return opensimModelSimulationJNI.WrapSphereObst_getLength(swigCPtr, this);
  }

  public void setLength(double aLength) {
    opensimModelSimulationJNI.WrapSphereObst_setLength(swigCPtr, this, aLength);
  }

  public String getWrapTypeName() {
    return opensimModelSimulationJNI.WrapSphereObst_getWrapTypeName(swigCPtr, this);
  }

  public String getDimensionsString() {
    return opensimModelSimulationJNI.WrapSphereObst_getDimensionsString(swigCPtr, this);
  }

  public void scale(Vec3 aScaleFactors) {
    opensimModelSimulationJNI.WrapSphereObst_scale(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void connectToModelAndBody(Model aModel, PhysicalFrame aBody) {
    opensimModelSimulationJNI.WrapSphereObst_connectToModelAndBody(swigCPtr, this, Model.getCPtr(aModel), aModel, PhysicalFrame.getCPtr(aBody), aBody);
  }

}
