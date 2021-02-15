package chapter2;

import java.util.Scanner;

public class Example04_ComputeAreaWithConstant {
	public static void main(String[] args) {
		final double PI = 3.14159; // Declare a constant

		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();

		// Compute area
		double area = radius * radius * PI;

		// Display result
		System.out.print("The area for the circle of radius " + radius + " is " + area);
	}
}
