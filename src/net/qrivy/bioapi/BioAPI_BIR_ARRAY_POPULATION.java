/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.qrivy.bioapi;

public class BioAPI_BIR_ARRAY_POPULATION {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected BioAPI_BIR_ARRAY_POPULATION(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BioAPI_BIR_ARRAY_POPULATION obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      BioAPIJNI.delete_BioAPI_BIR_ARRAY_POPULATION(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setNumberOfMembers(long NumberOfMembers) {
    BioAPIJNI.set_BioAPI_BIR_ARRAY_POPULATION_NumberOfMembers(swigCPtr, NumberOfMembers);
  }

  public long getNumberOfMembers() {
    return BioAPIJNI.get_BioAPI_BIR_ARRAY_POPULATION_NumberOfMembers(swigCPtr);
  }

  public void setMembers(SWIGTYPE_p_p_bioapi_hrs_bir Members) {
    BioAPIJNI.set_BioAPI_BIR_ARRAY_POPULATION_Members(swigCPtr, SWIGTYPE_p_p_bioapi_hrs_bir.getCPtr(Members));
  }

  public SWIGTYPE_p_p_bioapi_hrs_bir getMembers() {
    long cPtr = BioAPIJNI.get_BioAPI_BIR_ARRAY_POPULATION_Members(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_bioapi_hrs_bir(cPtr, false);
  }

  public BioAPI_BIR_ARRAY_POPULATION() {
    this(BioAPIJNI.new_BioAPI_BIR_ARRAY_POPULATION(), true);
  }

}