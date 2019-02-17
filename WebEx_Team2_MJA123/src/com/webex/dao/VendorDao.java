package com.webex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.webex.beans.Vendor;
import com.webex.beans.VendorShopDetails;
import com.webex.util.DatabaseUtil;



public class VendorDao {
	public boolean insertvendor(Vendor vendor) {
		boolean result=false;
		Connection cn=null;
		PreparedStatement ps=null;
		try {
			cn=DatabaseUtil.getConnection();
			ps=cn.prepareStatement("INSERT INTO WebExVendor VALUES(?,?,?,?,?,?,?)");
			ps.setString(1, vendor.getVendor_First_Name());
			ps.setString(2, vendor.getVendor_Last_Name());
			ps.setString(3, vendor.getVendor_Id());
			ps.setString(4, vendor.getVendor_password());
			ps.setString(5, vendor.getVendor_email());
			ps.setString(6, vendor.getMobile_contact_No());
			ps.setString(7, vendor.getVendor_Tin());

		
			int result1=ps.executeUpdate();
			if(result1>0) {
				result=true;
			}
					} catch(SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DatabaseUtil.closePreparedStatement(ps);
			DatabaseUtil.closeConnection(cn);
		}
		return result;


	}
	
	public boolean insertVendorShop(VendorShopDetails vendorshop) {
		boolean result=false;
		Connection cn=null;
		PreparedStatement ps=null;
		try {
			cn=DatabaseUtil.getConnection();
			ps=cn.prepareStatement("INSERT INTO WebExVendorShop VALUES(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, vendorshop.getShop_Name());
			ps.setString(2, vendorshop.getShop_Plot_No());
			ps.setString(3, vendorshop.getShop_Street());
			ps.setString(4, vendorshop.getShop_Landmark());
			ps.setString(5, vendorshop.getShop_city());
			ps.setString(6, vendorshop.getShop_state());
			ps.setLong(7, vendorshop.getShop_pincode());
			ps.setLong(8, vendorshop.getShop_telephone_number());
			ps.setString(9, vendorshop.getVendor_Id());
			
			int result1=ps.executeUpdate();
			if(result1>0) {
				result=true;
			}
					} catch(SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DatabaseUtil.closePreparedStatement(ps);
			DatabaseUtil.closeConnection(cn);
		}
		return result;


	}
	

	

	
}
