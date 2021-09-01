package com.studentApp.service;

import java.util.List;

import com.studentApp.entity.Student;

public interface StudentService {
	
	public Student addStudent(Student student);

	public List<Student> getAllStudent();
	
}
