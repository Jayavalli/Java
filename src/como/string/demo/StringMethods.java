package como.string.demo;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data ="Apple";
		String data1 = "Apple";
		System.out.println(data.hashCode());
		System.out.println(data1.hashCode());
	
		//Equals and equalsIgnoreCase
		System.out.println(data.equalsIgnoreCase(data1));
		System.out.println(data.equals(data1));
		
		//length check
		System.out.println(data.length());
		
		//to lowercase
		System.out.println(data.toLowerCase());
		
		// to uppercase
		System.out.println(data.toUpperCase());
		
		//charAt() index needs to be passed;
		System.out.println(data.charAt(4));
		
		data1 = data+"sample123";
		
		//contains
		System.out.println(data1.contains("123"));
		System.out.println(data1.contains(data));
		
		// isEmpty()
		String data2 ="";
		System.out.println(data2.isEmpty());
		
		//trim()
		String data3 = "       Soda Buddi   ";
		System.out.println(data3);
		System.out.println(data3.trim());
		
		
		
		
	}

}
