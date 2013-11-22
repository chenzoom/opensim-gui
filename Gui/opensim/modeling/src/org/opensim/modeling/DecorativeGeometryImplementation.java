/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DecorativeGeometryImplementation {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public DecorativeGeometryImplementation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(DecorativeGeometryImplementation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_DecorativeGeometryImplementation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    opensimModelJNI.DecorativeGeometryImplementation_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    opensimModelJNI.DecorativeGeometryImplementation_change_ownership(this, swigCPtr, true);
  }

  public void implementPointGeometry(DecorativePoint arg0) {
    opensimModelJNI.DecorativeGeometryImplementation_implementPointGeometry(swigCPtr, this, DecorativePoint.getCPtr(arg0), arg0);
  }

  public void implementLineGeometry(DecorativeLine arg0) {
    opensimModelJNI.DecorativeGeometryImplementation_implementLineGeometry(swigCPtr, this, DecorativeLine.getCPtr(arg0), arg0);
  }

  public void implementBrickGeometry(DecorativeBrick arg0) {
    opensimModelJNI.DecorativeGeometryImplementation_implementBrickGeometry(swigCPtr, this, DecorativeBrick.getCPtr(arg0), arg0);
  }

  public void implementCylinderGeometry(DecorativeCylinder arg0) {
    opensimModelJNI.DecorativeGeometryImplementation_implementCylinderGeometry(swigCPtr, this, DecorativeCylinder.getCPtr(arg0), arg0);
  }

  public void implementCircleGeometry(DecorativeCircle arg0) {
    opensimModelJNI.DecorativeGeometryImplementation_implementCircleGeometry(swigCPtr, this, DecorativeCircle.getCPtr(arg0), arg0);
  }

  public void implementSphereGeometry(DecorativeSphere arg0) {
    opensimModelJNI.DecorativeGeometryImplementation_implementSphereGeometry(swigCPtr, this, DecorativeSphere.getCPtr(arg0), arg0);
  }

  public void implementEllipsoidGeometry(DecorativeEllipsoid arg0) {
    opensimModelJNI.DecorativeGeometryImplementation_implementEllipsoidGeometry(swigCPtr, this, DecorativeEllipsoid.getCPtr(arg0), arg0);
  }

  public void implementFrameGeometry(DecorativeFrame arg0) {
    opensimModelJNI.DecorativeGeometryImplementation_implementFrameGeometry(swigCPtr, this, DecorativeFrame.getCPtr(arg0), arg0);
  }

  public void implementTextGeometry(DecorativeText arg0) {
    opensimModelJNI.DecorativeGeometryImplementation_implementTextGeometry(swigCPtr, this, DecorativeText.getCPtr(arg0), arg0);
  }

  public void implementMeshGeometry(DecorativeMesh arg0) {
    opensimModelJNI.DecorativeGeometryImplementation_implementMeshGeometry(swigCPtr, this, DecorativeMesh.getCPtr(arg0), arg0);
  }

  public DecorativeGeometryImplementation() {
    this(opensimModelJNI.new_DecorativeGeometryImplementation(), true);
    opensimModelJNI.DecorativeGeometryImplementation_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
