package chapter4;

import java.util.Scanner;

public class Exercise17_DaysOfAMonth {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a year and the first three letters of a month
		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.print("Enter a month: ");
		String month = input.next();

		if (month.length() != 3) {
			System.out.println("You must enter only the first three letters of a month");
			System.exit(1);
		} else if (!Character.isUpperCase(month.charAt(0))) {
			System.out.println("You must enter the month name with the first letter in uppercase");
			System.exit(1);
		}

		int day = 0;

		switch (month) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			day = 31;
			break;
		case "Sep":
		case "Apr":
		case "Jun":
		case "Nov":
			day = 30;
			break;
		case "Feb":
			day = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
			break;
		default:
			System.out.println(month + " is an invalid input");
			System.exit(1);
		}

		// Display result
		System.out.println(month + " " + year + " has " + day + " days");

	}
}
