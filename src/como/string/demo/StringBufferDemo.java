package como.string.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Hello World");
		System.out.println(sb.length());
		
		System.out.println(sb.capacity());
		
		sb.append("Java world");
		System.out.println(sb);
		
		sb.insert(3, "Jaya program");
		System.out.println(sb);
		
		System.out.println(sb.charAt(11));
		
		sb.delete(3, 14);
		System.out.println(sb);
		
		sb.deleteCharAt(6);
		System.out.println(sb);
		
		// ---7
		
		System.out.println(sb.lastIndexOf("e"));
		
		System.out.println(sb.indexOf("e"));
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.replace(3, 6, "Sample project"));
		
	}

}
