package com.pattern;

public class TestPatterndemo22 {

	public static void main(String[] args) {
		int star = 1, space = 4;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= star; k++) {

				System.out.print("*");

			}
			star = star + 2;
			space = space - 1;

			System.out.println();

		}
		
		int star1 = 8, space1 = 0;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space1; j++) {
				System.out.print(" ");

			}
			for (int k = 0; k <= star1; k++) {

				System.out.print("*");

			}
			star1 = star1 - 2;
			space1 = space1 + 1;

			System.out.println();

		}

	}

}
