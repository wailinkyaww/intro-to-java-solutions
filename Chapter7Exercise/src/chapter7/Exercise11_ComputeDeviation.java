package chapter7;

import java.util.Scanner;

public class Exercise11_ComputeDeviation {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		double[] numbers = new double[10];
		double mean, deviation;

		// Prompt user to enter 10 double values
		System.out.print("Enter ten double values: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		mean = mean(numbers);
		deviation = deviation(numbers);

		System.out.println("The mean is " + Math.round(mean * 100) / 100.0);
		System.out.println("The standard deviation value is " + Math.round(deviation * 100000) / 100000.0);
	}

	public static double deviation(double[] x) {
		double mean = mean(x);
		double sum = 0, deviation = 0;

		for (int i = 0; i < x.length; i++) {
			sum += Math.pow(x[i] - mean, 2);
		}

		deviation = Math.sqrt(sum / (x.length - 1));

		return deviation;
	}

	public static double mean(double[] x) {
		double sum = 0, mean = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}

		mean = sum / x.length;

		return mean;
	}
}
