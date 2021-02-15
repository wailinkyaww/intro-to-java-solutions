package chapter3;

import java.util.Scanner;

public class Exercise27_PointsInTriangle {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter coordinates
		System.out.print("Enter a point's x- and y- coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		// Compute the slope of the right triangle, m = (y2 - y1) / (x2 - x1)
		double m = (0 - 100.0) / (200.0 - 0);

		// Compute y-interpret point c
		double c = y - (m * x);

		if (x >= 0 && y <= 100 && c <= 100 && c >= 0)
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
	}
}
