package com.languagefundamentals.constructors;

public class StudentData {
	int studentId;
	String name;
	int marks;
	
	StudentData(){
		System.out.println("No arg Constructor Called!!!");
		
	}
	StudentData(int studentId){
		this.studentId = studentId;
	}
	StudentData(int studentId,String name){
		this.studentId = studentId;
		this.name = name;
		
	}
	StudentData(int studentId,String name,int marks){
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
		
	}
	void studentDataInfo() {
		System.out.println("************************************");
		System.out.println("Student Id : "+studentId);
		System.out.println("Student Name: "+name);
		System.out.println("Student Marks: "+marks);
	}

	public static void main(String[] args) {
		StudentData v1 = new StudentData();
		v1.studentDataInfo();
		
		StudentData v2 = new StudentData(234,"vinod");
		v2.studentDataInfo();
		
		StudentData v3 = new StudentData(234,"vinod",100);
		v3.studentDataInfo();
		
		
		

	}

}
