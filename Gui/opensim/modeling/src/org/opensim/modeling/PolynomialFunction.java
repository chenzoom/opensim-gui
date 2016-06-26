/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PolynomialFunction extends Function {
  private long swigCPtr;

  public PolynomialFunction(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.PolynomialFunction_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PolynomialFunction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_PolynomialFunction(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PolynomialFunction safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelCommonJNI.PolynomialFunction_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PolynomialFunction(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelCommonJNI.PolynomialFunction_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelCommonJNI.PolynomialFunction_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelCommonJNI.PolynomialFunction_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PolynomialFunction(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelCommonJNI.PolynomialFunction_getConcreteClassName(swigCPtr, this);
  }

  public PolynomialFunction() {
    this(opensimModelCommonJNI.new_PolynomialFunction__SWIG_0(), true);
  }

  public PolynomialFunction(Vector coefficients) {
    this(opensimModelCommonJNI.new_PolynomialFunction__SWIG_1(Vector.getCPtr(coefficients), coefficients), true);
  }

  public void setCoefficients(Vector coefficients) {
    opensimModelCommonJNI.PolynomialFunction_setCoefficients(swigCPtr, this, Vector.getCPtr(coefficients), coefficients);
  }

  public Vector getCoefficients() {
    return new Vector(opensimModelCommonJNI.PolynomialFunction_getCoefficients(swigCPtr, this), true);
  }

  public SWIGTYPE_p_SimTK__Function createSimTKFunction() {
    long cPtr = opensimModelCommonJNI.PolynomialFunction_createSimTKFunction(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SimTK__Function(cPtr, false);
  }

}
