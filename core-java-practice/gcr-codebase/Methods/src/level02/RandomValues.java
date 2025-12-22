package level02;
import java.util.Arrays;

public class RandomValues {

    public int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 9000) + 1000;
        }
        return array;
    }

    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for(int num : numbers) {
            sum += num;
            if(num < min) min = num;
            if(num > max) max = num;
        }

        double average = sum / numbers.length;
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        RandomValues rvs = new RandomValues();

        int[] randomNumbers = rvs.generate4DigitRandomArray(5);
        System.out.println("Random 4-digit numbers: " + Arrays.toString(randomNumbers));
        
        double[] stats = rvs.findAverageMinMax(randomNumbers);

        System.out.printf("Average: %.2f\n", stats[0]);
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
    }
}