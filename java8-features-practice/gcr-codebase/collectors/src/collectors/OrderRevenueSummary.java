package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order{
	String customerName;
	double amount;
	
	public Order(String customerName, double amount) {
		this.customerName = customerName;
		this.amount = amount;
	}
}

public class OrderRevenueSummary {

	public static void main(String[] args) {
		List<Order> orders =  Arrays.asList(
				new Order("John", 2500),
                new Order("Alice", 3000),
                new Order("John", 1500),
                new Order("Bob", 4000),
                new Order("Alice", 2000));
		
		Map<String, Double> revenueList = orders.stream()
				.collect(Collectors.groupingBy(o -> o.customerName, Collectors.summingDouble(o->o.amount)));
		
		revenueList.forEach((name, revenue)->System.out.println(name+"->"+revenue));
	}

}
