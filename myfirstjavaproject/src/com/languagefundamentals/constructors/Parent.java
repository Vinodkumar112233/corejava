package com.languagefundamentals.constructors;

public class Parent {
	Parent(int x,String a){
		System.out.println("Hii");
		System.out.println(x);
		System.out.println(a);
	}

	public static void main(String[] args) {

	}

}
class Child extends Parent{
	Child(){
		super(100,"vinod");
		System.out.println("bye");
	}
	public static void main(String[] args) {
		Child v1 = new Child();
	}
	
}
