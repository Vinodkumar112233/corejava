package com.oops.Loanapp;

import java.util.Scanner;

public class Loan {

	static Scanner sc = new Scanner(System.in);

	double getEmployeeSalary() {
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		return salary;

	}

	int getCibilScore() {
		System.out.println("Enter Your cibil Score : ");
		int cibil = sc.nextInt();
		return cibil;
	}

	double getROI() {
		double roi = 14.0;
		int cibil = getCibilScore();

		if (cibil > 800 && cibil <= 900) {
			System.out.println("Excellent : Strong Credit profile, best loan Terms.");
			roi = roi - 5;

		} else if (cibil > 760 && cibil <= 800) {
			System.out.println("Very Good : High Approval chances, competetive rates. ");
			roi -= 4;
		} else if (cibil > 700 && cibil <= 760) {
			System.out.println("Good : Eligible for most loans with decent terms. ");
			roi -= 3;
		} else if (cibil > 600 && cibil <= 700) {
			System.out.println("Average: May get loans but higher interest. ");
			roi -= 1;
		} else if (cibil >= 300 && cibil <= 600) {
			System.out.println("Poor : High risk: loan Application often rejected . ");

		} else {
			System.out.println("Invalid Cibil !!");
		}
		return roi;
	}

	boolean isAdharValid() {
		System.out.println("Enter Your Adhar card Number : ");
		String aadhar = sc.next();
		boolean aadharStatus = aadhar.matches("[2-9]{1}[0-9]{11}");
		return aadharStatus;
	}

	boolean isPanValid() {
		System.out.println("Enter your PAN number: ");
		String pan = sc.next();
		boolean panStatus = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return panStatus;
	}

	boolean isPhoneValid() {
		System.out.println("Enter Your Phone Number: ");
		String phone = sc.next();
		boolean phoneStatus = phone.matches("[6-9]{1}[0-9]{9}");
		return phoneStatus;
	}

}
