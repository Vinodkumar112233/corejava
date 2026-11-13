package com.oops;

class Person {
	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	void displayInfo() {
		System.out.println("ID : " + id);
		System.out.println("Name: " + name);

	}
}

class Student extends Person {

	Student(int id, String name) {
		super(id, name);
	}

	void enrollClass(String className) {
		System.out.println(name + " Enroll the " + className);
	}

}

class Teacher extends Person {

	Teacher(int id, String name) {
		super(id, name);
	}

	void assignGrade(String studentName, String grade) {
		System.out.println(name + " assigned grade " + grade + " to " + studentName);
	}

}

class Staff extends Person {

	Staff(int id, String name) {
		super(id, name);
	}

	void manageRecords() {
		System.out.println(name + " is mnaging school records.");
	}

}

public class Testdemo2 {

	public static void main(String[] args) {
		Student s1 = new Student(101, "vinod");
		Teacher t1 = new Teacher(201, "Rahul");
		Staff st1 = new Staff(301, "hemanth");

		System.out.println("-------Student Details--------");
		s1.displayInfo();
		s1.enrollClass(" java Programming ");

		System.out.println("------- Teacher Details -----");
		t1.displayInfo();
		t1.assignGrade("Vinod", "A");

		System.out.println("------- Staff Details -----");
		st1.displayInfo();
		st1.manageRecords();
	}
}
