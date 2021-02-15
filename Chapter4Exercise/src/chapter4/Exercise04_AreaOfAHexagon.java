package chapter4;

import java.util.Scanner;

public class Exercise04_AreaOfAHexagon {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the side
		System.out.print("Enter the side: ");
		double s = input.nextDouble();

		// Compute area
		double area = 6 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 6));

		// Display result
		System.out.println("The area of the hexagon is " + (int) (area * 100) / 100.0);
	}
}
