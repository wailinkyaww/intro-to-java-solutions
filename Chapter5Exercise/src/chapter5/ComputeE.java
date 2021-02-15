package chapter5;

public class ComputeE {
	public static void main(String[] args) {
		int i = 10000;
		while (i <= 100000) {
			double E = 1, d = 1;
			int inc = 1;
			for (; inc <= i;) {
				E += 1 / (d * inc);
				d *= inc++;
			}
			System.out.println("When i " + i + ", computed value of e : " + E);
			i += 10000;
		}

	}
}
