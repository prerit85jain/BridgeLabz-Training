package list;

import java.util.ArrayList;
import java.util.List;

public class RotateElement {
	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};
		int rotate = 2;
		List<Integer> ls = new ArrayList<>();
		for(int i=rotate; i<nums.length; i++) {
			ls.add(nums[i]);
		}
		for(int i =0; i<rotate; i++) {
			ls.add(nums[i]);
		}
		System.out.println(ls);
	}
}
