package chapter10;

public class Exercise23_MyString2 {
	// Driver program
	public static void main(String[] args) {
		MyString2 s = new MyString2("Object Oriented Thinking");

		// substring
		MyString2 s1 = s.substring(16);
		displayCharArray(s1.toChars());

		// toUppercase
		MyString2 s2 = s.toUppercase();
		displayCharArray(s2.toChars());

		// valueOf
		MyString2 s3 = MyString2.valueOf(false);
		displayCharArray(s3.toChars());

		System.out.println(new MyString2("Java is cool").compare("Java is fan"));
	}

	public static void displayCharArray(char[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}
		System.out.println();
	}
}

class MyString2 {
	private String s;

	public MyString2(String s) {
		this.s = s;
	}

	public int compare(String s) {
		int i = 0;
		for (; i < s.length() && i < this.s.length(); i++) {
			if (this.s.charAt(i) - s.charAt(i) != 0)
				return this.s.charAt(i) - s.charAt(i);
		}
		return this.s.length() - s.length();
	}

	public MyString2 substring(int begin) {
		String temp = "";
		for (int i = 0; i < s.length() - begin; i++) {
			temp += s.charAt(begin + i);
		}
		return new MyString2(temp);
	}

	public MyString2 toUppercase() {
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 97 && ch <= 122)
				ch = (char) (ch - 32);
			temp += ch;
		}
		return new MyString2(temp);
	}

	public char[] toChars() {
		char[] temp = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			temp[i] = s.charAt(i);
		}
		return temp;
	}

	public static MyString2 valueOf(boolean b) {
		return b ? new MyString2("ture") : new MyString2("false");
	}

}
