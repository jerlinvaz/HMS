package org.newreport;
import javax.persistence.Embeddable;
import org.member.member;
@Embeddable
public class newreport extends member{
	@column (name="report_details")
private String appreserv;
private String consulting_doctor;
public String getAppreserv() {
	return appreserv;
}
public void setAppreserv(String appreserv) {
	this.appreserv = appreserv;
}
public String getConsulting_doctor() {
	return consulting_doctor;
}
public void setConsulting_doctor(String consulting_doctor) {
	this.consulting_doctor = consulting_doctor;
}
}

