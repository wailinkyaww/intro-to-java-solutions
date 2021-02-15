package chapter4;

import java.util.Scanner;

public class Exercise21_CheckSSN {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter SSN
		System.out.print("Enter a SSN: ");
		String ssn = input.next();

		if (ssn.length() == 11 && Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(1)) && Character.isDigit(ssn.charAt(2))
				&& ssn.charAt(3) == '-' && Character.isDigit(ssn.charAt(4)) && Character.isDigit(ssn.charAt(5))
				&& ssn.charAt(6) == '-' && Character.isDigit(ssn.charAt(7)) && Character.isDigit(ssn.charAt(8))
				&& Character.isDigit(ssn.charAt(9)) && Character.isDigit(ssn.charAt(10)))
			System.out.println(ssn + " is a valid social security number");
		else
			System.out.println(ssn + " is not a valid social security number");
	}
}
