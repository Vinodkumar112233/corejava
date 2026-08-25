package com.languagefundamentals;

public class Testdemo11 {
//	No return type + No parameters :
	void show() {
		System.out.println("hii");

	}

//	No return type + With Parameters:
	void addition(String a, String b) {
//		int sum = a + b;
		System.out.println(a +" is a "+ b);
	}

//	return type + No parameters:

	String number() {
//		int a = 200;
//		int b = 500;

		return "vinod";

	}
	
//	return type with Parameters:
	int  calculation(int a, int b) {
		return a+b;
		
		
	}

	public static void main(String[] args) {
		Testdemo11 v = new Testdemo11();
		Testdemo11 v1 = new Testdemo11();
		Testdemo11 v2 = new Testdemo11();
		Testdemo11 v3 = new Testdemo11();

		v.show();

		v1.addition("vinod", "goodboy");
		
//		double value = v2.number();

		System.out.println(v2.number());
		System.out.println(v3.calculation(12, 22));
		
		

	}

}
