package chapter7;

public class LinearSearch {
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}
}
