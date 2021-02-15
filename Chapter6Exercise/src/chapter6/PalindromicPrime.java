package chapter6;

public class PalindromicPrime {
	public static void main(String[] args) {
		displayPalindromicPrime();
	}

	public static void displayPalindromicPrime() {
		final int NUMEBRS_PER_LINE = 10;
		int count = 0, n = 2;

		for (;;) {
			if (isPrime(n) && isPalindromic(n)) {
				if (++count % NUMEBRS_PER_LINE == 0)
					System.out.println(n);
				else
					System.out.print(n + " ");
			}
			n++;
			if (count >= 100)
				break;
		}

	}

	public static boolean isPrime(int n) {
		boolean flag = true;
		int d = 2;
		for (; d <= n / 2;) {
			if (n % d++ == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static int reverse(int n) {
		int r = 0;

		for (;;) {
			if (n == 0)
				break;
			r = r * 10 + n % 10;
			n /= 10;
		}

		return r;
	}

	public static boolean isPalindromic(int n) {
		return n == reverse(n);
	}

}
