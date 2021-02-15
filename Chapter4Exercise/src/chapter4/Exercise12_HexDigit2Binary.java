package chapter4;

import java.util.Scanner;

public class Exercise12_HexDigit2Binary {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a hex digit
		System.out.print("Enter a hex digit: ");
		String hexString = input.next();

		if (hexString.length() != 1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}

		char ch = hexString.charAt(0);
		if (ch >= 'A' && ch <= 'F') {
			switch (ch) {
			case 'A':
				System.out.println("The binary value of " + ch + " is 1010");
				break;
			case 'B':
				System.out.println("The binary value of " + ch + " is 1011");
				break;
			case 'C':
				System.out.println("The binary value of " + ch + " is 1100");
				break;
			case 'D':
				System.out.println("The binary value of " + ch + " is 1101");
				break;
			case 'E':
				System.out.println("The binary value of " + ch + " is 1110");
				break;
			case 'F':
				System.out.println("The binary value of " + ch + " is 1111");
				break;
			}
		} else if (ch >= '1' && ch <= '9') {
			switch (ch) {
			case '1':
				System.out.println("The binary value of " + ch + " is 1");
				break;
			case '2':
				System.out.println("The binary value of " + ch + " is 10");
				break;
			case '3':
				System.out.println("The binary value of " + ch + " is 11");
				break;
			case '4':
				System.out.println("The binary value of " + ch + " is 100");
				break;
			case '5':
				System.out.println("The binary value of " + ch + " is 101");
				break;
			case '6':
				System.out.println("The binary value of " + ch + " is 110");
				break;
			case '7':
				System.out.println("The binary value of " + ch + " is 111");
				break;
			case '8':
				System.out.println("The binary value of " + ch + " is 1000");
				break;
			case '9':
				System.out.println("The binary value of " + ch + " is 1001");
				break;
			}
		} else
			System.out.println(ch + " is an invalid niput");
	}
}
