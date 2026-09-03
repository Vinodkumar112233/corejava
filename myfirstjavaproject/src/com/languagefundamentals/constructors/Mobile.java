package com.languagefundamentals.constructors;
class Product{
	String productType;
	Product(String productType){
		this.productType = productType;
	}
}
class ElectronicProduct extends Product{
	String productName;
	long price;
	ElectronicProduct(String productType,String productName,long price){
		super(productType);
		this.productName = productName;
		this.price = price;
		
		
		
	}
}
public class Mobile extends ElectronicProduct {
	String brand;
	
	Mobile(String productType,String productName,long price,String brand){
		super(productType,productName,price);
		this.brand = brand;
	}
	void mobileInfo() {
		System.out.println("Product Type: "+productType);
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price: "+price);
		System.out.println("Product Brand: "+brand);
	}

	public static void main(String[] args) {
		Mobile v1 = new Mobile("Electronic","mobile",40000,"vivo");
		v1.mobileInfo();

	}

}
