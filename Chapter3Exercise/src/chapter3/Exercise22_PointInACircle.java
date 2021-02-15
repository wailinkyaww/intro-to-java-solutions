package chapter3;

import java.util.Scanner;

public class Exercise22_PointInACircle {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter points
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		// Calculate the distance from ( 0, 0 )
		double distance = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);

		if (distance <= 10) {
			System.out.println("Point (" + x + ", " + y + ") is in the circle");
		} else
			System.out.println("Point (" + x + ", " + y + ") is not in the circle");
	}
}
