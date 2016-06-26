/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class CSVFileAdapter extends DelimFileAdapter {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected CSVFileAdapter(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.CSVFileAdapter_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CSVFileAdapter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimModelCommonJNI.delete_CSVFileAdapter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CSVFileAdapter() {
    this(opensimModelCommonJNI.new_CSVFileAdapter__SWIG_0(), true);
  }

  public CSVFileAdapter(CSVFileAdapter arg0) {
    this(opensimModelCommonJNI.new_CSVFileAdapter__SWIG_1(CSVFileAdapter.getCPtr(arg0), arg0), true);
  }

  public DataAdapter clone() {
    long cPtr = opensimModelCommonJNI.CSVFileAdapter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new CSVFileAdapter(cPtr, true);
  }

  public static TimeSeriesTable read(String fileName) {
    return new TimeSeriesTable(opensimModelCommonJNI.CSVFileAdapter_read(fileName), true);
  }

  public static void write(TimeSeriesTable table, String fileName) {
    opensimModelCommonJNI.CSVFileAdapter_write(TimeSeriesTable.getCPtr(table), table, fileName);
  }

}
