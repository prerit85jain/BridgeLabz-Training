package sortingAlgos;

public class QuickSort {
    public static void main(String[] args) {
        double[] prices = {29.99, 9.99, 15.49, 49.99, 5.99, 19.99, 39.99};

        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted product prices in ascending order:");
        for (double price : prices) {
            System.out.printf("%.2f ", price);
        }
    }

    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}