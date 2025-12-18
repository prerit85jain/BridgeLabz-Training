public class ProfitLossCalculator {
    // Main Function
	public static void main(String args[]) {
        // Variable Declaration
		int costPrice = 129;
		int sellPrice = 191;

        // Calculate Profit and Profit Percentage
		double profit = sellPrice-costPrice;
		double profitPercentage = profit/costPrice * 100;
		
		System.out.println("The Cost Price is INR "+costPrice + " and Selling Price is INR "+sellPrice);
		System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);
	}
}
