package set;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> ans = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(4);
		set2.add(3);
		set2.add(5);
		
		
		
		for(int s : set1) {
			if(!set2.contains(s)) {
				ans.add(s);
			}
		}
		for(int s : set2) {
			if(!set1.contains(s)) {
				ans.add(s);
			}
		}
		System.out.println(ans);
	}

}
