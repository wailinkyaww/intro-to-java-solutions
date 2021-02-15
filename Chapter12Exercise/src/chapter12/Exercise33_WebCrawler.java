package chapter12;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise33_WebCrawler {
	public static void main(String[] args) {
		/**
		 * The url that author provided is remove or not available now
		 * But you can test with another available link
		 */
		String url = "http://cs.armstrong.edu/liang";
		url = "http://google.com";

		crawler(url);
	}

	public static void crawler(String startingURL) {
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		ArrayList<String> listOfTraveservedURLs = new ArrayList<>();

		listOfPendingURLs.add(startingURL);
		while (!listOfPendingURLs.isEmpty() && listOfTraveservedURLs.size() <= 100) {
			String urlString = listOfPendingURLs.remove(0);
			if (!listOfTraveservedURLs.contains(urlString)) {
				listOfTraveservedURLs.add(urlString);
				System.out.println("Craw " + urlString);

				for (String s : getSubURLs(urlString)) {
					if (!listOfTraveservedURLs.contains(s)) {
						listOfPendingURLs.add(s);
					}
				}
			}
		}
	}

	public static ArrayList<String> getSubURLs(String urlString) {
		ArrayList<String> list = new ArrayList<>();

		try {
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			while (input.hasNext()) {
				String line = input.nextLine();
				current = line.indexOf("http:", 0);
				while (current > 0) {
					int endIndex = line.indexOf("\"", current);
					if (endIndex > 0) {
						list.add(line.substring(current, endIndex));
						current = line.indexOf("http:", endIndex);
					} else {
						current = -1;
					}
				}
			}

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		return list;
	}
}
