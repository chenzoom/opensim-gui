/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class IOError extends OpenSimException {
  private long swigCPtr;

  public IOError(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.IOError_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IOError obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_IOError(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IOError() {
    this(opensimModelCommonJNI.new_IOError(), true);
  }

}
