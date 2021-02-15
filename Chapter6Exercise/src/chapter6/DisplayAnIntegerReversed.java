package chapter6;

import java.util.Scanner;

public class DisplayAnIntegerReversed {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter an integer
		System.out.print("Enter an integer: ");
		int n = input.nextInt();

		System.out.println("The reversal of " + n + " is " + reverse(n));
	}

	public static int reverse(int n) {
		int reverse = 0;
		while (n != 0) {
			reverse = n % 10 + reverse * 10;
			n /= 10;
		}
		return reverse;
	}
}
