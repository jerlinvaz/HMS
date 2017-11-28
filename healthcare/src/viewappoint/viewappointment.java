package viewappoint;

import org.doctordetails.doctor_details;
import org.newreport.column;
import javax.persistence.Entity;
import javax.persistence.Embeddable;
@Embeddable
@Entity
public class viewappointment extends doctor_details{
	@column (name="patient_id")
 private int patient_id;
 private String reason;
 private String prescription;
public int getPatient_id() {
	return patient_id;
}
public void setPatient_id(int patient_id) {
	this.patient_id = patient_id;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public String getPrescription() {
	return prescription;
}
public void setPrescription(String prescription) {
	this.prescription = prescription;
}
 
}
