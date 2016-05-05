/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PathPoint extends Station {
  private transient long swigCPtr;

  public PathPoint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.PathPoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PathPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_PathPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PathPoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.PathPoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PathPoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.PathPoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.PathPoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.PathPoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PathPoint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.PathPoint_getConcreteClassName(swigCPtr, this);
  }

  public PathPoint() {
    this(opensimModelSimulationJNI.new_PathPoint(), true);
  }

  public void init(PathPoint point) {
    opensimModelSimulationJNI.PathPoint_init(swigCPtr, this, PathPoint.getCPtr(point), point);
  }

  public void copyData(PathPoint aPoint) {
    opensimModelSimulationJNI.PathPoint_copyData(swigCPtr, this, PathPoint.getCPtr(aPoint), aPoint);
  }

  public Vec3 getLocation() {
    return new Vec3(opensimModelSimulationJNI.PathPoint_getLocation(swigCPtr, this), false);
  }

  public double getLocationCoord(int aXYZ) {
    return opensimModelSimulationJNI.PathPoint_getLocationCoord(swigCPtr, this, aXYZ);
  }

  public void setLocationCoord(int aXYZ, double aValue) {
    opensimModelSimulationJNI.PathPoint_setLocationCoord(swigCPtr, this, aXYZ, aValue);
  }

  public void setLocation(State s, Vec3 location) {
    opensimModelSimulationJNI.PathPoint_setLocation__SWIG_0(swigCPtr, this, State.getCPtr(s), s, Vec3.getCPtr(location), location);
  }

  public void setLocation(State s, int aCoordIndex, double aLocation) {
    opensimModelSimulationJNI.PathPoint_setLocation__SWIG_1(swigCPtr, this, State.getCPtr(s), s, aCoordIndex, aLocation);
  }

  public void setLocation(State s, double[] pt) {
    opensimModelSimulationJNI.PathPoint_setLocation__SWIG_2(swigCPtr, this, State.getCPtr(s), s, pt);
  }

  public void setBody(PhysicalFrame body) {
    opensimModelSimulationJNI.PathPoint_setBody(swigCPtr, this, PhysicalFrame.getCPtr(body), body);
  }

  public void changeBodyPreserveLocation(State s, PhysicalFrame body) {
    opensimModelSimulationJNI.PathPoint_changeBodyPreserveLocation(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(body), body);
  }

  public PhysicalFrame getBody() {
    return new PhysicalFrame(opensimModelSimulationJNI.PathPoint_getBody(swigCPtr, this), false);
  }

  public String getBodyName() {
    return opensimModelSimulationJNI.PathPoint_getBodyName(swigCPtr, this);
  }

  public GeometryPath getPath() {
    long cPtr = opensimModelSimulationJNI.PathPoint_getPath(swigCPtr, this);
    return (cPtr == 0) ? null : new GeometryPath(cPtr, false);
  }

  public void scale(State s, Vec3 scaleFactors) {
    opensimModelSimulationJNI.PathPoint_scale(swigCPtr, this, State.getCPtr(s), s, Vec3.getCPtr(scaleFactors), scaleFactors);
  }

  public WrapObject getWrapObject() {
    long cPtr = opensimModelSimulationJNI.PathPoint_getWrapObject(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapObject(cPtr, false);
  }

  public boolean isActive(State s) {
    return opensimModelSimulationJNI.PathPoint_isActive(swigCPtr, this, State.getCPtr(s), s);
  }

  public void connectToModelAndPath(Model aModel, GeometryPath aPath) {
    opensimModelSimulationJNI.PathPoint_connectToModelAndPath(swigCPtr, this, Model.getCPtr(aModel), aModel, GeometryPath.getCPtr(aPath), aPath);
  }

  public void update(State s) {
    opensimModelSimulationJNI.PathPoint_update(swigCPtr, this, State.getCPtr(s), s);
  }

  public void getVelocity(State s, Vec3 velocity) {
    opensimModelSimulationJNI.PathPoint_getVelocity(swigCPtr, this, State.getCPtr(s), s, Vec3.getCPtr(velocity), velocity);
  }

  public Vec3 getdPointdQ(State s) {
    return new Vec3(opensimModelSimulationJNI.PathPoint_getdPointdQ(swigCPtr, this, State.getCPtr(s), s), true);
  }

  public void updateGeometry() {
    opensimModelSimulationJNI.PathPoint_updateGeometry(swigCPtr, this);
  }

  public static PathPoint makePathPointOfType(PathPoint aPoint, String aNewTypeName) {
    long cPtr = opensimModelSimulationJNI.PathPoint_makePathPointOfType(PathPoint.getCPtr(aPoint), aPoint, aNewTypeName);
    return (cPtr == 0) ? null : new PathPoint(cPtr, false);
  }

  public static void deletePathPoint(PathPoint aPoint) {
    opensimModelSimulationJNI.PathPoint_deletePathPoint(PathPoint.getCPtr(aPoint), aPoint);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimModelSimulationJNI.PathPoint_updateFromXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

}
