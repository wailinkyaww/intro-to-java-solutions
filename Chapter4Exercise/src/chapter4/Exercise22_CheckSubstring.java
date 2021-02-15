package chapter4;

import java.util.Scanner;

public class Exercise22_CheckSubstring {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter two strings
		System.out.print("Enter string s1: ");
		String s1 = input.nextLine();

		System.out.print("Enter string s2: ");
		String s2 = input.nextLine();

		if (s1.indexOf(s2) != -1)
			System.out.println(s2 + " is a substring of " + s1);
		else
			System.out.println(s2 + " is not a substring of " + s1);
	}
}
