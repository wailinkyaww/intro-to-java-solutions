package chapter3;

import java.util.Scanner;

public class Exercise21_DayOfTheWeek {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter year, month, and of the month
		System.out.print("Enter year: ");
		int year = input.nextInt();

		System.out.print("Enter month: 1-12: ");
		int m = input.nextInt();

		System.out.print("Enter the day of the month 1-31: ");
		int q = input.nextInt();

		// 13 and 14 for January and February and year to previous year
		if (m == 1 || m == 2) {
			m += 12;
			year--;
		}

		int j = year / 100;
		int k = year % 100;

		int h = (q + 26 * (m + 1) / 10 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

		// Display results
		System.out.print("Day of the week is ");

		switch (h) {
		case 0:
			System.out.println("Saturday");
			break;
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Thuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		}
	}
}
