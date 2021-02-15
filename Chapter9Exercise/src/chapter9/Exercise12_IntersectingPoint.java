package chapter9;

import java.util.Scanner;

// Test program
public class Exercise12_IntersectingPoint {
	public static void main(String[] args) {
		IntersectingPoint.main(args);
	}
}

class IntersectingPoint {
	// Create a Scanner
	private static Scanner input = new Scanner(System.in);
	private static double a, b, c, d, e, f;

	public static void main(String[] args) {
		// Prompt user to enter coordinates of four points
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		a = y1 - y2;
		b = x1 - x2;
		c = y3 - y4;
		d = x3 - x4;
		e = (y1 - y2) * x1 - (x1 - x2) * y1;
		f = (y3 - y4) * x3 - (x3 - x4) * y3;

		// Create new Equation
		LinearEquation equation1 = new LinearEquation(a, b, c, d, e, f);

		if (equation1.isSolvable())
			System.out.printf("The intersecting point is at (%6.5f, %6.5f) \n", equation1.getX(), equation1.getY());
		else
			System.out.printf("The two lines are parallel\n");
	}
}
