/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class InvalidTimestamp extends InvalidRow {
  private long swigCPtr;

  public InvalidTimestamp(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.InvalidTimestamp_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InvalidTimestamp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_InvalidTimestamp(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public InvalidTimestamp() {
    this(opensimModelCommonJNI.new_InvalidTimestamp(), true);
  }

}
