 package org.member;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.newreport.column;
@Entity
public class member {
	@Id
	@column (name="member_id")
 private String username;
 private int id;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
 
}
