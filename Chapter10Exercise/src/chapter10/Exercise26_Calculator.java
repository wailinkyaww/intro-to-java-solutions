package chapter10;

public class Exercise26_Calculator {
	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Usage: java Exercise26_Calculator expression");
			System.exit(1);
		}

		int result = 0;

		String[] tokens = args[0].split("[\\s]+");

		switch (tokens[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[2]);
			break;
		case '-':
			result = Integer.parseInt(tokens[0]) - Integer.parseInt(tokens[2]);
			break;
		case '*':
			result = Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[2]);
			break;
		case '/':
			result = Integer.parseInt(tokens[0]) / Integer.parseInt(tokens[2]);
			break;
		}

		System.out.println(tokens[0] + ' ' + tokens[1] + ' ' + tokens[2] + " = " + result);
	}
}
