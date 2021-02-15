package chapter11;

import java.util.GregorianCalendar;

// For Exercise 02
public class MyDate {
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
