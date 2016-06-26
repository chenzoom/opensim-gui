/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ReporterDouble extends AbstractReporter {
  private long swigCPtr;

  public ReporterDouble(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.ReporterDouble_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ReporterDouble obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ReporterDouble safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelCommonJNI.ReporterDouble_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ReporterDouble(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelCommonJNI.ReporterDouble_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelCommonJNI.ReporterDouble_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelCommonJNI.ReporterDouble_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ReporterDouble(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelCommonJNI.ReporterDouble_getConcreteClassName(swigCPtr, this);
  }

  public void set_has_input_inputs(boolean value) {
    opensimModelCommonJNI.ReporterDouble__has_input_inputs_set(swigCPtr, this, value);
  }

  public boolean get_has_input_inputs() {
    return opensimModelCommonJNI.ReporterDouble__has_input_inputs_get(swigCPtr, this);
  }

}
