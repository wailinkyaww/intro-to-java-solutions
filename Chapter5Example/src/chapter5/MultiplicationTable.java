package chapter5;

public class MultiplicationTable {
	public static void main(String[] args) {
		// Display the table heading
		System.out.println("	    Multiplication Table");

		// Display the number title
		System.out.print("    ");
		for (int j = 1; j <= 9; j++)
			System.out.print("   " + j);

		System.out.println("\n----------------------------------------");

		// Display the table body
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " | ");

			// Display the product and align properly
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%4d", i * j);
			}
			
			System.out.println();
		}

	}
}
