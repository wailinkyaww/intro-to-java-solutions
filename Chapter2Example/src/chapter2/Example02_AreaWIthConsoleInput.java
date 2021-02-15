package chapter2;

import java.util.Scanner;

public class Example02_AreaWIthConsoleInput {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		// Compute area
		double area = radius * radius * 3.14159;
		
		// Display results
		System.out.print("The area of the circle of radius " + radius + " is " + area);
	}
}
