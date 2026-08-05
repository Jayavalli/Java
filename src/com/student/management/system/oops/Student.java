package com.student.management.system.oops;

public class Student {

	String name;
	int rollNo;
	int age;
	double marksInMaths;
	double marksInSceince;
	double marksInEnglish;
	String grade;
	
	public void calculateTotalMarks() {
		double totalMarks = marksInMaths +marksInSceince+marksInEnglish;
		System.out.println("total marks :"+ totalMarks);
	}
	
}
