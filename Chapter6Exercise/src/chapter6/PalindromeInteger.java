package chapter6;

import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a number
		System.out.print("Enter an integer: ");
		int n = input.nextInt();

		if (isPalindrome(n))
			System.out.println(n + " is a palindrome number");
		else
			System.out.println(n + " is not a palindrome number");

	}

	public static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}
		return reverse;
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}
