package forEachMethod;

import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {

	public static void main(String[] args) {
		List<Double> prices = Arrays.asList(120.5, 121.0, 119.8, 122.3, 123.1);
		
		prices.forEach(p -> System.out.println("Live Stock Price "+p));
	}

}
