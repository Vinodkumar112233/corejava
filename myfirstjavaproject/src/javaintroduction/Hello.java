package javaintroduction;

public class Hello {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Class.forName("javaintroduction.Welcome"));
		System.out.println(Class.forName("java.lang.System"));
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));

	
	}

}
