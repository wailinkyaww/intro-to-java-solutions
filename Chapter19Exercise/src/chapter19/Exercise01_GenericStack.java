package chapter19;

public class Exercise01_GenericStack {
	public static void main(String[] args) {
		GenericStack<Integer> stack = new GenericStack<>();

		for (int i = 0; i < 20; i++) {
			stack.push(i);
		}

		Exercise01_GenericStack.<Integer>print(stack);

	}

	public static <T> void print(GenericStack<T> stack) {
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}

class GenericStack<E> {
	private int size = 0;
	private E[] list = (E[]) new Object[10];

	public int getSize() {
		return size;
	}

	public void push(E o) {
		if (!isOverFlow()) {
			list[size++] = o;
		} else {
			E[] newList = (E[]) new Object[size * 2];
			copyArrayIdentically(list, newList);
			list = newList;
			newList[size] = o;
		}
	}

	public E pop() {
		E o = list[getSize() - 1];
		list[--size] = null;
		return o;
	}

	public E peek() {
		return list[getSize() - 1];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private boolean isOverFlow() {
		return size == list.length;
	}

	private void copyArrayIdentically(E[] list1, E[] list2) {
		if (list1.length > list2.length) {
			throw new RuntimeException("The two array do not have the compitable size");
		}

		for (int i = 0; i < list1.length; i++)
			list2[i] = list1[i];
	}

}