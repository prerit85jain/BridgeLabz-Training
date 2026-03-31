package set;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionOfSets {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(4);
		set2.add(3);
		set2.add(5);
		
		Set<Integer> union = new HashSet<>();
		Set<Integer> intersection = new HashSet<>();
		
		for(int s : set1) {
			union.add(s);
			if(set2.contains(s)) {
				intersection.add(s);
			}
		}
		for(int s : set2) {
			union.add(s);
		}
		System.out.println("Union: "+union);
		System.out.println("Intersection: "+intersection);
	}

}
