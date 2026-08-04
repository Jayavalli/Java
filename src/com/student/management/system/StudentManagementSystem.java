package com.student.management.system;

import java.util.Scanner;

public class StudentManagementSystem {

	public static String studentName[] = new String[100];
	public static int studentAge[] = new int[100];
	public static double marksObtainedInEnglish[] = new double[100];
	public static double marksObtainedInMath[] = new double[100];
	public static double marksObtainedInScience[] = new double[100];
	public static String grade[] = new String[100];
	public static int studentRollNo[] = new int[100];
	public static Scanner sc = new Scanner(System.in);
	public static int index = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option;
		while (true) {
			System.out.println("===================================");
			System.out.println("**** Student Management System ****");
			System.out.println("1. Add student");
			System.out.println("2. Get student information");
			System.out.println("3. Get all students information");
			System.out.println("4. Exit Application");
			System.out.println("===================================");
			System.out.println("Choose any option from 1-4:");
			option = sc.nextInt();

			switch (option) {
			case 1:
				addStudentInformation();
				break;
			case 2:
				getStudentInformation();
				break;
			case 3:
				getAllStudentInfo();
				break;
			case 4:
				exitApplication();
				break;
			}
		}
	}

	private static void exitApplication() {
		// TODO Auto-generated method stub
		System.out.println("Exiting Application");
		System.exit(0);
	}

	private static void getAllStudentInfo() {
		// TODO Auto-generated method stub
		System.out.println("All students info");
		for(int i=0; i<index;i++) {
			System.out.println("===================================");
			System.out.println("Student Name: " + studentName[i]);
			System.out.println("Student Age: " + studentAge[i]);
			System.out.println("Student Roll No: " + studentRollNo[i]);
			System.out.println("Marks obtained in English: " + marksObtainedInEnglish[i]);
			System.out.println("Marks obtained in Math: " + marksObtainedInMath[i]);
			System.out.println("Marks obtained in Sceince: " + marksObtainedInScience[i]);
			System.out.println("Student Grade: " + grade[i]);
			System.out.println("===================================");
		}
	}

	private static void getStudentInformation() {
		// TODO Auto-generated method stub
		System.out.println("Enter student index");
		int userIndex = sc.nextInt();
		System.out.println("===================================");
		System.out.println("Student Name: " + studentName[userIndex]);
		System.out.println("Student Age: " + studentAge[userIndex]);
		System.out.println("Student Roll No: " + studentRollNo[userIndex]);

		System.out.println("Marks obtained in English: " + marksObtainedInEnglish[userIndex]);
		System.out.println("Marks obtained in Math: " + marksObtainedInMath[userIndex]);
		System.out.println("Marks obtained in Sceince: " + marksObtainedInScience[userIndex]);

		System.out.println("Student Grade: " + grade[userIndex]);
		System.out.println("===================================");

	}

	private static void addStudentInformation() {
		// TODO Auto-generated method stub
		// Scanning values from console
		System.out.println("===================================");
		System.out.println("Enter student name: ");
		studentName[index] = sc.next();
		System.out.println("Enter student Age: ");
		studentAge[index] = sc.nextInt();
		System.out.println("Enter student Roll No: ");
		studentRollNo[index] = sc.nextInt();
		System.out.println("Enter student marks obtained in English: ");
		marksObtainedInEnglish[index] = sc.nextDouble();
		System.out.println("Enter student marks obtained in Math: ");
		marksObtainedInMath[index] = sc.nextDouble();
		System.out.println("Enter student marks obtained in Science: ");
		marksObtainedInScience[index] = sc.nextDouble();
		double percentage = (marksObtainedInEnglish[index] + marksObtainedInMath[index] + marksObtainedInScience[index])
				/ 3.0;
		System.out.println(percentage);
		if (percentage >= 95) {
			grade[index] = "A+";
		} else if (percentage >= 90) {
			grade[index] = "A";
		} else if (percentage >= 80) {
			grade[index] = "B+";
		} else if (percentage >= 75) {
			grade[index] = "B";
		} else if (percentage >= 70) {
			grade[index] = "C";
		} else if (percentage >= 60) {
			grade[index] = "D";
		} else {
			grade[index] = "F";
		}
		index++;
		System.out.println("Student added successfully!");
		System.out.println("===================================");
	}

}
