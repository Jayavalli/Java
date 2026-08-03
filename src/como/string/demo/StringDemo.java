package como.string.demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =10;
		int y =10;
		System.out.println(x==y);
		
		String name = "Jaya";
		String name2 = "Jaya";
		String name3 = "JAya";
		System.out.println(name==name2);
		System.out.println(name.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name==name3);
		System.out.println(name.hashCode());
		System.out.println(name3.hashCode());
		

	}

}
