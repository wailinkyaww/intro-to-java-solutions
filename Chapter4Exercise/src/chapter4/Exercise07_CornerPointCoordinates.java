package chapter4;

import java.util.Scanner;

public class Exercise07_CornerPointCoordinates {
	public static void main(String[] args) {
		// Create new Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();

		double a1 = Math.PI / 10;
		double a2 = Math.PI / 2;
		double a3 = Math.PI / 2 + 2 * Math.PI / 5;
		double a4 = Math.PI / 2 + 4 * Math.PI / 5;
		double a5 = Math.PI / 2 + 6 * Math.PI / 5;

		double x1 = radius * Math.cos(a1);
		double y1 = radius * Math.sin(a1);
		double x2 = radius * Math.cos(a2);
		double y2 = radius * Math.sin(a2);
		double x3 = radius * Math.cos(a3);
		double y3 = radius * Math.sin(a3);
		double x4 = radius * Math.cos(a4);
		double y4 = radius * Math.sin(a4);
		double x5 = radius * Math.cos(a5);
		double y5 = radius * Math.sin(a5);

		System.out.println("(" + x1 + ", " + y1 + ")");
		System.out.println("(" + x2 + ", " + y2 + ")");
		System.out.println("(" + x3 + ", " + y3 + ")");
		System.out.println("(" + x4 + ", " + y4 + ")");
		System.out.println("(" + x5 + ", " + y5 + ")");
	}
}
