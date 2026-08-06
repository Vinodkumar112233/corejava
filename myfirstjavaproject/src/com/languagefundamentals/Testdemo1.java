package com.languagefundamentals;

public class Testdemo1 {
//	Implicit Type Conversion
	byte v = 123;
//	explicit Type Conversion
	byte v1 = (byte) 150;

	short a = v;
	short a1 = (short) 44444444;

	int b = a;
	int b1 = (int) 21.4;

	long c = b;
	long c1 = (long) 34.6666;

	float d = b;
	float d1 = (float) b;

	double e = b;
	double e1 = (double) 34;

	char f = 70;
	char f1 = 'r';

//	boolean g = True;
//	boolean g1 = False;

	boolean g2 = true;
	boolean g3 = false;

//	boolean g4 = 0;
//	boolean g5 = 1;
//	
//	boolean g6 = TRUE;
//	boolean g7 = FALSE;

//	String h;

	public static void main(String[] args) {
		Testdemo1 type = new Testdemo1();
		System.out.println(type.v);
		System.out.println(type.v1);
		System.out.println(type.a);
		System.out.println(type.a1);
		System.out.println(type.b);
		System.out.println(type.b1);
		System.out.println(type.c);
		System.out.println(type.c1);
		System.out.println(type.d);
		System.out.println(type.d1);

		System.out.println(type.e);
		System.out.println(type.e1);

		System.out.println(type.f);
		System.out.println(type.f1);

		System.out.println(type.g2);
		System.out.println(type.g3);

	}

}
