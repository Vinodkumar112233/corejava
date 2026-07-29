package javaintroduction;

public class Student {
	static String college_name;
	int studentid;
    String studentName;
    int english_marks;
    int telugu_marks;
    int hindi_marks;
    int total_marks;
    
    void calculateTotal(){
    	 total_marks = english_marks+telugu_marks+hindi_marks;
    	 System.out.println("Total_marks: "+total_marks);
    	
    }
    
    void calculatepercentage() {
    	double percentage =(total_marks/300.0)*100;
    	System.out.println("Total_Percentage: "+percentage);
    }
    
    

	public static void main(String[] args) {
		Student vinod = new Student();
		vinod.studentid = 143;
		vinod.studentName = "Vinodkumar";
		vinod.english_marks = 90;
		vinod.telugu_marks = 99;
		vinod.hindi_marks = 98;
		System.out.println("Studentid: "+vinod.studentid);
		System.out.println("Studentid: "+vinod.studentName);
		System.out.println("Studentid: "+vinod.english_marks);
		System.out.println("Studentid: "+vinod.telugu_marks);
		System.out.println("Studentid: "+vinod.hindi_marks);
		vinod.calculateTotal();
		vinod.calculatepercentage();
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		
		Student hemanth = new Student();
		hemanth.studentid = 144;
		hemanth.studentName = "Hemanthkumar";
		hemanth.english_marks = 99;
		hemanth.telugu_marks = 99;
		hemanth.hindi_marks = 99;
		System.out.println("Studentid: "+hemanth.studentid);
		System.out.println("Studentid: "+hemanth.studentName);
		System.out.println("Studentid: "+hemanth.english_marks);
		System.out.println("Studentid: "+hemanth.telugu_marks);
		System.out.println("Studentid: "+hemanth.hindi_marks);
		hemanth.calculateTotal();
		hemanth.calculatepercentage();
		
		
		
		
	
		
			
		
		

	}

}
