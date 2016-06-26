/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetAnalysis extends OpenSimObject {
  private long swigCPtr;

  public SetAnalysis(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.SetAnalysis_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetAnalysis obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_SetAnalysis(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetAnalysis safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.SetAnalysis_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetAnalysis(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.SetAnalysis_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.SetAnalysis_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.SetAnalysis_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetAnalysis(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.SetAnalysis_getConcreteClassName(swigCPtr, this);
  }

  public SetAnalysis() {
    this(opensimModelSimulationJNI.new_SetAnalysis__SWIG_0(), true);
  }

  public SetAnalysis(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelSimulationJNI.new_SetAnalysis__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetAnalysis(String aFileName) {
    this(opensimModelSimulationJNI.new_SetAnalysis__SWIG_2(aFileName), true);
  }

  public SetAnalysis(SetAnalysis aSet) {
    this(opensimModelSimulationJNI.new_SetAnalysis__SWIG_3(SetAnalysis.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimModelSimulationJNI.SetAnalysis_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelSimulationJNI.SetAnalysis_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimModelSimulationJNI.SetAnalysis_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelSimulationJNI.SetAnalysis_getSize(swigCPtr, this);
  }

  public int getIndex(Analysis aObject, int aStartIndex) {
    return opensimModelSimulationJNI.SetAnalysis_getIndex__SWIG_0(swigCPtr, this, Analysis.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Analysis aObject) {
    return opensimModelSimulationJNI.SetAnalysis_getIndex__SWIG_1(swigCPtr, this, Analysis.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelSimulationJNI.SetAnalysis_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelSimulationJNI.SetAnalysis_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimModelSimulationJNI.SetAnalysis_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Analysis aObject) {
    return opensimModelSimulationJNI.SetAnalysis_adoptAndAppend(swigCPtr, this, Analysis.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Analysis aObject) {
    return opensimModelSimulationJNI.SetAnalysis_cloneAndAppend(swigCPtr, this, Analysis.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Analysis aObject) {
    return opensimModelSimulationJNI.SetAnalysis_insert(swigCPtr, this, aIndex, Analysis.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelSimulationJNI.SetAnalysis_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Analysis aObject) {
    return opensimModelSimulationJNI.SetAnalysis_remove__SWIG_1(swigCPtr, this, Analysis.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimModelSimulationJNI.SetAnalysis_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Analysis aObject, boolean preserveGroups) {
    return opensimModelSimulationJNI.SetAnalysis_set__SWIG_0(swigCPtr, this, aIndex, Analysis.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Analysis aObject) {
    return opensimModelSimulationJNI.SetAnalysis_set__SWIG_1(swigCPtr, this, aIndex, Analysis.getCPtr(aObject), aObject);
  }

  public Analysis get(int aIndex) {
    return new Analysis(opensimModelSimulationJNI.SetAnalysis_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Analysis get(String aName) {
    return new Analysis(opensimModelSimulationJNI.SetAnalysis_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimModelSimulationJNI.SetAnalysis_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimModelSimulationJNI.SetAnalysis_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimModelSimulationJNI.SetAnalysis_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimModelSimulationJNI.SetAnalysis_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimModelSimulationJNI.SetAnalysis_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimModelSimulationJNI.SetAnalysis_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimModelSimulationJNI.SetAnalysis_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimModelSimulationJNI.SetAnalysis_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimModelSimulationJNI.SetAnalysis_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimModelSimulationJNI.SetAnalysis_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
