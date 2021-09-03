package com.TraineeMgt.model.service;

import java.util.List;

import com.TraineeMgt.model.dao.TraineeDao;
import com.TraineeMgt.model.dao.TraineeDaoImpl;
import com.TraineeMgt.web.entity.Trainee;

public class TraineeServiceImpl implements TraineeService {
	
	private TraineeDao traineeDao;
	
	public TraineeServiceImpl() {
		traineeDao = new TraineeDaoImpl();
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		return traineeDao.addTrainee(trainee);
		
	}

	@Override
	public List<Trainee> getAllTrainee() {
		
		return traineeDao.getAllTrainee();
		
	}
	
}
