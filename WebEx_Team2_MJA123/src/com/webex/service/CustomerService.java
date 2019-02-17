package com.webex.service;

import com.webex.beans.Customer;
import com.webex.beans.Login;
import com.webex.dao.CustomerDao;
import com.webex.dao.LoginDao;

public class CustomerService {

	public boolean varifyLogin(Login login) {
		LoginDao dao = new LoginDao();
		return dao.varifyLogin(login);
	}

	public boolean insertCustomer(Customer customer) {
		CustomerDao dao=new CustomerDao();
		return dao.insertCustomer(customer);
	}

}
