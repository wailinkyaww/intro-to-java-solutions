package chapter3;

import java.util.Scanner;

public class Exercise19_PerimeterOfTriangle {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive three edges for a triangle
		System.out.print("Enter three edges for a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		// Compute perimeter and display results
		if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
			double perimeter = side1 + side2 + side3;
			System.out.println("The perimeter of the triangle is " + perimeter);
		} else {
			System.out.println("The input is invalid.");
			System.exit(1);
		}

	}
}