package chapter6;

import java.util.Scanner;

public class MyTriangle {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three sides of a triangle: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();

		if (isValid(s1, s2, s3))
			System.out.println("The area of the triangle is " + area(s1, s2, s3));
		else
			System.out.println("The input is invalid");
	}

	public static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
			return true;
		return false;
	}

	public static double area(double side1, double side2, double side3) {
		double area = 0;

		double s = (side1 + side2 + side3) / 2;
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		return area;
	}
}
