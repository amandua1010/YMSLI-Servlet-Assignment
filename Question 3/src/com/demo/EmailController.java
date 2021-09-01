package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailController
 */
public class EmailController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public EmailController() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String emailOption = request.getParameter("email");

		if (emailOption.equals("unknown")) {
			response.sendRedirect("Error.jsp");
		} 
		
		else {
			response.sendRedirect("https://www." + emailOption + ".com");
		}

	}

}
