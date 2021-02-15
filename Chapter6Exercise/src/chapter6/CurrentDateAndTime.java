package chapter6;

public class CurrentDateAndTime {
	public static void main(String[] args) {

	}

	public static void displayCurrentDateTime(long milliseconds) {

	}
	

	public static String getCurrentTime(long milliseconds) {
		String currentTime = "";

		long totalSeconds = milliseconds / 1000;
		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 12;

		currentTime = currentHour + ":" + currentMinute + ":" + currentSecond;

		return currentTime;
	}

	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

}
