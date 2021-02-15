package chapter10;

import java.util.Scanner;

public class Exercise15_BoundingRectangle {
	private static double[][] points;
	private static Scanner input;
	private static MyRectangle2D rectangle;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		points = new double[5][2];

		// Prompt user to enter five points
		System.out.print("Enter five points: ");

		// Receive inputs
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		rectangle = getRectangle(points);

		// Display results
		System.out.printf("The bounding rectangle's center (%1.1f, %1.2f), width %1.1f, height %1.2f", rectangle.getX(),
				rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());

	}

	public static MyRectangle2D getRectangle(double[][] points) {
		double minX = points[0][0], minY = points[0][1], maxX = points[0][0], maxY = points[0][1];

		for (int i = 1; i < points.length; i++) {
			if (minX > points[i][0])
				minX = points[i][0];
			if (minY > points[i][1])
				minY = points[i][1];
			if (maxX < points[i][0])
				maxX = points[i][0];
			if (maxY < points[i][1])
				maxY = points[i][1];
		}

		double cx = (minX + maxX) / 2;
		double cy = (minY + maxY) / 2;
		double width = maxX - minX;
		double height = maxY - minY;

		return new MyRectangle2D(cx, cy, width, height);
	}
}
