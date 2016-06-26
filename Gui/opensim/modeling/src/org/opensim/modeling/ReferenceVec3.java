/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ReferenceVec3 extends OpenSimObject {
  private long swigCPtr;

  public ReferenceVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.ReferenceVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ReferenceVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_ReferenceVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ReferenceVec3 safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.ReferenceVec3_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ReferenceVec3(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.ReferenceVec3_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.ReferenceVec3_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.ReferenceVec3_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ReferenceVec3(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.ReferenceVec3_getConcreteClassName(swigCPtr, this);
  }

  public int getNumRefs() {
    return opensimModelSimulationJNI.ReferenceVec3_getNumRefs(swigCPtr, this);
  }

  public Vec2 getValidTimeRange() {
    return new Vec2(opensimModelSimulationJNI.ReferenceVec3_getValidTimeRange(swigCPtr, this), true);
  }

  public SimTKArrayString getNames() {
    return new SimTKArrayString(opensimModelSimulationJNI.ReferenceVec3_getNames(swigCPtr, this), false);
  }

  public void getValues(State s, SimTKArrayVec3 values) {
    opensimModelSimulationJNI.ReferenceVec3_getValues__SWIG_0(swigCPtr, this, State.getCPtr(s), s, SimTKArrayVec3.getCPtr(values), values);
  }

  public void getWeights(State s, SimTKArrayDouble weights) {
    opensimModelSimulationJNI.ReferenceVec3_getWeights__SWIG_0(swigCPtr, this, State.getCPtr(s), s, SimTKArrayDouble.getCPtr(weights), weights);
  }

  public SimTKArrayVec3 getValues(State s) {
    return new SimTKArrayVec3(opensimModelSimulationJNI.ReferenceVec3_getValues__SWIG_1(swigCPtr, this, State.getCPtr(s), s), true);
  }

  public SimTKArrayDouble getWeights(State s) {
    return new SimTKArrayDouble(opensimModelSimulationJNI.ReferenceVec3_getWeights__SWIG_1(swigCPtr, this, State.getCPtr(s), s), true);
  }

}
