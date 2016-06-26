/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class AbstractProperty {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public AbstractProperty(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(AbstractProperty obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_AbstractProperty(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAllowableListSize(int aMin, int aMax) {
    opensimModelCommonJNI.AbstractProperty_setAllowableListSize__SWIG_0(swigCPtr, this, aMin, aMax);
  }

  public void setAllowableListSize(int aNum) {
    opensimModelCommonJNI.AbstractProperty_setAllowableListSize__SWIG_1(swigCPtr, this, aNum);
  }

  public AbstractProperty clone() {
    long cPtr = opensimModelCommonJNI.AbstractProperty_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AbstractProperty(cPtr, true);
  }

  public String toString() {
    return opensimModelCommonJNI.AbstractProperty_toString(swigCPtr, this);
  }

  public String getTypeName() {
    return opensimModelCommonJNI.AbstractProperty_getTypeName(swigCPtr, this);
  }

  public boolean isObjectProperty() {
    return opensimModelCommonJNI.AbstractProperty_isObjectProperty(swigCPtr, this);
  }

  public boolean isUnnamedProperty() {
    return opensimModelCommonJNI.AbstractProperty_isUnnamedProperty(swigCPtr, this);
  }

  public boolean equals(AbstractProperty other) {
    return opensimModelCommonJNI.AbstractProperty_equals(swigCPtr, this, AbstractProperty.getCPtr(other), other);
  }

  public boolean isSamePropertyClass(AbstractProperty other) {
    return opensimModelCommonJNI.AbstractProperty_isSamePropertyClass(swigCPtr, this, AbstractProperty.getCPtr(other), other);
  }

  public int size() {
    return opensimModelCommonJNI.AbstractProperty_size(swigCPtr, this);
  }

  public boolean empty() {
    return opensimModelCommonJNI.AbstractProperty_empty(swigCPtr, this);
  }

  public void clear() {
    opensimModelCommonJNI.AbstractProperty_clear(swigCPtr, this);
  }

  public OpenSimObject getValueAsObject(int index) {
    return new OpenSimObject(opensimModelCommonJNI.AbstractProperty_getValueAsObject__SWIG_0(swigCPtr, this, index), false);
  }

  public OpenSimObject getValueAsObject() {
    return new OpenSimObject(opensimModelCommonJNI.AbstractProperty_getValueAsObject__SWIG_1(swigCPtr, this), false);
  }

  public OpenSimObject updValueAsObject(int index) {
    return new OpenSimObject(opensimModelCommonJNI.AbstractProperty_updValueAsObject__SWIG_0(swigCPtr, this, index), false);
  }

  public OpenSimObject updValueAsObject() {
    return new OpenSimObject(opensimModelCommonJNI.AbstractProperty_updValueAsObject__SWIG_1(swigCPtr, this), false);
  }

  public void setValueAsObject(OpenSimObject obj, int index) {
    opensimModelCommonJNI.AbstractProperty_setValueAsObject__SWIG_0(swigCPtr, this, OpenSimObject.getCPtr(obj), obj, index);
  }

  public void setValueAsObject(OpenSimObject obj) {
    opensimModelCommonJNI.AbstractProperty_setValueAsObject__SWIG_1(swigCPtr, this, OpenSimObject.getCPtr(obj), obj);
  }

  public void setAllPropertiesUseDefault(boolean shouldUseDefault) {
    opensimModelCommonJNI.AbstractProperty_setAllPropertiesUseDefault(swigCPtr, this, shouldUseDefault);
  }

  public void readFromXMLParentElement(SWIGTYPE_p_SimTK__Xml__Element parent, int versionNumber) {
    opensimModelCommonJNI.AbstractProperty_readFromXMLParentElement(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent), versionNumber);
  }

  public void writeToXMLParentElement(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimModelCommonJNI.AbstractProperty_writeToXMLParentElement(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public void setName(String name) {
    opensimModelCommonJNI.AbstractProperty_setName(swigCPtr, this, name);
  }

  public void setComment(String aComment) {
    opensimModelCommonJNI.AbstractProperty_setComment(swigCPtr, this, aComment);
  }

  public void setValueIsDefault(boolean isDefault) {
    opensimModelCommonJNI.AbstractProperty_setValueIsDefault(swigCPtr, this, isDefault);
  }

  public String getName() {
    return opensimModelCommonJNI.AbstractProperty_getName(swigCPtr, this);
  }

  public String getComment() {
    return opensimModelCommonJNI.AbstractProperty_getComment(swigCPtr, this);
  }

  public boolean getValueIsDefault() {
    return opensimModelCommonJNI.AbstractProperty_getValueIsDefault(swigCPtr, this);
  }

  public int getMinListSize() {
    return opensimModelCommonJNI.AbstractProperty_getMinListSize(swigCPtr, this);
  }

  public int getMaxListSize() {
    return opensimModelCommonJNI.AbstractProperty_getMaxListSize(swigCPtr, this);
  }

  public boolean isOptionalProperty() {
    return opensimModelCommonJNI.AbstractProperty_isOptionalProperty(swigCPtr, this);
  }

  public boolean isListProperty() {
    return opensimModelCommonJNI.AbstractProperty_isListProperty(swigCPtr, this);
  }

  public boolean isOneValueProperty() {
    return opensimModelCommonJNI.AbstractProperty_isOneValueProperty(swigCPtr, this);
  }

  public boolean isOneObjectProperty() {
    return opensimModelCommonJNI.AbstractProperty_isOneObjectProperty(swigCPtr, this);
  }

}
