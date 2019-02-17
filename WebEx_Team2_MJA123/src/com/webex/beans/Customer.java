package com.webex.beans;

public class Customer {
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String userId;
	private String password;
	private String firstName;
	private String LastName;
	private String email;
	private long contactNo;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", password=" + password + ", firstname=" + firstName + ", Lastname="
				+ LastName + ", email=" + email + ", contectno=" + contactNo + "]";
	}

	public Customer(String userId, String password, String firstname, String lastname, String email, long contectno) {
		super();
		this.userId = userId;
		this.password = password;
		this.firstName = firstname;
		LastName = lastname;
		this.email = email;
		this.contactNo = contectno;
	}

}
