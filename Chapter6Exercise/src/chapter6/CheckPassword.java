package chapter6;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a password string: ");
		String passwordString = input.nextLine();

		if (checkPassword(passwordString))
			System.out.println("Password is valid");
		else
			System.out.println("Invalid password.");

	}

	public static boolean checkPassword(String password) {
		boolean isValid = true;
		int digitCount = 0;
		char ch;
		for (int i = 0; i < password.length(); i++) {
			ch = password.charAt(i);
			if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
				isValid = false;
				break;
			}
			if (Character.isDigit(ch))
				digitCount++;
		}
		if (digitCount < 2)
			isValid = false;

		return isValid;
	}
}
