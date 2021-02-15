package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise10_MyStack {
	public static void main(String[] args) {
		// Create new Stack
		MyStack stack = new MyStack();

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++) {
			String s = input.nextLine();
			stack.push(s);
		}

		System.out.println("You strings in reverse order: ");
		for (int i = stack.getSize() - 1; i >= 0; i--) {
			System.out.println(stack.pop());
		}
	}
}

class MyStack extends ArrayList<Object> {

	public boolean isEmpty() {
		return super.isEmpty();
	}

	public int getSize() {
		return size();
	}

	public Object peek() {
		return get(size() - 1);
	}

	public Object pop() {
		Object o = get(size() - 1);
		remove(size() - 1);
		return o;
	}

	public void push(Object o) {
		add(o);
	}

	@Override
	public String toString() {
		return "stack: " + super.toString();
	}
}
