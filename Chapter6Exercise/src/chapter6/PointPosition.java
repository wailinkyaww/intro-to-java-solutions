package chapter6;

import java.util.Scanner;

public class PointPosition {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter three points
		System.out.print("Enter three points for p0, p1, and p2: ");

		// Receive inputs
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		if (leftOfTheLine(x0, y0, x1, y1, x2, y2))
			System.out.println("(" + x2 + ", " + y2 + ") is on the ");
	}

	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
	}

	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
	}

//	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
//		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0;
//	}
}
