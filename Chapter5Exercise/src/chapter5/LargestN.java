package chapter5;

public class LargestN {
	public static void main(String[] args) {
		int n = 1;

		while (Math.pow(n, 3) < 12000) {
			// Check the next number
			n++;
		}

		// Display results
		System.out.println("The largest n such that n*n*n < 12,000 is " + --n);
	}
}
