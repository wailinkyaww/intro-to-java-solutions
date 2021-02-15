package chapter5;

public class ComputePI {
	public static void main(String[] args) {
		double PI = 0;
		int i = 10000;

		while (i <= 100000) {
			// Reset PI to Zero and Compute it's value
			PI = 0;
			for (int j = 1; j <= i; j++) {
				PI += 4 * (Math.pow(-1, j + 1) / (2 * j - 1));
			}
			
			System.out.println("For i = " + i + ", PI = " + PI);
			i += 10000;
		}

	}
}
