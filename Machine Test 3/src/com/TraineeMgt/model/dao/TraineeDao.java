package com.TraineeMgt.model.dao;

import java.util.List;

import com.TraineeMgt.web.entity.Trainee;

public interface TraineeDao {

	public Trainee addTrainee(Trainee trainee);
	
	public List<Trainee> getAllTrainee();
	
}
