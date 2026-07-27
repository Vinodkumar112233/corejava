package javaintroduction;

public class Abc {
	void method1() {
		System.out.println("hii");
		method2();
		
	}
	void method2() {
		System.out.println("hello");
		method3();
		
	}
	void method3() {
		System.out.println("bro");
		method4();
		
	}
	void method4() {
		System.out.println("goodmorning");
		
	}
	static {
     Abc v = new Abc();
     v.method1();
		
	}


	public static void main(String[] args) {
		System.out.println();
		
	} 

}
