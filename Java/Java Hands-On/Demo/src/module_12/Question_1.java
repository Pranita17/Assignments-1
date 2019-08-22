package module_12;

public class Question_1 {

	
	public static double calculateProfit(double sellingPrice, double buyingPrice) {
		
		double profit = 0;
		if(buyingPrice < 0 || sellingPrice < 0) throw new IllegalArgumentException("Buying price or selling price cannot be lesser than 0");
		profit=(sellingPrice-buyingPrice);
		return profit;
		
	}
}
