/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PointToPointActuator extends ScalarActuator {
  private long swigCPtr;

  public PointToPointActuator(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.PointToPointActuator_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PointToPointActuator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_PointToPointActuator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PointToPointActuator safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.PointToPointActuator_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PointToPointActuator(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.PointToPointActuator_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.PointToPointActuator_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.PointToPointActuator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PointToPointActuator(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.PointToPointActuator_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_bodyA(PointToPointActuator source) {
    opensimModelJNI.PointToPointActuator_copyProperty_bodyA(swigCPtr, this, PointToPointActuator.getCPtr(source), source);
  }

  public String get_bodyA(int i) {
    return opensimModelJNI.PointToPointActuator_get_bodyA__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_bodyA(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.PointToPointActuator_upd_bodyA__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_bodyA(int i, String value) {
    opensimModelJNI.PointToPointActuator_set_bodyA__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_bodyA(String value) {
    return opensimModelJNI.PointToPointActuator_append_bodyA(swigCPtr, this, value);
  }

  public void constructProperty_bodyA() {
    opensimModelJNI.PointToPointActuator_constructProperty_bodyA__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_bodyA(String initValue) {
    opensimModelJNI.PointToPointActuator_constructProperty_bodyA__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_bodyA() {
    return opensimModelJNI.PointToPointActuator_get_bodyA__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_bodyA() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.PointToPointActuator_upd_bodyA__SWIG_1(swigCPtr, this), false);
  }

  public void set_bodyA(String value) {
    opensimModelJNI.PointToPointActuator_set_bodyA__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_bodyB(PointToPointActuator source) {
    opensimModelJNI.PointToPointActuator_copyProperty_bodyB(swigCPtr, this, PointToPointActuator.getCPtr(source), source);
  }

  public String get_bodyB(int i) {
    return opensimModelJNI.PointToPointActuator_get_bodyB__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_bodyB(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.PointToPointActuator_upd_bodyB__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_bodyB(int i, String value) {
    opensimModelJNI.PointToPointActuator_set_bodyB__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_bodyB(String value) {
    return opensimModelJNI.PointToPointActuator_append_bodyB(swigCPtr, this, value);
  }

  public void constructProperty_bodyB() {
    opensimModelJNI.PointToPointActuator_constructProperty_bodyB__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_bodyB(String initValue) {
    opensimModelJNI.PointToPointActuator_constructProperty_bodyB__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_bodyB() {
    return opensimModelJNI.PointToPointActuator_get_bodyB__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_bodyB() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.PointToPointActuator_upd_bodyB__SWIG_1(swigCPtr, this), false);
  }

  public void set_bodyB(String value) {
    opensimModelJNI.PointToPointActuator_set_bodyB__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_points_are_global(PointToPointActuator source) {
    opensimModelJNI.PointToPointActuator_copyProperty_points_are_global(swigCPtr, this, PointToPointActuator.getCPtr(source), source);
  }

  public boolean get_points_are_global(int i) {
    return opensimModelJNI.PointToPointActuator_get_points_are_global__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_points_are_global(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.PointToPointActuator_upd_points_are_global__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_points_are_global(int i, boolean value) {
    opensimModelJNI.PointToPointActuator_set_points_are_global__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_points_are_global(boolean value) {
    return opensimModelJNI.PointToPointActuator_append_points_are_global(swigCPtr, this, value);
  }

  public void constructProperty_points_are_global(boolean initValue) {
    opensimModelJNI.PointToPointActuator_constructProperty_points_are_global(swigCPtr, this, initValue);
  }

  public boolean get_points_are_global() {
    return opensimModelJNI.PointToPointActuator_get_points_are_global__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_points_are_global() {
    return new SWIGTYPE_p_bool(opensimModelJNI.PointToPointActuator_upd_points_are_global__SWIG_1(swigCPtr, this), false);
  }

  public void set_points_are_global(boolean value) {
    opensimModelJNI.PointToPointActuator_set_points_are_global__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_pointA(PointToPointActuator source) {
    opensimModelJNI.PointToPointActuator_copyProperty_pointA(swigCPtr, this, PointToPointActuator.getCPtr(source), source);
  }

  public Vec3 get_pointA(int i) {
    return new Vec3(opensimModelJNI.PointToPointActuator_get_pointA__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_pointA(int i) {
    return new Vec3(opensimModelJNI.PointToPointActuator_upd_pointA__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_pointA(int i, Vec3 value) {
    opensimModelJNI.PointToPointActuator_set_pointA__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_pointA(Vec3 value) {
    return opensimModelJNI.PointToPointActuator_append_pointA(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_pointA(Vec3 initValue) {
    opensimModelJNI.PointToPointActuator_constructProperty_pointA(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_pointA() {
    return new Vec3(opensimModelJNI.PointToPointActuator_get_pointA__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_pointA() {
    return new Vec3(opensimModelJNI.PointToPointActuator_upd_pointA__SWIG_1(swigCPtr, this), false);
  }

  public void set_pointA(Vec3 value) {
    opensimModelJNI.PointToPointActuator_set_pointA__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_pointB(PointToPointActuator source) {
    opensimModelJNI.PointToPointActuator_copyProperty_pointB(swigCPtr, this, PointToPointActuator.getCPtr(source), source);
  }

  public Vec3 get_pointB(int i) {
    return new Vec3(opensimModelJNI.PointToPointActuator_get_pointB__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_pointB(int i) {
    return new Vec3(opensimModelJNI.PointToPointActuator_upd_pointB__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_pointB(int i, Vec3 value) {
    opensimModelJNI.PointToPointActuator_set_pointB__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_pointB(Vec3 value) {
    return opensimModelJNI.PointToPointActuator_append_pointB(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_pointB(Vec3 initValue) {
    opensimModelJNI.PointToPointActuator_constructProperty_pointB(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_pointB() {
    return new Vec3(opensimModelJNI.PointToPointActuator_get_pointB__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_pointB() {
    return new Vec3(opensimModelJNI.PointToPointActuator_upd_pointB__SWIG_1(swigCPtr, this), false);
  }

  public void set_pointB(Vec3 value) {
    opensimModelJNI.PointToPointActuator_set_pointB__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_optimal_force(PointToPointActuator source) {
    opensimModelJNI.PointToPointActuator_copyProperty_optimal_force(swigCPtr, this, PointToPointActuator.getCPtr(source), source);
  }

  public double get_optimal_force(int i) {
    return opensimModelJNI.PointToPointActuator_get_optimal_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_optimal_force(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.PointToPointActuator_upd_optimal_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_optimal_force(int i, double value) {
    opensimModelJNI.PointToPointActuator_set_optimal_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_optimal_force(double value) {
    return opensimModelJNI.PointToPointActuator_append_optimal_force(swigCPtr, this, value);
  }

  public void constructProperty_optimal_force(double initValue) {
    opensimModelJNI.PointToPointActuator_constructProperty_optimal_force(swigCPtr, this, initValue);
  }

  public double get_optimal_force() {
    return opensimModelJNI.PointToPointActuator_get_optimal_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_optimal_force() {
    return new SWIGTYPE_p_double(opensimModelJNI.PointToPointActuator_upd_optimal_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_optimal_force(double value) {
    opensimModelJNI.PointToPointActuator_set_optimal_force__SWIG_1(swigCPtr, this, value);
  }

  public PointToPointActuator() {
    this(opensimModelJNI.new_PointToPointActuator__SWIG_0(), true);
  }

  public PointToPointActuator(String bodyNameA, String bodyNameB) {
    this(opensimModelJNI.new_PointToPointActuator__SWIG_1(bodyNameA, bodyNameB), true);
  }

  public void setPointA(Vec3 pointAPos) {
    opensimModelJNI.PointToPointActuator_setPointA(swigCPtr, this, Vec3.getCPtr(pointAPos), pointAPos);
  }

  public Vec3 getPointA() {
    return new Vec3(opensimModelJNI.PointToPointActuator_getPointA(swigCPtr, this), false);
  }

  public void setPointB(Vec3 pointBPos) {
    opensimModelJNI.PointToPointActuator_setPointB(swigCPtr, this, Vec3.getCPtr(pointBPos), pointBPos);
  }

  public Vec3 getPointB() {
    return new Vec3(opensimModelJNI.PointToPointActuator_getPointB(swigCPtr, this), false);
  }

  public void setPointsAreGlobal(boolean isGlobal) {
    opensimModelJNI.PointToPointActuator_setPointsAreGlobal(swigCPtr, this, isGlobal);
  }

  public boolean getPointsAreGlobal() {
    return opensimModelJNI.PointToPointActuator_getPointsAreGlobal(swigCPtr, this);
  }

  public void setOptimalForce(double optimalForce) {
    opensimModelJNI.PointToPointActuator_setOptimalForce(swigCPtr, this, optimalForce);
  }

  public double getOptimalForce() {
    return opensimModelJNI.PointToPointActuator_getOptimalForce(swigCPtr, this);
  }

}
