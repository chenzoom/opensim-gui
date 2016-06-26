/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class AbstractConnector extends OpenSimObject {
  private long swigCPtr;

  public AbstractConnector(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.AbstractConnector_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(AbstractConnector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_AbstractConnector(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static AbstractConnector safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelCommonJNI.AbstractConnector_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new AbstractConnector(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelCommonJNI.AbstractConnector_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelCommonJNI.AbstractConnector_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelCommonJNI.AbstractConnector_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AbstractConnector(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelCommonJNI.AbstractConnector_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_connectee_name(AbstractConnector source) {
    opensimModelCommonJNI.AbstractConnector_copyProperty_connectee_name(swigCPtr, this, AbstractConnector.getCPtr(source), source);
  }

  public String get_connectee_name(int i) {
    return opensimModelCommonJNI.AbstractConnector_get_connectee_name(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_connectee_name(int i) {
    return new SWIGTYPE_p_std__string(opensimModelCommonJNI.AbstractConnector_upd_connectee_name(swigCPtr, this, i), false);
  }

  public void set_connectee_name(int i, String value) {
    opensimModelCommonJNI.AbstractConnector_set_connectee_name(swigCPtr, this, i, value);
  }

  public int append_connectee_name(String value) {
    return opensimModelCommonJNI.AbstractConnector_append_connectee_name(swigCPtr, this, value);
  }

  public void constructProperty_connectee_name() {
    opensimModelCommonJNI.AbstractConnector_constructProperty_connectee_name(swigCPtr, this);
  }

  public Stage getConnectAtStage() {
    return new Stage(opensimModelCommonJNI.AbstractConnector_getConnectAtStage(swigCPtr, this), true);
  }

  public boolean isListConnector() {
    return opensimModelCommonJNI.AbstractConnector_isListConnector(swigCPtr, this);
  }

  public boolean isConnected() {
    return opensimModelCommonJNI.AbstractConnector_isConnected(swigCPtr, this);
  }

  public long getNumConnectees() {
    return opensimModelCommonJNI.AbstractConnector_getNumConnectees(swigCPtr, this);
  }

  public String getConnecteeTypeName() {
    return opensimModelCommonJNI.AbstractConnector_getConnecteeTypeName(swigCPtr, this);
  }

  public void connect(OpenSimObject connectee) {
    opensimModelCommonJNI.AbstractConnector_connect(swigCPtr, this, OpenSimObject.getCPtr(connectee), connectee);
  }

  public void findAndConnect(Component root) {
    opensimModelCommonJNI.AbstractConnector_findAndConnect(swigCPtr, this, Component.getCPtr(root), root);
  }

  public void setConnecteeName(String name) {
    opensimModelCommonJNI.AbstractConnector_setConnecteeName__SWIG_0(swigCPtr, this, name);
  }

  public void setConnecteeName(String name, long ix) {
    opensimModelCommonJNI.AbstractConnector_setConnecteeName__SWIG_1(swigCPtr, this, name, ix);
  }

  public String getConnecteeName() {
    return opensimModelCommonJNI.AbstractConnector_getConnecteeName__SWIG_0(swigCPtr, this);
  }

  public String getConnecteeName(long ix) {
    return opensimModelCommonJNI.AbstractConnector_getConnecteeName__SWIG_1(swigCPtr, this, ix);
  }

  public void appendConnecteeName(String name) {
    opensimModelCommonJNI.AbstractConnector_appendConnecteeName(swigCPtr, this, name);
  }

  public void disconnect() {
    opensimModelCommonJNI.AbstractConnector_disconnect(swigCPtr, this);
  }

}
