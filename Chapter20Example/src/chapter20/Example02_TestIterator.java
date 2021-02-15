package chapter20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Example02_TestIterator {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>();
		collection.add("New York");
		collection.add("Atlanta");
		collection.add("Madison");
		collection.add("Dallas");

		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase() + " ");
		}
		System.out.println();
	}
}
