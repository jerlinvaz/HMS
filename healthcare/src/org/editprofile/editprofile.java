package org.editprofile;
import javax.persistence.Entity;
import javax.persistence.Embeddable;
import org.member.member;
import org.newreport.column;
@Embeddable
public class editprofile extends member{
	@column (name="email_id")
 private int exmid;
 private long mno;
 public int getExmid() {
	return exmid;
}
public void setExmid(int exmid) {
	this.exmid = exmid;
}
public long getMno() {
	return mno;
}
public void setMno(long mno) {
	this.mno = mno;
}
public String getEaddress() {
	return eaddress;
}
public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}
private String eaddress;
 
}

