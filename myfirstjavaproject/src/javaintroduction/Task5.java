package javaintroduction;

public class Task5 {
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Task5 v1 = new Task5();
		System.out.println(v1);
		
		Task5 v2 = new Task5();
		System.out.println(v2);
		

		Task5 v3 = new Task5();
		System.out.println(v3);
		
		v1 = null;
		v2 = null;
		System.gc();
		
		
		


		

	}

}
