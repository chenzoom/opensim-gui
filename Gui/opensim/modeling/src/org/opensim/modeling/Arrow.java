/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Arrow extends Geometry {
  private long swigCPtr;

  public Arrow(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.Arrow_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Arrow obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_Arrow(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Arrow safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.Arrow_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Arrow(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.Arrow_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.Arrow_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.Arrow_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Arrow(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.Arrow_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_start_point(Arrow source) {
    opensimModelSimulationJNI.Arrow_copyProperty_start_point(swigCPtr, this, Arrow.getCPtr(source), source);
  }

  public Vec3 get_start_point(int i) {
    return new Vec3(opensimModelSimulationJNI.Arrow_get_start_point__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_start_point(int i) {
    return new Vec3(opensimModelSimulationJNI.Arrow_upd_start_point__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_start_point(int i, Vec3 value) {
    opensimModelSimulationJNI.Arrow_set_start_point__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_start_point(Vec3 value) {
    return opensimModelSimulationJNI.Arrow_append_start_point(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_start_point(Vec3 initValue) {
    opensimModelSimulationJNI.Arrow_constructProperty_start_point(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_start_point() {
    return new Vec3(opensimModelSimulationJNI.Arrow_get_start_point__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_start_point() {
    return new Vec3(opensimModelSimulationJNI.Arrow_upd_start_point__SWIG_1(swigCPtr, this), false);
  }

  public void set_start_point(Vec3 value) {
    opensimModelSimulationJNI.Arrow_set_start_point__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_direction(Arrow source) {
    opensimModelSimulationJNI.Arrow_copyProperty_direction(swigCPtr, this, Arrow.getCPtr(source), source);
  }

  public Vec3 get_direction(int i) {
    return new Vec3(opensimModelSimulationJNI.Arrow_get_direction__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_direction(int i) {
    return new Vec3(opensimModelSimulationJNI.Arrow_upd_direction__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_direction(int i, Vec3 value) {
    opensimModelSimulationJNI.Arrow_set_direction__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_direction(Vec3 value) {
    return opensimModelSimulationJNI.Arrow_append_direction(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_direction(Vec3 initValue) {
    opensimModelSimulationJNI.Arrow_constructProperty_direction(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_direction() {
    return new Vec3(opensimModelSimulationJNI.Arrow_get_direction__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_direction() {
    return new Vec3(opensimModelSimulationJNI.Arrow_upd_direction__SWIG_1(swigCPtr, this), false);
  }

  public void set_direction(Vec3 value) {
    opensimModelSimulationJNI.Arrow_set_direction__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_length(Arrow source) {
    opensimModelSimulationJNI.Arrow_copyProperty_length(swigCPtr, this, Arrow.getCPtr(source), source);
  }

  public double get_length(int i) {
    return opensimModelSimulationJNI.Arrow_get_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_length(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Arrow_upd_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_length(int i, double value) {
    opensimModelSimulationJNI.Arrow_set_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_length(double value) {
    return opensimModelSimulationJNI.Arrow_append_length(swigCPtr, this, value);
  }

  public void constructProperty_length(double initValue) {
    opensimModelSimulationJNI.Arrow_constructProperty_length(swigCPtr, this, initValue);
  }

  public double get_length() {
    return opensimModelSimulationJNI.Arrow_get_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_length() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Arrow_upd_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_length(double value) {
    opensimModelSimulationJNI.Arrow_set_length__SWIG_1(swigCPtr, this, value);
  }

  public Arrow(Vec3 aPoint1, UnitVec3 aUnitDir, double aLength) {
    this(opensimModelSimulationJNI.new_Arrow__SWIG_0(Vec3.getCPtr(aPoint1), aPoint1, UnitVec3.getCPtr(aUnitDir), aUnitDir, aLength), true);
  }

  public Arrow() {
    this(opensimModelSimulationJNI.new_Arrow__SWIG_1(), true);
  }

}
