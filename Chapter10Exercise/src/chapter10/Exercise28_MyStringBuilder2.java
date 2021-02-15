package chapter10;

// Test Program
public class Exercise28_MyStringBuilder2 {
	public static void main(String[] args) {
		MyStringBuilder2 sb = new MyStringBuilder2("Inheritance and Polymorphism");

		sb.reverse();
		System.out.println(sb.toString());

		sb.reverse();
		sb.toUpperCase();
		System.out.println(sb.toString());

		sb.insert(0, new MyStringBuilder2("Chapter10 "));
		System.out.println(sb.toString());
		sb.insert(0, sb);
		System.out.println(sb.toString());

		System.out.println("Substring: " + sb.substring(26).toString());
	}
}

/**
 * Implementation of StringBuilder with String
 */
class MyStringBuilder2 {
	private String s;

	public MyStringBuilder2() {
		s = "";
	}

	public MyStringBuilder2(char[] chars) {
		s = String.valueOf(chars);
	}

	public MyStringBuilder2(String s) {
		this.s = s;
	}

	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
		String str = new String();
		for (int i = 0; i < offset; i++)
			str += this.s.charAt(i);
		str += s;
		str += substring(offset);
		this.s = str;
		return this;
	}

	public MyStringBuilder2 reverse() {
		String reverseStr = new String();
		for (int i = s.length(); i > 0;)
			reverseStr += s.charAt(--i);
		s = reverseStr;
		return this;
	}

	public MyStringBuilder2 substring(int begin) {
		String subStr = new String();
		for (int i = begin; i < s.length(); i++)
			subStr += s.charAt(i);

		return new MyStringBuilder2(subStr);
	}

	public MyStringBuilder2 toUpperCase() {
		String temp = new String();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				ch -= 32;
			temp += ch;
		}
		s = temp;
		return this;
	}

	@Override
	public String toString() {
		return s;
	}
}
