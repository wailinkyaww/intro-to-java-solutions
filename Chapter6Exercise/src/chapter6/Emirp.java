package chapter6;

public class Emirp {
	public static void main(String[] args) {
		displayEmirp(100);
	}

	public static void displayEmirp(int total) {
		final int EMIRPS_PER_LINE = 10;
		int count = 0;
		int n = 13;

		while (count < total) {
			if (isEmirp(n)) {
				if (++count % EMIRPS_PER_LINE == 0)
					System.out.println(n);
				else
					System.out.print(n + " ");
			}
			n++;
		}
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

	public static boolean isEmirp(int n) {
		if (!isPalindromic(n) && isPrime(n) && isPrime(reverse(n)))
			return true;
		return false;
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

	public static boolean isPalindromic(int n) {
		return n == reverse(n);
	}

}
