/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ActuatorForceProbe extends Probe {
  private long swigCPtr;

  public ActuatorForceProbe(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.ActuatorForceProbe_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ActuatorForceProbe obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_ActuatorForceProbe(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ActuatorForceProbe safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.ActuatorForceProbe_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ActuatorForceProbe(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.ActuatorForceProbe_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.ActuatorForceProbe_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.ActuatorForceProbe_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ActuatorForceProbe(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.ActuatorForceProbe_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_actuator_names(ActuatorForceProbe source) {
    opensimModelSimulationJNI.ActuatorForceProbe_copyProperty_actuator_names(swigCPtr, this, ActuatorForceProbe.getCPtr(source), source);
  }

  public String get_actuator_names(int i) {
    return opensimModelSimulationJNI.ActuatorForceProbe_get_actuator_names(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_actuator_names(int i) {
    return new SWIGTYPE_p_std__string(opensimModelSimulationJNI.ActuatorForceProbe_upd_actuator_names(swigCPtr, this, i), false);
  }

  public void set_actuator_names(int i, String value) {
    opensimModelSimulationJNI.ActuatorForceProbe_set_actuator_names(swigCPtr, this, i, value);
  }

  public int append_actuator_names(String value) {
    return opensimModelSimulationJNI.ActuatorForceProbe_append_actuator_names(swigCPtr, this, value);
  }

  public void constructProperty_actuator_names() {
    opensimModelSimulationJNI.ActuatorForceProbe_constructProperty_actuator_names(swigCPtr, this);
  }

  public void copyProperty_sum_forces_together(ActuatorForceProbe source) {
    opensimModelSimulationJNI.ActuatorForceProbe_copyProperty_sum_forces_together(swigCPtr, this, ActuatorForceProbe.getCPtr(source), source);
  }

  public boolean get_sum_forces_together(int i) {
    return opensimModelSimulationJNI.ActuatorForceProbe_get_sum_forces_together__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_sum_forces_together(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.ActuatorForceProbe_upd_sum_forces_together__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_sum_forces_together(int i, boolean value) {
    opensimModelSimulationJNI.ActuatorForceProbe_set_sum_forces_together__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_sum_forces_together(boolean value) {
    return opensimModelSimulationJNI.ActuatorForceProbe_append_sum_forces_together(swigCPtr, this, value);
  }

  public void constructProperty_sum_forces_together(boolean initValue) {
    opensimModelSimulationJNI.ActuatorForceProbe_constructProperty_sum_forces_together(swigCPtr, this, initValue);
  }

  public boolean get_sum_forces_together() {
    return opensimModelSimulationJNI.ActuatorForceProbe_get_sum_forces_together__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_sum_forces_together() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.ActuatorForceProbe_upd_sum_forces_together__SWIG_1(swigCPtr, this), false);
  }

  public void set_sum_forces_together(boolean value) {
    opensimModelSimulationJNI.ActuatorForceProbe_set_sum_forces_together__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_exponent(ActuatorForceProbe source) {
    opensimModelSimulationJNI.ActuatorForceProbe_copyProperty_exponent(swigCPtr, this, ActuatorForceProbe.getCPtr(source), source);
  }

  public double get_exponent(int i) {
    return opensimModelSimulationJNI.ActuatorForceProbe_get_exponent__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_exponent(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.ActuatorForceProbe_upd_exponent__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_exponent(int i, double value) {
    opensimModelSimulationJNI.ActuatorForceProbe_set_exponent__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_exponent(double value) {
    return opensimModelSimulationJNI.ActuatorForceProbe_append_exponent(swigCPtr, this, value);
  }

  public void constructProperty_exponent(double initValue) {
    opensimModelSimulationJNI.ActuatorForceProbe_constructProperty_exponent(swigCPtr, this, initValue);
  }

  public double get_exponent() {
    return opensimModelSimulationJNI.ActuatorForceProbe_get_exponent__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_exponent() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.ActuatorForceProbe_upd_exponent__SWIG_1(swigCPtr, this), false);
  }

  public void set_exponent(double value) {
    opensimModelSimulationJNI.ActuatorForceProbe_set_exponent__SWIG_1(swigCPtr, this, value);
  }

  public ActuatorForceProbe() {
    this(opensimModelSimulationJNI.new_ActuatorForceProbe__SWIG_0(), true);
  }

  public ActuatorForceProbe(ArrayStr actuator_names, boolean sum_forces_together, double exponent) {
    this(opensimModelSimulationJNI.new_ActuatorForceProbe__SWIG_1(ArrayStr.getCPtr(actuator_names), actuator_names, sum_forces_together, exponent), true);
  }

  public PropertyString getActuatorNames() {
    return new PropertyString(opensimModelSimulationJNI.ActuatorForceProbe_getActuatorNames(swigCPtr, this), false);
  }

  public boolean getSumForcesTogether() {
    return opensimModelSimulationJNI.ActuatorForceProbe_getSumForcesTogether(swigCPtr, this);
  }

  public double getExponent() {
    return opensimModelSimulationJNI.ActuatorForceProbe_getExponent(swigCPtr, this);
  }

  public void setActuatorNames(ArrayStr actuatorNames) {
    opensimModelSimulationJNI.ActuatorForceProbe_setActuatorNames(swigCPtr, this, ArrayStr.getCPtr(actuatorNames), actuatorNames);
  }

  public void setSumForcesTogether(boolean sum_forces_together) {
    opensimModelSimulationJNI.ActuatorForceProbe_setSumForcesTogether(swigCPtr, this, sum_forces_together);
  }

  public void setExponent(double exponent) {
    opensimModelSimulationJNI.ActuatorForceProbe_setExponent(swigCPtr, this, exponent);
  }

  public Vector computeProbeInputs(State state) {
    return new Vector(opensimModelSimulationJNI.ActuatorForceProbe_computeProbeInputs(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public int getNumProbeInputs() {
    return opensimModelSimulationJNI.ActuatorForceProbe_getNumProbeInputs(swigCPtr, this);
  }

  public ArrayStr getProbeOutputLabels() {
    return new ArrayStr(opensimModelSimulationJNI.ActuatorForceProbe_getProbeOutputLabels(swigCPtr, this), true);
  }

  public void extendConnectToModel(Model model) {
    opensimModelSimulationJNI.ActuatorForceProbe_extendConnectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

}
