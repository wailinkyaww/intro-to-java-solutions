package chapter5;

public class DisplayNumbersInAPyramidPattern {
	public static void main(String[] args) {
		int n, d;
		for (int i = 1; i <= 8; i++) {
			n = 0;
			d = 1;
			for (int j = 1; j <= 8 - i; j++)
				System.out.print("    ");
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.printf("%3d ",(int) (Math.pow(2, n)));
				if (n == i - 1)
					d = -1;
				n += d;
			}
			System.out.println();
		}
	}
}
