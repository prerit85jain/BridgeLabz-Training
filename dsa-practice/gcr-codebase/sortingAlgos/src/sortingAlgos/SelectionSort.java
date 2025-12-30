package sortingAlgos;

public class SelectionSort {
    public static void main(String[] args) {
        int[] scores = {78, 92, 65, 88, 70, 55, 85};
        for (int i = 0; i < scores.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = scores[minIdx];
            scores[minIdx] = scores[i];
            scores[i] = temp;
        }
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}