package com.languagefundamentals;
import java.util.Scanner;
public class Testdemo22 {
	static Scanner sc = new Scanner(System.in);
//	void studentInfo(String name, int id) {
//		System.out.println("Name of the Student: "+name);
//		System.out.println("Student Id: "+id);
//	}
	
	void movieInfo(String movieName, int released_Year,String genere) {
		System.out.println("Movie Name: "+movieName);
		System.out.println("Released Year: "+released_Year);
		System.out.println("Movie Genere: "+genere);
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the Movie Name: ");
		String  movieName = sc.nextLine();
		
		System.out.println("Enter the Released Year: ");
		int released_Year = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Movie Genere: ");
		String genere = sc.nextLine();
		
		
		Testdemo22 v = new Testdemo22();
		v.movieInfo(movieName, released_Year, genere);
		

	}

}
