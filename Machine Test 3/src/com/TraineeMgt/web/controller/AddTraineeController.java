package com.TraineeMgt.web.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TraineeMgt.model.service.TraineeService;
import com.TraineeMgt.model.service.TraineeServiceImpl;
import com.TraineeMgt.web.entity.Trainee;

public class AddTraineeController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private TraineeService traineeService;
	
    public AddTraineeController() {
    	
    }
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		traineeService = new TraineeServiceImpl();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String trainee_Id = request.getParameter("trainee_Id");
		String trainee_Name = request.getParameter("trainee_Name");
		String branch = request.getParameter("branch");
		Double percentage = Double.valueOf(request.getParameter("percentage"));
		
		Trainee trainee = new Trainee(trainee_Id, trainee_Name, branch, percentage);
		System.out.println(trainee);
		
		Trainee traineeAdded = traineeService.addTrainee(trainee);
		
		if(traineeAdded != null) {
			response.getWriter().write("Trainee Added Successfully.");
		}
		
		response.sendRedirect("showTrainee");
		
	}

}
