package chapter4;

import java.util.Scanner;

public class Exercise08_CharacterOfAnASCIICode {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter ASCII code
		System.out.print("Enter an ASCII code: ");
		int asciiCode = input.nextInt();

		// Check and display result
		if (asciiCode >= 0 && asciiCode <= 127) {
			System.out.println("The character for ASCII code " + asciiCode + " is " + (char) asciiCode);
		} else
			System.out.println(asciiCode + " is an invalid input");
	}
}
