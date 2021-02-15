package chapter6;

public class ConversionsBetweenFeetAndMeters {
	public static void main(String[] args) {
		System.out.println("Feet \t Meters \t | \t Meters \t Feet");
		System.out.println("---------------------------------------------------------");
		
		for(double f = 1, m = 20; f <= 10;m += 5) {
			System.out.printf("%-4.1f \t %-6.3f \t | \t %-6.1f \t %-4.3f \n",f,footToMeter(f++),m,meterToFoot(m));
		}
	}

	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}

	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}
}
