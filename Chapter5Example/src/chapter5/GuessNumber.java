package chapter5;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		// Generate a random number to be guessed
		int number = (int) (Math.random() * 10);

		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");

		int guess = -1;
		while (guess != number) {
			// Prompt user to enter guess number
			System.out.print("Enter your guess: ");
			guess = input.nextInt();

			if (guess == number)
				System.out.println("Yes, the number is " + number);
			else if (guess > number)
				System.out.println("Your number is too high");
			else
				System.out.println("Your number is too low");
		}
	}
}
