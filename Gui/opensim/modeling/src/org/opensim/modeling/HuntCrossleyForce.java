/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class HuntCrossleyForce extends Force {
  private long swigCPtr;

  public HuntCrossleyForce(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.HuntCrossleyForce_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HuntCrossleyForce obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_HuntCrossleyForce(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static HuntCrossleyForce safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.HuntCrossleyForce_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new HuntCrossleyForce(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.HuntCrossleyForce_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.HuntCrossleyForce_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.HuntCrossleyForce_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new HuntCrossleyForce(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.HuntCrossleyForce_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_contact_parameters(HuntCrossleyForce source) {
    opensimModelSimulationJNI.HuntCrossleyForce_copyProperty_contact_parameters(swigCPtr, this, HuntCrossleyForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet get_contact_parameters(int i) {
    return new SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet(opensimModelSimulationJNI.HuntCrossleyForce_get_contact_parameters__SWIG_0(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet upd_contact_parameters(int i) {
    return new SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet(opensimModelSimulationJNI.HuntCrossleyForce_upd_contact_parameters__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_contact_parameters(int i, SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet value) {
    opensimModelSimulationJNI.HuntCrossleyForce_set_contact_parameters__SWIG_0(swigCPtr, this, i, SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet.getCPtr(value));
  }

  public int append_contact_parameters(SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet value) {
    return opensimModelSimulationJNI.HuntCrossleyForce_append_contact_parameters(swigCPtr, this, SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet.getCPtr(value));
  }

  public void constructProperty_contact_parameters(SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet initValue) {
    opensimModelSimulationJNI.HuntCrossleyForce_constructProperty_contact_parameters(swigCPtr, this, SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet.getCPtr(initValue));
  }

  public SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet get_contact_parameters() {
    return new SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet(opensimModelSimulationJNI.HuntCrossleyForce_get_contact_parameters__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet upd_contact_parameters() {
    return new SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet(opensimModelSimulationJNI.HuntCrossleyForce_upd_contact_parameters__SWIG_1(swigCPtr, this), false);
  }

  public void set_contact_parameters(SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet value) {
    opensimModelSimulationJNI.HuntCrossleyForce_set_contact_parameters__SWIG_1(swigCPtr, this, SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet.getCPtr(value));
  }

  public void copyProperty_transition_velocity(HuntCrossleyForce source) {
    opensimModelSimulationJNI.HuntCrossleyForce_copyProperty_transition_velocity(swigCPtr, this, HuntCrossleyForce.getCPtr(source), source);
  }

  public double get_transition_velocity(int i) {
    return opensimModelSimulationJNI.HuntCrossleyForce_get_transition_velocity__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_transition_velocity(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.HuntCrossleyForce_upd_transition_velocity__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_transition_velocity(int i, double value) {
    opensimModelSimulationJNI.HuntCrossleyForce_set_transition_velocity__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_transition_velocity(double value) {
    return opensimModelSimulationJNI.HuntCrossleyForce_append_transition_velocity(swigCPtr, this, value);
  }

  public void constructProperty_transition_velocity(double initValue) {
    opensimModelSimulationJNI.HuntCrossleyForce_constructProperty_transition_velocity(swigCPtr, this, initValue);
  }

  public double get_transition_velocity() {
    return opensimModelSimulationJNI.HuntCrossleyForce_get_transition_velocity__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_transition_velocity() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.HuntCrossleyForce_upd_transition_velocity__SWIG_1(swigCPtr, this), false);
  }

  public void set_transition_velocity(double value) {
    opensimModelSimulationJNI.HuntCrossleyForce_set_transition_velocity__SWIG_1(swigCPtr, this, value);
  }

  public HuntCrossleyForce() {
    this(opensimModelSimulationJNI.new_HuntCrossleyForce(), true);
  }

  public SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet updContactParametersSet() {
    return new SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet(opensimModelSimulationJNI.HuntCrossleyForce_updContactParametersSet(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet getContactParametersSet() {
    return new SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParametersSet(opensimModelSimulationJNI.HuntCrossleyForce_getContactParametersSet(swigCPtr, this), false);
  }

  public void addContactParameters(SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParameters params) {
    opensimModelSimulationJNI.HuntCrossleyForce_addContactParameters(swigCPtr, this, SWIGTYPE_p_OpenSim__HuntCrossleyForce__ContactParameters.getCPtr(params));
  }

  public double getTransitionVelocity() {
    return opensimModelSimulationJNI.HuntCrossleyForce_getTransitionVelocity(swigCPtr, this);
  }

  public void setTransitionVelocity(double velocity) {
    opensimModelSimulationJNI.HuntCrossleyForce_setTransitionVelocity(swigCPtr, this, velocity);
  }

  public double getStiffness() {
    return opensimModelSimulationJNI.HuntCrossleyForce_getStiffness(swigCPtr, this);
  }

  public void setStiffness(double stiffness) {
    opensimModelSimulationJNI.HuntCrossleyForce_setStiffness(swigCPtr, this, stiffness);
  }

  public double getDissipation() {
    return opensimModelSimulationJNI.HuntCrossleyForce_getDissipation(swigCPtr, this);
  }

  public void setDissipation(double dissipation) {
    opensimModelSimulationJNI.HuntCrossleyForce_setDissipation(swigCPtr, this, dissipation);
  }

  public double getStaticFriction() {
    return opensimModelSimulationJNI.HuntCrossleyForce_getStaticFriction(swigCPtr, this);
  }

  public void setStaticFriction(double friction) {
    opensimModelSimulationJNI.HuntCrossleyForce_setStaticFriction(swigCPtr, this, friction);
  }

  public double getDynamicFriction() {
    return opensimModelSimulationJNI.HuntCrossleyForce_getDynamicFriction(swigCPtr, this);
  }

  public void setDynamicFriction(double friction) {
    opensimModelSimulationJNI.HuntCrossleyForce_setDynamicFriction(swigCPtr, this, friction);
  }

  public double getViscousFriction() {
    return opensimModelSimulationJNI.HuntCrossleyForce_getViscousFriction(swigCPtr, this);
  }

  public void setViscousFriction(double friction) {
    opensimModelSimulationJNI.HuntCrossleyForce_setViscousFriction(swigCPtr, this, friction);
  }

  public void addGeometry(String name) {
    opensimModelSimulationJNI.HuntCrossleyForce_addGeometry(swigCPtr, this, name);
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimModelSimulationJNI.HuntCrossleyForce_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(State state) {
    return new ArrayDouble(opensimModelSimulationJNI.HuntCrossleyForce_getRecordValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

}
