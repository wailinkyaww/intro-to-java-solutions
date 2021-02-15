package chapter9;

import java.util.GregorianCalendar;

public class Exercise05_UseGregorianCalendar {
	public static void main(String[] args) {
		String currentDate = getCurrentDate();
		System.out.print("Current date: " + currentDate);

		// Set specified value
		String specifiedDate = getDate(1234567898765L);
		System.out.print("\nThe specified date : " + specifiedDate);
	}
	
	public static String getCurrentDate() {
		String date = "";
		GregorianCalendar calendar = new GregorianCalendar();

		date += calendar.get(GregorianCalendar.YEAR) + "-";
		date += calendar.get(GregorianCalendar.MONTH) + "-";
		date += calendar.get(GregorianCalendar.DAY_OF_MONTH);

		return date;
	}

	public static String getDate(long n) {
		String date = new String();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(n);

		date += calendar.get(GregorianCalendar.YEAR) + "-";
		date += calendar.get(GregorianCalendar.MONTH) + "-";
		date += calendar.get(GregorianCalendar.DAY_OF_MONTH);

		return date;
	}
}
