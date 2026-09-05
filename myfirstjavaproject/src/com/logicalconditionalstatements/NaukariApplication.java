package com.logicalconditionalstatements;

import java.util.Scanner;

public class NaukariApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hello, am I speaking with Vinod?");
		String response = sc.nextLine();

		if (response.equalsIgnoreCase("YES")) {

			System.out.println("I am calling from ABC Company.");
			System.out.println("May I know your full name?");
			System.out.println("Enter your full name:");

			String name = sc.nextLine();

			System.out.println("Nice to meet you, " + name + "!");
			System.out.println("What is your highest qualification?");
			System.out.println("Enter your qualification:");

			String qualification = sc.nextLine();

			if (qualification.equalsIgnoreCase("B.Tech")
					|| qualification.equalsIgnoreCase("B.E")) {

				System.out.println("Nice!");
				System.out.println("What is your percentage?");
				System.out.println("Enter your percentage:");

				double percentage = sc.nextDouble();

				if (percentage >= 60) {

					System.out.println("Do you have knowledge of Java?");
					System.out.println("Enter true or false:");

					boolean answer = sc.nextBoolean();

					if (answer) {

						System.out.println(
								"How many years of Java experience do you have?");
						double experience = sc.nextDouble();

						if (experience >= 0) {

							System.out.println("May I know your age?");
							int age = sc.nextInt();

							if (age >= 21 && age <= 28) {

								System.out.println(
										"Are you willing to relocate?");
								boolean relocate = sc.nextBoolean();

								if (relocate) {

									System.out.println(
											"Are you available to join immediately?");
									boolean join = sc.nextBoolean();

									if (join) {

										System.out.println();
										System.out.println(
												"Congratulations " + name + "!");
										System.out.println(
												"Your profile is Shortlisted for the Technical Round 🎉🎉🎉");

									} else {

										System.out.println(
												"Sorry, you are not eligible because you are not available to join immediately.");

									}

								} else {

									System.out.println(
											"Sorry, you are not eligible because relocation is required.");

								}

							} else {

								System.out.println(
										"Sorry, your age does not match our requirements.");

							}

						} else {

							System.out.println(
									"Sorry, your experience details are not valid.");

						}

					} else {

						System.out.println(
								"Sorry, Java knowledge is required for this position.");

					}

				} else {

					System.out.println(
							"Sorry, your percentage does not meet our requirement.");

				}

			} else {

				System.out.println(
						"Sorry, you are not eligible for this job. B.Tech or B.E qualification is required.");

			}

		} else {

			System.out.println(
					"Sorry, we contacted the wrong person. Thank you!");

		}

		sc.close();
	}
}