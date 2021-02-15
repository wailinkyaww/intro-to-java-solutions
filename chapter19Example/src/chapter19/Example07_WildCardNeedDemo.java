package chapter19;

public class Example07_WildCardNeedDemo {
	public static void main(String[] args) {
		GenericStack<Integer> stack = new GenericStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(-2);

//		System.out.println("The max number is " + max(stack));
	}

	public static double max(GenericStack<Number> stack) {
		double max = stack.pop().doubleValue();

		while (!stack.isEmpty()) {
			double value = stack.pop().doubleValue();
			if (value > max)
				max = value;
		}

		return max;
	}
}
