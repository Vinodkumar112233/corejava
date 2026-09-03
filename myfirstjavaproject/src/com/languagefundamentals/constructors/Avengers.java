package com.languagefundamentals.constructors;

public class Avengers {
	int id;
	String name;
	String strength;
	double height;
	
	Avengers(int id,String name,String strength,double height){
		System.out.println("Parameterized Constructor Called");
		this.id = id;
		this.name = name;
		this.strength = strength;
		this.height = height;
	}
	public static void main(String[] args) {
		Avengers v1 = new Avengers(1,"Captain America","Physique",6.2);
		v1.avengersInfo();
		
		Avengers v2 = new Avengers(2,"Iron man","suit",5.9);
		v2.avengersInfo();
		
		Avengers v3 = new Avengers(3,"Spyder man","Webs",5.7);
		v3.avengersInfo();
		
		Avengers v4 = new Avengers(4,"Thor","Axe",6.4);
		v4.avengersInfo();
		

	}
	void avengersInfo() {
		System.out.println("*********************************************");
		System.out.println("Avenger Id: "+id);
		System.out.println("Avenger Name: "+name);
		System.out.println("Avenger Strength: "+strength);
		System.out.println("Avenger Height: "+height);
		System.out.println("---------------------------------------------");
		}

}
