package com.operators;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Intial a ="+a);
		System.out.println("Intial b ="+b);
		
		// using temp
		int temp =a;
		a=b;
		b=temp;
		System.out.println("After swap with temp a ="+a);
		System.out.println("After swap with temp b ="+b);
		
		// without using temp; arthimetic operator
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("After swap with + a ="+a);
		 System.out.println("After swap with + b ="+b);
		 
		 // with bitwise operator
		 
		 a=a^b;
		 b=a^b;
		 a=a^b;
		 System.out.println("After swap with ex-or a ="+a);
		 System.out.println("After swap with ex-or b ="+b);

	}

}
