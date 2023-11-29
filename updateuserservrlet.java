package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateuserservrlet")
public class updateuserservrlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String fName = request.getParameter("name1");
		String lName = request.getParameter("name2");
		String email = request.getParameter("mail");
		String phone = request.getParameter("cmobile");
		String uername = request.getParameter("nameid1");
		String password = request.getParameter("passw");
		
		boolean isTrue;
		
		isTrue = profileDB.updateuserservrlet(id, fName, lName, email, phone, uername, password);
		if(isTrue == true) {
			
			List <user> userDetails = profileDB.getUserdetails(id);
			request.setAttribute("userDetails", userDetails);
			
			RequestDispatcher dis3 = request.getRequestDispatcher("useracc.jsp");
			dis3.forward(request, response);
		}
		else {
			
			List <user> userDetails = profileDB.getUserdetails(id);
			request.setAttribute("userDetails", userDetails);
			
			RequestDispatcher di4 = request.getRequestDispatcher("useracc.jsp");
			di4.forward(request, response);
		}
	}

}
