package org.previous_details;

import org.newreport.column;
import org.patient_details.patient_details;
import javax.persistence.Entity;
import javax.persistence.Embeddable;
@Embeddable
public class prevoius_details extends patient_details {
	@column (name="reason_type")
  private String appointment;
  private int time;
  private String reason;
  private String consulted_doctor;
  
public String getAppointment() {
	return appointment;
}
public void setAppointment(String appointment) {
	this.appointment = appointment;
}
public int getTime() {
	return time;
}
public void setTime(int time) {
	this.time = time;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public String getConsulted_doctor() {
	return consulted_doctor;
}
public void setConsulted_doctor(String consulted_doctor) {
	this.consulted_doctor = consulted_doctor;
}
  
}
