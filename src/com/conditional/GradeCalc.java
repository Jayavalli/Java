package com.conditional;

public class GradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int percentage = 60;
		char grade;
		if(percentage >90)
			grade = 'A';
		else if (percentage>=80 && percentage<=90)
			grade = 'B';
		else if (percentage>=70 && percentage<80)
			grade='C';
		else 
			grade='D';
		
		System.out.println("grade is: " +grade);
			
			

	}

}
