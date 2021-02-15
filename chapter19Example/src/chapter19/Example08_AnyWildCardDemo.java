package chapter19;

public class Example08_AnyWildCardDemo {
	public static void main(String[] args) {
		GenericStack<Integer> stack = new GenericStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(-2);

		print(stack);
	}

	public static void print(GenericStack<?> stack) {
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}
