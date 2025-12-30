package sortingAlgos;

public class InsertionSort {
    public static void main(String[] args) {
        int[] employeeIDs = {1043, 1021, 1056, 1010, 1035, 1028};

        insertionSort(employeeIDs);

        System.out.println("Sorted employee IDs in ascending order:");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}