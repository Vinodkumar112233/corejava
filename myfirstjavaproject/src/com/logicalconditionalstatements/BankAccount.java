package com.logicalconditionalstatements;
import java.util.Scanner;

public class BankAccount {
	double balance = 50000;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		
		System.out.println("Enter the Deposit Money: ");
		double depositMoney = sc.nextDouble();
		a.deposit(depositMoney);
		
		
		System.out.println("Enter the Withdraw Money: ");
		double withdrawAmount = sc.nextDouble();
		a.withDraw(withdrawAmount);

	}
	void checkBalance() {
		System.out.println("Total Balance: "+balance);
	}
	
	void deposit(double depositMoney) {
		if (depositMoney >0) {
			balance += depositMoney;
			checkBalance();
		}else {
			System.err.println("Deposit money is nill");
			System.out.println("Please Check the Balance: ");
			checkBalance();
		}
	
		}
	void withDraw(double withdrawAmount) {
		if (withdrawAmount<=100000 && withdrawAmount <= balance) {
			balance -= withdrawAmount;
			checkBalance();
		}else {
			System.out.println("Insufficient Money");
			System.out.println("Please Chech The Balance: ");
			checkBalance();
		}
		System.out.println("Thank for Choosing VBanking!!!!!!!!!!!!!!!!");
	}
		
	}


