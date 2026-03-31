package list;

import java.util.HashMap;
import java.util.Map;

public class FindFrequency {
	public static void main(String agrs[]) {
		String[] ls = {"Apple", "Banana", "Cherry", "Apple"};
		
		HashMap<String, Integer> hm = new HashMap<>();
		for(String s : ls) {
			if(!hm.containsKey(s)) {
				hm.put(s, 1);
			}else {
				hm.put(s, hm.get(s)+1);
			}
		}
		System.out.print("{ ");
		for(Map.Entry<String, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey()+": "+ m.getValue());
		}
		System.out.println(" }");
	}
}
