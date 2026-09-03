package com.logicalconditionalstatements;

import java.util.Scanner;

public class CricketerInfo {

	public static void main(String[] args) {
		System.out.println("Welcome To Indian Cricket Team");
		Scanner sc = new Scanner(System.in);
		
		char choice;
		do {
			System.out.println("Enter the Jersy No: ");
			int  jersyNo = sc.nextInt();
			
			switch(jersyNo){
			case 1 -> {
				System.out.println("KL Rahul");
				System.out.println("Klassy Player");
			}
			case 18 ->{
				System.out.println("Virat Kohli");
				System.out.println("Consistency Player");
			}
			case 7 ->{
				System.out.println("M S Dhoni ");
				System.out.println("Cool Captain");
			}
			case 77 ->{
				System.out.println("Subhman Gill");
				System.out.println("Prince");
			}
			case 8->{
				System.out.println("Jadeja");
				System.out.println("Best All Rounder");
			}
			default ->{
				System.out.println("Invalid Jersy Number");
			}
			
		}
			System.out.println("\nDo you want to continue? (Y/N)");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nThank You!");
        System.out.println("Program Exited.");

        sc.close();
			
			
		

	
	}
}
	
