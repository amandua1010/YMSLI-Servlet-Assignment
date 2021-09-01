package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidationTest
 */
public class ValidationTest extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public ValidationTest() {
    	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		String nameParam = this.getServletConfig().getInitParameter("username");
		String passwordParam = this.getServletConfig().getInitParameter("password");

		if (username.equals(nameParam) && password.equals(passwordParam)) {
			writer.write("Username and Password are valid");
		} 
		
		else {
			int count = Integer.valueOf(this.getServletContext().getInitParameter("count"));
			while (count-- != 0) {
				writer.write("Invalid Parameter => Username: " + username + " , Password: " + password + " <br/>");
			}
		}
		
	}

}
