package chapter19;

import java.util.ArrayList;

// Driver class for GenericStack
public class Example01_GenericStack {
	public static void main(String[] args) {
		GenericStack<String> stack1 = new GenericStack<>();
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		
		GenericStack<Integer> stack2 = new GenericStack<>();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
	}
}

class GenericStack<E> {
	private ArrayList<E> list = new ArrayList<>();
	
	public int getSize() {
		return list.size();
	}

	public void push(E o) {
		list.add(o);
	}

	public E peek() {
		return list.get(getSize() - 1);
	}

	public E pop() {
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
