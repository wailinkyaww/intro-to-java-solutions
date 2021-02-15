package chapter12;

import java.util.Scanner;

public class Exercise08_HexFormatException {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();

		try {
			System.out.println("The decimal value for the hex number " + hex + " is " + hex2Decimal(hex.toUpperCase()));
		} catch (HexFormatException ex) {
			System.out.println(ex);
		}
	}
	
	public static int hex2Decimal(String hex) throws HexFormatException {
		int decimalValue = 0, i = 0;

		for (; i < hex.length();) {
			char hexChar = hex.charAt(i++);

			// Throw new HexFormatException if the number is invalid
			if (!(hexChar >= '0' && hexChar <= '9') && !(hexChar >= 'A' && hexChar <= 'F'))
				throw new HexFormatException(hex);

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

// Custom Exception
class HexFormatException extends Exception {
	
	private String hex;
	
	public HexFormatException(String hex) {
		super(hex + " is not a valid hex string");
		this.hex = hex;
	}
	
	public String getHex() {
		return hex;
	}
}
