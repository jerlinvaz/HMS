package org.newappointment;

import org.member.member;
import org.newreport.column;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
@Embeddable
public class newappointment extends member{
@column (name="pcity")	
 private String patient_name;
 private int patient_id;
 private long mobilenumber;
 private String paddress;
 private String pcity;
 private String pstate;
public String getPatient_name() {
	return patient_name;
}
public void setPatient_name(String patient_name) {
	this.patient_name = patient_name;
}
public int getPatient_id() {
	return patient_id;
}
public void setPatient_id(int patient_id) {
	this.patient_id = patient_id;
}
public long getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getPaddress() {
	return paddress;
}
public void setPaddress(String paddress) {
	this.paddress = paddress;
}
public String getPcity() {
	return pcity;
}
public void setPcity(String pcity) {
	this.pcity = pcity;
}
public String getPstate() {
	return pstate;
}
public void setPstate(String pstate) {
	this.pstate = pstate;
}
 
}
