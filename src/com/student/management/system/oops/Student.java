package com.student.management.system.oops;

public class Student {

	private String name;
	private int rollNo;
	private int age;
	private double marksInMaths;
	private double marksInSceince;
	private double marksInEnglish;
	private String grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		if (rollNo >= 1) {
			this.rollNo = rollNo;
		} else
			System.out.println("Invalid RollNo");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 10 && age < 21) {
			this.age = age;
		} else
			System.out.println("Invalid Age");
	}

	public double getMarksInMaths() {
		return marksInMaths;
	}

	public void setMarksInMaths(double marksInMaths) {
		if (marksInMaths >= 0 && marksInMaths < 100) {
			this.marksInMaths = marksInMaths;
		} else
			System.out.println("Invalid marks");

	}

	public double getMarksInSceince() {
		return marksInSceince;
	}

	public void setMarksInSceince(double marksInSceince) {
		if (marksInSceince >= 0 && marksInSceince < 100) {
			this.marksInSceince = marksInSceince;
		} else
			System.out.println("Invalid marks");

	}

	public double getMarksInEnglish() {
		return marksInEnglish;
	}

	public void setMarksInEnglish(double marksInEnglish) {
		if (marksInEnglish >= 0 && marksInEnglish < 100) {
			this.marksInEnglish = marksInEnglish;
		} else
			System.out.println("Invalid marks");

	}

	public String getGrade() {
		double averageMarks = calculateTotalMarks() / 3;
		if (averageMarks >= 90) {
			this.grade = "A";
		} else if (averageMarks >= 80) {
			this.grade = "B";
		} else
			this.grade = "F";
		return grade;
	}

//	public void setGrade(String grade) {
//		this.grade = grade;
//	}

	public double calculateTotalMarks() {
		double totalMarks = marksInMaths + marksInSceince + marksInEnglish;
		System.out.println("total marks :" + totalMarks);
		return totalMarks;
	}

}
