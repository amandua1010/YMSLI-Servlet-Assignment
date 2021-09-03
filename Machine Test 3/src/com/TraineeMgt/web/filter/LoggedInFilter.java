package com.TraineeMgt.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.TraineeMgt.web.entity.User;

@WebFilter("*.do")
public class LoggedInFilter implements Filter {

    public LoggedInFilter() {
    	
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		boolean isValid = false;
		
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			User user = (User) session.getAttribute("user");
			if(user != null) {
				isValid = true;
			}
		}
		
		if(isValid) {
			chain.doFilter(request, response);
		}
		else {
			res.sendRedirect("index.jsp");
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
