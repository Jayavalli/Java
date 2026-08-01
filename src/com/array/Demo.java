package com.array;

public class Demo {

	public static void main(String[] args) {
		 int x =10;
		 int marks[] = new int[10];
		 marks[0]= 20;
		 marks[3]= 50;
		 
		 for(int temp : marks) {
			 System.out.println(temp);
		 }
		 
		 char letters[] = new char[5];
		 letters[0]='A';
		 letters[1]='C';
		 for(int i=0; i<=letters.length-1; i++) {
			 System.out.println(letters[i]+"Letters");
		 }

	}

}
