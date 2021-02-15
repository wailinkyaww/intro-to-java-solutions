package chapter5;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = input.nextLine();

		String reverseString = "";

		for (int i = 0; i < text.length(); i++) {
			reverseString = text.charAt(i) + reverseString;
		}

		System.out.println("The reversed string is " + reverseString);
	}
}
