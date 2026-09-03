package com.languagefundamentals.constructors;

public class Test1 {
	Test1(){
		this(10);
		System.out.println("No arg Constructor");
		System.out.println("hii broo");
	}
	Test1(int x){
		this(22,"vinod");
		System.out.println("1 arg Constructor");
		System.out.println(x);
	}
	Test1(int y , String a){
		System.out.println("2 arg Constructor");
		System.out.println(y);
		System.out.println(a);
	}

	public static void main(String[] args) {

	}

}
class Test2 extends Test1{
	Test2(){
		System.out.println("bye");
	}
	public static void main(String[] args) {
		Test2 v1 = new Test2();
	}
	
	
}
