package chapter6;

public class FormatAnInteger {
	public static void main(String[] args) {
		System.out.println(format(34, 10));
	}

	public static String format(int number, int width) {
		String s = "" + number;
		for (;;) {
			if (s.length() >= width)
				break;
			s = "0" + s;
		}
		return s;
	}
}
