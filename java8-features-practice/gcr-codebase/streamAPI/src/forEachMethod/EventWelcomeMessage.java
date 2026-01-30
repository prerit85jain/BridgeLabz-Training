package forEachMethod;

import java.util.Arrays;
import java.util.List;

public class EventWelcomeMessage {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList(
				"Rahul", "Priya", "Amit", "Sneha", "Rohit");
		
		names.forEach(name -> System.out.println("Welcome "+name));
	}

}
