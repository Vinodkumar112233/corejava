package javaintroduction;

public class Testdemo11 {
	void hello() {
		System.out.println("hello bro");
	}
	static void welcome() {
		System.out.println("welcome to java");
	}
	public static void main(String[] args) {

		System.out.println("main method started");
		welcome();
		Testdemo11 vinod = new Testdemo11();
		vinod.hello();
		
		System.out.println("main method ended");
		
	}

}
