package com.languagefundamentals;

public class CountofObjects {
	static int n=0;
	{
		 n++;
	}
	

	public static void main(String[] args) {
		CountofObjects v1 = new CountofObjects();
		CountofObjects v2 = new CountofObjects();
		CountofObjects v3 = new CountofObjects();
		CountofObjects v4 = new CountofObjects();
		System.out.println("Count Of Objects: "+n);
		

	}

}
