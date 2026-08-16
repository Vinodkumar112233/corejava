package com.languagefundamentals;

public class Testdemo1 {
//	Implicit Type Conversion
	byte v = 123;
//	explicit Type Conversion
	byte v1 = (byte) 150;
	byte v2 = 'a';

	short a = v;
	short a1 = (short) 44444444;
	short a2 = 'z';

	int b = 'a';
	int b1 = (int) 21.4;

	long c = b;
	long c1 = (long) 34.6666;
	long c2 = 'z';

	float d = b;
	float d1 = (float) b;
	float d2 = 'a';

	double e = b;
	double e1 = (double) 34;
	double e2 = 'z';

	char f = 122;
	char f1 = 'a';

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
		System.out.println(type.v2);
		
		System.out.println(type.a);
		System.out.println(type.a1);
		System.out.println(type.a2);
		
		System.out.println(type.b);
		System.out.println(type.b1);
		
		System.out.println(type.c);
		System.out.println(type.c1);
		System.out.println("ascii:"+type.c2);
		
		System.out.println(type.d);
		System.out.println(type.d1);
		System.out.println("A:"+type.d2);

		System.out.println(type.e);
		System.out.println(type.e1);
		System.out.println("Z:"+type.e2);

		System.out.println(type.f);
		System.out.println(type.f1);

		System.out.println(type.g2);
		System.out.println(type.g3);

	}

}
