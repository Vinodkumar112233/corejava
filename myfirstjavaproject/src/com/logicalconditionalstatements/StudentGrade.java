package com.logicalconditionalstatements;

import java.util.Scanner;

public class StudentGrade {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Student Marks: ");
		double marks = sc.nextDouble();
		
		if (marks >=90) {
			System.out.println("Grade A");
			
		}
		else if (marks >= 80) {
			System.out.println("Grade B");
			
			
		}
		else if(marks >= 70) {
			System.out.println("Grade c");
		}
		else if(marks >= 60) {
			System.out.println("Grade D");
			
		}else if(marks >= 50) {
			System.out.println("Grade E");
		}else if(marks >= 40) {
			System.out.println("Just Passed!!!");
		}else {
			System.out.println("FaiL");
		}
		
		
		
		

	}

}
