package com.languagefundamentals.constructors;

class Demo {

    Demo() {
    	this(10);
    	
    	
    }

    Demo(int x) {
        System.out.println(x);
    }
    public static void main(String[] args) {
    	Demo v = new Demo();
    }
}
