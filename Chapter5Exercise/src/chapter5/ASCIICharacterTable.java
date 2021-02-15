package chapter5;

public class ASCIICharacterTable {
	public static void main(String[] args) {
		final int CHARACTERS_PER_LINE = 10;
		char ch = '!';
		int count = 0;

		while (ch <= '~') {
			count++;
			if (count % CHARACTERS_PER_LINE == 0)
				System.out.println(ch);
			else
				System.out.print(ch + " ");
			ch++;
		}
	}
}
