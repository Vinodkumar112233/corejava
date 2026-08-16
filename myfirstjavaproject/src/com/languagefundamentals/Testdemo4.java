package com.languagefundamentals;

public class Testdemo4 {
	Integer studentId;
	String studentName;
	Character gender;
	String branchName;
	String collegeName;
	void studentDetails() {
		System.out.println("StudentId: "+studentId);
		System.out.println("StudentName: "+studentName);
		System.out.println("Student Gender: "+gender);
		System.out.println("Student Branch: "+branchName);
		System.out.println("Student Colleg Name: "+collegeName);
	}
	
	

	public static void main(String[] args) {
		Testdemo4 v = new Testdemo4();
		v.studentId = 1;
		v.studentName = "Vinod";
		v.gender = 'M';
		v.branchName = "Csm";
		v.collegeName = "Kiet";
		
		v.studentDetails();
		System.out.println("--------------------------------------------------------------------");
		
		
	
		Testdemo4 v1 = new Testdemo4();
		v1.studentId = 7;
		v1.studentName = "Hemanth";
		v1.gender = 'F';
		v1.branchName = "Csm";
		v1.collegeName = "Kiet";
		
		v1.studentDetails();
		System.out.println("----------------------------------------------------------------------");
		
		
		

	}

}
