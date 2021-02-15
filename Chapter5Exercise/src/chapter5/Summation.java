package chapter5;

public class Summation {
	public static void main(String[] args) {
		double sum = 0;

		for (int i = 1; i <= 625; i++) {
			sum += 1.0 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}

		System.out.println("The summation of the series is " + sum);
	}
}
