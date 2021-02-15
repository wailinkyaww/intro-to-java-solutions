package chapter12;

import java.util.Scanner;

public class Exercise09_BinaryFormatException {
	// Driver program
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a binary number: ");
		String binaryNumber = input.nextLine();

		try {

			int decimalValue = binToDecimal(binaryNumber);
			System.out.println("The  decimal value for the binary number " + binaryNumber + " is " + decimalValue);

		} catch (BinaryFormatException ex) {
			System.out.println(ex);
		}
	}

	public static int binToDecimal(String binaryString) throws BinaryFormatException {
		int decimalValue = 0, i = 0;

		for (; i < binaryString.length(); i++) {
			char binChar = binaryString.charAt(binaryString.length() - 1 - i);

			// Throw new Exception if the string is not a binary string
			if (binChar != '0' && binChar != '1')
				throw new BinaryFormatException(binaryString);

			decimalValue += (binChar - 48) * (int) Math.pow(2, i);
		}

		return decimalValue;
	}
}

// Custom BinaryFormatException
class BinaryFormatException extends Exception {

	private String binaryString;

	public BinaryFormatException(String binaryString) {
		super(binaryString + " is not a valid binary number");
		this.binaryString = binaryString;
	}

	public String getBinaryString() {
		return binaryString;
	}
}
