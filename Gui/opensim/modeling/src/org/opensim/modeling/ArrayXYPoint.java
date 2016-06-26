/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayXYPoint {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ArrayXYPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayXYPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_ArrayXYPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayXYPoint(XYPoint aDefaultValue, int aSize, int aCapacity) {
    this(opensimModelCommonJNI.new_ArrayXYPoint__SWIG_0(XYPoint.getCPtr(aDefaultValue), aDefaultValue, aSize, aCapacity), true);
  }

  public ArrayXYPoint(XYPoint aDefaultValue, int aSize) {
    this(opensimModelCommonJNI.new_ArrayXYPoint__SWIG_1(XYPoint.getCPtr(aDefaultValue), aDefaultValue, aSize), true);
  }

  public ArrayXYPoint(XYPoint aDefaultValue) {
    this(opensimModelCommonJNI.new_ArrayXYPoint__SWIG_2(XYPoint.getCPtr(aDefaultValue), aDefaultValue), true);
  }

  public ArrayXYPoint() {
    this(opensimModelCommonJNI.new_ArrayXYPoint__SWIG_3(), true);
  }

  public ArrayXYPoint(ArrayXYPoint aArray) {
    this(opensimModelCommonJNI.new_ArrayXYPoint__SWIG_4(ArrayXYPoint.getCPtr(aArray), aArray), true);
  }

  public boolean arrayEquals(ArrayXYPoint aArray) {
    return opensimModelCommonJNI.ArrayXYPoint_arrayEquals(swigCPtr, this, ArrayXYPoint.getCPtr(aArray), aArray);
  }

  public void trim() {
    opensimModelCommonJNI.ArrayXYPoint_trim(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimModelCommonJNI.ArrayXYPoint_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelCommonJNI.ArrayXYPoint_getSize(swigCPtr, this);
  }

  public int size() {
    return opensimModelCommonJNI.ArrayXYPoint_size(swigCPtr, this);
  }

  public int append(XYPoint aValue) {
    return opensimModelCommonJNI.ArrayXYPoint_append__SWIG_0(swigCPtr, this, XYPoint.getCPtr(aValue), aValue);
  }

  public int append(ArrayXYPoint aArray) {
    return opensimModelCommonJNI.ArrayXYPoint_append__SWIG_1(swigCPtr, this, ArrayXYPoint.getCPtr(aArray), aArray);
  }

  public int insert(int aIndex, XYPoint aValue) {
    return opensimModelCommonJNI.ArrayXYPoint_insert(swigCPtr, this, aIndex, XYPoint.getCPtr(aValue), aValue);
  }

  public int remove(int aIndex) {
    return opensimModelCommonJNI.ArrayXYPoint_remove(swigCPtr, this, aIndex);
  }

  public void set(int aIndex, XYPoint aValue) {
    opensimModelCommonJNI.ArrayXYPoint_set(swigCPtr, this, aIndex, XYPoint.getCPtr(aValue), aValue);
  }

  public XYPoint get(int aIndex) {
    return new XYPoint(opensimModelCommonJNI.ArrayXYPoint_get(swigCPtr, this, aIndex), false);
  }

  public XYPoint getitem(int index) {
    return new XYPoint(opensimModelCommonJNI.ArrayXYPoint_getitem(swigCPtr, this, index), true);
  }

  public void setitem(int index, XYPoint val) {
    opensimModelCommonJNI.ArrayXYPoint_setitem(swigCPtr, this, index, XYPoint.getCPtr(val), val);
  }

  public XYPoint getLast() {
    return new XYPoint(opensimModelCommonJNI.ArrayXYPoint_getLast(swigCPtr, this), false);
  }

  public int findIndex(XYPoint aValue) {
    return opensimModelCommonJNI.ArrayXYPoint_findIndex(swigCPtr, this, XYPoint.getCPtr(aValue), aValue);
  }

  public int rfindIndex(XYPoint aValue) {
    return opensimModelCommonJNI.ArrayXYPoint_rfindIndex(swigCPtr, this, XYPoint.getCPtr(aValue), aValue);
  }

  public int searchBinary(XYPoint aValue, boolean aFindFirst, int aLo, int aHi) {
    return opensimModelCommonJNI.ArrayXYPoint_searchBinary__SWIG_0(swigCPtr, this, XYPoint.getCPtr(aValue), aValue, aFindFirst, aLo, aHi);
  }

  public int searchBinary(XYPoint aValue, boolean aFindFirst, int aLo) {
    return opensimModelCommonJNI.ArrayXYPoint_searchBinary__SWIG_1(swigCPtr, this, XYPoint.getCPtr(aValue), aValue, aFindFirst, aLo);
  }

  public int searchBinary(XYPoint aValue, boolean aFindFirst) {
    return opensimModelCommonJNI.ArrayXYPoint_searchBinary__SWIG_2(swigCPtr, this, XYPoint.getCPtr(aValue), aValue, aFindFirst);
  }

  public int searchBinary(XYPoint aValue) {
    return opensimModelCommonJNI.ArrayXYPoint_searchBinary__SWIG_3(swigCPtr, this, XYPoint.getCPtr(aValue), aValue);
  }

}
