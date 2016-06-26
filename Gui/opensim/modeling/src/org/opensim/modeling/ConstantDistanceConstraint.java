/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ConstantDistanceConstraint extends Constraint {
  private long swigCPtr;

  public ConstantDistanceConstraint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.ConstantDistanceConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ConstantDistanceConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_ConstantDistanceConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ConstantDistanceConstraint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.ConstantDistanceConstraint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ConstantDistanceConstraint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.ConstantDistanceConstraint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.ConstantDistanceConstraint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ConstantDistanceConstraint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.ConstantDistanceConstraint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_location_body_1(ConstantDistanceConstraint source) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_copyProperty_location_body_1(swigCPtr, this, ConstantDistanceConstraint.getCPtr(source), source);
  }

  public Vec3 get_location_body_1(int i) {
    return new Vec3(opensimModelSimulationJNI.ConstantDistanceConstraint_get_location_body_1__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_location_body_1(int i) {
    return new Vec3(opensimModelSimulationJNI.ConstantDistanceConstraint_upd_location_body_1__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location_body_1(int i, Vec3 value) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_set_location_body_1__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_location_body_1(Vec3 value) {
    return opensimModelSimulationJNI.ConstantDistanceConstraint_append_location_body_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_location_body_1(Vec3 initValue) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_constructProperty_location_body_1(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_location_body_1() {
    return new Vec3(opensimModelSimulationJNI.ConstantDistanceConstraint_get_location_body_1__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_location_body_1() {
    return new Vec3(opensimModelSimulationJNI.ConstantDistanceConstraint_upd_location_body_1__SWIG_1(swigCPtr, this), false);
  }

  public void set_location_body_1(Vec3 value) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_set_location_body_1__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_location_body_2(ConstantDistanceConstraint source) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_copyProperty_location_body_2(swigCPtr, this, ConstantDistanceConstraint.getCPtr(source), source);
  }

  public Vec3 get_location_body_2(int i) {
    return new Vec3(opensimModelSimulationJNI.ConstantDistanceConstraint_get_location_body_2__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_location_body_2(int i) {
    return new Vec3(opensimModelSimulationJNI.ConstantDistanceConstraint_upd_location_body_2__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location_body_2(int i, Vec3 value) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_set_location_body_2__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_location_body_2(Vec3 value) {
    return opensimModelSimulationJNI.ConstantDistanceConstraint_append_location_body_2(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_location_body_2(Vec3 initValue) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_constructProperty_location_body_2(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_location_body_2() {
    return new Vec3(opensimModelSimulationJNI.ConstantDistanceConstraint_get_location_body_2__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_location_body_2() {
    return new Vec3(opensimModelSimulationJNI.ConstantDistanceConstraint_upd_location_body_2__SWIG_1(swigCPtr, this), false);
  }

  public void set_location_body_2(Vec3 value) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_set_location_body_2__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_constant_distance(ConstantDistanceConstraint source) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_copyProperty_constant_distance(swigCPtr, this, ConstantDistanceConstraint.getCPtr(source), source);
  }

  public double get_constant_distance(int i) {
    return opensimModelSimulationJNI.ConstantDistanceConstraint_get_constant_distance__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_constant_distance(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.ConstantDistanceConstraint_upd_constant_distance__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_constant_distance(int i, double value) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_set_constant_distance__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_constant_distance(double value) {
    return opensimModelSimulationJNI.ConstantDistanceConstraint_append_constant_distance(swigCPtr, this, value);
  }

  public void constructProperty_constant_distance(double initValue) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_constructProperty_constant_distance(swigCPtr, this, initValue);
  }

  public double get_constant_distance() {
    return opensimModelSimulationJNI.ConstantDistanceConstraint_get_constant_distance__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_constant_distance() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.ConstantDistanceConstraint_upd_constant_distance__SWIG_1(swigCPtr, this), false);
  }

  public void set_constant_distance(double value) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_set_constant_distance__SWIG_1(swigCPtr, this, value);
  }

  public void set_connector_body_1(int value) {
    opensimModelSimulationJNI.ConstantDistanceConstraint__connector_body_1_set(swigCPtr, this, value);
  }

  public int get_connector_body_1() {
    return opensimModelSimulationJNI.ConstantDistanceConstraint__connector_body_1_get(swigCPtr, this);
  }

  public void set_connector_body_2(int value) {
    opensimModelSimulationJNI.ConstantDistanceConstraint__connector_body_2_set(swigCPtr, this, value);
  }

  public int get_connector_body_2() {
    return opensimModelSimulationJNI.ConstantDistanceConstraint__connector_body_2_get(swigCPtr, this);
  }

  public ConstantDistanceConstraint() {
    this(opensimModelSimulationJNI.new_ConstantDistanceConstraint__SWIG_0(), true);
  }

  public ConstantDistanceConstraint(PhysicalFrame body1, Vec3 locationBody1, PhysicalFrame body2, Vec3 locationBody2, double distance) {
    this(opensimModelSimulationJNI.new_ConstantDistanceConstraint__SWIG_1(PhysicalFrame.getCPtr(body1), body1, Vec3.getCPtr(locationBody1), locationBody1, PhysicalFrame.getCPtr(body2), body2, Vec3.getCPtr(locationBody2), locationBody2, distance), true);
  }

  public PhysicalFrame getBody1() {
    return new PhysicalFrame(opensimModelSimulationJNI.ConstantDistanceConstraint_getBody1(swigCPtr, this), false);
  }

  public PhysicalFrame getBody2() {
    return new PhysicalFrame(opensimModelSimulationJNI.ConstantDistanceConstraint_getBody2(swigCPtr, this), false);
  }

  public void setBody1ByName(String aBodyName) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_setBody1ByName(swigCPtr, this, aBodyName);
  }

  public void setBody1PointLocation(Vec3 location) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_setBody1PointLocation(swigCPtr, this, Vec3.getCPtr(location), location);
  }

  public void setBody2ByName(String aBodyName) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_setBody2ByName(swigCPtr, this, aBodyName);
  }

  public void setBody2PointLocation(Vec3 location) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_setBody2PointLocation(swigCPtr, this, Vec3.getCPtr(location), location);
  }

  public void setConstantDistance(double distance) {
    opensimModelSimulationJNI.ConstantDistanceConstraint_setConstantDistance(swigCPtr, this, distance);
  }

}
