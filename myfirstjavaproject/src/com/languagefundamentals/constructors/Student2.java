package com.languagefundamentals.constructors;

public class Student2 {
	int id;
	String name;

	Student2() {

		System.out.println("Student No arg Constructor Called!!");
		this.id = id;
		this.name = name;

	}

	Student2(int id) {
		System.out.println("Student 1 arg Constructor Called!!");
		this.id = id;
		this.name = name;

	}

	Student2(int id, String name) {
		System.out.println("Student 2 arg Constructor Called!!");
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		Student2 v1 = new Student2();
		v1.studentInfo();

		Student2 v2 = new Student2(233);
		v2.studentInfo();

		Student2 v3 = new Student2(233, "vinod");
		v3.studentInfo();

	}

	void studentInfo() {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("***********************************");
	}

}
