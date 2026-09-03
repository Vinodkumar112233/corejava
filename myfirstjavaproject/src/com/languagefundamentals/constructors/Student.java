package com.languagefundamentals.constructors;

public class Student {
	int id;
	String name;
	int marks;
	int height;
	String location;
	Student(){
		System.out.println("no - arg constructor called");
		id = 123;
		name = "vinod";
		marks = 200;
		height = 175;
		location = "hyd";
	}
	Student(int id,String name,String location){
		System.out.println("parameterised constructor");
		this.id = id;
		this.name = name;
		this.location = location;
	}
	void studentInfo() {
		System.out.println("Student id: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("Student Marks: "+marks);
		System.out.println("Student Height: "+height);
		System.out.println("Student Location: "+location);
		System.out.println("***************************************************************");
	}
	 

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Student s1 = new Student();
		s1.studentInfo();
		Student s2 = new Student(101,"hemanth","hyd");
		s2.studentInfo();
		

	}

}
