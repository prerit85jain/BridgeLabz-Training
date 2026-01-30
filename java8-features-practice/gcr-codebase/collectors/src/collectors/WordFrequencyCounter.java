package collectors;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

	public static void main(String[] args) {
		String text = "java stream api java collectors stream api java";
		String[] splitText = text.trim().split(" ");
		
		Map<String, Integer> counter = Arrays.stream(splitText)
				.collect(Collectors.toMap(word -> word, word->1, Integer::sum));
		
		counter.forEach((word, count)->System.out.println(word+"="+count));
	}

}
