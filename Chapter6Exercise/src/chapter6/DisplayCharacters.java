package chapter6;

public class DisplayCharacters {
	public static void main(String[] args) {
		printChars('1', 'Z', 10);
	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int count = 0;
		for(;;) {
			count++;
			if(ch1 > ch2)
				break;
			if(count % numberPerLine == 0)
				System.out.println(ch1++);
			else
				System.out.print(ch1++ + " ");
		}
	}
}
