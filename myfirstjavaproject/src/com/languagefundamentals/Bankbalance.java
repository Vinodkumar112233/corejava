package com.languagefundamentals;
import java.util.Scanner;

public class Bankbalance {
	double balance = 5000;
	static Scanner sc = new Scanner(System.in);
	
	void checkbalance() {
		System.out.println("Total balance: "+balance);
	}
	void depositMoney(double deposit) {
		if (deposit>0) {
			balance += deposit;
		}else {
			System.out.println("Invalid Desposit");
		}
		checkbalance();
		
	}
	
	void withDrawMoney(double wMoney) {
		if(wMoney<balance) {
			balance -= wMoney;
		}else {
			System.out.println("Invalid Withdraw");
		}
		checkbalance();
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Bankbalance v1 = new Bankbalance();
		
		System.out.println("Enter deposit Money");
		double deposit = sc.nextDouble();
		v1.depositMoney(deposit);
		
		System.out.println("Enter Withdraw Money");
		double wMoney = sc.nextDouble();
		v1.withDrawMoney(wMoney);
		

	}

}
