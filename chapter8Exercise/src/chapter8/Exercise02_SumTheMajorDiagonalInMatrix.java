package chapter8;

import java.util.Scanner;

public class Exercise02_SumTheMajorDiagonalInMatrix {
	public static void main(String[] args) {
		// Declare 4 x 4 array for testing
		double[][] m = new double[4][4];
		
		// Prompt user to enter 4 x 4 matrix
		System.out.println("Enter a 4-by-4 matrix row by row:");
		getArray(m);
		
		// Display result
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
	}

	public static void getArray(double[][] arr) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		for(int row = 0; row < arr.length; row++)
			for(int column = 0; column < arr[row].length; column++)
				arr[row][column] = input.nextDouble();
	}

	// Find summation of major diagonal in n x n matrix
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int rowCol = 0; rowCol < m.length; rowCol++)
			sum += m[rowCol][rowCol];
		return sum;
	}
}
