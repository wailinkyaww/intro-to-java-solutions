package chapter6;

import java.util.Scanner;

public class DisplayMatrixOf0sAnd1s {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = input.nextInt();

		printMatrix(n);
	}

	public static void printMatrix(int n) {
		int i = 0;
		while (i < Math.pow(n, 2)) {
			int matrix = (int) (Math.random() * 2);
			if (++i % n == 0)
				System.out.println(matrix);
			else
				System.out.print(matrix + " ");
		}
	}
}
