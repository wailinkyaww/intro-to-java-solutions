package chapter6;

import java.util.Scanner;

public class PhoneKeypads {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();

		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)))
				str += getNumber(Character.toUpperCase(s.charAt(i)));
			else
				str += s.charAt(i);
		}
		
		System.out.println(str);
	}

	public static int getNumber(char uppercaseLetter) {
		int n = 0;
		switch (uppercaseLetter) {
		case 'A':
		case 'B':
		case 'C':
			n = 2;
			break;
		case 'D':
		case 'E':
		case 'F':
			n = 3;
			break;
		case 'G':
		case 'H':
		case 'I':
			n = 4;
			break;
		case 'J':
		case 'K':
		case 'L':
			n = 5;
			break;
		case 'M':
		case 'N':
		case 'O':
			n = 6;
			break;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			n = 7;
			break;
		case 'T':
		case 'U':
		case 'V':
			n = 8;
			break;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			n = 9;
			break;

		}

		return n;
	}
}
