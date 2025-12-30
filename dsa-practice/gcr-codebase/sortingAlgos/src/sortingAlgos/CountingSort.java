package sortingAlgos;

public class CountingSort {
    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 18, 14, 13, 10, 17, 12, 16};
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        for (int age : ages) {
            count[age - minAge]++;
        }
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        int[] output = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            int index = ages[i] - minAge;
            output[--count[index]] = ages[i];
        }
        for (int age : output) {
            System.out.print(age + " ");
        }
    }
}