package chapter5;

import java.util.Scanner;

public class TestDoWhile {
	public static void main(String[] args) {
		int data;
		int sum = 0;

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		do {
			// Read the next data
			System.out.print("Enter an integer ( the input ends if it is 0): ");
			data = input.nextInt();

			sum += data;
		} while (data != 0);

		// Display sum
		System.out.println("The sum is " + sum);
	}
}
