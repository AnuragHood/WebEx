package com.webex.beans;

public class VendorShopDetails {
	public VendorShopDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String Shop_Name;
	private String Shop_Plot_No;
	private String Shop_Street;
	private String Shop_Landmark;
	private String Shop_city;
	private String Shop_state;
	private long Shop_pincode;
	private long Shop_telephone_number;
	private String Vendor_Id;

	public String getShop_Name() {
		return Shop_Name;
	}

	public void setShop_Name(String shop_Name) {
		Shop_Name = shop_Name;
	}

	public String getShop_Plot_No() {
		return Shop_Plot_No;
	}

	public void setShop_Plot_No(String shop_Plot_No) {
		Shop_Plot_No = shop_Plot_No;
	}

	public String getShop_Street() {
		return Shop_Street;
	}

	public void setShop_Street(String shop_Street) {
		Shop_Street = shop_Street;
	}

	public String getShop_Landmark() {
		return Shop_Landmark;
	}

	public void setShop_Landmark(String shop_Landmark) {
		Shop_Landmark = shop_Landmark;
	}

	public String getShop_city() {
		return Shop_city;
	}

	public void setShop_city(String shop_city) {
		Shop_city = shop_city;
	}

	public String getShop_state() {
		return Shop_state;
	}

	public void setShop_state(String shop_state) {
		Shop_state = shop_state;
	}

	public long getShop_pincode() {
		return Shop_pincode;
	}

	public void setShop_pincode(long shop_pincode) {
		Shop_pincode = shop_pincode;
	}

	public long getShop_telephone_number() {
		return Shop_telephone_number;
	}

	public void setShop_telephone_number(long shop_telephone_number) {
		Shop_telephone_number = shop_telephone_number;
	}

	public String getVendor_Id() {
		return Vendor_Id;
	}

	public void setVendor_Id(String vendor_Id) {
		Vendor_Id = vendor_Id;
	}

	@Override
	public String toString() {
		return "Locationsort [Shop_Name=" + Shop_Name + ", Shop_Plot_No=" + Shop_Plot_No + ", Shop_Street="
				+ Shop_Street + ", Shop_Landmark=" + Shop_Landmark + ", Shop_city=" + Shop_city + ", Shop_state="
				+ Shop_state + ", Shop_pincode=" + Shop_pincode + ", Shop_telephone_number=" + Shop_telephone_number
				+ ", Vendor_Id=" + Vendor_Id + "]";
	}

	public VendorShopDetails(String shop_Name, String shop_Plot_No, String shop_Street, String shop_Landmark,
			String shop_city, String shop_state, long shop_pincode, long shop_telephone_number, String vendor_Id) {
		super();
		Shop_Name = shop_Name;
		Shop_Plot_No = shop_Plot_No;
		Shop_Street = shop_Street;
		Shop_Landmark = shop_Landmark;
		Shop_city = shop_city;
		Shop_state = shop_state;
		Shop_pincode = shop_pincode;
		Shop_telephone_number = shop_telephone_number;
		Vendor_Id = vendor_Id;
	}

}
