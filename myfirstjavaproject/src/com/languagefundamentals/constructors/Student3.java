package com.languagefundamentals.constructors;

public class Student3 {
	int id;
	String name;

	Student3() {

		System.out.println("Student No arg Constructor Called!!");
		this.id = id;
		this.name = name;

	}

	Student3(int id) {
		System.out.println("Student 1 arg Constructor Called!!");
		this.id = id;
		this.name = name;

	}

	Student3( String name,int id) {
		System.out.println("Student 2 arg Constructor Called!!");
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		Student3 v1 = new Student3();
		v1.studentInfo();

		Student3 v2 = new Student3(233);
		v2.studentInfo();

		Student3 v3 = new Student3("vinod",33);
		v3.studentInfo();

	}

	void studentInfo() {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("***********************************");
	}

}
