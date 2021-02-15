package chapter5;

public class FutureTuition {
	public static void main(String[] args) {
		// Initial Tuition fee
		double tuitionFee = 10000;
//		double totalAmount = 0;
		// Constants
		final double NUMBER_OF_YEARS = 10;
		final double INCREASE_RATE = 0.05;
		int count = 1;

		// Compute the tuition
		while (count <= NUMBER_OF_YEARS) {
			tuitionFee = tuitionFee + tuitionFee * INCREASE_RATE;
			count++;
		}

		System.out.println("The tuition in ten years: " + tuitionFee);

	}
}
