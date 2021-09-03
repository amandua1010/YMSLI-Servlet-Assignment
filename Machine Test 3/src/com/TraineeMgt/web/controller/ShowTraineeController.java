package com.TraineeMgt.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TraineeMgt.model.service.TraineeService;
import com.TraineeMgt.model.service.TraineeServiceImpl;
import com.TraineeMgt.web.entity.Trainee;


public class ShowTraineeController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private TraineeService traineeService;

    public ShowTraineeController() {
    	
    	super();
    	traineeService = new TraineeServiceImpl();
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
		List<Trainee> traineeList = traineeService.getAllTrainee();
		
		request.setAttribute("trainees", traineeList);
		
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		
	}

}
