package com.languagefundamentals.constructors;

public class College {
	String collegeName;
	String location;
	int studentCount;

	College() {
		collegeName = "kiet";
		location = "Kakinada";
		studentCount = 2000;

	}

	public static void main(String[] args) {
		College v1 = new College();
		v1.collegeInfo();

	}

	void collegeInfo() {
		System.out.println("College Name: " + collegeName);
		System.out.println("College Location: " + location);
		System.out.println("Total Students: " + studentCount);
	}

}
