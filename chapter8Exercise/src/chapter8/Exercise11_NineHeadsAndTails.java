package chapter8;

import java.util.Scanner;

public class Exercise11_NineHeadsAndTails {
	public static void main(String[] args) {
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a number
		System.out.print("Enter a number between 1 and 511: ");
		int n = input.nextInt();

		char[][] matrix = new char[3][3];

		for (int i = matrix.length - 1; i >= 0; i--) {
			for (int j = matrix.length - 1; j >= 0; j--) {
				if ((n & 1) == 1)
					matrix[i][j] = 'T';
				else
					matrix[i][j] = 'H';
				n >>= 1;
			}
		}
		
		display(matrix);
	}

	public static void display(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}

}
