package chapter9;

public class Exercise02_Stock {
	public static void main(String[] args) {
		Stock stock1 = new Stock("ORCL", "Oracle Corporation");
		stock1.previousClosingPrice = 34.5;
		stock1.currentPrice = 34.35;

		double priceChange = stock1.getChangePercent();
		
		System.out.println("Price change percentage: " + Math.round(priceChange * 100000) / 100000.0) ;
	}
}

class Stock {
	String symbol, name;
	double previousClosingPrice, currentPrice;

	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	double getChangePercent() {
		double diffenent = currentPrice - previousClosingPrice;
		double changePercentage = diffenent / previousClosingPrice * 100;
		return changePercentage;
	}
}
