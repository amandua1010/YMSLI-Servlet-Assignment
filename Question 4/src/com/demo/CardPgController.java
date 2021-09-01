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
public class CardPgController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
  
    public CardPgController() {
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().write("Card Page Controller");
		
		int cardQuantity = Integer.valueOf(request.getParameter("cardQuantity"));
		
		HttpSession session = request.getSession();		
		session.setAttribute("cardQuantity", cardQuantity);
		
		response.sendRedirect("index.jsp");
		
	}

}
