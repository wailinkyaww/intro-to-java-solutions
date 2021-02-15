package chapter8;

import java.util.Scanner;

public class FindNearestPoints {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();

		// Create an array to store points
		double[][] points = new double[numberOfPoints][2];
		System.out.print("Enter " + numberOfPoints + " points: ");

		// we can improve performance by replacing points.length with numberOfPoints
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		// p1 and p2 are indices in the points' array
		int p1 = 0, p2 = 1;
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

		// Compute distance for every two points
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				// Find distance
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

				if (shortestDistance > distance) {
					p1 = i;
					p2 = j;
					shortestDistance = distance;
				}
			}
		}

		// Display results
		System.out.println("The cloest two points are (" + points[p1][0] + ", " + points[p1][1] + ") and ("
				+ points[p2][0] + ", " + points[p2][1] + ")");
	}

	// Compute distance between two points p1, p2
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}
