/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DelimFileAdapter extends FileAdapter {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected DelimFileAdapter(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.DelimFileAdapter_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DelimFileAdapter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimModelCommonJNI.delete_DelimFileAdapter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DelimFileAdapter(DelimFileAdapter arg0) {
    this(opensimModelCommonJNI.new_DelimFileAdapter__SWIG_0(DelimFileAdapter.getCPtr(arg0), arg0), true);
  }

  public DelimFileAdapter(String delimitersRead, String delimterWrite) {
    this(opensimModelCommonJNI.new_DelimFileAdapter__SWIG_1(delimitersRead, delimterWrite), true);
  }

  public DataAdapter clone() {
    long cPtr = opensimModelCommonJNI.DelimFileAdapter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new DelimFileAdapter(cPtr, true);
  }

  public static String get_table() {
    return opensimModelCommonJNI.DelimFileAdapter__table_get();
  }

}
