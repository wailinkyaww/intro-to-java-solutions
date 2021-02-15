package chapter6;

public class CrapsGame {
	public static void main(String[] args) {
		int points = 0;
		int sum = getRolled();

		switch (sum) {
		case 2:
		case 3:
		case 12:
			System.out.println("You lose");
			break;
		case 7:
		case 11:
			System.out.println("You win");
			break;
		default:
			points = sum;
			break;
		}

		if (points != 0) {
			System.out.println("points is " + points);

			do {
				sum = getRolled();
				switch (sum) {
				case 7:
					System.out.println("You lose");
					break;
				default:
					break;
				}
			} while (sum != 7 || sum != points);

		}
	}

	public static int getRolled() {
		int n1 = (int) (Math.random() * 6) + 1;
		int n2 = (int) (Math.random() * 6) + 1;
		int sum = n1 + n2;

		System.out.println("You rolled " + n1 + " + " + n2 + " = " + sum);

		return sum;
	}
}
