package chapter3;

import java.util.Scanner;

public class Exercise25_IntersectingPoint {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter four points
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4 : ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = y1 - y2;
		double b = -x1 + x2;
		double c = y3 - y4;
		double d = -x3 + x4;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		double divisor = a * d - b * c;

		// Calculate and display the results
		if (divisor != 0) {
			double x = (e * d - b * f) / divisor;
			double y = (a * f - e * c) / divisor;
			System.out.println("The intersecting point is at (" + (int) (x * 100000) / 100000.0 + ", "
					+ (int) (y * 100000) / 100000.0 + ")");
		} else {
			System.out.println("The two lines are parallel");
		}
	}
}
