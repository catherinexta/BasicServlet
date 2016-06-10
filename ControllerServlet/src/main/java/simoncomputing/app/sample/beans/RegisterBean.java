package simoncomputing.app.sample.beans;

import javax.servlet.http.HttpServletRequest;

public class RegisterBean {
	String lastName;
	String firstName;
	String dob;
	
	public void bind(HttpServletRequest request) {
		lastName = (String) request.getParameter("lastName");
		firstName = (String) request.getParameter("firstName");
		dob = (String) request.getParameter("dob");
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
