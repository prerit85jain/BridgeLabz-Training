package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] nums = {3,1,2,3,2,4,3,5,6};
		
		List<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		
		for(int n : nums) {
			if(!set.contains(n)) {
				list.add(n);
				set.add(n);
			}
		}
		System.out.println(list);
	}

}
