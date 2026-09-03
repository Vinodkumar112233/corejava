package com.languagefundamentals.constructors;

public class Book {
	int id;
	String name;
	String author;

	Book() {
		System.out.println("Book No arg constuctor Called!!!!");
		this.id = id;
		this.name = name;
		this.author = author;
	}

	Book(int id) {
		System.out.println("Book 1 arg constuctor Called!!!!");

		this.id = id;
		this.name = name;
		this.author = author;

	}

	Book(int id, String name) {
		System.out.println("Book 2 arg constuctor Called!!!!");

		this.id = id;
		this.name = name;
		this.author = author;

	}

	Book(int id, String name, String author) {
		System.out.println("Book 3 arg constuctor Called!!!!");

		this.id = id;
		this.name = name;
		this.author = author;
	}
	void bookInfo() {
		
		System.out.println("Book id : "+id);
		System.out.println("Book Name : "+name);
		System.out.println("Author of the Book: "+author);
		System.out.println("*********************");
		
	}

	public static void main(String[] args) {
		Book v1 = new Book();
		v1.bookInfo();
		
		Book v2 = new Book(101);
		v2.bookInfo();
		
		Book v3 = new Book(101,"The Nation");
		v3.bookInfo();
		
		Book v4 = new Book(101,"The Nation","Vinod");
		v4.bookInfo();
		
		
		
		

	}

}
