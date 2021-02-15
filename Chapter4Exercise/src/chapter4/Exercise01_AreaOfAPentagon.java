package chapter4;

import java.util.Scanner;

public class Exercise01_AreaOfAPentagon {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the length
		System.out.print("Enter the length from the center to a vertex: ");
		double lengthFromCenter = input.nextDouble();

		// Compute area
		double lengthOfASide = 2 * lengthFromCenter * Math.sin(Math.PI / 5);
		double area = 5 * Math.pow(lengthOfASide, 2) / (4 * Math.tan(Math.PI / 5));

		// Display result
		System.out.printf("The area of the pentagon is %.2f", area);
	}
}