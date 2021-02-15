package chapter5;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter two positive integers
		System.out.print("Enter the two positive integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();

		// Assume n1 is minimum
		int d = n1;
		int gcd = 1;

		if (n2 < n1)
			d = n2;

		while (d >= 1) {
			if (n1 % d == 0 && n2 % d == 0) {
				gcd = d;
				break;
			}
			d--;
		}

		// Display the results
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);

	}
}
