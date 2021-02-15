package chapter9;

// Driver class
public class Exercise06_StopWatch {
	// Test Program
	public static void main(String[] args) {
		StopWatch stopwatch = new StopWatch();

		final int size = 100_000;
		int[] numbers = createArray(size);

		stopwatch.start();
		SelectionSort.selectionSort(numbers);
		stopwatch.stop();

		System.out.println("The elapsed time to sort " + size + " numbers using selection sort is \n"
				+ stopwatch.getElapsedTime() + " milliseconds");

	}

	private static int[] createArray(int size) {
		int[] x = new int[size];

		for (int i = 0; i < x.length; i++) 
			x[i] = (int) (Math.random() * (size + 1));
		

		return x;
	}
}

class StopWatch {
	private long startTime, endTime;

	public StopWatch() {
		startTime = System.currentTimeMillis();
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return endTime - startTime;
	}
}
