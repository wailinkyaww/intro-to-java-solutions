package chapter10;

// Test program
public class Exercise01_Time {
	public static void main(String[] args) {
		// Create two time objects
		Time t1 = new Time();
		Time t2 = new Time(555550000);

		// Display results
		System.out.println("For the t1 object: ");
		System.out.println("Current time is " + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());

		System.out.println("\nFor the t2 object: ");
		System.out.println("Current time is " + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
	}
}

class Time {
	private long hour, minute, second;

	public Time() {
		this(System.currentTimeMillis());
	}

	public Time(long elapseTime) {
		setTime(elapseTime);
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	public void setTime(long elapseTime) {
		long milliseconds = elapseTime;
		long totalSeconds = milliseconds / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;

		second = totalSeconds % 60;
		minute = totalMinutes % 60;
		hour = totalHours % 24;
	}
}
