package com.webex.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webex.beans.Login;
import com.webex.beans.Vendor;
import com.webex.beans.VendorShopDetails;
import com.webex.service.LoginService;
import com.webex.service.VendorService;

/**
 * Servlet implementation class VendorController
 */
@WebServlet("/VendorController")
public class VendorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VendorController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		LoginService service1 = new LoginService();
		VendorService service2 = new VendorService();
		RequestDispatcher rd = null;

		if ("AddVendor".equals(action)) {
			String userId = request.getParameter("UserName");
			String Password = request.getParameter("password");
			String firstName = request.getParameter("FirstName");
			String lastName = request.getParameter("LastName");
			String email = request.getParameter("EmailId");
			String contactno = request.getParameter("MobileNumber");
			String Tinno = request.getParameter("Tin");
			Vendor vendor = new Vendor(firstName, lastName, userId, Password, email, contactno, Tinno);
			boolean result = service2.insertvendor(vendor);
			if (result == true) {
				rd = request.getRequestDispatcher("Success.jsp");
				request.setAttribute("message", "Welcome to WebEx...");

			} else {
				rd = request.getRequestDispatcher("Failure.jsp");
				request.setAttribute("message", "Some failure accured try to repeat...");

			}
			rd.forward(request, response);

		} else if ("login".equals(action)) {
			String userName = request.getParameter("userId");
			String password = request.getParameter("password");
			Login login1 = new Login(userName, password);

			boolean result = service1.varifyVendorLogin(login1);
			if (result == true) {
				rd = request.getRequestDispatcher("index.jsp");
			} else {
				rd = request.getRequestDispatcher("Failure.jsp");
				request.setAttribute("message",
						"loginId or password incorrect or you are not yet registered with webex management system in this case go back and signup...");
			}
			rd.forward(request, response);
		} else if ("AddShop".equals(action)) {
			String shopName = request.getParameter("Name");
			String plot = request.getParameter("FlatNo/DoorNo");
			String Street = request.getParameter("Area/Street");
			String Landmark = request.getParameter("Landmark");
			String City = request.getParameter("City");
			String Pincode = request.getParameter("Pincode");
			String TelephoneNumber = request.getParameter("TelephoneNumber");
			String UserName = request.getParameter("UserName");
			String State = request.getParameter("State");

			long pincode1=0;
			long telephone=0;
			if(Pincode!=null) {
			 pincode1=Long.parseLong(Pincode);
			}
			if(TelephoneNumber!=null) {
				telephone=Long.parseLong(Pincode);
				}
			VendorShopDetails vendorShop=new VendorShopDetails(shopName, plot, Street, Landmark, City, State, pincode1, telephone, UserName);
			boolean result = service2.insertVendorShop(vendorShop);
			if (result == true) {
				rd = request.getRequestDispatcher("Success.jsp");
				request.setAttribute("message", "Welcome to WebEx...");

			} else {
				rd = request.getRequestDispatcher("Failure.jsp");
				request.setAttribute("message", "Some failure accured try to repeat...");

			}
			rd.forward(request, response);
			

		}
	}

}
