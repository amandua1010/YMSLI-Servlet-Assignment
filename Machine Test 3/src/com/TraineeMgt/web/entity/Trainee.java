package com.TraineeMgt.web.entity;

public class Trainee {
	
//	trainee_id, trainee_name, branch (java, oracle, php,dotnet), percentage
	
	private String trainee_Id;
	private String trainee_Name;
	private String branch;
	private Double percentage;
	
	public Trainee(String trainee_Id, String trainee_Name, String branch, Double percentage) {
		
		this.trainee_Id = trainee_Id;
		this.trainee_Name = trainee_Name;
		this.branch = branch;
		this.percentage = percentage;
		
	}

	public String getTrainee_Id() {
		return trainee_Id;
	}

	public void setTrainee_Id(String trainee_Id) {
		this.trainee_Id = trainee_Id;
	}

	public String getTrainee_Name() {
		return trainee_Name;
	}

	public void setTrainee_Name(String trainee_Name) {
		this.trainee_Name = trainee_Name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Trainee [trainee_Id=");
		builder.append(trainee_Id);
		builder.append(", trainee_Name=");
		builder.append(trainee_Name);
		builder.append(", branch=");
		builder.append(branch);
		builder.append(", percentage=");
		builder.append(percentage);
		builder.append("]");
		return builder.toString();
	}
	
}
