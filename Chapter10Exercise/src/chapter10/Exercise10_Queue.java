package chapter10;

// Test Queue
public class Exercise10_Queue {
	public static void main(String[] args) {
		// Create new Queue
		Queue queue = new Queue();

		// Add 1 to 20 to queue
		for (int i = 1; i <= 20; i++) {
			queue.enqueue(i);
		}

		// Remove numbers
		for (int i = 0; i < 20;) {
			int n = queue.dequeue();

			if (++i % 10 == 0)
				System.out.println(n);
			else
				System.out.printf("%2d  ", n);
		}
	}
}

class Queue {
	private int size;
	private int[] elements;
	private static final int DEFAULT_CAPACITY = 8;

	public Queue() {
		this(DEFAULT_CAPACITY);
	}

	public Queue(int capacity) {
		elements = new int[capacity];
	}

	public void enqueue(int v) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = v;
	}

	public int dequeue() {
		int item = elements[0];

		for (int i = 0; i < elements.length - 1;) {
			elements[i] = elements[++i];
		}

		return item;
	}

	public int getSize() {
		return size;
	}

	public boolean empty() {
		return size == 0;
	}
}
