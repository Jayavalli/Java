package com.calculation;

public class MedthoOverloadding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addNumber(10,5));
		System.out.println(addNumber(10.5,30));
		System.out.println(addNumber(30,10.5));
		
		helloNumber(10,50);
		int i =9;
		int j =10;
		helloNumber(i, j);

	}

	private static double addNumber(int d, double e) {
		return d+e;	}

	private static double addNumber(double d, int j) {
		return d+j;	}

	private static double addNumber(int i, int j) {
		return i+j; }
	
	public static void helloNumber(int j, int i) {
		System.out.println("int: "+j);
		System.out.println("second int: "+i);
	}

}
