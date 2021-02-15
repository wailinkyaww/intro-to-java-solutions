package chapter6;

import java.util.Scanner;

public class DisplayPatterns {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int n = input.nextInt();

		displayPattern(n);
	}

	public static void displayPattern(int n) {
		for (int i = 1; i <= n;) {
			for (int k = 1; k <= 2 * (n - i); k++)
				System.out.print(" ");
			for (int j = i++; j >= 1;)
				System.out.print(j-- + " ");
			System.out.println();
		}
	}
}
