package chapter8;

public class Exercise18_ShuffleRows {
	public static void main(String[] args) {
		int[][] m = {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}};
		
		// Before shuffle
		display(m);
		
		// Shuffle the array
		shuffle(m);
		
		// After shuffle
		display(m);
	}

	public static void display(int[][] m) {
		System.out.print("{ ");
		for (int i = 0; i < m.length - 1; i++) {
			System.out.print("{ " + m[i][0] + ", " + m[i][1] + " }" + ", ");
		}
		System.out.print("{ " + m[m.length - 1][0] + ", " + m[m.length - 1][1] + " }");
		System.out.println(" }");
	}

	public static void shuffle(int[][] m) {
		int length = m.length;
		int[] temp = new int[m[0].length];
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * length);
			temp = m[i];
			m[i] = m[index];
			m[index] = temp;
		}
	}
}
