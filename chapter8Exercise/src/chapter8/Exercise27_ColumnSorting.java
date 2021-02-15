package chapter8;

import java.util.Scanner;

public class Exercise27_ColumnSorting {
	public static void main(String[] args) {
		// Create 3 x 3 matrix
		double[][] m = new double[3][3];

		// Prompt user to enter the matrix
		System.out.println("Enter 3-by-3 matrix row by row: ");
		getArray(m);

		// Sort the array and display the result
		display(sortColumns(m));
	}

	public static void getArray(double[][] m) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = input.nextDouble();
		}
	}

	public static void display(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.printf(m[i][j] + " ");
			// Advance to new line after each row
			System.out.println();
		}
	}

	public static double[][] sortColumns(double[][] m) {
		double[][] n = new double[m.length][m[0].length];

		// Copy array
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[i][j] = m[i][j];
			}
		}

		for (int col = 0; col < n[0].length; col++) {
			for (int row = 0; row < n.length; row++) {
				double currentMinValue = n[row][col];
				int index = row;

				for (int j = row + 1; j < n.length; j++) {
					if (currentMinValue > n[j][col]) {
						currentMinValue = n[j][col];
						index = j;
					}
				}

				if (index != row) {
					n[index][col] = n[row][col];
					n[row][col] = currentMinValue;
				}
			}
		}

		return n;
	}
}
