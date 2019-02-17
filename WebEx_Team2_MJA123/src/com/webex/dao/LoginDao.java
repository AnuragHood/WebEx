package com.webex.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.webex.beans.Login;
import com.webex.util.DatabaseUtil;

public class LoginDao {
	ResultSet rs=null;

	public boolean varifyLogin(Login login) {
		// TODO Auto-generated method stub

		boolean result = false;
		java.sql.Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DatabaseUtil.getConnection();
			pst = con.prepareStatement("SELECT *FROM WebExCustomer WHERE customer_Id =?  AND customer_password =?");
			pst.setString(1, login.getUserId());
			pst.setString(2, login.getPassword());
			rs = pst.executeQuery();
			if(rs.next()) {
				result=true;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DatabaseUtil.closePreparedStatement(pst);
			DatabaseUtil.closeConnection(con);
		}

		return result;

	}

	public boolean varifyVendorLogin(Login login1) {

		boolean result = false;
		java.sql.Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DatabaseUtil.getConnection();
			pst = con.prepareStatement("SELECT * FROM WebExVendor WHERE Vendor_Id =?  AND Vendor_password =?");
			pst.setString(1, login1.getUserId());
			pst.setString(2, login1.getPassword());
			rs = pst.executeQuery();
			if(rs.next()) {
				result=true;
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DatabaseUtil.closePreparedStatement(pst);
			DatabaseUtil.closeConnection(con);
		}

		return result;

	}

}
