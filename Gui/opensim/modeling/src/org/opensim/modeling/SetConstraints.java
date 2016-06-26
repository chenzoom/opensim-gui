/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetConstraints extends OpenSimObject {
  private long swigCPtr;

  public SetConstraints(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.SetConstraints_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetConstraints obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_SetConstraints(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetConstraints safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.SetConstraints_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetConstraints(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.SetConstraints_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.SetConstraints_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.SetConstraints_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetConstraints(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.SetConstraints_getConcreteClassName(swigCPtr, this);
  }

  public SetConstraints() {
    this(opensimModelSimulationJNI.new_SetConstraints__SWIG_0(), true);
  }

  public SetConstraints(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelSimulationJNI.new_SetConstraints__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetConstraints(String aFileName) {
    this(opensimModelSimulationJNI.new_SetConstraints__SWIG_2(aFileName), true);
  }

  public SetConstraints(SetConstraints aSet) {
    this(opensimModelSimulationJNI.new_SetConstraints__SWIG_3(SetConstraints.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimModelSimulationJNI.SetConstraints_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelSimulationJNI.SetConstraints_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimModelSimulationJNI.SetConstraints_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelSimulationJNI.SetConstraints_getSize(swigCPtr, this);
  }

  public int getIndex(Constraint aObject, int aStartIndex) {
    return opensimModelSimulationJNI.SetConstraints_getIndex__SWIG_0(swigCPtr, this, Constraint.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Constraint aObject) {
    return opensimModelSimulationJNI.SetConstraints_getIndex__SWIG_1(swigCPtr, this, Constraint.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelSimulationJNI.SetConstraints_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelSimulationJNI.SetConstraints_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimModelSimulationJNI.SetConstraints_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Constraint aObject) {
    return opensimModelSimulationJNI.SetConstraints_adoptAndAppend(swigCPtr, this, Constraint.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Constraint aObject) {
    return opensimModelSimulationJNI.SetConstraints_cloneAndAppend(swigCPtr, this, Constraint.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Constraint aObject) {
    return opensimModelSimulationJNI.SetConstraints_insert(swigCPtr, this, aIndex, Constraint.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelSimulationJNI.SetConstraints_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Constraint aObject) {
    return opensimModelSimulationJNI.SetConstraints_remove__SWIG_1(swigCPtr, this, Constraint.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimModelSimulationJNI.SetConstraints_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Constraint aObject, boolean preserveGroups) {
    return opensimModelSimulationJNI.SetConstraints_set__SWIG_0(swigCPtr, this, aIndex, Constraint.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Constraint aObject) {
    return opensimModelSimulationJNI.SetConstraints_set__SWIG_1(swigCPtr, this, aIndex, Constraint.getCPtr(aObject), aObject);
  }

  public Constraint get(int aIndex) {
    return new Constraint(opensimModelSimulationJNI.SetConstraints_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Constraint get(String aName) {
    return new Constraint(opensimModelSimulationJNI.SetConstraints_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimModelSimulationJNI.SetConstraints_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimModelSimulationJNI.SetConstraints_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimModelSimulationJNI.SetConstraints_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimModelSimulationJNI.SetConstraints_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimModelSimulationJNI.SetConstraints_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimModelSimulationJNI.SetConstraints_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimModelSimulationJNI.SetConstraints_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimModelSimulationJNI.SetConstraints_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimModelSimulationJNI.SetConstraints_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimModelSimulationJNI.SetConstraints_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
