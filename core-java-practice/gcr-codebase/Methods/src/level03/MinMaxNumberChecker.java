package level03;
public class MinMaxNumberChecker {

    public static void main(String[] args) {
        int number = 153;

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + NumberChecker.countDigits(number));

        int[] digits = NumberChecker.getDigitsArray(number);
        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number? " + NumberChecker.isDuckNumber(number));
        System.out.println("Is Armstrong Number? " + NumberChecker.isArmstrongNumber(number));

        int[] largestAndSecondLargest = NumberChecker.findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestAndSecondLargest[0]);
        System.out.println("Second Largest: " + largestAndSecondLargest[1]);

        int[] smallestAndSecondSmallest = NumberChecker.findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestAndSecondSmallest[0]);
        System.out.println("Second Smallest: " + smallestAndSecondSmallest[1]);
    }
}