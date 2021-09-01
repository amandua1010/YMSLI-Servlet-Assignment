package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FlowerPgController
 */
public class FlowerPgController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public FlowerPgController() {
    	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().write("Flower Page Controller");
		
		int flowerQuantity = Integer.valueOf(request.getParameter("flowerQuantity"));
		
		HttpSession session = request.getSession();		
		session.setAttribute("flowerQuantity", flowerQuantity);
		
		response.sendRedirect("index.jsp");
		
	}

}
