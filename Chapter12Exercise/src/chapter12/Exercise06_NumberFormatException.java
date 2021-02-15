package chapter12;

import java.util.Scanner;

public class Exercise06_NumberFormatException {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();

		try {
			System.out.println("The decimal value for the hex number " + hex + " is " + Hex2Dec.hexToDecimal(hex.toUpperCase()));
		} catch (NumberFormatException ex) {
			System.out.println(ex);
		}
	}
}

class Hex2Dec {
	public static int hexToDecimal(String hex) {
		int decimalValue = 0, i = 0;

		for (; i < hex.length();) {
			char hexChar = hex.charAt(i++);
			if (!(hexChar >= '0' && hexChar <= '9') && !(hexChar >= 'A' && hexChar <= 'F'))
				throw new NumberFormatException("The string you entered is not a Hex String");
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
