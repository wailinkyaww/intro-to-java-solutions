package chapter6;

import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a string
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();

		System.out.println("The decimal value for the hex number " + hex + " is " + hexToDecimal(hex));
	}

	public static int hexToDecimal(String hex) {
		int decimalValue = 0, i = 0;

		for (; i < hex.length();) {
			char hexChar = hex.charAt(i++);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}

		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return ch - 'A' + 10;
		return ch - '0';
	}
}
