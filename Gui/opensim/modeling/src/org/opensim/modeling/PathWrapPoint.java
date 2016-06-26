/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PathWrapPoint extends PathPoint {
  private long swigCPtr;

  public PathWrapPoint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.PathWrapPoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PathWrapPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_PathWrapPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PathWrapPoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.PathWrapPoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PathWrapPoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.PathWrapPoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.PathWrapPoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.PathWrapPoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PathWrapPoint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.PathWrapPoint_getConcreteClassName(swigCPtr, this);
  }

  public PathWrapPoint() {
    this(opensimModelSimulationJNI.new_PathWrapPoint(), true);
  }

  public SWIGTYPE_p_OpenSim__ArrayT_SimTK__VecT_3_double_1_t_t getWrapPath() {
    return new SWIGTYPE_p_OpenSim__ArrayT_SimTK__VecT_3_double_1_t_t(opensimModelSimulationJNI.PathWrapPoint_getWrapPath(swigCPtr, this), false);
  }

  public double getWrapLength() {
    return opensimModelSimulationJNI.PathWrapPoint_getWrapLength(swigCPtr, this);
  }

  public void setWrapLength(double aLength) {
    opensimModelSimulationJNI.PathWrapPoint_setWrapLength(swigCPtr, this, aLength);
  }

  public WrapObject getWrapObject() {
    long cPtr = opensimModelSimulationJNI.PathWrapPoint_getWrapObject(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapObject(cPtr, false);
  }

  public void setWrapObject(WrapObject wrapObject) {
    opensimModelSimulationJNI.PathWrapPoint_setWrapObject(swigCPtr, this, WrapObject.getCPtr(wrapObject), wrapObject);
  }

}
