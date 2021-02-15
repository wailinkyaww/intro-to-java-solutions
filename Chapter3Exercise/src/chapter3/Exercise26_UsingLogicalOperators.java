package chapter3;

import java.util.Scanner;

public class Exercise26_UsingLogicalOperators {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a number
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		// Display results
		System.out.println("Is " + number + " divisible by 5 and 6? " + (number % 5 == 0 && number % 6 == 0));
		System.out.println("Is " + number + " divisible by 5 or 6? " + (number % 5 == 0 || number % 6 == 0));
		System.out
				.println("Is " + number + " divisible by 5 or 6, but not both? " + (number % 5 == 0 ^ number % 6 == 0));
	}
}
