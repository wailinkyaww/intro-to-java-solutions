package chapter12;

public class Exercise01_NumberFormatException {
	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		int result = 0;

		try {

			if (!args[0].matches("\\d*"))
				throw new NumberFormatException("Wrong input: " + args[0]);
			else if (!args[2].matches("\\d*"))
				throw new NumberFormatException("Wrong input: " + args[2]);

			switch (args[1].charAt(0)) {
			case '+':
				result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case '-':
				result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
				break;
			case '*':
				result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
				break;
			case '/':
				result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
				break;
			}

			// Display result
			System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);

		} catch (NumberFormatException ex) {
			System.out.println(ex);
		}

	}
}

class Calculator {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		int result = 0;

		if (!args[0].matches("\\d*")) {
			System.out.println("Wrong input: " + args[0]);
			System.exit(1);
		} else if (!args[2].matches("\\d*")) {
			System.out.println("Wrong input: " + args[2]);
			System.exit(2);
		}

		switch (args[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			break;
		case '-':
			result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			break;
		case '*':
			result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			break;
		case '/':
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			break;
		}

		// Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);

	}
}
