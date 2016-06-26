/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayStateVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ArrayStateVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayStateVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_ArrayStateVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayStateVector(StateVector aDefaultValue, int aSize, int aCapacity) {
    this(opensimModelCommonJNI.new_ArrayStateVector__SWIG_0(StateVector.getCPtr(aDefaultValue), aDefaultValue, aSize, aCapacity), true);
  }

  public ArrayStateVector(StateVector aDefaultValue, int aSize) {
    this(opensimModelCommonJNI.new_ArrayStateVector__SWIG_1(StateVector.getCPtr(aDefaultValue), aDefaultValue, aSize), true);
  }

  public ArrayStateVector(StateVector aDefaultValue) {
    this(opensimModelCommonJNI.new_ArrayStateVector__SWIG_2(StateVector.getCPtr(aDefaultValue), aDefaultValue), true);
  }

  public ArrayStateVector() {
    this(opensimModelCommonJNI.new_ArrayStateVector__SWIG_3(), true);
  }

  public ArrayStateVector(ArrayStateVector aArray) {
    this(opensimModelCommonJNI.new_ArrayStateVector__SWIG_4(ArrayStateVector.getCPtr(aArray), aArray), true);
  }

  public boolean arrayEquals(ArrayStateVector aArray) {
    return opensimModelCommonJNI.ArrayStateVector_arrayEquals(swigCPtr, this, ArrayStateVector.getCPtr(aArray), aArray);
  }

  public void trim() {
    opensimModelCommonJNI.ArrayStateVector_trim(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimModelCommonJNI.ArrayStateVector_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelCommonJNI.ArrayStateVector_getSize(swigCPtr, this);
  }

  public int size() {
    return opensimModelCommonJNI.ArrayStateVector_size(swigCPtr, this);
  }

  public int append(StateVector aValue) {
    return opensimModelCommonJNI.ArrayStateVector_append__SWIG_0(swigCPtr, this, StateVector.getCPtr(aValue), aValue);
  }

  public int append(ArrayStateVector aArray) {
    return opensimModelCommonJNI.ArrayStateVector_append__SWIG_1(swigCPtr, this, ArrayStateVector.getCPtr(aArray), aArray);
  }

  public int insert(int aIndex, StateVector aValue) {
    return opensimModelCommonJNI.ArrayStateVector_insert(swigCPtr, this, aIndex, StateVector.getCPtr(aValue), aValue);
  }

  public int remove(int aIndex) {
    return opensimModelCommonJNI.ArrayStateVector_remove(swigCPtr, this, aIndex);
  }

  public void set(int aIndex, StateVector aValue) {
    opensimModelCommonJNI.ArrayStateVector_set(swigCPtr, this, aIndex, StateVector.getCPtr(aValue), aValue);
  }

  public StateVector get(int aIndex) {
    return new StateVector(opensimModelCommonJNI.ArrayStateVector_get(swigCPtr, this, aIndex), false);
  }

  public StateVector getitem(int index) {
    return new StateVector(opensimModelCommonJNI.ArrayStateVector_getitem(swigCPtr, this, index), true);
  }

  public void setitem(int index, StateVector val) {
    opensimModelCommonJNI.ArrayStateVector_setitem(swigCPtr, this, index, StateVector.getCPtr(val), val);
  }

  public StateVector getLast() {
    return new StateVector(opensimModelCommonJNI.ArrayStateVector_getLast(swigCPtr, this), false);
  }

  public int findIndex(StateVector aValue) {
    return opensimModelCommonJNI.ArrayStateVector_findIndex(swigCPtr, this, StateVector.getCPtr(aValue), aValue);
  }

  public int rfindIndex(StateVector aValue) {
    return opensimModelCommonJNI.ArrayStateVector_rfindIndex(swigCPtr, this, StateVector.getCPtr(aValue), aValue);
  }

  public int searchBinary(StateVector aValue, boolean aFindFirst, int aLo, int aHi) {
    return opensimModelCommonJNI.ArrayStateVector_searchBinary__SWIG_0(swigCPtr, this, StateVector.getCPtr(aValue), aValue, aFindFirst, aLo, aHi);
  }

  public int searchBinary(StateVector aValue, boolean aFindFirst, int aLo) {
    return opensimModelCommonJNI.ArrayStateVector_searchBinary__SWIG_1(swigCPtr, this, StateVector.getCPtr(aValue), aValue, aFindFirst, aLo);
  }

  public int searchBinary(StateVector aValue, boolean aFindFirst) {
    return opensimModelCommonJNI.ArrayStateVector_searchBinary__SWIG_2(swigCPtr, this, StateVector.getCPtr(aValue), aValue, aFindFirst);
  }

  public int searchBinary(StateVector aValue) {
    return opensimModelCommonJNI.ArrayStateVector_searchBinary__SWIG_3(swigCPtr, this, StateVector.getCPtr(aValue), aValue);
  }

}
