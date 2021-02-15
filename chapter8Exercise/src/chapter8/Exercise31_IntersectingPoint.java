package chapter8;

import java.util.Scanner;

public class Exercise31_IntersectingPoint {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create new array two store points and result
		double[][] points = new double[4][2];
		double[] result = new double[2];

		// Prompt user to enter the points
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		for (int i = 0, rowLength = points.length; i < rowLength; i++) {
			for (int j = 0, colLength = points[i].length; j < colLength; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		result = getIntersectingPoint(points);

		if (result != null) {
			System.out.printf("The intersecting point is at (%.5f , %.4f)", result[0], result[1]);
		} else {
			System.out.println("The two lines are parallel");
		}
	}

	public static double[] getIntersectingPoint(double[][] points) {
		double a = points[0][1] - points[1][1]; // y1-y2
		double b = -points[0][0] + points[1][0]; // -(x1-x2)
		double c = points[2][1] - points[3][1]; // y3-y4
		double d = -points[2][0] + points[3][0]; // -(x3-x4)
		double e = a * points[0][0] + b * points[0][1]; // (y1-y2)x1-(x1-x2)y1
		double f = c * points[2][0] + d * points[2][1]; // (y3-y4)x3-(x3-x4)y3

		double determinant = a * d - b * c;
		if (determinant != 0) {
			double[] result = new double[2];
			result[0] = (e * d - b * f) / determinant;
			result[1] = (a * f - e * c) / determinant;
			return result;
		}

		return null;
	}
}
