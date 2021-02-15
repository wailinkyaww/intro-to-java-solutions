package chapter7;

public class Exercise13_RandomNumberChooser {
	public static int getRandom(int... numbers) {
		int x = 0;
		boolean isExclude = false;
		for (;;) {
			x = (int) (Math.random() * 54);
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == x) {
					isExclude = true;
					break;
				}
			}
			if (!isExclude)
				break;
		}

		return x;
	}
}
