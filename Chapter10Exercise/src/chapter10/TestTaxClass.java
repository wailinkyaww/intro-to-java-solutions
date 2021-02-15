package chapter10;

public class TestTaxClass {

	private static Tax[][] tax1 = new Tax[4][11];
	private static Tax[][] tax2 = new Tax[4][11];

	public static void main(String[] args) {

		String[] status = { "Single filers", "Married filing jointly", "Married filing separately", "Head of house" };

		int[][] bracketsFor2001 = { { 27_050, 65_550, 136_750, 297_350 }, 
				{ 45_200, 109_250, 166_500, 297_350 },
				{ 22_600, 54_625, 83_250, 148_675 },
				{ 36_250, 93_650, 151_650, 297_350 } };

		int[][] bracketsFor2009 = { { 8350, 33950, 82250, 171550, 372950 }, 
				{ 16700, 67900, 137050, 20885, 372950 },
				{ 8350, 33950, 68525, 104425, 186475 },
				{ 11950, 45500, 117450, 190200, 372950 } };

		double[] ratesFor2001 = { 0.15, 27.5, 30.5, 35.5, 39.1 };
		double[] ratesFor2009 = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };

		createTaxArrays(bracketsFor2001, ratesFor2001, bracketsFor2009, ratesFor2009);

		System.out.println("2001 United State Federal Personal Tax");
		System.out.printf("%-30s \t %5s \t %5s\n", "Status", "Income", "Tax");
		for (int i = 0; i < tax1.length; i++) {
			for (int j = 0; j < tax1[i].length; j++) {
				Tax tax = tax1[i][j];
				System.out.printf("%-27s \t %5f \t %5f \n", status[i], tax.getTaxableIncome(), tax.getTax());
			}
		}
		
		System.out.println("\n");
		System.out.println("2009 United State Federal Personal Tax");
		System.out.printf("%-30s \t %5s \t %5s\n", "Status", "Income", "Tax");
		for (int i = 0; i < tax2.length; i++) {
			for (int j = 0; j < tax2[i].length; j++) {
				Tax tax = tax2[i][j];
				System.out.printf("%-27s \t %5f \t %5f \n", status[i], tax.getTaxableIncome(), tax.getTax());
			}
		}

	}

	public static void createTaxArrays(int[][] brackets1, double[] rates1, int[][] brackets2, double[] rates2) {
		double income = 50000;
		for (int i = 0;; income += 1000, i++) {
			if (income > 60000)
				break;
			tax1[Tax.SINGLE_FILER][i] = new Tax(Tax.SINGLE_FILER, brackets1, rates1, income);
			tax1[Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW][i] = new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW,
					brackets1, rates1, income);
			tax1[Tax.MARRIED_SEPARATELY][i] = new Tax(Tax.MARRIED_SEPARATELY, brackets1, rates1, income);
			tax1[Tax.HEAD_OF_HOUSEHOLD][i] = new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets1, rates1, income);

			tax2[Tax.SINGLE_FILER][i] = new Tax(Tax.SINGLE_FILER, brackets2, rates2, income);
			tax2[Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW][i] = new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW,
					brackets2, rates2, income);
			tax2[Tax.MARRIED_SEPARATELY][i] = new Tax(Tax.MARRIED_SEPARATELY, brackets2, rates2, income);
			tax2[Tax.HEAD_OF_HOUSEHOLD][i] = new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets2, rates2, income);
		}
	}
}
