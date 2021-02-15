package chapter6;

import java.util.Scanner;

public class SumsTheDigitsInAnInteger {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter an integer
		System.out.print("Enter an integer: ");
		long number = input.nextLong();

		System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
	}

	public static int sumDigits(long n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
