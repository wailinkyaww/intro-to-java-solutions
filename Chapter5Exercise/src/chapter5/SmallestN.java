package chapter5;

public class SmallestN {
	public static void main(String[] args) {
		int n = 1;

		while (Math.pow(n, 2) <= 12000) {
			// Check the next number
			n++;
		}

		// Display result
		System.out.println("The smallest n such that n*n > 12,000  is " + n);
	}
}
