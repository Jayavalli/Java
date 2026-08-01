package com.loops;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=5; i++) 
		{
			System.out.println(" ");
			for(int j=0;j<=i;j++)
			{
				System.out.print(" * ");
			}
		}
		System.out.println("Simple for loop");
		
		//simple for loop
		int i=10;
		for(; i>=1;i--)
			System.out.print(i);
		System.out.println(i);

	}

}
