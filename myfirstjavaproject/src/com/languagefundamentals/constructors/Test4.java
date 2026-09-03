package com.languagefundamentals.constructors;

public class Test4 {
	Test4(){
		System.out.println("p1");
	}
	Test4(int x){
		System.out.println("P2"+x);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Test5 extends Test4{
	Test5(){
		System.out.println("c1");
		this(100);
	}
	Test5(int x){
		super(x);
		System.out.println("C2"+x);
	}
	public static void main(String[] args) {
		Test5 v1 = new Test5();
	}
	
	
}
