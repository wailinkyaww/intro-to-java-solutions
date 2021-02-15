package chapter5;

public class DemonstrateCancellationErrors {
	public static void main(String[] args) {
		int n = 50000;
		double sumFromLeftToRight = 0;
		double sumFromRigthToLeft = 0;

		int count = 1;

		while (count <= n) {
			sumFromLeftToRight += 1.0 / count;
			count++;
		}

		while (n >= 1) {
			sumFromRigthToLeft += 1.0 / n;
			n--;
		}

		System.out.println("Sum from left to right: " + sumFromLeftToRight);
		System.out.println("Sum from right to left: " + sumFromRigthToLeft);

	}
}
