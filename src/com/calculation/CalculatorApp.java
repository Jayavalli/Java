package com.calculation;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1 = 100;
		int num2 = 20;
		System.out.println(calculateSum(num1,num2));
		
		double result = calculateMutliply(20,100);
		System.out.println(result);
	}
	
	public static double calculateSum(double number1, double number2) {
		return number1+number2;
	}
	
	public static double calculateMutliply(double number1, double number2) {
		return number1*number2;
	}
	public static double calculateSub(double number1, double number2) {
		return number1-number2;
	}
	public static double calculateDivision(double number1, double number2) {
		return number1/number2;
	}
	
	
	
	

}
