package chapter7;

import java.util.Scanner;

public class AnalyzeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the number of items
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();

		double[] numbers = new double[n];
		double sum = 0;

		System.out.print("Enter the numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}

		double average = sum / n;

		int count = 0;
		for (int i = 0; i < numbers.length;i++) {
			if (numbers[i] > average)
				count++;
		}

		System.out.println("Average is " + average);
		System.out.println("Numbers of elements above the average is " + count);
	}
}
