package com.oops.Copy;

class Address1 {
	String city;

	Address1(String city) {
		this.city = city;
	}

	Address1(Address1 a) {
		this.city = a.city;
	}

}

class Student {
	int id;
	String name;
	double marks;
	Address1 address1;

	Student(int id, String name, double marks, Address1 address1) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address1 = address1;
	}

	Student(Student s) {
		this.id = s.id;
		this.name = s.name;
		this.marks = s.marks;
		this.address1 = new Address1(s.address1);
	}
}

public class TestDemoDeepCopy1 {

	public static void main(String[] args) {
		Address1 a1 = new Address1("Vizag");
		Student s1 = new Student(1, "vinod", 100, a1);

		Student s2 = new Student(s1);

		System.out.println(" Before Modification ");
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.marks);
		System.out.println(s1.address1.city);

		System.out.println("                                                       ");
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.marks);
		System.out.println(s2.address1.city);
		
		
		s2.id = 2;
		s2.name = "Hemanth";
		s2.marks = 99;
		s2.address1.city = "Viajayanagaram";

		System.out.println("****************************************************");

		System.out.println("After Modification ");

		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.marks);
		System.out.println(s1.address1.city);

		System.out.println("                                                       ");

		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.marks);
		System.out.println(s2.address1.city);

	}

}
