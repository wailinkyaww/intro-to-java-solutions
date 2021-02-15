//package chapter13;
//
//import java.math.BigInteger;
//import java.util.Scanner;
//
//public class Exercise19_ConvertDecimalsToFractions {
//	public static void main(String[] args) {
//		// Create a Scanner
//		Scanner input = new Scanner(System.in);
//
//		// Prompt user to enter a String
//		System.out.print("Enter a decimal number: ");
//		String value = input.nextLine();
//
//		String[] tokens = value.split("[.]");
//
//		BigInteger n = new BigInteger(tokens[0]);
//		
//		BigInteger d = new BigInteger(tokens[1]);
//		BigInteger df = new BigInteger(String.valueOf((int)Math.pow(10, tokens[1].length())));
//		
//		Rational r1 = new Rational(n, BigInteger.ONE);
//		Rational r2 = new Rational(d,df);
//		
//		Rational result = (tokens[0].charAt(0) == '-') ? r1.subtract(r2) : r1.add(r2);
//
//		System.out.println("The fraction number is " + result);
//	}
//}
