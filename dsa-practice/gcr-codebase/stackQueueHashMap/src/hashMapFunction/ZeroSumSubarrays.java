package hashMapFunction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZeroSumSubarrays {

    public static List<List<Integer>> findZeroSumSubarrays(int[] arr) {
        HashMap<Integer, List<Integer>> sumMap = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        int cumulativeSum = 0;

        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            if (sumMap.containsKey(cumulativeSum)) {
                for (int startIndex : sumMap.get(cumulativeSum)) {
                    List<Integer> subarray = new ArrayList<>();
                    for (int j = startIndex + 1; j <= i; j++) {
                        subarray.add(arr[j]);
                    }
                    result.add(subarray);
                }
                sumMap.get(cumulativeSum).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                sumMap.put(cumulativeSum, list);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        List<List<Integer>> zeroSumSubarrays = findZeroSumSubarrays(array);

        System.out.println("Zero sum subarrays:");
        for (List<Integer> subarray : zeroSumSubarrays) {
            System.out.println(subarray);
        }
    }
}