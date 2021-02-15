package chapter3;

import java.util.Scanner;

public class Exercise30_ShowCurrentTime {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter zone offset
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();

		// Obtain the total milliseconds
		long totalMillisecond = System.currentTimeMillis();

		// Obtain the total seconds
		long totalSeconds = totalMillisecond / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		long currentHour = totalHours % 12;
		currentHour += offset;

		// Display results
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + (totalHours % 24 < 12 ? " PM":" AM"));
	}
}
