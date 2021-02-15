package chapter6;

public class EstimatePI {
	public static void main(String[] args) {
		
		System.out.println("i \t  m(i)");
		System.out.println("---------------");
		
		int i = 1;
		while( i <= 901) {
			System.out.printf("%-3d \t %6.4f \n",i,computePI(i));
			i += 100;
		}
	}

	public static double computePI(int i) {
		double sum = 0;

		for (int k = 1; k <= i; k++)
			sum += Math.pow(-1, k + 1) / (2 * k - 1);

		return Math.round(4 * sum * 10000) / 10000.0;
	}
}
