/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Marker extends Station {
  private long swigCPtr;

  public Marker(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.Marker_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Marker obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_Marker(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Marker safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.Marker_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Marker(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.Marker_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.Marker_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.Marker_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Marker(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.Marker_getConcreteClassName(swigCPtr, this);
  }

  public Marker() {
    this(opensimModelSimulationJNI.new_Marker(), true);
  }

  public String getFrameName() {
    return opensimModelSimulationJNI.Marker_getFrameName(swigCPtr, this);
  }

  public void setFrameName(String aName) {
    opensimModelSimulationJNI.Marker_setFrameName(swigCPtr, this, aName);
  }

  public void changeFrame(PhysicalFrame aPhysicalFrame) {
    opensimModelSimulationJNI.Marker_changeFrame(swigCPtr, this, PhysicalFrame.getCPtr(aPhysicalFrame), aPhysicalFrame);
  }

  public void changeFramePreserveLocation(State s, PhysicalFrame aPhysicalFrame) {
    opensimModelSimulationJNI.Marker_changeFramePreserveLocation(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(aPhysicalFrame), aPhysicalFrame);
  }

  public void scale(Vec3 aScaleFactors) {
    opensimModelSimulationJNI.Marker_scale(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimModelSimulationJNI.Marker_updateFromXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode) {
    opensimModelSimulationJNI.Marker_updateFromXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode));
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelSimulationJNI.Marker_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}
