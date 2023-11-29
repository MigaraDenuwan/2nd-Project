package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteUserServerlet")
public class deleteUserServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		boolean isTrue;
		isTrue = profileDB.deleteUser(id);
		
		if( isTrue == true) {

			RequestDispatcher di5 = request.getRequestDispatcher("UserInsert.jsp");
			di5.forward(request, response);
		}
		else {	

			List <user> userDetails = profileDB.getUserdetails(id);
			request.setAttribute("userDetails", userDetails);
			
			RequestDispatcher di6 = request.getRequestDispatcher("useracc.jsp");
			di6.forward(request, response);
		}
	}

}
