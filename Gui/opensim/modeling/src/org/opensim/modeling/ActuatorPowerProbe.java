/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ActuatorPowerProbe extends Probe {
  private long swigCPtr;

  public ActuatorPowerProbe(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.ActuatorPowerProbe_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ActuatorPowerProbe obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_ActuatorPowerProbe(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ActuatorPowerProbe safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.ActuatorPowerProbe_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ActuatorPowerProbe(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.ActuatorPowerProbe_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.ActuatorPowerProbe_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.ActuatorPowerProbe_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ActuatorPowerProbe(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.ActuatorPowerProbe_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_actuator_names(ActuatorPowerProbe source) {
    opensimModelSimulationJNI.ActuatorPowerProbe_copyProperty_actuator_names(swigCPtr, this, ActuatorPowerProbe.getCPtr(source), source);
  }

  public String get_actuator_names(int i) {
    return opensimModelSimulationJNI.ActuatorPowerProbe_get_actuator_names(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_actuator_names(int i) {
    return new SWIGTYPE_p_std__string(opensimModelSimulationJNI.ActuatorPowerProbe_upd_actuator_names(swigCPtr, this, i), false);
  }

  public void set_actuator_names(int i, String value) {
    opensimModelSimulationJNI.ActuatorPowerProbe_set_actuator_names(swigCPtr, this, i, value);
  }

  public int append_actuator_names(String value) {
    return opensimModelSimulationJNI.ActuatorPowerProbe_append_actuator_names(swigCPtr, this, value);
  }

  public void constructProperty_actuator_names() {
    opensimModelSimulationJNI.ActuatorPowerProbe_constructProperty_actuator_names(swigCPtr, this);
  }

  public void copyProperty_sum_powers_together(ActuatorPowerProbe source) {
    opensimModelSimulationJNI.ActuatorPowerProbe_copyProperty_sum_powers_together(swigCPtr, this, ActuatorPowerProbe.getCPtr(source), source);
  }

  public boolean get_sum_powers_together(int i) {
    return opensimModelSimulationJNI.ActuatorPowerProbe_get_sum_powers_together__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_sum_powers_together(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.ActuatorPowerProbe_upd_sum_powers_together__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_sum_powers_together(int i, boolean value) {
    opensimModelSimulationJNI.ActuatorPowerProbe_set_sum_powers_together__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_sum_powers_together(boolean value) {
    return opensimModelSimulationJNI.ActuatorPowerProbe_append_sum_powers_together(swigCPtr, this, value);
  }

  public void constructProperty_sum_powers_together(boolean initValue) {
    opensimModelSimulationJNI.ActuatorPowerProbe_constructProperty_sum_powers_together(swigCPtr, this, initValue);
  }

  public boolean get_sum_powers_together() {
    return opensimModelSimulationJNI.ActuatorPowerProbe_get_sum_powers_together__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_sum_powers_together() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.ActuatorPowerProbe_upd_sum_powers_together__SWIG_1(swigCPtr, this), false);
  }

  public void set_sum_powers_together(boolean value) {
    opensimModelSimulationJNI.ActuatorPowerProbe_set_sum_powers_together__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_exponent(ActuatorPowerProbe source) {
    opensimModelSimulationJNI.ActuatorPowerProbe_copyProperty_exponent(swigCPtr, this, ActuatorPowerProbe.getCPtr(source), source);
  }

  public double get_exponent(int i) {
    return opensimModelSimulationJNI.ActuatorPowerProbe_get_exponent__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_exponent(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.ActuatorPowerProbe_upd_exponent__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_exponent(int i, double value) {
    opensimModelSimulationJNI.ActuatorPowerProbe_set_exponent__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_exponent(double value) {
    return opensimModelSimulationJNI.ActuatorPowerProbe_append_exponent(swigCPtr, this, value);
  }

  public void constructProperty_exponent(double initValue) {
    opensimModelSimulationJNI.ActuatorPowerProbe_constructProperty_exponent(swigCPtr, this, initValue);
  }

  public double get_exponent() {
    return opensimModelSimulationJNI.ActuatorPowerProbe_get_exponent__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_exponent() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.ActuatorPowerProbe_upd_exponent__SWIG_1(swigCPtr, this), false);
  }

  public void set_exponent(double value) {
    opensimModelSimulationJNI.ActuatorPowerProbe_set_exponent__SWIG_1(swigCPtr, this, value);
  }

  public ActuatorPowerProbe() {
    this(opensimModelSimulationJNI.new_ActuatorPowerProbe__SWIG_0(), true);
  }

  public ActuatorPowerProbe(ArrayStr actuator_names, boolean sum_powers_together, double exponent) {
    this(opensimModelSimulationJNI.new_ActuatorPowerProbe__SWIG_1(ArrayStr.getCPtr(actuator_names), actuator_names, sum_powers_together, exponent), true);
  }

  public PropertyString getActuatorNames() {
    return new PropertyString(opensimModelSimulationJNI.ActuatorPowerProbe_getActuatorNames(swigCPtr, this), false);
  }

  public boolean getSumPowersTogether() {
    return opensimModelSimulationJNI.ActuatorPowerProbe_getSumPowersTogether(swigCPtr, this);
  }

  public double getExponent() {
    return opensimModelSimulationJNI.ActuatorPowerProbe_getExponent(swigCPtr, this);
  }

  public void setActuatorNames(ArrayStr actuatorNames) {
    opensimModelSimulationJNI.ActuatorPowerProbe_setActuatorNames(swigCPtr, this, ArrayStr.getCPtr(actuatorNames), actuatorNames);
  }

  public void setSumPowersTogether(boolean sum_powers_together) {
    opensimModelSimulationJNI.ActuatorPowerProbe_setSumPowersTogether(swigCPtr, this, sum_powers_together);
  }

  public void setExponent(double exponent) {
    opensimModelSimulationJNI.ActuatorPowerProbe_setExponent(swigCPtr, this, exponent);
  }

  public Vector computeProbeInputs(State state) {
    return new Vector(opensimModelSimulationJNI.ActuatorPowerProbe_computeProbeInputs(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public int getNumProbeInputs() {
    return opensimModelSimulationJNI.ActuatorPowerProbe_getNumProbeInputs(swigCPtr, this);
  }

  public ArrayStr getProbeOutputLabels() {
    return new ArrayStr(opensimModelSimulationJNI.ActuatorPowerProbe_getProbeOutputLabels(swigCPtr, this), true);
  }

  public void extendConnectToModel(Model aModel) {
    opensimModelSimulationJNI.ActuatorPowerProbe_extendConnectToModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

}
