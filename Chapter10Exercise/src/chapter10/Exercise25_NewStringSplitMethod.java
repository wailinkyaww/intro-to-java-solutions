package chapter10;

// Test program 
public class Exercise25_NewStringSplitMethod {
	public static void main(String[] args) {
		String[] x = NewStringSplitMethod.split("a?b?gf#ea?h", "[?#]");
		display(x);
	}

	public static void display(String[] x) {
		for (String s : x)
			System.out.print(" " + s + ", ");
	}

}

class NewStringSplitMethod {

	public static String[] split(String s, String regex) {
		if (regex.length() == 1)
			return splitChar(s, regex.charAt(0));
		else
			return splitStr(s, regex);
	}

	public static String[] splitChar(String s, char regex) {
		String[] tempArr = new String[s.length()];
		String tempStr = "";
		int index = 0;

		for (int i = 0; i < s.length(); i++) {
			if (regex == s.charAt(i)) {
				tempArr[index++] = tempStr;
				tempStr = "";
				tempArr[index++] = regex + "";
			} else
				tempStr += s.charAt(i);
		}

		return tempArr;
	}

	public static String[] splitStr(String s, String regex) {
		char[] tempCharArr = new char[regex.length() - 2];
		String[] tempStrArr = new String[s.length()];
		int index = 0;
		String tempStr = "";
		boolean match = false;
		char deliminator = ' ';

		for (int i = 1; i <= tempCharArr.length; i++)
			tempCharArr[i - 1] = regex.charAt(i);

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < tempCharArr.length; j++) {
				if (tempCharArr[j] == (s.charAt(i))) {
					match = true;
					deliminator = s.charAt(i);
					break;
				} else if (j + 1 == tempCharArr.length)
					tempStr += s.charAt(i);
			}

			if (match == true) {
				match = false;
				tempStrArr[index++] = tempStr;
				tempStrArr[index++] = deliminator + "";
				tempStr = "";
			}
		}

		tempStrArr[index++] = tempStr;

		String[] tempArr2 = new String[index];

		for (int i = 0; i < index; i++)
			tempArr2[i] = tempStrArr[i];

		return tempArr2;
	}
}
