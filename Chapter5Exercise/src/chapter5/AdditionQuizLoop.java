package chapter5;

import java.util.Scanner;

public class AdditionQuizLoop {
	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 10; // Number of questions
		int correctCount = 0; // Count the number of correct answers
		int count = 0; // Count the number of questions
		long startTime = System.currentTimeMillis();
		String output = "";
		Scanner input = new Scanner(System.in);

		while (count < NUMBER_OF_QUESTIONS) {
			// Generate two random single-digit integers
			int number1 = (int) (Math.random() * 16) + 1;
			int number2 = (int) (Math.random() * 16) + 1;

			// Prompt user to answer "What is number1 + number ?"
			System.out.print("What is " + number1 + " + " + number2 + " ? ");
			int answer = input.nextInt();

			// Grade the answer and display the result
			if (number1 + number2 == answer) {
				System.out.println("You are correct.");
				correctCount++;
			} else {
				System.out.println("You are wrong");
				System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
			}

			// Increase the question count
			count++;
			output += number1 + " + " + number2 + "\t= " + (number1 + number2)
					+ (number1 + number2 == answer ? " correct" : " wrong") + "\n";
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		// Display result
		System.out.println("Correct count is " + correctCount);
		System.out.println("Test time is " + testTime / 1000 + " seconds");
		System.out.println(output);
	}
}
