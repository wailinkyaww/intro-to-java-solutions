package chapter6;

import java.util.Scanner;

public class AreaOfAPentagon {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the side
		System.out.print("Enter the side: ");
		double s = input.nextDouble();

		// Get area and display result
		double area = area(s);
		System.out.println("The area of the pentagon is  " + area);
	}

	public static double area(double side) {
		return 5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));
	}
}
