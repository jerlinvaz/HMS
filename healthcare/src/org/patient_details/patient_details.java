package org.patient_details;
import javax.persistence.Embeddable;

import org.newreport.column;
@Embeddable
public class patient_details {
	@column (name="pid")
   private String pname;
   private int pid;
   private String gender;
   private String State;
   private String DOB;
   private String address;
   private String phoneno;
   public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String string) {
	this.phoneno = string;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public patient_details()
   {
	   super();
   }
public String getPname() {
	return pname;
}
public  void setPname(String pname) {
	this.pname = pname;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
    
   }
