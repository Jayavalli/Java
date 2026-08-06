package com.student.management.system.oops;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setName("Jaya");
		s1.setAge(25);
		s1.setRollNo(18);
		s1.setMarksInEnglish(80);
		s1.setMarksInSceince(90);
		s1.setMarksInMaths(345);

		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getRollNo());
		System.out.println(s1.getMarksInEnglish());
		System.out.println(s1.getMarksInMaths());
		System.out.println(s1.getMarksInSceince());
		System.out.println(s1.getGrade());
		
		s1.calculateTotalMarks();

	}

}
