package org.doctordetails;

import org.doclogin.doctorlogin;
import org.newreport.column;

import javax.persistence.Embeddable;
@Embeddable
public class doctor_details extends doctorlogin {
	@column (name="demail_id")
private String doctorname;
private String mno;
private int did;
private String demailid;
private String specialization;
public String getDoctorname() {
	return doctorname;
}
public void setDoctorname(String doctorname) {
	this.doctorname = doctorname;
}
public String getMno() {
	return mno;
}
public void setMno(String string) {
	this.mno = string;
}
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDemailid() {
	return demailid;
}
public void setDemailid(String demailid) {
	this.demailid = demailid;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
}
