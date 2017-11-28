package org.admin;
import org.doctordetails.doctor_details;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.patient_details.patient_details;

	public class admin {
		private String adminusername;
	    private String password;
	public String getAdminusername() {
		return adminusername;
	}
	public void setAdminusername(String adminusername) {
		this.adminusername = adminusername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

		public static void main(String[] args){
	patient_details pa=new patient_details();
		    pa.setPname("ramya");
		    pa.setPid(101);
		    pa.setGender("female");
		    pa.setDOB("25-05-1990");
		    pa.setState("tamilnadu");
		    pa.setPhoneno("895634235");
		    pa.setAddress("ramnager,chennai-60028");
		    SessionFactory sf = new Configuration().configure().buildSessionFactory();
		    Session session=sf.openSession();
		    session.beginTransaction();
		    session.save(pa);
		    session.getTransaction().commit();
		    session.close();
	doctor_details da=new doctor_details();
		   da.setDoctorname("arul");
		   da.setMno("5678341290");
		   da.setDid(105);
		   da.setDemailid("huyt@gmail.com");
		   SessionFactory FS1 = new Configuration().configure().buildSessionFactory();
		    Session session1=FS1.openSession();
		    session1.beginTransaction();
		    session1.save(da);
		    session1.getTransaction().commit();
		    session1.close();
   
	 	 }
	}


