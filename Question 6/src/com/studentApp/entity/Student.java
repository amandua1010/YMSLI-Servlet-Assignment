package com.studentApp.entity;

public class Student {
	
	private String stud_Id;
	private String stud_Name;
	private String stream;
	private Double percentage;
	
	public Student(String stud_Id, String stud_Name, String stream, Double percentage) {

		this.stud_Id = stud_Id;
		this.stud_Name = stud_Name;
		this.stream = stream;
		this.percentage = percentage;
		
	}
	
	public String getStud_Id() {
		return stud_Id;
	}

	public void setStud_Id(String stud_Id) {
		this.stud_Id = stud_Id;
	}

	public String getStud_Name() {
		return stud_Name;
	}

	public void setStud_Name(String stud_Name) {
		this.stud_Name = stud_Name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
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
		builder.append("Student [stud_Id=");
		builder.append(stud_Id);
		builder.append(", stud_Name=");
		builder.append(stud_Name);
		builder.append(", stream=");
		builder.append(stream);
		builder.append(", percentage=");
		builder.append(percentage);
		builder.append("]");
		return builder.toString();
	}
	
}
