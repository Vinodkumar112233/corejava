package com.languagefundamentals.constructors;



//Create 5 objects and print how many objects were created.
public class ObjectCount {
	static int n = 0;
	ObjectCount(){
		n++;
		
	}

	public static void main(String[] args) {
		ObjectCount v1 = new ObjectCount();
		ObjectCount v2 = new ObjectCount();
		ObjectCount v3 = new ObjectCount();
		ObjectCount v4 = new ObjectCount();
		ObjectCount v5 = new ObjectCount();
		
		System.out.println("Total Objects: "+n);
		

	}

} 