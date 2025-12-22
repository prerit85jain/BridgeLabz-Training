package level03;

public class HarshadNumberChecker {

    public static void main(String[] args) {
        int number = 123321;

        System.out.println("Number: " + number);

        int count = NumberChecker.countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = NumberChecker.getDigitsArray(number);
        System.out.print("Digits array: ");
        for(int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int sumDigits = NumberChecker.getSumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        int sumSquares = NumberChecker.getSumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        boolean isHarshad = NumberChecker.isHarshadNumber(number, digits);
        System.out.println("Is Harshad number?: " + isHarshad);

        int[][] frequencies = NumberChecker.getDigitFrequencies(digits);
        System.out.println("Digit frequencies:");
        for(int i=0; i<frequencies.length; i++) {
            if(frequencies[i][1] > 0) {
                System.out.println("Digit " + frequencies[i][0] + ": " + frequencies[i][1]);
            }
        }
    }
}