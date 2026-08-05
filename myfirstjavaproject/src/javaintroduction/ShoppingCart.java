package javaintroduction;

public class ShoppingCart {
	static String website = "pizzahut";
	
	int items;
	double totalAmount;
	String orderPlaced;
	
	void addItem() {
		items++;
		System.out.println("Item Is Added");
	}
	void diplayCart() {
		System.out.println("Website Name: "+website);
		System.out.println("No.of Items: "+items);
		System.out.println("Total Amount: "+totalAmount);
		System.out.println("Order status: "+orderPlaced);
	}
	void placeOrder() {
		System.out.println("Order is Placed");
	}
	
	void cancelOrder(){
		System.out.println("Order is cancelled");
	}

	public static void main(String[] args) {
		ShoppingCart v1 = new ShoppingCart();
		ShoppingCart v2 = new ShoppingCart();
		v1.items = 2;
		v1.totalAmount = 250.55;
		v1.orderPlaced = "yes";
		
		
		v2.items =4;
		v2.totalAmount = 350.55;
		v2.orderPlaced = "yes";
		
		v1.diplayCart();
		
		System.out.println("------------------------------------------------------");
		
		v2.diplayCart();
		
		System.out.println("------------------------------------------------------");
		
		v1.placeOrder();
		v1.addItem();
		v2.addItem();
		
		System.out.println("------------------------------------------------------");
		
		v1.website = "Abc";
		v2.website = "Abc";
		
		System.out.println("------------------------------------------------------");
		
		v1.diplayCart();
		
	    System.out.println("------------------------------------------------------");
	    
	    v2.diplayCart();
				
	
			
		

	}

}
