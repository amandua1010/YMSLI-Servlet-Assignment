package com.TraineeMgt.model.service;

import java.util.List;

import com.TraineeMgt.web.entity.Trainee;

public interface TraineeService {
	
	public Trainee addTrainee(Trainee trainee);
	
	public List<Trainee> getAllTrainee();
	
}
