package chapter8;

import java.util.Scanner;

public class Exercise06_MutiplyTwoMatrices {
	public static void main(String[] args) {
		double[][] m1 = new double[3][3], m2 = new double[3][3], result = new double[3][3];

		// Prompt user to enter two matrix
		System.out.print("Enter matrix1: ");
		getArray(m1);

		System.out.print("Enter matrix2: ");
		getArray(m2);

		result = multiplyMatrix(m1, m2);

		// Display results
		System.out.println("The multiplication of the matrices is: ");
		display(m1);
		System.out.println(" x ");
		display(m2);
		System.out.println(" = ");
		display(result);
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

	// Assume n x n matrix
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		int hl = a.length; // rows count
		int vl = a[0].length; // column count
		double[][] grid = new double[hl][vl];
		for (int i = 0; i < hl; i++)
			for (int j = 0; j < vl; j++)
			{
				double result = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
				grid[i][j] = Math.round(result * 10) / 10.0; 
			}
		return grid;
	}
}
