package javaintroduction;

// ways of nullifying the objects.

public class Testdemo7 {

	public static void main(String[] args) {
		Testdemo7 v = new Testdemo7();
		Testdemo7 v1 = new Testdemo7();
//		1.Nullifying the object
		v= null;  
//		2.reassigning the object
		v = v1;
////	3.reassign reference to another 
//		v3 = new Testdemo7();
//		4. anonymous object 
//		public class Test {
//		    public static void main(String[] args) {
//		        new Test();   // No reference variable
//		    }
//		}
//		public class Test {
//
//		    public static void createObject() {
//		        Test obj = new Test();
//		    }
//
//		    public static void main(String[] args) {
//		        createObject();
//		        // obj is out of scope here
		    }
		
	}




