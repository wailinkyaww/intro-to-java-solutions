package chapter5;

import java.util.Scanner;

public class Exercise01_ComputeAverage {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		int number = 1, positiveCount = 0, negativeCount = 0;
		double sum = 0, average = 0;

		// Prompt user to enter the integers
		System.out.print("Enter an integer, the input ends if it is 0: ");

		while (number != 0) {
			number = input.nextInt();
			sum += number;

			if (number > 0)
				positiveCount++;
			else if (number < 0)
				negativeCount++;
		}

		// Display result
		if (positiveCount + negativeCount > 0) {
			average = sum / (positiveCount + negativeCount);

			System.out.println("The number of positives is " + positiveCount);
			System.out.println("The number of negatives is " + negativeCount);
			System.out.println("The total is " + sum);
			System.out.println("The average is " + average);
		} else
			System.out.println("No numbers are entered except 0");
	}
}
