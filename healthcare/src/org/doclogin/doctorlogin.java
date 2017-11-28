package org.doclogin;

import org.admin.admin;
import org.newreport.column;
import javax.persistence.Entity;
import javax.persistence.Embeddable;
@Entity


public class doctorlogin extends admin{
	@column (name="doctorlogin")
	private String dusername;
	  private String password;
  public String getDusername() {
		return dusername;
	}
	public void setDusername(String dusername) {
		this.dusername = dusername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
