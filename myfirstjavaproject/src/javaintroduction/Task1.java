package javaintroduction;

public class Task1 {
	static void method1(){
		method2();
		System.out.println("method1 callled");
		
	}
	static void method2() {
		Task1 v = new Task1();
		v.method3();
				
		System.out.println("method2 called");
	}
	void method3() {
		method4();
		System.out.println("method3 called");
	}
	void method4() {
		System.out.println("method4 called");
	}
	public static void main(String[] args) {
		method1();
		
		
		
		
	}

}
