package chapter3;

import java.util.Scanner;

public class Exercise32_PointPosition {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter three points
		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		// Calculate condition
		double condition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		// Check condition and display result
		if (condition > 0)
			System.out.print("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0
					+ ") to (" + x1 + ", " + y1 + ")");
		else if (condition == 0)
			System.out.print("(" + x2 + ", " + y2 + ") is on the same line from (" + x0 + ", " + y0 + ") to (" + x1
					+ ", " + y1 + ")");
		else
			System.out.print("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0
					+ ") to (" + x1 + ", " + y1 + ")");
	}
}
