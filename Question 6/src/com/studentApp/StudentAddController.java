package com.studentApp;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentApp.entity.Student;
import com.studentApp.service.StudentService;
import com.studentApp.service.StudentServiceImpl;


public class StudentAddController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private StudentService studentService;

    public StudentAddController() {
        
    }
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		studentService = new StudentServiceImpl();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String stud_Id = request.getParameter("stud_Id");
		String stud_Name = request.getParameter("stud_Name");
		String stream = request.getParameter("stream");
		Double percentage = Double.valueOf(request.getParameter("percentage"));

		Student student = new Student(stud_Id, stud_Name, stream, percentage);
		System.out.println(student);
		
		Student studentAdded = studentService.addStudent(student);
		
		if (studentAdded != null) {
			response.getWriter().write("Student Added Successfully");
		}

		response.sendRedirect("showStudents");
		
	}

}
