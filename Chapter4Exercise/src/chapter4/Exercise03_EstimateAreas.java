package chapter4;

public class Exercise03_EstimateAreas {
	public static void main(String[] args) {
		// Earth radius
		final double EARTH_RADIUS = 6371.01; // Constant

		// latitude and longitude for Atlanta, Georgia
		double x1 = Math.toRadians(33.776145);
		double y1 = Math.toRadians(-84.448065);

		// latitude and longitude for Orlando, Florida
		double x2 = Math.toRadians(28.529928);
		double y2 = Math.toRadians(-81.381740);

		// latitude and longitude for Savannah, Georgia
		double x3 = Math.toRadians(32.05807);
		double y3 = Math.toDegrees(-81.123320);

		// latitude and longitude for Charlotte, North Calrolina
		double x4 = Math.toRadians(35.209175);
		double y4 = Math.toRadians(-80.812332);

		// Distance between Atlanta and Orlando
		double d1 = EARTH_RADIUS
				* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		// Distance between Orlando and Savannah
		double d2 = EARTH_RADIUS
				* Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));

		// Distance between Savannah and Charlotte
		double d3 = EARTH_RADIUS
				* Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));

		// Distance between Atlanta and Charlotter
		double d4 = EARTH_RADIUS
				* Math.acos(Math.sin(x1) * Math.sin(x4) + Math.cos(x1) * Math.cos(x4) * Math.cos(y1 - y4));

		// Cross Distance between Orlando and Charlotte
		double d5 = EARTH_RADIUS
				* Math.acos(Math.sin(x2) * Math.sin(x4) + Math.cos(x2) * Math.cos(x4) * Math.cos(y2 - y4));

		// Area enclosed by Atlanta, Orlando, and Charlotte
		double s = (d1 + d2 + d5) / 2;
		double area1 = Math.sqrt(s * (s - d1) * (s - d2) * (s - d3));
		
		// Area enclosed by Orlando, Savannah, and Charlotte
		s = (d2 + d3 + d5) / 2;
		double area2 = Math.sqrt(s * (s - d2) * (s - d3) * (s - d5));
				
		// Total area enclosed by these four cities
		double area = area1 + area2;
		
		// Display results
		System.out.println("The area enclosed by these four cities: " + area + " square kilometers");
	}
}
