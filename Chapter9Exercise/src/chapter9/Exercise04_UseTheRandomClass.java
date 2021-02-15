package chapter9;

import java.util.Random;

public class Exercise04_UseTheRandomClass {
	public static void main(String[] args) {
		Random random = new Random(1000);

		for (int i = 1; i <= 50; i++) {
			if (i % 10 == 0)
				System.out.printf("%2d \n", random.nextInt(100));
			else
				System.out.printf("%2d ", random.nextInt(100));
		}

	}
}
