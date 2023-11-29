package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userinsertservlet")
public class userinsertservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String fname = request.getParameter("name1");
		String lname = request.getParameter("name2");
		String email = request.getParameter("mail");
		String phone = request.getParameter("cmobile");
		String uname = request.getParameter("nameid1");
		String passw = request.getParameter("passw");
		
		boolean isTrue;
		
		isTrue = profileDB.userinsertservlet(fname, lname, email, phone, uname, passw);
		
		if(isTrue == true) {
			
			RequestDispatcher dis1 = request.getRequestDispatcher("success.jsp");
			dis1.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
