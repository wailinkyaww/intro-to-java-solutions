package chapter13;

public class Exercise16_RationalNumberCalculator {
	public static void main(String[] args) throws IllegalArgumentException {
		if (args.length != 1) {
			System.out.println("Usage: java Exercise13_16 expression");
			System.exit(1);
		}

		String expression = args[0];
		expression = expression.replaceAll("/", " ");
		String[] tokens = expression.split("\\s+");

		// Create two rational
		Rational r1 = new Rational(Long.parseLong(tokens[0]), Long.parseLong(tokens[1]));
		Rational r2 = new Rational(Long.parseLong(tokens[3]), Long.parseLong(tokens[4]));

		String result = new String();

		switch (tokens[2].charAt(0)) {
		case '+':
			result = r1.add(r2).toString();
			break;
		case '-':
			result = r1.subtract(r2).toString();
			break;
		case '*':
			result = r1.multiply(r2).toString();
			break;
		case '/':
			result = r1.divide(r2).toString();
			break;
		default:
			throw new IllegalArgumentException("Invalid argument");
		}

		// Display result
		System.out.println(args[0] + result);
	}
}
