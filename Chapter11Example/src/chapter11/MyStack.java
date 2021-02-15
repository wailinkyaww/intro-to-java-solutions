package chapter11;

import java.util.ArrayList;

public class MyStack {
	private ArrayList<Object> list = new ArrayList<>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(list.size() - 1);
	}

	public Object pop() {
		Object o = list.get(list.size() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}

	// Driver program
	public static void main(String[] args) {
		MyStack stack = new MyStack();

		stack.push(new CircleFromSimpleGeometricObject(1));
		stack.push(new CircleFromSimpleGeometricObject(2));
		
		System.out.println(stack);

		stack.pop();

		Object object1 = stack.peek();
		if (object1 instanceof CircleFromSimpleGeometricObject) {
			System.out.println(((CircleFromSimpleGeometricObject) object1).getArea());
		}
	}
}
