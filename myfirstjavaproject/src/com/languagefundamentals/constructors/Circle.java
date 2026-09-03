package com.languagefundamentals.constructors;

class Shape{
	String name;
	String area;
	Shape(String name,String area){
		System.out.println("Parameterised Constructor Called!!");
		this.name = name;
		this.area = area;
	}
}
public class Circle  extends Shape{
	Circle(){
		super("circle","PIr*r");
		shapeInfo();
		System.out.println("Yes it is Circle");
	}

	public static void main(String[] args) {
		Circle v1 = new Circle();

	}
	void shapeInfo() {
		System.out.println("Shape Name: "+name);
		System.out.println("Area:"+area);
	}

}
