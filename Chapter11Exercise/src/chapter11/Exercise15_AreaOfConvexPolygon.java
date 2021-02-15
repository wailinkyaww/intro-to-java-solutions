package chapter11;

import java.util.Scanner;

public class Exercise15_AreaOfConvexPolygon {

	private static double[][] points;

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the number of points and coordinates
		System.out.print("Enter the number of points: ");
		int n = input.nextInt();

		points = new double[n][2];

		// Prompt user to enter the coordinates of the points
		System.out.println("Enter the coordinates of the points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++)
				points[i][j] = input.nextDouble();
		}

		// Get total area
		double area = getAreaOfConvexPolygon(points);
		
		// Display results
		System.out.println("The total area is " + area);

	}

	private static double getAreaOfConvexPolygon(double[][] points) {
		double totalArea = 0;

		for (int i = 0; i < points.length - 1; i++) {
			totalArea += getAreaOfATriangle(points[0][0], points[0][1], points[i][0], points[i][1], points[i + 1][0],
					points[i + 1][1]);
		}

		return totalArea;
	}

	public static double getAreaOfATriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		double s1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double s2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double s3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

		double s = (s1 + s2 + s3) / 2;
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		return area;
	}
}
