package chapter9;

public class SelectionSort {
	public static void selectionSort(int[] x) {
		for (int i = 0; i < x.length; i++) {
			int currentMinIndex = i;
			int currentMin = x[currentMinIndex];

			for (int j = i + 1; j < x.length; j++) {
				if (currentMin > x[j]) {
					currentMinIndex = j;
					currentMin = x[j];
				}
			}

			if (currentMinIndex != i) {
				x[currentMinIndex] = x[i];
				x[i] = currentMin;
			}
		}
	}
}
