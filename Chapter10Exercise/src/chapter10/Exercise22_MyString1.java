package chapter10;

public class Exercise22_MyString1 {
	// Driver program for MyString1
	public static void main(String[] args) {
		MyString1 s = new MyString1("Database Programming".toCharArray());

		// length of MyString1 s
		System.out.println("The length of s is " + s.length());

		System.out.println(s.charAt(0));

		// substring
		MyString1 sub = s.substring(0, 9);

		for (int i = 0; i < sub.length(); i++) {
			System.out.print(sub.charAt(i));
		}

		System.out.println();

		// toLowerCase
		MyString1 sl = s.toLowerCase();
		for (int i = 0; i < sl.length(); i++) {
			System.out.print(sl.charAt(i));
		}

		// equals
		MyString1 s1 = new MyString1("Event-Driven Programming".toCharArray());
		MyString1 s2 = new MyString1("Parallel Processing".toCharArray());
		MyString1 s3 = new MyString1("Event-Driven Programming".toCharArray());

		System.out.println("\n\ns1.equals(s2) ? " + s1.equals(s2));
		System.out.println("s1.equals(s3) ? " + s1.equals(s3) + "\n");

		// valueOf
		MyString1 s4 = MyString1.valueOf(13);
		for (int i = 0; i < s4.length(); i++) {
			System.out.print(s4.charAt(i));
		}
	}
}

class MyString1 {

	private char[] chars;

	public MyString1(char[] chars) {
		this.chars = chars;
	}

	public char charAt(int index) {
		return chars[index];
	}

	public int length() {
		return chars.length;
	}

	public MyString1 substring(int begin, int end) {
		char[] temp = new char[end - begin];
		System.arraycopy(chars, begin, temp, 0, end - begin);
		MyString1 s = new MyString1(temp);
		return s;
	}

	public MyString1 toLowerCase() {
		char[] temp = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			char ch = chars[i];
			if (ch >= 'A' && ch <= 'Z')
				ch = (char) (ch + 'a' - 'A');
			temp[i] = ch;
		}
		return new MyString1(temp);
	}

	public boolean equals(MyString1 s) {
		int i = 0;
		if (chars.length != s.length())
			return false;
		for (;;) {
			if (i >= chars.length)
				break;
			if (chars[i] != s.charAt(i++))
				return false;
		}
		return true;
	}

	public static MyString1 valueOf(int i) {
		return new MyString1(Integer.toString(i).toCharArray());
	}

}
