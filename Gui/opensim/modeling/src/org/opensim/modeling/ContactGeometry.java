/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ContactGeometry extends ModelComponent {
  private long swigCPtr;

  public ContactGeometry(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.ContactGeometry_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ContactGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_ContactGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ContactGeometry safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.ContactGeometry_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ContactGeometry(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.ContactGeometry_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.ContactGeometry_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.ContactGeometry_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ContactGeometry(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.ContactGeometry_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_location(ContactGeometry source) {
    opensimModelSimulationJNI.ContactGeometry_copyProperty_location(swigCPtr, this, ContactGeometry.getCPtr(source), source);
  }

  public Vec3 get_location(int i) {
    return new Vec3(opensimModelSimulationJNI.ContactGeometry_get_location__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_location(int i) {
    return new Vec3(opensimModelSimulationJNI.ContactGeometry_upd_location__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location(int i, Vec3 value) {
    opensimModelSimulationJNI.ContactGeometry_set_location__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_location(Vec3 value) {
    return opensimModelSimulationJNI.ContactGeometry_append_location(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_location(Vec3 initValue) {
    opensimModelSimulationJNI.ContactGeometry_constructProperty_location(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_location() {
    return new Vec3(opensimModelSimulationJNI.ContactGeometry_get_location__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_location() {
    return new Vec3(opensimModelSimulationJNI.ContactGeometry_upd_location__SWIG_1(swigCPtr, this), false);
  }

  public void set_location(Vec3 value) {
    opensimModelSimulationJNI.ContactGeometry_set_location__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_orientation(ContactGeometry source) {
    opensimModelSimulationJNI.ContactGeometry_copyProperty_orientation(swigCPtr, this, ContactGeometry.getCPtr(source), source);
  }

  public Vec3 get_orientation(int i) {
    return new Vec3(opensimModelSimulationJNI.ContactGeometry_get_orientation__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_orientation(int i) {
    return new Vec3(opensimModelSimulationJNI.ContactGeometry_upd_orientation__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_orientation(int i, Vec3 value) {
    opensimModelSimulationJNI.ContactGeometry_set_orientation__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_orientation(Vec3 value) {
    return opensimModelSimulationJNI.ContactGeometry_append_orientation(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_orientation(Vec3 initValue) {
    opensimModelSimulationJNI.ContactGeometry_constructProperty_orientation(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_orientation() {
    return new Vec3(opensimModelSimulationJNI.ContactGeometry_get_orientation__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_orientation() {
    return new Vec3(opensimModelSimulationJNI.ContactGeometry_upd_orientation__SWIG_1(swigCPtr, this), false);
  }

  public void set_orientation(Vec3 value) {
    opensimModelSimulationJNI.ContactGeometry_set_orientation__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_display_preference(ContactGeometry source) {
    opensimModelSimulationJNI.ContactGeometry_copyProperty_display_preference(swigCPtr, this, ContactGeometry.getCPtr(source), source);
  }

  public int get_display_preference(int i) {
    return opensimModelSimulationJNI.ContactGeometry_get_display_preference__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_int upd_display_preference(int i) {
    return new SWIGTYPE_p_int(opensimModelSimulationJNI.ContactGeometry_upd_display_preference__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_display_preference(int i, int value) {
    opensimModelSimulationJNI.ContactGeometry_set_display_preference__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_display_preference(int value) {
    return opensimModelSimulationJNI.ContactGeometry_append_display_preference(swigCPtr, this, value);
  }

  public void constructProperty_display_preference(int initValue) {
    opensimModelSimulationJNI.ContactGeometry_constructProperty_display_preference(swigCPtr, this, initValue);
  }

  public int get_display_preference() {
    return opensimModelSimulationJNI.ContactGeometry_get_display_preference__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_int upd_display_preference() {
    return new SWIGTYPE_p_int(opensimModelSimulationJNI.ContactGeometry_upd_display_preference__SWIG_1(swigCPtr, this), false);
  }

  public void set_display_preference(int value) {
    opensimModelSimulationJNI.ContactGeometry_set_display_preference__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_color(ContactGeometry source) {
    opensimModelSimulationJNI.ContactGeometry_copyProperty_color(swigCPtr, this, ContactGeometry.getCPtr(source), source);
  }

  public double get_color(int i) {
    return opensimModelSimulationJNI.ContactGeometry_get_color(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_color(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.ContactGeometry_upd_color(swigCPtr, this, i), false);
  }

  public void set_color(int i, double value) {
    opensimModelSimulationJNI.ContactGeometry_set_color(swigCPtr, this, i, value);
  }

  public int append_color(double value) {
    return opensimModelSimulationJNI.ContactGeometry_append_color(swigCPtr, this, value);
  }

  public void set_connector_frame(int value) {
    opensimModelSimulationJNI.ContactGeometry__connector_frame_set(swigCPtr, this, value);
  }

  public int get_connector_frame() {
    return opensimModelSimulationJNI.ContactGeometry__connector_frame_get(swigCPtr, this);
  }

  public PhysicalFrame getFrame() {
    return new PhysicalFrame(opensimModelSimulationJNI.ContactGeometry_getFrame(swigCPtr, this), false);
  }

  public void setFrame(PhysicalFrame body) {
    opensimModelSimulationJNI.ContactGeometry_setFrame(swigCPtr, this, PhysicalFrame.getCPtr(body), body);
  }

  public int getDisplayPreference() {
    return opensimModelSimulationJNI.ContactGeometry_getDisplayPreference(swigCPtr, this);
  }

  public void setDisplayPreference(int dispPref) {
    opensimModelSimulationJNI.ContactGeometry_setDisplayPreference(swigCPtr, this, dispPref);
  }

  public SWIGTYPE_p_SimTK__ContactGeometry createSimTKContactGeometry() {
    return new SWIGTYPE_p_SimTK__ContactGeometry(opensimModelSimulationJNI.ContactGeometry_createSimTKContactGeometry(swigCPtr, this), true);
  }

  public Transform getTransform() {
    return new Transform(opensimModelSimulationJNI.ContactGeometry_getTransform(swigCPtr, this), true);
  }

  public void scale(ScaleSet aScaleSet) {
    opensimModelSimulationJNI.ContactGeometry_scale(swigCPtr, this, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public void updateGeometry() {
    opensimModelSimulationJNI.ContactGeometry_updateGeometry(swigCPtr, this);
  }

  public Vec3 getLocation() {
    return new Vec3(opensimModelSimulationJNI.ContactGeometry_getLocation(swigCPtr, this), false);
  }

  public void setLocation(Vec3 location) {
    opensimModelSimulationJNI.ContactGeometry_setLocation(swigCPtr, this, Vec3.getCPtr(location), location);
  }

  public Vec3 getOrientation() {
    return new Vec3(opensimModelSimulationJNI.ContactGeometry_getOrientation(swigCPtr, this), false);
  }

  public void setOrientation(Vec3 orientation) {
    opensimModelSimulationJNI.ContactGeometry_setOrientation(swigCPtr, this, Vec3.getCPtr(orientation), orientation);
  }

  public PhysicalFrame getBody() {
    return new PhysicalFrame(opensimModelSimulationJNI.ContactGeometry_getBody(swigCPtr, this), false);
  }

  public void setBody(PhysicalFrame body) {
    opensimModelSimulationJNI.ContactGeometry_setBody(swigCPtr, this, PhysicalFrame.getCPtr(body), body);
  }

}
