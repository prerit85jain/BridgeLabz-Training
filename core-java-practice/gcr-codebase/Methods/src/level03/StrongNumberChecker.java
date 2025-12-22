package level03;

public class StrongNumberChecker {
	public static void main(String[] args) {
        int[] testNumbers = {6, 12, 8, 145, 28, 15};

        for (int number : testNumbers) {
            System.out.println("Number: " + number);
            System.out.println("Perfect number: " + NumberChecker.isPerfectNumber(number));
            System.out.println("Abundant number: " + NumberChecker.isAbundantNumber(number));
            System.out.println("Deficient number: " + NumberChecker.isDeficientNumber(number));
            System.out.println("Strong number: " + NumberChecker.isStrongNumber(number));
        }
    }
}
