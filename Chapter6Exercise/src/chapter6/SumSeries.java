package chapter6;

public class SumSeries {
	public static void main(String[] args) {
		System.out.println("i \t  m(i)");
		System.out.println("----------------");
		
		for (int i = 1; i <= 20;)
			System.out.printf("%-2d \t %7.4f \n", i, Math.round(sumSeries(i++) * 10000) / 10000.0);
	}

	public static double sumSeries(int i) {
		double sum = 0;
		int n = 1;
		while (n <= i) {
			sum += (double) n / ++n;
		}
		return sum;
	}
}
