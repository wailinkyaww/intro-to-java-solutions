package chapter3;

import java.util.Scanner;

public class Exercise03_SolveLinearEquations {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive inputs
		System.out.print("Enter a, b, c, d, e, f : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double divisor = a * d - b * c;

		if (divisor != 0) {
			// Calculate x and y using Cramer's rule
			double x = (e * d - b * f) / divisor;
			double y = (a * f - e * c) / divisor;

			// Display results
			System.out.println("x is " + x + " and y is " + y);
		} else {
			// Display error message
			System.out.println("The equation has no solution");
		}

	}
}
