package chapter5;

public class PerfectNumber {
	public static void main(String[] args) {
		int number = 1;
		int sum;

		while (number <= 10000) {
			sum = 0;
			for (int divisor = 1; divisor <= number / 2; divisor++) {
				if (number % divisor == 0)
					sum += divisor;
			}
			if (number == sum)
				System.out.println(number);
				
			// Check the next number
			number++;
		}
	}
}
