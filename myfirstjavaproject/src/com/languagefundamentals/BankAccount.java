package com.languagefundamentals;
import java.util.Scanner;

public class BankAccount {
	static Scanner sc = new Scanner(System.in);
	long accountNumber;
    String customerName;
    double balance;
    double anotherAccountBalance;
    
    double deposit(double depositMoney) {
    	balance +=depositMoney;
    	return balance;
    }
	double withDraw(double withDrawMoney) {
		balance -= withDrawMoney;
		return balance;
	}
	void transfer(double amount) {
		balance = balance - amount;
		anotherAccountBalance = amount;
		System.out.println("After Transfer the money Balace is :"+balance);
		System.out.println("Another Account Balance is :"+anotherAccountBalance);
		
	}
	double interest(double rate) {
		return (balance*rate)/100;
	}
	public static void main(String[] args) {
		BankAccount v1 = new BankAccount();
		System.out.println("Enter the Account Number: ");
		v1.accountNumber = sc.nextLong();
		System.out.println("Enter the Customer Name: ");
		v1.customerName = sc.next();
		System.out.println("Enter the Balance: ");
		v1.balance = sc.nextDouble();
		
//		deposited money:
		System.out.println("Enter the deposited Money: ");
		double depositMoney = sc.nextDouble();
		System.out.println("Updated Money After Deposited Money: "+v1.deposit(depositMoney));
		
//		Withdraw Money: 
		System.out.println("Enter the Withdraw Money: ");
		double withDrawMoney = sc.nextDouble();
		System.out.println("Updated Money After Withdraw Money: "+v1.withDraw(withDrawMoney));
//		transfer Money: 
		v1.transfer(10000);
		
//		interest:
		System.out.println("Enter the Rate: ");
		double interest = sc.nextDouble();
		System.out.println("Interest: "+v1.interest(interest));
		
		BankAccount v2 = new BankAccount();
		System.out.println("Enter the Account Number: ");
		v2.accountNumber = sc.nextLong();
		System.out.println("Enter the Customer Name: ");
		v2.customerName = sc.next();
		System.out.println("Enter the Balance: ");
		v2.balance = sc.nextDouble();
		
//		deposited money:
		System.out.println("Enter the deposited Money: ");
		double depositMoney2 = sc.nextDouble();
		System.out.println("Updated Money After Deposited Money: "+v2.deposit(depositMoney2));
		
//		Withdraw Money: 
		System.out.println("Enter the Withdraw Money: ");
		double withDrawMoney2 = sc.nextDouble();
		System.out.println("Updated Money After Withdraw Money: "+v2.withDraw(withDrawMoney2));
//		transfer Money: 
		v2.transfer(10000);
		
//		interest:
		System.out.println("Enter the Rate: ");
		double interest2 = sc.nextDouble();
		System.out.println("Interest: "+v2.interest(interest2));
		
	


		
	}
}
