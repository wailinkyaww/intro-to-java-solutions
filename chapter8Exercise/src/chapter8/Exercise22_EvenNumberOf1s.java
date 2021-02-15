package chapter8;

public class Exercise22_EvenNumberOf1s {
	public static void main(String[] args) {
		// Create a 6 x 6 array
		byte[][] matrix = new byte[6][6];

		// Generate with 0s and 1s
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				byte item = (byte) (Math.random() * 2);
				matrix[i][j] = item;
			}
		}

		// Display the matrix
		display(matrix);

		boolean flag = true;

		/**
		 * Check each row and column in matrix.Assume n x n matrix.The number of rows
		 * and columns are same in this case
		 */
		for (int i = 0; i < matrix.length; i++) {
			int rowOnes = 0, columnOnes = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 1)
					rowOnes++;
				if (matrix[j][i] == 1)
					columnOnes++;
			}
			if ((rowOnes & 1) == 1 || (columnOnes & 1) == 1) {
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("Every rows and every columns have an even number of 1s");
		else
			System.out.println("Not every rows and every columns have an even number of 1s");
	}

	public static void display(byte[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
