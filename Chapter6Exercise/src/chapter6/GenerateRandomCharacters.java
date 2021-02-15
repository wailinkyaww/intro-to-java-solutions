package chapter6;

public class GenerateRandomCharacters {
	public static void main(String[] args) {
		displayRandomCharachters(100);
	}

	public static void displayRandomCharachters(int n) {
		final int CHARATERS_PER_LINE = 10;
		int count = 0;
		char ch;

		System.out.println("Displaying 100 random uppercase letters: \n");
		
		// Display random uppercase letters
		for (;;) {
			if (++count > n)
				break;
			ch = getRandomUppercaseLetter();
			if (count % CHARATERS_PER_LINE == 0)
				System.out.println(ch);
			else
				System.out.print(ch + " ");
		}
		
		System.out.println("\nDisplaying 100 random digit characters: \n");

		// Display random single-digits
		for (count = 0;;) {
			if (++count > n)
				break;
			ch = getRandomDigitCharacter();
			if (count % CHARATERS_PER_LINE == 0)
				System.out.println(ch);
			else
				System.out.print(ch + " ");
		}
	}

	public static char getRandomCharacters(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static char getRandomUppercaseLetter() {
		return getRandomCharacters('A', 'Z');
	}

	public static char getRandomDigitCharacter() {
		return getRandomCharacters('0', '9');
	}

}
