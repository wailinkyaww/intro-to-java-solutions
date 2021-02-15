package chapter4;

public class Exercise16_RandomCharacter {
	public static void main(String[] args) {
		// Generate a random uppercase letter
		int letter = 65 + (int) (Math.random() * 26);

		System.out.println("A random uppercase letter is \"" + (char) letter + "\"");
	}
}
