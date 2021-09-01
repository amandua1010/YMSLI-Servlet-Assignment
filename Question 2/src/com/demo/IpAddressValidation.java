package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IpAddressValidation
 */
public class IpAddressValidation extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public IpAddressValidation() {
    	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String getIpAddress = request.getParameter("ipAddress");
		String invalidIpAddress = this.getServletConfig().getInitParameter("invalidIpAddress");
		
		if(getIpAddress.equals(invalidIpAddress)) {
			response.sendRedirect("forbidden.jsp");
		}
		
		else {
			response.sendRedirect("success.jsp");
		}
		
	}

}
