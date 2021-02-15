package chapter3;

import java.util.Scanner;

public class Exercise10_AdditionQuiz {
	public static void main(String[] args) {
		// Generate random integers less than 100
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to answer the quiz
		System.out.print(number1 + " + " + number2 + " ? ");
		int answer = input.nextInt();

		// Display result
		System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
	}
}
