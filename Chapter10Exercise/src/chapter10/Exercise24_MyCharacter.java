package chapter10;

public class Exercise24_MyCharacter {
	// Driver program
	public static void main(String[] args) {

		System.out.println("1 is digit ? " + MyCharacter.isDigit('1'));
		System.out.println("A is lower case ? " + MyCharacter.isLowerCase('A'));
		System.out.println("m is lower case ? " + MyCharacter.isLowerCase('m'));
		System.out.println("M is upper case ? " + MyCharacter.isUpperCase('M'));
		System.out.println("3 is letter or digit ? " + MyCharacter.isLetterOfDigit('3'));
		System.out.println("t is letter or digit ? " + MyCharacter.isLetterOfDigit('t'));
		System.out.println("The uppercase to 'a' is " + MyCharacter.toUpperCase('a'));
		System.out.println("The lowercase of 'M' is " + MyCharacter.toLowerCase('M'));
	}
}

class MyCharacter {

	public static boolean isDigit(char ch) {
		if (ch >= 48 && ch <= 57)
			return true;
		return false;
	}

	public static boolean isLetter(char ch) {
		if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
			return true;
		return false;
	}

	public static boolean isLetterOfDigit(char ch) {
		return isDigit(ch) || isLetter(ch);
	}

	public static boolean isLowerCase(char ch) {
		return ch >= 97 && ch <= 122;
	}

	public static boolean isUpperCase(char ch) {
		return ch >= 65 && ch <= 90;
	}

	public static char toLowerCase(char ch) {
		if (isUpperCase(ch))
			ch += 32;
		return ch;
	}

	public static char toUpperCase(char ch) {
		if (isLowerCase(ch))
			ch -= 32;
		return ch;
	}

}
