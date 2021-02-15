package chapter4;

public class Exercise25_VehiclePlateNumbers {
	public static void main(String[] args) {
		// Generate three random numbers for upper case letters
		int firstletter = 65 + (int) (Math.random() * (90 - 65 + 1));
		int secondLetter = 65 + (int) (Math.random() * (90 - 65 + 1));
		int thirdletter = 65 + (int) (Math.random() * (90 - 65 + 1));

		// Generate four digits
		int fourDigits = 1000 + (int) (Math.random() * (9999 - 1000 + 1));

		// Form the vehicle plate number
		String plateNumber = "" + (char) firstletter + (char) secondLetter + (char) thirdletter + fourDigits;

		// Display the result
		System.out.print(plateNumber);
	}
}
