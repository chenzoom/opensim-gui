/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TableReporterVec3 extends ReporterVec3 {
  private long swigCPtr;

  public TableReporterVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.TableReporterVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TableReporterVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_TableReporterVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static TableReporterVec3 safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelCommonJNI.TableReporterVec3_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TableReporterVec3(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelCommonJNI.TableReporterVec3_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelCommonJNI.TableReporterVec3_getClassName();
  }

  public TableReporterVec3 clone() {
    long cPtr = opensimModelCommonJNI.TableReporterVec3_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TableReporterVec3(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelCommonJNI.TableReporterVec3_getConcreteClassName(swigCPtr, this);
  }

  public TableReporterVec3() {
    this(opensimModelCommonJNI.new_TableReporterVec3(), true);
  }

  public TimeSeriesTableVec3 getReport() {
    return new TimeSeriesTableVec3(opensimModelCommonJNI.TableReporterVec3_getReport(swigCPtr, this), true);
  }

}
