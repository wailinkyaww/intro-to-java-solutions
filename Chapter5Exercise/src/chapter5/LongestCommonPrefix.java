package chapter5;

import java.util.Scanner;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the first string
		System.out.print("Enter the first string: ");
		String firstString = input.nextLine();

		// Prompt user to enter the second string
		System.out.print("Enter the second string: ");
		String secondString = input.nextLine();

		String prefix = "";
		int i = 0;

		while (firstString.charAt(i) == secondString.charAt(i)) {
			prefix += firstString.charAt(i);
			i++;
		}

		if (i > 0)
			System.out.println("The common prefix is " + prefix);
		else
			System.out.println(firstString + " and " + secondString + " have no common prefix");
	}
}
