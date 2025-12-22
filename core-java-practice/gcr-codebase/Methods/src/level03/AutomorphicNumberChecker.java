package level03;

public class AutomorphicNumberChecker {
	public static void main(String[] args) {
        int[] testNumbers = {17, 28, 45, 76, 371, 9, 703, 135};

        for (int number : testNumbers) {
            System.out.println("Number: " + number);
            System.out.println("Prime: " + NumberChecker.isPrime(number));
            System.out.println("Neon number: " + NumberChecker.isNeonNumber(number));
            System.out.println("Spy number: " + NumberChecker.isSpyNumber(number));
            System.out.println("Automorphic number: " + NumberChecker.isAutomorphicNumber(number));
            System.out.println("Buzz number: " + NumberChecker.isBuzzNumber(number));
        }
    }
}
