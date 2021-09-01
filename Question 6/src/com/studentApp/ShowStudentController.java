package com.studentApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentApp.entity.Student;
import com.studentApp.service.StudentService;
import com.studentApp.service.StudentServiceImpl;


public class ShowStudentController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private StudentService studentService;

    public ShowStudentController() {
		super();
		studentService = new StudentServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
		List<Student> studentList = studentService.getAllStudent();
		
		request.setAttribute("students", studentList);
		
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		
	}

}
