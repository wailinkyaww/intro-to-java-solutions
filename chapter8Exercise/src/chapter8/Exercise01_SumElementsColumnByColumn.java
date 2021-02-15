package chapter8;

import java.util.Scanner;

public class Exercise01_SumElementsColumnByColumn {
	public static void main(String[] args) {
		// Declare 3-by-4 multidimensional array to store matrix
		double[][] m = new double[3][4];

		// Prompt user to enter an array
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		getArray(m);

		for (int column = 0; column < m[0].length; column++)
			System.out.println("Sum of elements at column " + column + " is " + sumColumn(m, column));
	}

	public static void getArray(double[][] arr) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = input.nextDouble();
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double total = 0;
		for (int row = 0; row < m.length; row++)
			total += m[row][columnIndex];
		return total;
	}
}
