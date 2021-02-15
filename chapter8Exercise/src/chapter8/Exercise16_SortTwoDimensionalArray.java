package chapter8;

public class Exercise16_SortTwoDimensionalArray {
	public static void main(String[] args) {
		int[][] m = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

		// Before Sorted
		display(m);

		// Sort the array
		sort(m);

		// After sorted
		display(m);
	}

	public static void display(int[][] m) {
		System.out.print("{ ");
		for (int i = 0; i < m.length - 1; i++) {
			System.out.print("{ " + m[i][0] + ", " + m[i][1] + " }" + ", ");
		}
		System.out.print("{ " + m[m.length - 1][0] + ", " + m[m.length - 1][1] + " }");
		System.out.println(" }");
	}

	public static void sort(int m[][]) {
		// Sort first
		for (int i = 0; i < m.length; i++) {
			int minRow = m[i][0];
			int minCol1 = m[i][1];
			int minIndex = i;
			for (int j = i + 1; j < m.length; j++) {
				// Check row - first column
				if (minRow > m[j][0]) {
					minRow = m[j][0];
					minCol1 = m[i][1];
					minIndex = j;
					continue;
				}
				// Check column - second column
				if (minRow == m[j][0] && minCol1 > m[j][1]) {
					minRow = m[j][0];
					minCol1 = m[j][1];
					minIndex = j;
				}
			}

			// Swap
			if (minIndex != i) {
				m[minIndex][0] = m[i][0];
				m[minIndex][1] = m[i][1];
				m[i][0] = minRow;
				m[i][1] = minCol1;
			}
		}
	}
}
