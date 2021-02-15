package chapter7;

import java.util.Scanner;

public class Exercise08_AverageAnArray {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		double[] numbers = new double[10];

		// Prompt user to enter ten doubles
		System.out.print("Enter ten double values: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		double average = average(numbers);

		System.out.println("The average value is " + average);
	}

	public static int average(int[] array) {
		int average = 0, sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		average = sum / array.length;

		return average;
	}

	public static double average(double[] array) {
		double average = 0, sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		average = sum / array.length;

		return average;
	}
}
