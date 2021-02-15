package chapter5;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter two integers
		System.out.print("Enter the first integer: ");
		int n1 = input.nextInt();

		System.out.print("Enter the second integer: ");
		int n2 = input.nextInt();

		int gcd = 1; // Initial gcd is 1
		int k = 2; // Possible gcd

		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k; // Update gcd
			}
			k++;
		}

		// Display results
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
	}
}
