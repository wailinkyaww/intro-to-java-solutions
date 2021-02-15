package chapter12;

public class Exercise10_OutOfMemoryError {
	public static void main(String[] args) throws OutOfMemoryError {
		try {
			int[] list = new int[Integer.MAX_VALUE];
		} catch (OutOfMemoryError ex) {
			System.out.println(ex);
		}
	}
}
