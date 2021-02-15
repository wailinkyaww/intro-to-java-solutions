package chapter3;

import java.util.Scanner;

public class Exercise12_PalindromeNumber {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter three-digit integer
		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();

		if (number / 100 == number % 10) {
			System.out.println(number + " is a palindrome");
		} else {
			System.out.println(number + " is not a palindrome");
		}
	}
}
