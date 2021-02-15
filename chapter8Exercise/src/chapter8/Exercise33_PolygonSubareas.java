package chapter8;

import java.util.Scanner;

public class Exercise33_PolygonSubareas {
	public static void main(String[] args) {
		double[][] points = new double[4][2];
		
		// Prompt user to enter coordinates of points
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		getPoints(points);
		
		double[][] copy = copyMatrix(points);

		// Change point 2 and point 3 for intersecting point
		double[] temp = new double[2];
		temp = copy[1];
		copy[1] = copy[2];
		copy[2] = temp;

		// Intersecting point
		double[] intersect = getIntersectingPoint(copy);
		if (intersect == null) {
			System.out.println("Invalid Polygon!");
			System.exit(1);
		}

		double[] areas = new double[4];
		for (int i = 0; i < 3;)
			areas[i] = getTriangleArea(points[i], points[++i], intersect);
		areas[3] = getTriangleArea(points[3], points[0], intersect);

		// Sort area in increasing area
		sort(areas);

		// Display results
		System.out.print("The areas are ");
		display(areas);
	}

	public static double[][] copyMatrix(double[][] matrix) {
		double[][] copy = new double[matrix.length][matrix[0].length];
		for (int i = 0, rowLength = matrix.length; i < rowLength; i++) {
			for (int j = 0, colLength = matrix[i].length; j < colLength; j++)
				copy[i][j] = matrix[i][j];
		}

		return copy;
	}

	public static void display(double[] arr) {
		for (int i = 0, length = arr.length; i < length; i++) {
			System.out.printf("%.2f ",arr[i]);
		}
	}

	public static double getTriangleArea(double[] p0, double[] p1, double[] p2) {
		double x0 = p0[0], y0 = p0[1];
		double x1 = p1[0], y1 = p1[1];
		double x2 = p2[0], y2 = p2[1];

		double d = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		// Check three points are on the same line
		if (d != 0) {
			double side1, side2, side3, s, area;
			side1 = Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2));
			side2 = Math.sqrt(Math.pow(x0 - x2, 2) + Math.pow(y0 - y2, 2));
			side3 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			s = (side1 + side2 + side3) / 2;

			area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
			return area;
		}

		return 0;
	}

	// Intersecting Point Of Two Diagonal
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

	public static void getPoints(double[][] points) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		for (int i = 0, rowLength = points.length; i < rowLength; i++) {
			for (int j = 0, colLength = points[i].length; j < colLength; j++)
				points[i][j] = input.nextDouble();
		}
	}

	public static void sort(double[] arr) {
		for (int i = 0, length = arr.length; i < length; i++) {
			double currentMinValue = arr[i];
			int index = i;
			for (int j = i + 1; j < length; j++) {
				if (currentMinValue > arr[j]) {
					currentMinValue = arr[j];
					index = j;
				}
			}

			// Swap
			if (index != i) {
				arr[index] = arr[i];
				arr[i] = currentMinValue;
			}
		}
	}
}
