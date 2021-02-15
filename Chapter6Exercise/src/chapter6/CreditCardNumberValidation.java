package chapter6;

import java.util.Scanner;

public class CreditCardNumberValidation {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the credit card number
		System.out.print("Enter a credit card number as a string: ");
		String s = input.nextLine();

		System.out.println(s + " is " + (isValid(s) ? "valid" : "invalid"));

	}

	public static boolean isValid(String s) {
		if (getSize(s) < 13 && getSize(s) > 16) {
			return false;
		}

		if (!(prefixMatched(s, 4) || prefixMatched(s, 5) || prefixMatched(s, 6) || prefixMatched(s, 37))) {
			return false;
		}

		int sumOfDoubleEvenPlaceDigits = sumOfDoubleEvenPlace(s);
		int sumOfOddPlaceDigits = sumOfOddPlace(s);

		int total = sumOfDoubleEvenPlaceDigits + sumOfOddPlaceDigits;

		if (total % 10 == 0)
			return true;

		return false;
	}

	// Return the sum of the double of even-place in number
	public static int sumOfDoubleEvenPlace(String s) {
		int sum = 0, n = 0, i = getSize(s) - 2;

		for (;;) {
			if (i < 0)
				break;
			n = s.charAt(i) - 48;
			sum += getDigit(n * 2);
			i -= 2;
		}

		return sum;
	}

	// Return the sum of odd-place digits in number
	public static int sumOfOddPlace(String s) {
		int sum = 0, i = getSize(s) - 1;

		for (;; i -= 2) {
			if (i < 0)
				break;
			sum += s.charAt(i) - 48;
		}

		return sum;
	}

	public static int getDigit(int n) {
		if (n < 10)
			return n;
		return n / 10 + n % 10;
	}

	// Return the number of digits in number
	public static int getSize(String s) {
		return s.length();
	}

	// Return the first k number of digits from number
	public static int getPrefix(String s, int k) {
		if (s.length() < k)
			return Integer.parseInt(s);
		return Integer.parseInt(s.substring(0, k));
	}

	public static boolean prefixMatched(String s, int d) {
		boolean flag = true;

		if (d >= 10) {
			if (d != getPrefix(s, 2))
				flag = false;
		} else if (d > 0 && d < 10)
			flag = d == getPrefix(s, 1);

		return flag;
	}

}
