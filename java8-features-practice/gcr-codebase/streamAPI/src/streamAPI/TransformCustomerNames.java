package streamAPI;

import java.util.Arrays;
import java.util.List;

public class TransformCustomerNames {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList(
				"rahul", "priya", "amit", "sneha", "rohit");
		
		names.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
	}

}
