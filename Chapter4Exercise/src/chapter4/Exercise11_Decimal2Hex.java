package chapter4;

import java.util.Scanner;

public class Exercise11_Decimal2Hex {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a decimal value between 0 and 15
		System.out.print("Enter a decimal (0 to 15) : ");
		int decimalDigit = input.nextInt();

		if (decimalDigit >= 0 && decimalDigit <= 9)
			System.out.println("The hex value is " + decimalDigit);
		else if (decimalDigit >= 10 && decimalDigit <= 15) {
			int value = decimalDigit - 10 + 'A';
			System.out.println("The hex value is " + (char) value);
		} else
			System.out.println(decimalDigit + " is an invalid input");
	}
}
