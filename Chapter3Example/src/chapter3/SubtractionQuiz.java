package chapter3;

import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[] args) {
		// Generate two random single-digit integer
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		// if number1 < number2, swap them
		if (number1 < number2) {
			int temp = number1;
			number2 = number1;
			number1 = number2;
		}

		// Prompt the user to answer "What is number1 - number2?"
		System.out.print("What is " + number1 + " - " + number2 + " ? ");

		// Create a Scanner
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();

		// Grade the result and display the result
		if (number1 - number2 == answer)
			System.out.print("Your answer is correct!");
		else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
		}

	}
}
