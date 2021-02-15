package chapter8;

import java.util.Scanner;

public class Exercise32_AreaOfTriangle {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create a matrix to store coordinates of triangle
		double[][] points = new double[3][2];
		double area;

		// Prompt user to enter coordinates of three points
		System.out.print("Enter x1, y1, x2, y2, x3, y3: ");

		for (int i = 0, rowLength = points.length; i < rowLength; i++) {
			for (int j = 0, colLength = points[i].length; j < colLength; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		area = getTriangleArea(points);

		if (area != 0)
			System.out.printf("The area of the triangle is %.2f \n", area);
		else
			System.out.println("The three points are on the same line");
	}

	public static double getTriangleArea(double[][] points) {

		double x0 = points[0][0], y0 = points[0][1], x1 = points[1][0], y1 = points[1][1], x2 = points[2][0],
				y2 = points[2][1];

		double d = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		// Check three points are on the same line
		if (d != 0) {
			double side1, side2, side3, s, area;
			side1 = Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2));
			side2 = Math.sqrt(Math.pow(x0 - x2, 2) + Math.pow(y0 - y2, 2));
			side3 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			s = (side1 + side2 + side3) / 2;
			
			area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
			return  area;
		}

		return 0;
	}
}
