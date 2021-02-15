package chapter3;

import java.util.Scanner;

public class Exercise28_TwoRectangles {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive input
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();

		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();

		// Compute horizontal and vertical distance between two centers
		double dx = Math.abs(x1 - x2); // horizontal
		double dy = Math.abs(y1 - y2); // vertical

		// For r2 inside r1
		if (dx + w2 / 2 <= w1 / 2 && dy + h2 / 2 <= h1 / 2)
			System.out.println("r2 is inside r1");
		else if (dx - w2 / 2 <= w1 / 2 && dy - h2 / 2 <= h1 / 2)
			System.out.println("r2 overlaps r1");
		else
			System.out.println("r2 does not overlaps r1");

	}
}
