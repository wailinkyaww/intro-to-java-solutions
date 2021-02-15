package chapter7;

import java.util.Scanner;

public class Exercise09_SmallestElement {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		double[] numbers = new double[10];

		// Prompt user to enter ten double values
		System.out.print("Enter ten double values: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		double min = min(numbers);

		// Display result
		System.out.print("The minimum value is: " + min);
	}

	public static double min(double[] array) {
		double min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}

		return min;
	}
}
