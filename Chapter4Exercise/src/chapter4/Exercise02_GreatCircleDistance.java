package chapter4;

import java.util.Scanner;

public class Exercise02_GreatCircleDistance {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter latitude and longitude of two points
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		final double EARTH_RADIUS = 6371.01; // Constant

		// Convert degrees to radians
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);

		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);

		double distance = EARTH_RADIUS
				* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

		// Display results
		System.out.println("The distance between the two points is " + distance + " km");
	}
}
