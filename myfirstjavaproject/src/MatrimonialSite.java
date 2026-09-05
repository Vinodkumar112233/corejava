import java.util.Scanner;

public class MatrimonialSite{

	public static void main(String[] args) {
		System.out.println("Welcome to Vinod Matrimonial Site 😊✌️");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String name = sc.nextLine();
		System.out.println("Hello "+name+" Nice To Meet You ❤️" );
		
		System.out.println("Enter your assests: ");
		double assests = sc.nextDouble();
		System.out.println("Enter you Salary: ");
		double salary = sc.nextDouble();
		
		if (assests>=6000000 && salary>=12000000) {
			System.out.println("We can conitnue our Chat 😊");
			
			System.out.println("Enter your height: ");
			double height = sc.nextDouble();
			System.out.println("Enter your Weight: ");
			double weight = sc.nextDouble();
			
			if((height>=5.7 && height<= 6.1) ||(weight>=65 && weight<=75)){
				System.out.println("Wow Nice We can Move Forward ✌️");
				
				System.out.println("Enter Your Age : ");
				double age = sc.nextDouble();
				
				if(age>=26 && age<=29) {
					System.out.println("Nice 👌, My Family Members Reached You 👍");
					
				}else {
					System.out.println("You can Leave For the Day 😁");
				}
				
			}else {
				System.out.println("Sorry, If it is Your Weight and Height Then Go Gym for Weight Loss And Wear Big Shoes For HEight!!😂😂");
			}
		}else {
			System.out.println("Your Profile Is Not Matching!!😢");
		}
		System.out.println("Thank You For Choosing Our Matrimonial Website ❤️❤️❤️");
				
		
	}

}
