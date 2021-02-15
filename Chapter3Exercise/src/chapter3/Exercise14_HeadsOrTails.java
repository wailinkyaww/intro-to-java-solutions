package chapter3;

import java.util.Scanner;

public class Exercise14_HeadsOrTails {
	public static void main(String[] args) {
		// Generate an integer 0 or 1
		int number = (int) (Math.random() * 2);

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a guess
		System.out.print("Enter a guess (0-head, 1-tail) : ");
		int guess = input.nextInt();

		System.out.println("The answer is " + (number == 0 ? "head":"tail"));

		if (guess == number)
			System.out.println("You are correct");
		else
			System.out.println("Sorry, you are incorrect");
	}
}
