package chapter7;

import java.util.Scanner;

public class Exercise33_ChineseZodiac {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		String[] zodiac = { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
				"horse", "sheep" };

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.println(zodiac[year % 12]);
	}
}
