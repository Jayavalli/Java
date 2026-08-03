package como.string.demo;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Heelo world How are you?";
		
		String s1[] = data.split(" ");
		for(String temp: s1) {
			System.out.println(temp);
		}
		
		System.out.println(Arrays.toString(s1));
		

	}

}
