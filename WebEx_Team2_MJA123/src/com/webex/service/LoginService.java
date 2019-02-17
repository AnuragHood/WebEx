package com.webex.service;

import com.webex.beans.Login;
import com.webex.beans.Vendor;
import com.webex.dao.LoginDao;

public class LoginService {
	public boolean varifyLogin(Login login) {
		LoginDao dao = new LoginDao();
		return dao.varifyLogin(login);

	}
	
	public boolean varifyVendorLogin(Login login1) {
	LoginDao dao=new LoginDao();
	return dao.varifyVendorLogin(login1);
	}

		
}