package com.languagefundamentals.constructors;
import java.util.Scanner;

public class BankAccount1 {
	static Scanner sc = new Scanner(System.in);
	int accountNumber;
	String holderName;
	double balance;
	
	BankAccount1(int accountNumber,String holderName,double balance){
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		
		
	}
	
	double deposit() {
		System.out.println("Enter Deposit Money: ");
		 double deposit = sc.nextDouble();
		 
		 balance += deposit;
		 return balance ;
		
	}
	double withDraw() {
		System.out.println("Enter the withdraw Money: ");
		double withdraw = sc.nextDouble();
		balance -= withdraw;
		return balance;
	}
	
	void accountInfo() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+holderName);
		System.out.println("Account Balance: "+balance);
		System.out.println("Deposit Money :"+deposit());
		System.out.println("Withdraw Money: "+withDraw() );
	}

	public static void main(String[] args) {
		BankAccount1 v = new BankAccount1(123,"vinod",50000);
		v.accountInfo();
		
		

	}

}
