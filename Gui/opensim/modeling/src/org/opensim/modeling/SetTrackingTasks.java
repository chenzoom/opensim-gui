/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetTrackingTasks extends OpenSimObject {
  private long swigCPtr;

  public SetTrackingTasks(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.SetTrackingTasks_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetTrackingTasks obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SetTrackingTasks(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetTrackingTasks safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.SetTrackingTasks_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetTrackingTasks(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.SetTrackingTasks_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.SetTrackingTasks_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.SetTrackingTasks_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetTrackingTasks(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.SetTrackingTasks_getConcreteClassName(swigCPtr, this);
  }

  public SetTrackingTasks() {
    this(opensimModelJNI.new_SetTrackingTasks__SWIG_0(), true);
  }

  public SetTrackingTasks(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_SetTrackingTasks__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetTrackingTasks(String aFileName) {
    this(opensimModelJNI.new_SetTrackingTasks__SWIG_2(aFileName), true);
  }

  public SetTrackingTasks(SetTrackingTasks aSet) {
    this(opensimModelJNI.new_SetTrackingTasks__SWIG_3(SetTrackingTasks.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimModelJNI.SetTrackingTasks_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelJNI.SetTrackingTasks_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.SetTrackingTasks_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.SetTrackingTasks_getSize(swigCPtr, this);
  }

  public int getIndex(TrackingTask aObject, int aStartIndex) {
    return opensimModelJNI.SetTrackingTasks_getIndex__SWIG_0(swigCPtr, this, TrackingTask.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(TrackingTask aObject) {
    return opensimModelJNI.SetTrackingTasks_getIndex__SWIG_1(swigCPtr, this, TrackingTask.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelJNI.SetTrackingTasks_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelJNI.SetTrackingTasks_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimModelJNI.SetTrackingTasks_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(TrackingTask aObject) {
    return opensimModelJNI.SetTrackingTasks_adoptAndAppend(swigCPtr, this, TrackingTask.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(TrackingTask aObject) {
    return opensimModelJNI.SetTrackingTasks_cloneAndAppend(swigCPtr, this, TrackingTask.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, TrackingTask aObject) {
    return opensimModelJNI.SetTrackingTasks_insert(swigCPtr, this, aIndex, TrackingTask.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelJNI.SetTrackingTasks_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(TrackingTask aObject) {
    return opensimModelJNI.SetTrackingTasks_remove__SWIG_1(swigCPtr, this, TrackingTask.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimModelJNI.SetTrackingTasks_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, TrackingTask aObject, boolean preserveGroups) {
    return opensimModelJNI.SetTrackingTasks_set__SWIG_0(swigCPtr, this, aIndex, TrackingTask.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, TrackingTask aObject) {
    return opensimModelJNI.SetTrackingTasks_set__SWIG_1(swigCPtr, this, aIndex, TrackingTask.getCPtr(aObject), aObject);
  }

  public TrackingTask get(int aIndex) {
    return new TrackingTask(opensimModelJNI.SetTrackingTasks_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public TrackingTask get(String aName) {
    return new TrackingTask(opensimModelJNI.SetTrackingTasks_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimModelJNI.SetTrackingTasks_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimModelJNI.SetTrackingTasks_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimModelJNI.SetTrackingTasks_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimModelJNI.SetTrackingTasks_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimModelJNI.SetTrackingTasks_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimModelJNI.SetTrackingTasks_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimModelJNI.SetTrackingTasks_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimModelJNI.SetTrackingTasks_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimModelJNI.SetTrackingTasks_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimModelJNI.SetTrackingTasks_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
