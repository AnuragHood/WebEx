package com.webex.beans;

public class Vendor {
	String Vendor_First_Name;
	String Vendor_Last_Name;
	String Vendor_Id;
	String Vendor_password;
	String Vendor_email;
	String Mobile_contact_No;
	String Vendor_Tin;
	public String getVendor_First_Name() {
		return Vendor_First_Name;
	}
	public void setVendor_First_Name(String vendor_First_Name) {
		Vendor_First_Name = vendor_First_Name;
	}
	public String getVendor_Last_Name() {
		return Vendor_Last_Name;
	}
	public void setVendor_Last_Name(String vendor_Last_Name) {
		Vendor_Last_Name = vendor_Last_Name;
	}
	public String getVendor_Id() {
		return Vendor_Id;
	}
	public void setVendor_Id(String vendor_Id) {
		Vendor_Id = vendor_Id;
	}
	public String getVendor_password() {
		return Vendor_password;
	}
	public void setVendor_password(String vendor_password) {
		Vendor_password = vendor_password;
	}
	public String getVendor_email() {
		return Vendor_email;
	}
	public void setVendor_email(String vendor_email) {
		Vendor_email = vendor_email;
	}
	public String getMobile_contact_No() {
		return Mobile_contact_No;
	}
	public void setMobile_contact_No(String mobile_contact_No) {
		Mobile_contact_No = mobile_contact_No;
	}
	public String getVendor_Tin() {
		return Vendor_Tin;
	}
	public void setVendor_Tin(String vendor_Tin) {
		Vendor_Tin = vendor_Tin;
	}
	public Vendor(String vendor_First_Name, String vendor_Last_Name,
			String vendor_Id, String vendor_password, String vendor_email,
			String mobile_contact_No, String vendor_Tin) {
		super();
		Vendor_First_Name = vendor_First_Name;
		Vendor_Last_Name = vendor_Last_Name;
		Vendor_Id = vendor_Id;
		Vendor_password = vendor_password;
		Vendor_email = vendor_email;
		Mobile_contact_No = mobile_contact_No;
		Vendor_Tin = vendor_Tin;
	}
	@Override
	public String toString() {
		return "Vendor [Vendor_First_Name=" + Vendor_First_Name
				+ ", Vendor_Last_Name=" + Vendor_Last_Name + ", Vendor_Id="
				+ Vendor_Id + ", Vendor_password=" + Vendor_password
				+ ", Vendor_email=" + Vendor_email + ", Mobile_contact_No="
				+ Mobile_contact_No + ", Vendor_Tin=" + Vendor_Tin + "]";
	}
	
}
