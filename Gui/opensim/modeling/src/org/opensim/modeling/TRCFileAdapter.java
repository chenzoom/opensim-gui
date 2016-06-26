/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TRCFileAdapter extends FileAdapter {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected TRCFileAdapter(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.TRCFileAdapter_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TRCFileAdapter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimModelCommonJNI.delete_TRCFileAdapter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TRCFileAdapter() {
    this(opensimModelCommonJNI.new_TRCFileAdapter__SWIG_0(), true);
  }

  public TRCFileAdapter(TRCFileAdapter arg0) {
    this(opensimModelCommonJNI.new_TRCFileAdapter__SWIG_1(TRCFileAdapter.getCPtr(arg0), arg0), true);
  }

  public DataAdapter clone() {
    long cPtr = opensimModelCommonJNI.TRCFileAdapter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TRCFileAdapter(cPtr, true);
  }

  public static TimeSeriesTableVec3 read(String filename) {
    return new TimeSeriesTableVec3(opensimModelCommonJNI.TRCFileAdapter_read(filename), true);
  }

  public static void write(TimeSeriesTableVec3 table, String filename) {
    opensimModelCommonJNI.TRCFileAdapter_write(TimeSeriesTableVec3.getCPtr(table), table, filename);
  }

  public static String get_markers() {
    return opensimModelCommonJNI.TRCFileAdapter__markers_get();
  }

}
