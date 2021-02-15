package chapter5;

public class SumASeries {
	public static void main(String[] args) {
		double sum = 0;

		for (int i = 1; i <= 97; i += 2) {
			sum += (double) i / (i + 2);
		}
		System.out.print("The sum of the series is " + sum);
	}
}
