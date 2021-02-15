package chapter8;

import java.util.Scanner;

public class Exercise05_AddTwoMatrices {
	public static void main(String[] args) {
		double[][] m1 = new double[3][3], m2 = new double[3][3], sum = new double[3][3];

		// Prompt user to enter two matrix
		System.out.print("Enter matrix1: ");
		getArray(m1);

		System.out.print("Enter matrix2: ");
		getArray(m2);

		// Add two matrix
		sum = addMatrix(m1, m2);
		
		// Display results
		System.out.println("The matrix are added as follows: ");
		display(m1);
		System.out.println(" + ");
		display(m2);
		System.out.println(" = ");
		display(sum);
	}

	public static void display(double[][] m) {
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				System.out.print(m[row][column] + " ");
			}
			System.out.println();
		}
	}

	public static void getArray(double[][] m) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		for (int row = 0; row < m.length; row++)
			for (int column = 0; column < m[row].length; column++)
				m[row][column] = input.nextDouble();
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		int hl = a.length; // number of rows
		int vl = a[0].length; // number of columns
		double[][] grid = new double[hl][vl];
		for (int row = 0; row < hl; row++) {
			for (int column = 0; column < vl; column++)
				grid[row][column] = a[row][column] + b[row][column];
		}
		return grid;
	}
}
