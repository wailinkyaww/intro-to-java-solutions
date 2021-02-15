package chapter8;

import java.util.Scanner;

public class Exercise34_RightmostLowestPoint {
	public static void main(String[] args) {
		double[][] points = new double[6][2];

		// Prompt user to enter 6 points
		System.out.print("Enter 6 points: ");
		getArray(points);

		double[] result = getRightmostLowestPoint(points);
		System.out.printf("%s ( %.1f, %.1f ) ", "The rightmost lowest point is ", result[0], result[1]);
	}

	public static void getArray(double[][] points) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		for (int i = 0, rowLength = points.length; i < rowLength; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
	}

	public static double[] getRightmostLowestPoint(double[][] points) {
		sortPoints(points);
		return points[0];
	}

	public static void sortPoints(double[][] points) {
		boolean changed;
		do {
			changed = false;
			for (int i = 0; i < points.length - 1; i++) {
				if (points[i + 1][1] <= points[i][1]) {
					if (points[i + 1][0] < points[i][0])
						continue;
					double[] temp = points[i + 1];
					points[i + 1] = points[i];
					points[i] = temp;
					changed = true;
				}

			}
		} while (changed);
	}
}
