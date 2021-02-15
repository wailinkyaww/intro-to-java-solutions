package chapter8;

public class Exercise10_LargestRowAndColumn {
	public static void main(String[] args) {
		byte[][] matrix = new byte[4][4];

		// Fill random 0s and 1s
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = (byte) (Math.random() * 2);
		}

		// Display the matrix
		display(matrix);

		// Assume n x n matrix
		int largestRow = 0, largestColumn = 0, maxRowVal = 0, maxColVal = 0;
		for (int i = 0; i < matrix.length; i++) {
			int rowOnes = 0, columnOnes = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 1)
					rowOnes++;
				if (matrix[j][i] == 1)
					columnOnes++;
			}
			if (rowOnes > maxRowVal) {
				maxRowVal = rowOnes;
				largestRow = i;
			}

			if (columnOnes > maxColVal) {
				maxColVal = columnOnes;
				largestColumn = i;
			}
		}

		// Display the results
		System.out.println("The largest row index: " + largestRow);
		System.out.println("The largest column index: " + largestColumn);

		// Alternative way
		System.out.println("The largest row index: " + largestRow(matrix));
		System.out.println("The largest column index: " + largestColumn(matrix));
	}

	public static void display(byte[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}

	public static int largestRow(byte[][] matrix) {
		int largestRow = 0;
		int max = 0;
		for (int i = 0; i < matrix.length; i++) {
			int ones = 0;
			for (int j = 0; j < matrix[i].length; j++)
				if (matrix[i][j] == 1)
					ones++;
			if (ones > max) {
				max = ones;
				largestRow = i;
			}
		}
		return largestRow;
	}

	public static int largestColumn(byte[][] matrix) {
		int largestColumn = 0;
		int max = 0;
		for (int i = 0; i < matrix[0].length; i++) {
			int ones = 0;
			for (int j = 0; j < matrix.length; j++)
				if (matrix[j][i] == 1)
					ones++;
			if (ones > max) {
				max = ones;
				largestColumn = i;
			}
		}
		return largestColumn;
	}
}
