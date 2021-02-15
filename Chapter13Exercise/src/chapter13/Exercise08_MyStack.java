package chapter13;

import java.util.ArrayList;

// Test Program
public class Exercise08_MyStack {
	public static void main(String[] args) throws CloneNotSupportedException {
		MyStack stack = new MyStack();
		
		stack.push(100);
		stack.push(200);
		stack.push("Java is cool");
		
		MyStack stack1 = (MyStack) stack.clone();
		stack1.pop();
		
		System.out.println("peek stack: " + stack.peek());
		System.out.println("peek stack1: " + stack1.peek());
	}
}

class MyStack implements Cloneable {

	private ArrayList<Object> list = new ArrayList<>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	public ArrayList<Object> copyList() {
		ArrayList<Object> temp = new ArrayList<>();
		for (int i = 0; i < list.size(); i++)
			temp.add(list.get(i));
		return temp;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		MyStack stackClone = (MyStack) super.clone();
		stackClone.list = copyList();
		return stackClone;
	}

	@Override
	public String toString() {
		return "stack: " + super.toString();
	}
}
