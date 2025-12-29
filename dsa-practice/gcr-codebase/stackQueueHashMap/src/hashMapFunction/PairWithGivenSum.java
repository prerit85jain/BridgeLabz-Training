package hashMapFunction;

import java.util.HashSet;

public class PairWithGivenSum {

    public static boolean hasPairWithSum(int[] arr, int targetSum) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(targetSum - num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 15, 3, 7};
        int target = 17;

        System.out.println(hasPairWithSum(array, target));
    }
}