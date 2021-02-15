package chapter7;

public class Exercise16_ExecutionTime {
	public static void main(String[] args) {
		int[] arr = createRandomIntegerArray();
		int key = (int) (Math.random() * arr.length);

		int index;
		long startTime, endTime, executionTime;

		// Working with linear search
		startTime = System.currentTimeMillis();

		index = LinearSearch.linearSearch(arr, key);

		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;

		System.out.println("By linear search: ");
		System.out.println("The index of the key " + key + " is " + index);
		System.out.println("The execution time of searching is " + executionTime + " milliseconds");

		// Sort the array with selection sort
		selectionSort(arr);

		// Working with binary search
		startTime = System.currentTimeMillis();

		index = BinarySearch.binarySearch(arr, key);

		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;

		System.out.println("\nBy binary search: ");
		System.out.println("The index of the key " + key + " is " + index);
		System.out.println("The execution time of searching is " + executionTime + " milliseconds");
	}

	public static int[] createRandomIntegerArray() {
		int[] x = new int[100000];

		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * x.length);
		}

		return x;
	}

	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}
