package functionalInterfaces;

import java.util.function.Function;

public class StringLengthChecker {
	public static void main(String[] args) {
		int limit = 10;
		
		Function<String, Integer> getLength = string -> string.length();
		
		String string = new String("Prerit Jain");
		int length = getLength.apply(string);
		
		if(length > limit) {
			System.out.println("String is too long");
		}else {
			System.out.println("All going well");
		}
	}
}
