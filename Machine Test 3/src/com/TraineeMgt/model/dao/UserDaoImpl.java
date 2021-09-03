package com.TraineeMgt.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.TraineeMgt.model.dao.factory.ConnectionFactory;
import com.TraineeMgt.web.entity.User;
import com.TraineeMgt.web.exceptions.DataAccessException;
import com.TraineeMgt.web.exceptions.UserNotFoundException;

public class UserDaoImpl implements UserDao {

	private Connection connection;

	public UserDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public User getUser(String username, String password) {
		
		User user = null;
		PreparedStatement pstmt;
		
		try {
			
			pstmt = connection.prepareStatement("select * from users where username=? and password=?");
			pstmt.setString(1, username);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
			} 
			
			else {
				throw new UserNotFoundException("user with username " + username + " is not found");
			}

		} 
		
		catch (SQLException e) {
			e.printStackTrace();
			throw new DataAccessException(e.getMessage());
		}
		
		return user;
		
	}

}
