package com.languagefundamentals.constructors;

public class Movie {
	String movieName;
	String genre;
	long budget;
	Movie(){
		System.out.println("No arg Constructor Called!!");
		movieName = "RRR";
		genre = "History";
		budget = 20000000;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie v1 = new Movie();
		v1.movieInfo();
		

	}
	void movieInfo() {
		System.out.println("Movie Name: "+movieName);
		System.out.println("Movie Genre: "+genre);
		System.out.println("Movie Budget: "+budget);
	}

}
