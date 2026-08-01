package com.conditional;

public class MaxOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 134;
		int j = 44;
		
		if (i>j)
			System.out.println("Max is :" + i);
		else
			System.out.println("max is :" + j);
		
		//ternary operator
		System.out.print(i>j?i:j);
	}

}
