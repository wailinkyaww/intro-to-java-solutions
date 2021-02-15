package chapter8;

import java.util.Scanner;

public class Exercise30_SolveLinearEquations {
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);

		// Declare three arrays
		double[][] a = new double[2][2];
		double[] b = new double[2];
		double[] result = new double[2];

		// Prompt user to enter the values
		System.out.print("Enter a00, a01, a10, a11: ");

		for (int i = 0, rowLength = a.length; i < rowLength; i++) {
			for (int j = 0, colLength = a[i].length; j < colLength; j++) {
				a[i][j] = input.nextDouble();
			}
		}

		System.out.print("Enter b0, b1: ");
		for (int i = 0, length = b.length; i < length; i++)
			b[i] = input.nextDouble();

		// Calculate Result
		result = linearEquation(a, b);

		// Display result
		if (result != null) {
			System.out.println("x = " + result[0]);
			System.out.println("y = " + result[1]);
		} else {
			System.out.println("There's no solution!");
		}
	}

	public static double[] linearEquation(double[][] a, double[] b) {
		double determinant = a[0][0] * a[1][1] - a[0][1] * a[1][0];
		if (determinant == 0)
			return null;

		// Create new array for x and y
		double[] result = new double[2];

		result[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / determinant;
		result[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / determinant;

		return result;
	}
}
