package com.webex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webex.beans.Customer;
import com.webex.beans.Login;
import com.webex.service.CustomerService;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		CustomerService service = new CustomerService();
		RequestDispatcher rd = null;

		if ("AddCustomer".equals(action)) {
			String userId = request.getParameter("userId");
			String Password = request.getParameter("Password");
			String firstName = request.getParameter("FisrtName");
			String lastName = request.getParameter("LastName");
			String email = request.getParameter("email");
			String contactno = request.getParameter("contactno");
			long contactNo=0;
			if(contactno!=null) {
				contactNo=Long.parseLong(contactno);
			}

			Customer customer = new Customer(userId, Password, firstName, lastName, email, contactNo);
			boolean result = service.insertCustomer(customer);
			if (result == true) {
				rd = request.getRequestDispatcher("Success.jsp");
				request.setAttribute("message", " SignedUp successfully Login here...");

			} else {
				rd = request.getRequestDispatcher("Failure.jsp");
				request.setAttribute("message", "SignUp failed due to some reason...");

			}
			rd.forward(request, response);

		}
		else if("login".equals(action)) {
			String userName = request.getParameter("userId");
			String password = request.getParameter("password");
			Login login = new Login(userName,password);
			
			boolean result = service.varifyLogin(login);
			if (result == true) {
				rd = request.getRequestDispatcher("index.jsp");
			} else {
				rd = request.getRequestDispatcher("Failure.jsp");
				request.setAttribute("message", "LoginId or password incorrect or you are not yet registered with WebEx"
						+ " in this case SignUp first...");
			}
			rd.forward(request, response);
		}

}
	


	}


