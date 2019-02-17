package com.webex.beans;

public class CustomerAddress {
	public CustomerAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String customer_Id;
	private String Customer_Door_No;
	private String Customer_Street;
	private String Customer_Landmark;
	private String Customer_city;
	private String Customer_state;
	long customer_pincode;
	long contact_number;

	public String getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getCustomer_Door_No() {
		return Customer_Door_No;
	}

	public void setCustomer_Door_No(String customer_Door_No) {
		Customer_Door_No = customer_Door_No;
	}

	public String getCustomer_Street() {
		return Customer_Street;
	}

	public void setCustomer_Street(String customer_Street) {
		Customer_Street = customer_Street;
	}

	public String getCustomer_Landmark() {
		return Customer_Landmark;
	}

	public void setCustomer_Landmark(String customer_Landmark) {
		Customer_Landmark = customer_Landmark;
	}

	public String getCustomer_city() {
		return Customer_city;
	}

	public void setCustomer_city(String customer_city) {
		Customer_city = customer_city;
	}

	public String getCustomer_state() {
		return Customer_state;
	}

	public void setCustomer_state(String customer_state) {
		Customer_state = customer_state;
	}

	public long getCustomer_pincode() {
		return customer_pincode;
	}

	public void setCustomer_pincode(long customer_pincode) {
		this.customer_pincode = customer_pincode;
	}

	public long getContact_number() {
		return contact_number;
	}

	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}

	public CustomerAddress(String customer_Id, String customer_Door_No, String customer_Street,
			String customer_Landmark, String customer_city, String customer_state, long customer_pincode,
			long contact_number) {
		super();
		this.customer_Id = customer_Id;
		Customer_Door_No = customer_Door_No;
		Customer_Street = customer_Street;
		Customer_Landmark = customer_Landmark;
		Customer_city = customer_city;
		Customer_state = customer_state;
		this.customer_pincode = customer_pincode;
		this.contact_number = contact_number;
	}

	@Override
	public String toString() {
		return "cusomerlocation [customer_Id=" + customer_Id + ", Customer_Door_No=" + Customer_Door_No
				+ ", Customer_Street=" + Customer_Street + ", Customer_Landmark=" + Customer_Landmark
				+ ", Customer_city=" + Customer_city + ", Customer_state=" + Customer_state + ", customer_pincode="
				+ customer_pincode + ", contact_number=" + contact_number + "]";
	}

}