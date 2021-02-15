package chapter13;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercise04_DisplayCalendars {

	private static final String[] MONTHS = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };

	public static void main(String[] args) {
		// Create new Calendar Object
		GregorianCalendar calendar = new GregorianCalendar();
		int month = calendar.get(GregorianCalendar.MONTH);
		int year = calendar.get(GregorianCalendar.YEAR);

		if (args.length == 2) {
			month = Integer.parseInt(args[0]) - 1;
			year = Integer.parseInt(args[1]);
		}

		calendar.set(year, month, 1);

		displayHeading(calendar);
		displayBody(calendar);
	}

	private static void displayBody(Calendar calendar) {
		for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.printf("    ");
		}

		while (calendar.get(Calendar.DATE) < calendar.getActualMaximum(Calendar.DATE)) {

			if (calendar.get(Calendar.DAY_OF_WEEK) == 7)
				System.out.printf("%3d\n", calendar.get(Calendar.DATE));
			else
				System.out.printf("%3d ", calendar.get(Calendar.DATE));

			calendar.add(Calendar.DATE, 1);
		}
		System.out.printf("%3d\n", calendar.get(Calendar.DATE));
	}

	private static void displayHeading(Calendar calendar) {
		System.out.println("\t" + MONTHS[calendar.get(Calendar.MONTH)] + ", " + calendar.get(Calendar.YEAR));

		System.out.println("----------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}
}
