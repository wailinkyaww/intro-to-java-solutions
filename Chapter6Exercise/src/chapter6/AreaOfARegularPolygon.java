package chapter6;

import java.util.Scanner;

public class AreaOfARegularPolygon {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the number of sides and side
		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();

		System.out.print("Enter the side: ");
		double s = input.nextDouble();

		// Get area computed
		double area = area(n, s);

		// Display result
		System.out.println("The area of the polygon is " + area);
	}

	public static double area(int n, double side) {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
}
