package chapter12;

import java.util.Scanner;

public class Exercise07_NumberFormatException {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a binary number: ");
		String binaryNumber = input.nextLine();

		try {

			int decimalValue = Bin2Dec.binToDecimal(binaryNumber);
			System.out.println("The  decimal value for the binary number " + binaryNumber + " is " + decimalValue);

		} catch (NumberFormatException ex) {
			System.out.println(ex);
		}
	}
}

class Bin2Dec {
	public static int binToDecimal(String binaryString) throws NumberFormatException {
		int decimalValue = 0, i = 0;

		for (; i < binaryString.length();i++) {
			char binChar = binaryString.charAt(binaryString.length() - 1 - i);

			if (binChar != '0' && binChar != '1')
				throw new NumberFormatException(binaryString + " is not a valid binary number");

			decimalValue += (binChar - 48) * (int) Math.pow(2, i);
		}

		return decimalValue;
	}
}
