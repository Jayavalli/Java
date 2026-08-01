package com.array;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j[][] = new int[3][];
		j[0] = new int[] {10,20,30};
		j[1] = new int[] {30,40,50,60};
		j[2] = new int[] {10};
		
		for(int i=0; i<=j.length-1;i++) {
			for(int k=0;k<=j[i].length-1;k++) {
				System.out.print(j[i][k]+" ");
			}
			System.out.println("");
		}
		

	}

}
