package com.studentApp.dao;

import java.util.List;

import com.studentApp.entity.Student;

public interface StudentDao {

	public Student addStudent(Student student);

	public List<Student> getAllStudent();

}
