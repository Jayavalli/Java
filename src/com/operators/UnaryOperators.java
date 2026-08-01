package com.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = -a;
		System.out.println(b);
		int c = --a;
		System.out.println("pre-decrement" + c);
		System.out.println("pre-decrement of a" + a);
		c = a--;
		System.out.println("post-decrement" + c);
		System.out.println("post-decrement of a" + a);
		
		int d = ++a;
		System.out.println("pre-increment" + d);
		System.out.println("pre-increment of a" + a);
		c = a++;
		System.out.println("post-increment" + d);
		System.out.println("post-increment of a" + a);
		
		boolean isStatus = false; 
		System.out.println(!isStatus);
		
		
	}

}
