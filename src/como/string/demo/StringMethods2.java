package como.string.demo;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String data = "Hello World!";
		 
		 //subString is method overloading (includes, excludes)
		 System.out.println(data.substring(3));
		 System.out.println(data.substring(2,6));
		 
		 //indexOf any character
		 System.out.println(data.indexOf('W'));
		 System.out.println(data.indexOf("ell"));
		 System.out.println(data.indexOf("hl"));
		 
		 // last index of any character
		 System.out.println(data.lastIndexOf("e"));
		 
		 //replace any string
		 System.out.println(data.replace("ello", "zzwewr"));

	}

}
