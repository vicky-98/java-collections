package com.training.collections;

public class Student {

	private String student;
	private String fruits;
	
	public Student(String student, String fruits) {
		super();
		this.student = student;
		this.fruits = fruits;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	@Override
	public String toString() {
		return "Student [student=" + student + ", fruits=" + fruits + "]";
	}
	
	
}
