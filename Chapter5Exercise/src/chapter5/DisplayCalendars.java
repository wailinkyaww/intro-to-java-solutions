package chapter5;

import java.util.Scanner;

public class DisplayCalendars {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter year and first day of the year
		System.out.print("Enter the year: ");
		int year = input.nextInt();

		System.out.print("Enter the first day of the year: ");
		int firstDay = input.nextInt();

		int days = 0;
		String monthName = "";

		for (int i = 1; i <= 12; i++) {
			switch (i) {
			case 1:
				days = 31;
				monthName = "January";
				break;
			case 2:
				firstDay = (firstDay + days) % 7;
				days = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
				monthName = "February";
				break;
			case 3:
				firstDay = (firstDay + days) % 7;
				days = 31;
				monthName = "March";
				break;
			case 4:
				firstDay = (firstDay + days) % 7;
				days = 30;
				monthName = "April";
				break;
			case 5:
				firstDay = (firstDay + days) % 7;
				days = 31;
				monthName = "May";
				break;
			case 6:
				firstDay = (firstDay + days) % 7;
				days = 30;
				monthName = "June";
				break;
			case 7:
				firstDay = (firstDay + days) % 7;
				days = 31;
				monthName = "July";
				break;
			case 8:
				firstDay = (firstDay + days) % 7;
				days = 31;
				monthName = "Auguest";
				break;
			case 9:
				firstDay = (firstDay + days) % 7;
				days = 30;
				monthName = "September";
				break;
			case 10:
				firstDay = (firstDay + days) % 7;
				days = 31;
				monthName = "October";
				break;
			case 11:
				firstDay = (firstDay + days) % 7;
				days = 30;
				monthName = "Novermber";
				break;
			case 12:
				firstDay = (firstDay + days) % 7;
				days = 31;
				monthName = "December";
				break;
			}

			// Display Heading
			System.out.println("	 " + monthName + " " + year);
			System.out.println("---------------------------");
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");

			// Paid the space before the first day in the month
			for (int j = 0; j < firstDay; j++)
				System.out.print("    ");
				
			for (int j = 1; j <= days; j++) {
				System.out.printf("%3d ",j);
				if((j + firstDay) % 7 == 0)
					System.out.println();
			}

			System.out.println("\n");
		}
	}
}
