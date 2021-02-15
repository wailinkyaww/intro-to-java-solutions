package chapter10;

import java.util.GregorianCalendar;

public class Exercise14_MyDate {
	// Driver program for MyDate objects
	public static void main(String[] args) {
		// Create two MyDate Objects
		MyDate d1 = new MyDate();
		MyDate d2 = new MyDate(34355555133101L);

		// Display results
		System.out.println("For the first object d1: ");
		System.out.println("Year \t: " + d1.getYear());
		System.out.println("Month \t: " + d1.getMonth());
		System.out.println("Day \t: " + d1.getDay());

		System.out.println("\nFor the second object d2: ");
		System.out.println("Year \t: " + d2.getYear());
		System.out.println("Month \t: " + d2.getMonth());
		System.out.println("Day \t: " + d2.getDay());
	}
}

class MyDate {
	private int year, month, day;

	public MyDate() {
		this(System.currentTimeMillis());
	}

	public MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public void setDate(long elapsedTime) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		year = calendar.get(GregorianCalendar.YEAR);
		month = calendar.get(GregorianCalendar.MONTH);
		day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}
}
