package chapter3;

import java.util.Scanner;

public class Exercise02_AddThreeNumbers {
	public static void main(String[] args) {
		// Generate three single-digit integer
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 3 % 10);
		int number3 = (int) (System.currentTimeMillis() / 7 % 10);

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to answer to sum of numbers
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
		int answer = input.nextInt();

		// Display result
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is "
				+ (number1 + number2 + number3 == answer));

	}
}
