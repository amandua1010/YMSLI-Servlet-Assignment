package com.TraineeMgt.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.TraineeMgt.model.dao.factory.ConnectionFactory;
import com.TraineeMgt.web.entity.Trainee;
import com.TraineeMgt.web.exceptions.DataAccessException;

public class TraineeDaoImpl implements TraineeDao {

	private Connection connection;

	public TraineeDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {

		PreparedStatement pstmt;

		try {

			pstmt = connection.prepareStatement("insert into trainee values(?,?,?,?)");

			pstmt.setString(1, trainee.getTrainee_Id());
			pstmt.setString(2, trainee.getTrainee_Name());
			pstmt.setString(3, trainee.getBranch());
			pstmt.setDouble(4, trainee.getPercentage());

			pstmt.executeUpdate();

		}

		catch (SQLException e) {
			throw new DataAccessException(e.getLocalizedMessage());
		}

		return trainee;

	}

	@Override
	public List<Trainee> getAllTrainee() {

		PreparedStatement pstmt;

		List<Trainee> traineeList = new ArrayList<>();

		try {

			pstmt = connection.prepareStatement("select * from trainee");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Trainee trainee = new Trainee(rs.getString("trainee_Id"), rs.getString("trainee_Name"), rs.getString("branch"), rs.getDouble("percentage"));
				traineeList.add(trainee);
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return traineeList;

	}

}
