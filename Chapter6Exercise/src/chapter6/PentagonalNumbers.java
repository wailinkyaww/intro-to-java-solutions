package chapter6;

public class PentagonalNumbers {
	public static void main(String[] args) {
		final int PENTAGONALS_PER_LINE = 10;
		final int NUMBERS_OF_PENTAGONAL = 100;

		for (int i = 1; i <= NUMBERS_OF_PENTAGONAL;) {
			int petagonalNumber = getPentagonalNumber(i);
			if (i++ % PENTAGONALS_PER_LINE == 0)
				System.out.printf("%5d \n",petagonalNumber);
			else
				System.out.printf("%5d ",petagonalNumber);
		}
	}

	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;
	}
}
