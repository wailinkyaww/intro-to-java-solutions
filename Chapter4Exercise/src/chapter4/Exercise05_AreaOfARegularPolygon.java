package chapter4;

import java.util.Scanner;

public class Exercise05_AreaOfARegularPolygon {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter number of sides and the length
		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();

		System.out.print("Enter the side: ");
		double s = input.nextDouble();

		// Compute area of polygon
		double area = n * Math.pow(s, 2) / (4 * Math.tan(Math.PI / n));

		// Display results
		System.out.println("The area of the polygon is " + area);
	}
}
