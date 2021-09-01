package com.studentApp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.studentApp.dao.factory.ConnectionFactory;
import com.studentApp.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private Connection connection;

	public StudentDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}
	
	@Override
	public Student addStudent(Student student) {

		PreparedStatement pstmt;
		
		try {
			
			pstmt = connection.prepareStatement("insert into students values(?,?,?,?)");
			
			pstmt.setString(1, student.getStud_Id());
			pstmt.setString(2, student.getStud_Name());
			pstmt.setString(3, student.getStream());
			pstmt.setDouble(4, student.getPercentage());

			pstmt.executeUpdate();

		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}

		return student;
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		PreparedStatement pstmt;
		
		List<Student> studentsList = new ArrayList<>();
		
		try {
			
			pstmt = connection.prepareStatement("select * from students");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Student student = new Student(rs.getString("stud_id"), rs.getString("stud_name"), rs.getString("stream"), rs.getDouble("percentage"));
				studentsList.add(student);
			}

		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}

		return studentsList;
		
	}
	
}
