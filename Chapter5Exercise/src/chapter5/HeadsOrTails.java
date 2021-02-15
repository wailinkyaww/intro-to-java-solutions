package chapter5;

public class HeadsOrTails {
	public static void main(String[] args) {
		final int NUMBERS_OF_TIME = 1_000_000;
		int headCount = 0;
		int tailCount = 0;
		int number = 0;
		int count = 1;

		// Continuously generate heads and tails
		while (count <= NUMBERS_OF_TIME) {
			number = (int) (Math.random() * 2);
			if (number == 0)
				headCount++;
			else
				tailCount++;

			count++;
		}

		System.out.println("The number of heads : " + headCount);
		System.out.println("The number of tails : " + tailCount);

	}
}
