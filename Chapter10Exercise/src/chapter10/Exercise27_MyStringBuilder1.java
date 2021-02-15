package chapter10;

// Test Program
public class Exercise27_MyStringBuilder1 {
	public static void main(String[] args) {
		MyStringBuilder1 sb = new MyStringBuilder1("Database");
		System.out.println("The length of sb is " + sb.length());

		// Can also receive return value
		sb.append(new MyStringBuilder1(" Programming"));

		System.out.println(sb);
		System.out.println("The length of sb after append is " + sb.length());

		System.out.println("To Lowercase: " + sb.toLowerCase());

		sb.append(2012);
		System.out.println(sb);

		System.out.println(sb.substring(0, 20));
	}
}

/**
 * Implementation of StringBuilder with Character Array. You can also implement
 * with String ( see Exercise 10.28)
 */
class MyStringBuilder1 {
	private char[] chars;
	private int size;

	public MyStringBuilder1(String s) {
		size = s.length();
		chars = s.toCharArray();
	}

	private MyStringBuilder1(char[] chars) {
		size = chars.length;
		this.chars = chars;
	}

	public MyStringBuilder1 append(MyStringBuilder1 s) {
		size += s.length();
		char[] temp = new char[size];
		System.arraycopy(chars, 0, temp, 0, chars.length);
		System.arraycopy(s.chars, 0, temp, chars.length, s.length());
		chars = temp;
		return this;
	}

	public MyStringBuilder1 append(int i) {
		String s = String.valueOf(i);
		return append(new MyStringBuilder1(s));
	}

	public int length() {
		return size;
	}

	public char charAt(int index) {
		return chars[index];
	}

	public MyStringBuilder1 toLowerCase() {
		char[] temp = new char[size];
		for (int i = 0; i < size; i++)
			temp[i] = Character.toLowerCase(chars[i]);
		return new MyStringBuilder1(temp);
	}

	public MyStringBuilder1 substring(int begin, int end) {
		char[] temp = new char[end - begin];
		System.arraycopy(chars, begin, temp, 0, end - begin);
		return new MyStringBuilder1(temp);
	}

	@Override
	public String toString() {
		return new String(chars);
	}
}
