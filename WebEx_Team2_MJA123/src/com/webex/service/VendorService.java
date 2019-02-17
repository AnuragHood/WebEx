package com.webex.service;

import com.webex.beans.Vendor;
import com.webex.beans.VendorShopDetails;
import com.webex.dao.VendorDao;

public class VendorService {

	public boolean insertvendor(Vendor vendor) {
		VendorDao dao=new VendorDao();
		return dao.insertvendor(vendor);
	}
	public boolean insertVendorShop(VendorShopDetails vendorshop) {
		VendorDao dao=new VendorDao();
		return dao.insertVendorShop(vendorshop);
	
	}
}
