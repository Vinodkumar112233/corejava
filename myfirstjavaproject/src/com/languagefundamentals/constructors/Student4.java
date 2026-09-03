package com.languagefundamentals.constructors;

public class Student4 {
	int id;
	String name;
	
	Student4(){
		this(20);
		System.out.println("No arg Constructor Called!!1");
		
	}
	Student4(int id){
		this(id,"vinod");
		this.id = id;
		this.name = name;
		System.out.println("1 arg Constructor Called!!!");
		
	}
	Student4(int id,String name){
		this.id = id;
		this.name = name;
		System.out.println("2 arg Constructor Called!! ");
		
		
	}
	void studentInfo() {
		System.out.println("Student Id :"+id);
		System.out.println("Student Name: "+name);
	}

	public static void main(String[] args) {
		Student4 v1 = new Student4();
		v1.studentInfo();

	}

}
