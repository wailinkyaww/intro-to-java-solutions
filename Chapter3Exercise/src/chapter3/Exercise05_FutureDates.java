package chapter3;

import java.util.Scanner;

public class Exercise05_FutureDates {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive Inputs
		System.out.print("Enter today's day: ");
		byte today = input.nextByte();

		System.out.print("Enter the number of days elapsed since today: ");
		int numberOfDays = input.nextInt();

		switch (today) {
		case 0:
			System.out.print("Today is Sunday ");
			break;
		case 1:
			System.out.print("Today is Monday ");
			break;
		case 2:
			System.out.print("Today is Tuesday ");
			break;
		case 3:
			System.out.print("Today is Wednesday ");
			break;
		case 4:
			System.out.print("Today is Thursday ");
			break;
		case 5:
			System.out.print("Today is Friday ");
			break;
		case 6:
			System.out.print("Today is Saturday ");
			break;
		}

		switch ((today + numberOfDays) % 7) {
		case 0:
			System.out.print("and the future day is Sunday ");
			break;
		case 1:
			System.out.print("and the future day is Monday ");
			break;
		case 2:
			System.out.print("and the future day is Tuesday ");
			break;
		case 3:
			System.out.print("and the future day is Wednesday ");
			break;
		case 4:
			System.out.print("and the future day is Thursday ");
			break;
		case 5:
			System.out.print("and the future day is Friday ");
			break;
		case 6:
			System.out.print("and the future day is Saturday ");
			break;
		}
	}
}
