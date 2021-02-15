package chapter5;

import java.util.Scanner;

public class ComputeMeanAndStandardDeviation {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter 10 numbers
		System.out.print("Enter ten numbers: ");

		final int COUNT = 10;
		double number = 0;

		double sum = 0;
		double sumOfSquares = 0;

		double mean = 0;
		double deviation = 0;

		for (int i = 1; i <= COUNT; i++) {
			number = input.nextDouble();

			sum += number;
			sumOfSquares += Math.pow(number, 2);
		}

		// Calculate mean and deviation
		mean = sum / COUNT;
		deviation = Math.sqrt((sumOfSquares - Math.pow(sum, 2) / COUNT) / (COUNT - 1));

		// Display results
		System.out.println("The mean is " + Math.round(mean * 100) / 100.0);
		System.out.println("The standard deviation is " + Math.round(deviation * 100000) / 100000.0);
	}
}
