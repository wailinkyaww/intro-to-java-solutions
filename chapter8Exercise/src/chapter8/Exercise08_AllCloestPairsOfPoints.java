package chapter8;

import java.util.Scanner;

public class Exercise08_AllCloestPairsOfPoints {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the number of points
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();

		double[][] points = new double[numberOfPoints][2];

		// Get Points
		System.out.print("Enter " + numberOfPoints + " points: ");
		for (int i = 0; i < numberOfPoints; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		int p1 = 0, p2 = 1;
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
		for (int i = 0; i < numberOfPoints; i++) {
			for (int j = i + 1; j < numberOfPoints; j++) {
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
				if (shortestDistance > distance) {
					p1 = i;
					p2 = j;
					shortestDistance = distance;
				}
			}
		}

		for (int i = 0; i < numberOfPoints; i++) {
			for (int j = i + 1; j < numberOfPoints; j++) {
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
				if (distance == shortestDistance) {
					System.out.println("The cloest two points are (" + points[i][0] + ", " + points[i][1] + ") and ("
							+ points[j][0] + ", " + points[j][1] + ")");
				}
			}
		}
		System.out.println("Their distance is " + shortestDistance);
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}
