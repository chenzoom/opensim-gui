/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Coordinate extends ModelComponent {
  private transient long swigCPtr;

  public Coordinate(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Coordinate_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Coordinate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_Coordinate(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Coordinate safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Coordinate_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Coordinate(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Coordinate_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Coordinate_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Coordinate_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Coordinate(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Coordinate_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_default_value(Coordinate source) {
    opensimSimulationJNI.Coordinate_copyProperty_default_value(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public double get_default_value(int i) {
    return opensimSimulationJNI.Coordinate_get_default_value__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_default_value(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Coordinate_upd_default_value__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_default_value(int i, double value) {
    opensimSimulationJNI.Coordinate_set_default_value__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_default_value(double value) {
    return opensimSimulationJNI.Coordinate_append_default_value(swigCPtr, this, value);
  }

  public void constructProperty_default_value(double initValue) {
    opensimSimulationJNI.Coordinate_constructProperty_default_value(swigCPtr, this, initValue);
  }

  public double get_default_value() {
    return opensimSimulationJNI.Coordinate_get_default_value__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_default_value() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Coordinate_upd_default_value__SWIG_1(swigCPtr, this), false);
  }

  public void set_default_value(double value) {
    opensimSimulationJNI.Coordinate_set_default_value__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_default_speed_value(Coordinate source) {
    opensimSimulationJNI.Coordinate_copyProperty_default_speed_value(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public double get_default_speed_value(int i) {
    return opensimSimulationJNI.Coordinate_get_default_speed_value__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_default_speed_value(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Coordinate_upd_default_speed_value__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_default_speed_value(int i, double value) {
    opensimSimulationJNI.Coordinate_set_default_speed_value__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_default_speed_value(double value) {
    return opensimSimulationJNI.Coordinate_append_default_speed_value(swigCPtr, this, value);
  }

  public void constructProperty_default_speed_value(double initValue) {
    opensimSimulationJNI.Coordinate_constructProperty_default_speed_value(swigCPtr, this, initValue);
  }

  public double get_default_speed_value() {
    return opensimSimulationJNI.Coordinate_get_default_speed_value__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_default_speed_value() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Coordinate_upd_default_speed_value__SWIG_1(swigCPtr, this), false);
  }

  public void set_default_speed_value(double value) {
    opensimSimulationJNI.Coordinate_set_default_speed_value__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_range(Coordinate source) {
    opensimSimulationJNI.Coordinate_copyProperty_range(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public double get_range(int i) {
    return opensimSimulationJNI.Coordinate_get_range(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_range(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Coordinate_upd_range(swigCPtr, this, i), false);
  }

  public void set_range(int i, double value) {
    opensimSimulationJNI.Coordinate_set_range(swigCPtr, this, i, value);
  }

  public int append_range(double value) {
    return opensimSimulationJNI.Coordinate_append_range(swigCPtr, this, value);
  }

  public void copyProperty_clamped(Coordinate source) {
    opensimSimulationJNI.Coordinate_copyProperty_clamped(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public boolean get_clamped(int i) {
    return opensimSimulationJNI.Coordinate_get_clamped__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_clamped(int i) {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Coordinate_upd_clamped__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_clamped(int i, boolean value) {
    opensimSimulationJNI.Coordinate_set_clamped__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_clamped(boolean value) {
    return opensimSimulationJNI.Coordinate_append_clamped(swigCPtr, this, value);
  }

  public void constructProperty_clamped(boolean initValue) {
    opensimSimulationJNI.Coordinate_constructProperty_clamped(swigCPtr, this, initValue);
  }

  public boolean get_clamped() {
    return opensimSimulationJNI.Coordinate_get_clamped__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_clamped() {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Coordinate_upd_clamped__SWIG_1(swigCPtr, this), false);
  }

  public void set_clamped(boolean value) {
    opensimSimulationJNI.Coordinate_set_clamped__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_locked(Coordinate source) {
    opensimSimulationJNI.Coordinate_copyProperty_locked(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public boolean get_locked(int i) {
    return opensimSimulationJNI.Coordinate_get_locked__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_locked(int i) {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Coordinate_upd_locked__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_locked(int i, boolean value) {
    opensimSimulationJNI.Coordinate_set_locked__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_locked(boolean value) {
    return opensimSimulationJNI.Coordinate_append_locked(swigCPtr, this, value);
  }

  public void constructProperty_locked(boolean initValue) {
    opensimSimulationJNI.Coordinate_constructProperty_locked(swigCPtr, this, initValue);
  }

  public boolean get_locked() {
    return opensimSimulationJNI.Coordinate_get_locked__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_locked() {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Coordinate_upd_locked__SWIG_1(swigCPtr, this), false);
  }

  public void set_locked(boolean value) {
    opensimSimulationJNI.Coordinate_set_locked__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_prescribed_function(Coordinate source) {
    opensimSimulationJNI.Coordinate_copyProperty_prescribed_function(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public Function get_prescribed_function(int i) {
    return new Function(opensimSimulationJNI.Coordinate_get_prescribed_function__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_prescribed_function(int i) {
    return new Function(opensimSimulationJNI.Coordinate_upd_prescribed_function__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_prescribed_function(int i, Function value) {
    opensimSimulationJNI.Coordinate_set_prescribed_function__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_prescribed_function(Function value) {
    return opensimSimulationJNI.Coordinate_append_prescribed_function(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_prescribed_function() {
    opensimSimulationJNI.Coordinate_constructProperty_prescribed_function__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_prescribed_function(Function initValue) {
    opensimSimulationJNI.Coordinate_constructProperty_prescribed_function__SWIG_1(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_prescribed_function() {
    return new Function(opensimSimulationJNI.Coordinate_get_prescribed_function__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_prescribed_function() {
    return new Function(opensimSimulationJNI.Coordinate_upd_prescribed_function__SWIG_1(swigCPtr, this), false);
  }

  public void set_prescribed_function(Function value) {
    opensimSimulationJNI.Coordinate_set_prescribed_function__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void copyProperty_prescribed(Coordinate source) {
    opensimSimulationJNI.Coordinate_copyProperty_prescribed(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public boolean get_prescribed(int i) {
    return opensimSimulationJNI.Coordinate_get_prescribed__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_prescribed(int i) {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Coordinate_upd_prescribed__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_prescribed(int i, boolean value) {
    opensimSimulationJNI.Coordinate_set_prescribed__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_prescribed(boolean value) {
    return opensimSimulationJNI.Coordinate_append_prescribed(swigCPtr, this, value);
  }

  public void constructProperty_prescribed(boolean initValue) {
    opensimSimulationJNI.Coordinate_constructProperty_prescribed(swigCPtr, this, initValue);
  }

  public boolean get_prescribed() {
    return opensimSimulationJNI.Coordinate_get_prescribed__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_prescribed() {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Coordinate_upd_prescribed__SWIG_1(swigCPtr, this), false);
  }

  public void set_prescribed(boolean value) {
    opensimSimulationJNI.Coordinate_set_prescribed__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_is_free_to_satisfy_constraints(Coordinate source) {
    opensimSimulationJNI.Coordinate_copyProperty_is_free_to_satisfy_constraints(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public boolean get_is_free_to_satisfy_constraints(int i) {
    return opensimSimulationJNI.Coordinate_get_is_free_to_satisfy_constraints__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_is_free_to_satisfy_constraints(int i) {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Coordinate_upd_is_free_to_satisfy_constraints__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_is_free_to_satisfy_constraints(int i, boolean value) {
    opensimSimulationJNI.Coordinate_set_is_free_to_satisfy_constraints__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_is_free_to_satisfy_constraints(boolean value) {
    return opensimSimulationJNI.Coordinate_append_is_free_to_satisfy_constraints(swigCPtr, this, value);
  }

  public void constructProperty_is_free_to_satisfy_constraints(boolean initValue) {
    opensimSimulationJNI.Coordinate_constructProperty_is_free_to_satisfy_constraints(swigCPtr, this, initValue);
  }

  public boolean get_is_free_to_satisfy_constraints() {
    return opensimSimulationJNI.Coordinate_get_is_free_to_satisfy_constraints__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_is_free_to_satisfy_constraints() {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Coordinate_upd_is_free_to_satisfy_constraints__SWIG_1(swigCPtr, this), false);
  }

  public void set_is_free_to_satisfy_constraints(boolean value) {
    opensimSimulationJNI.Coordinate_set_is_free_to_satisfy_constraints__SWIG_1(swigCPtr, this, value);
  }

  public void set_has_output_value(boolean value) {
    opensimSimulationJNI.Coordinate__has_output_value_set(swigCPtr, this, value);
  }

  public boolean get_has_output_value() {
    return opensimSimulationJNI.Coordinate__has_output_value_get(swigCPtr, this);
  }

  public void set_has_output_speed(boolean value) {
    opensimSimulationJNI.Coordinate__has_output_speed_set(swigCPtr, this, value);
  }

  public boolean get_has_output_speed() {
    return opensimSimulationJNI.Coordinate__has_output_speed_get(swigCPtr, this);
  }

  public void set_has_output_acceleration(boolean value) {
    opensimSimulationJNI.Coordinate__has_output_acceleration_set(swigCPtr, this, value);
  }

  public boolean get_has_output_acceleration() {
    return opensimSimulationJNI.Coordinate__has_output_acceleration_get(swigCPtr, this);
  }

  public Joint getJoint() {
    return new Joint(opensimSimulationJNI.Coordinate_getJoint(swigCPtr, this), false);
  }

  public Coordinate.MotionType getMotionType() {
    return Coordinate.MotionType.swigToEnum(opensimSimulationJNI.Coordinate_getMotionType(swigCPtr, this));
  }

  public double getValue(State s) {
    return opensimSimulationJNI.Coordinate_getValue(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setValue(State s, double aValue, boolean enforceContraints) {
    opensimSimulationJNI.Coordinate_setValue__SWIG_0(swigCPtr, this, State.getCPtr(s), s, aValue, enforceContraints);
  }

  public void setValue(State s, double aValue) {
    opensimSimulationJNI.Coordinate_setValue__SWIG_1(swigCPtr, this, State.getCPtr(s), s, aValue);
  }

  public double getSpeedValue(State s) {
    return opensimSimulationJNI.Coordinate_getSpeedValue(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setSpeedValue(State s, double aValue) {
    opensimSimulationJNI.Coordinate_setSpeedValue(swigCPtr, this, State.getCPtr(s), s, aValue);
  }

  public String getSpeedName() {
    return opensimSimulationJNI.Coordinate_getSpeedName(swigCPtr, this);
  }

  public double getDefaultValue() {
    return opensimSimulationJNI.Coordinate_getDefaultValue(swigCPtr, this);
  }

  public void setDefaultValue(double aDefaultValue) {
    opensimSimulationJNI.Coordinate_setDefaultValue(swigCPtr, this, aDefaultValue);
  }

  public double getDefaultSpeedValue() {
    return opensimSimulationJNI.Coordinate_getDefaultSpeedValue(swigCPtr, this);
  }

  public void setDefaultSpeedValue(double aDefaultSpeedValue) {
    opensimSimulationJNI.Coordinate_setDefaultSpeedValue(swigCPtr, this, aDefaultSpeedValue);
  }

  public double getAccelerationValue(State s) {
    return opensimSimulationJNI.Coordinate_getAccelerationValue(swigCPtr, this, State.getCPtr(s), s);
  }

  public boolean getClamped(State s) {
    return opensimSimulationJNI.Coordinate_getClamped(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setClamped(State s, boolean aLocked) {
    opensimSimulationJNI.Coordinate_setClamped(swigCPtr, this, State.getCPtr(s), s, aLocked);
  }

  public boolean getDefaultClamped() {
    return opensimSimulationJNI.Coordinate_getDefaultClamped(swigCPtr, this);
  }

  public void setDefaultClamped(boolean aClamped) {
    opensimSimulationJNI.Coordinate_setDefaultClamped(swigCPtr, this, aClamped);
  }

  public double getRangeMin() {
    return opensimSimulationJNI.Coordinate_getRangeMin(swigCPtr, this);
  }

  public double getRangeMax() {
    return opensimSimulationJNI.Coordinate_getRangeMax(swigCPtr, this);
  }

  public void setRange(double[] aRange) {
    opensimSimulationJNI.Coordinate_setRange(swigCPtr, this, aRange);
  }

  public void setRangeMin(double aMin) {
    opensimSimulationJNI.Coordinate_setRangeMin(swigCPtr, this, aMin);
  }

  public void setRangeMax(double aMax) {
    opensimSimulationJNI.Coordinate_setRangeMax(swigCPtr, this, aMax);
  }

  public boolean getLocked(State s) {
    return opensimSimulationJNI.Coordinate_getLocked(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setLocked(State s, boolean aLocked) {
    opensimSimulationJNI.Coordinate_setLocked(swigCPtr, this, State.getCPtr(s), s, aLocked);
  }

  public boolean getDefaultLocked() {
    return opensimSimulationJNI.Coordinate_getDefaultLocked(swigCPtr, this);
  }

  public void setDefaultLocked(boolean aLocked) {
    opensimSimulationJNI.Coordinate_setDefaultLocked(swigCPtr, this, aLocked);
  }

  public boolean isPrescribed(State s) {
    return opensimSimulationJNI.Coordinate_isPrescribed(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setIsPrescribed(State s, boolean isPrescribed) {
    opensimSimulationJNI.Coordinate_setIsPrescribed(swigCPtr, this, State.getCPtr(s), s, isPrescribed);
  }

  public boolean getDefaultIsPrescribed() {
    return opensimSimulationJNI.Coordinate_getDefaultIsPrescribed(swigCPtr, this);
  }

  public void setDefaultIsPrescribed(boolean isPrescribed) {
    opensimSimulationJNI.Coordinate_setDefaultIsPrescribed(swigCPtr, this, isPrescribed);
  }

  public void setPrescribedFunction(Function function) {
    opensimSimulationJNI.Coordinate_setPrescribedFunction(swigCPtr, this, Function.getCPtr(function), function);
  }

  public Function getPrescribedFunction() {
    return new Function(opensimSimulationJNI.Coordinate_getPrescribedFunction(swigCPtr, this), false);
  }

  public boolean isDependent(State s) {
    return opensimSimulationJNI.Coordinate_isDependent(swigCPtr, this, State.getCPtr(s), s);
  }

  public boolean isConstrained(State s) {
    return opensimSimulationJNI.Coordinate_isConstrained(swigCPtr, this, State.getCPtr(s), s);
  }

  public int getMobilizerQIndex() {
    return opensimSimulationJNI.Coordinate_getMobilizerQIndex(swigCPtr, this);
  }

  public int getBodyIndex() {
    return opensimSimulationJNI.Coordinate_getBodyIndex(swigCPtr, this);
  }

  public Coordinate.MotionType getUserSpecifiedMotionTypePriorTo40() {
    return Coordinate.MotionType.swigToEnum(opensimSimulationJNI.Coordinate_getUserSpecifiedMotionTypePriorTo40(swigCPtr, this));
  }

  public Coordinate() {
    this(opensimSimulationJNI.new_Coordinate__SWIG_0(), true);
  }

  public Coordinate(String aName, Coordinate.MotionType aMotionType, double defaultValue, double aRangeMin, double aRangeMax) {
    this(opensimSimulationJNI.new_Coordinate__SWIG_1(aName, aMotionType.swigValue(), defaultValue, aRangeMin, aRangeMax), true);
  }

  public final static class MotionType {
    public final static Coordinate.MotionType Undefined = new Coordinate.MotionType("Undefined");
    public final static Coordinate.MotionType Rotational = new Coordinate.MotionType("Rotational");
    public final static Coordinate.MotionType Translational = new Coordinate.MotionType("Translational");
    public final static Coordinate.MotionType Coupled = new Coordinate.MotionType("Coupled");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static MotionType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + MotionType.class + " with value " + swigValue);
    }

    private MotionType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private MotionType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private MotionType(String swigName, MotionType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static MotionType[] swigValues = { Undefined, Rotational, Translational, Coupled };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
