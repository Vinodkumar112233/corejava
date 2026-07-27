package javaintroduction;

public class Arithmetic {

	static Arithmetic v = new Arithmetic();
	static void addition(){
		int a = 20;
		int b = 30;
		System.out.println("Addition: "+(a+b));
		subtraction();
		
		
	}
	static void subtraction() {
		int a = 20;
		int b = 30;
				
		System.out.println("Subtraction: "+(a-b));
		
		v.multiplication();
			}
	void multiplication() {
		int a = 20;
		int b = 30;
		System.out.println("Multiplication: "+(a*b));
		division();
		
	}
	void division() {
		int a = 20;
		int b = 30;
		System.out.println("Division: " +(a/b));
		
	}
	public static void main(String[] args) {
		addition();
		
		
		
		
	}

}