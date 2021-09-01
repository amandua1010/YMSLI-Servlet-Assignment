package com.studentApp.service;

import java.util.List;

import com.studentApp.dao.StudentDao;
import com.studentApp.dao.StudentDaoImpl;
import com.studentApp.entity.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new StudentDaoImpl();
	}
	
	@Override
	public Student addStudent(Student student) {
		
		return studentDao.addStudent(student);
	
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentDao.getAllStudent();
	
	}
	
	
	
}
