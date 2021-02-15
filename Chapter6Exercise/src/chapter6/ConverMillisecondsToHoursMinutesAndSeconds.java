package chapter6;

import java.util.Scanner;

public class ConverMillisecondsToHoursMinutesAndSeconds {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter milliseconds
		System.out.print("Enter milliseconds: ");
		long milliseconds = input.nextLong();
		
		System.out.println(milliseconds + " milliseconds is equal to " + convertMillis(milliseconds));
	}

	public static String convertMillis(long millis) {
		String str = "";

		long totalSeconds = millis / 1000;
		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		str = totalHours + ":" + currentMinute + ":" + currentSecond;

		return str;
	}
}
