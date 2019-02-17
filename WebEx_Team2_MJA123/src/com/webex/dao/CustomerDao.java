package com.webex.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.webex.beans.Customer;
import com.webex.util.DatabaseUtil;

public class CustomerDao {
	public boolean insertCustomer(Customer customer) {
		boolean result=false;
		Connection cn=null;
		PreparedStatement ps=null;
		try {
			cn=DatabaseUtil.getConnection();
			ps=cn.prepareStatement("INSERT INTO WebExCustomer VALUES(?,?,?,?,?,?)");
			ps.setString(1, customer.getUserId());
			ps.setString(2, customer.getPassword());
			ps.setString(3, customer.getFirstName());
			ps.setString(4, customer.getLastName());
			ps.setString(5, customer.getEmail());
			ps.setLong(6, customer.getContactNo());
		
			int temp=ps.executeUpdate();
			if(temp>0) {
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