package chapter7;

public class Exercise07_CountSingleDigits {
	public static void main(String[] args) {
		int[] randomNumbers = createRandomIntegers();
		int[] counts = countDigits(randomNumbers);
		
		displayCounts(counts);
	}

	public static void displayCounts(int[] counts) {

		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + "s count is " + counts[i]);
		}
	}

	public static int[] createRandomIntegers() {
		int[] randomNumbers = new int[100];
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) (Math.random() * 10);
		}

		return randomNumbers;
	}

	public static int[] countDigits(int[] numbers) {
		int[] counts = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			counts[numbers[i]]++;
		}

		return counts;
	}
}
