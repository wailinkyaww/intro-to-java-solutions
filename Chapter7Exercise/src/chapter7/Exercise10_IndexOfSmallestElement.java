package chapter7;

import java.util.Scanner;

public class Exercise10_IndexOfSmallestElement {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		double[] numbers = new double[10];

		// Prompt user to enter 10 double values
		System.out.print("Enter ten double values: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		int minIndex = indexOfSmallestElement(numbers);

		System.out.println("The index of the smallest element is " + minIndex);

	}

	public static int indexOfSmallestElement(double[] array) {
		int index = 0;
		double min = array[index];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				index = i;
				min = array[i];
			}
		}

		return index;
	}
}
