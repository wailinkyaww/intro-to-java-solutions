package chapter3;

public class Exercise16_RandomPoint {
	public static void main(String[] args) {
		/**
		 * width = 100 and height = 200, x should be between -50 and 50 y should be
		 * between -100 and 100 as center is at (0,0)
		 */
		int x = (int) (Math.random() * (50 - (-50) + 1)) - 50;
		int y = (int) (Math.random() * (100 - (-100) + 1)) - 100;

		// Display results
		System.out.println("The coordinate in a rectangle");
		System.out.println("x = " + x + ", y = " + y);
	}
}
