package chapter3;

import java.util.Scanner;

public class Exercise23_PointInARectangle {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the coordinates of the point
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		// Horizontal distance and vertical distance from center (0,0)
		double horizontalDistance =  Math.abs(x);
		double verticalDistance = Math.abs(y);


		if (horizontalDistance <= 10.0 / 2 && verticalDistance <= 5.0 / 2)
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
		else
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
	}
}
