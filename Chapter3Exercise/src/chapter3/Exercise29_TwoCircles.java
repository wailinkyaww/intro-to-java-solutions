package chapter3;

import java.util.Scanner;

public class Exercise29_TwoCircles {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter two circles' coordinates
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();

		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();

		// Compute distances between two centers
		double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

		// Check and display results
		if (distance <= Math.abs(r1 - r2))
			System.out.println("circle2 is inside circle1.");
		else if (distance <= r1 + r2)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlaps circle1");
	}
}
