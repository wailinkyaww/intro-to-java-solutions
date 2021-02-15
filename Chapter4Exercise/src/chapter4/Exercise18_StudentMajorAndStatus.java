package chapter4;

import java.util.Scanner;

public class Exercise18_StudentMajorAndStatus {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter major and status
		System.out.print("Enter two characters: ");
		String majorStatus = input.next();

		if (majorStatus.length() != 2) {
			System.out.println("You must enter exactly two characters");
			System.exit(1);
		}

		char ch1 = majorStatus.charAt(0);
		char ch2 = majorStatus.charAt(1);
		String major = "", status = "";

		switch (ch1) {
		case 'M':
			major = "Mathematics";
			break;
		case 'C':
			major = "Computer Science";
			break;
		case 'I':
			major = "Information Technology";
			break;
		default:
			System.out.print("Invalid input");
			System.exit(1);
		}

		switch (ch2 - 48) {
		case 1:
			status = "Freshman";
			break;
		case 2:
			status = "Sophomore";
			break;
		case 3:
			status = "Junior";
			break;
		case 4:
			status = "Senior";
		default:
			System.out.println("Invalid input");
			System.exit(1);
		}

		// Display results
		System.out.println(major + " " + status);
	}
}
