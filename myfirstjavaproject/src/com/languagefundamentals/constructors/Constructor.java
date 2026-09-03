package com.languagefundamentals.constructors;

class Constructor {
	Constructor(){
		System.out.println(" Parent no arg Constructor Called!!!");
	}
	static {
		System.out.println("hii");
		
	}
	{
		System.out.println("Hello");
	}
	

	

}
class Constructor1 extends Constructor{
	Constructor1(){
		System.out.println("Child no arg constructor Called!!!");
	}
	static {
		System.out.println("hii1");
	}
	{
		System.out.println("hello1");
	}
	public static void main(String[] args) {
		Constructor1 v = new Constructor1();
	}
}
