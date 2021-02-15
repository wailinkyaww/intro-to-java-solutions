package chapter3;

import java.util.Scanner;

public class Exercise01_SolveQuadraticEquations {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter three numbers
		System.out.print("Enter a, b, c : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// Calculate discriminant of the quadratic equation
		double discriminant = Math.pow(b, 2) - 4 * a * c;

		// Check discriminant
		if (discriminant > 0) {
			double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

			// Display results
			System.out.println("The equation has two roots " + r1 + " " + r2);
		} else if (discriminant == 0) {
			double r = (-b) / (2 * a);

			// Display result
			System.out.println("The equation has one root " + r);
		} else {
			System.out.println("The equation has no real roots");
		}
	}
}
