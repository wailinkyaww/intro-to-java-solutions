package chapter9;

import java.util.Date;

public class Exercise03_UseTheDateClass {
	public static void main(String[] args) {
		Date[] dateArray;

		dateArray = createDateArray();
		displayDate(dateArray);
	}

	public static void displayDate(Date[] dateArray) {
		for(Date date:dateArray)
			System.out.println(date);
	}

	public static Date[] createDateArray() {
		Date[] dateArray = new Date[8];
		int n = 10000;

		for (int i = 0; i < dateArray.length;) {
			dateArray[i++] = new Date(n);
			n *= 10;
		}

		return dateArray;
	}
}
