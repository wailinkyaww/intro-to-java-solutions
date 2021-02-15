package chapter8;

import java.util.Scanner;

public class Exercise25_MarkovMatrix {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[3][3];

		// Prompt user to enter matrix
		System.out.print("Enter 3-by-3 matrix row by row: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextDouble();
		}

		if (isMarkovMatrix(matrix))
			System.out.println("It is a Markov matrix");
		else
			System.out.println("It is not a Markov matrix");
	}

	// Assume n x n matrix
	public static boolean isMarkovMatrix(double[][] m) {
		boolean isMarkov = true;
		for (int i = 0; i < m[0].length; i++) {
			double total = 0;
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] < 0)
					return false;
				total += m[j][i];
			}
			if (total != 1) {
				isMarkov = false;
				break;
			}
		}
		return isMarkov;
	}
}
