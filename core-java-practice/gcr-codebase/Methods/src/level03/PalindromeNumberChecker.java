package level03;

public class PalindromeNumberChecker {
	public static void main(String[] args) {
        int number = 123210;
        
        int count = NumberChecker.countDigits(number);
        int[] digits = NumberChecker.getDigitsArray(number);
        int[] reversedDigits = NumberChecker.reverseArray(digits);
        boolean palindrome = NumberChecker.isPalindrome(number);
        boolean duckNumber = NumberChecker.isDuckNumber(number);
        boolean arraysEqual = NumberChecker.compareArrays(digits, reversedDigits);

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + count);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.print("Reversed digits: ");
        for (int d : reversedDigits) {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("Is palindrome: " + palindrome);
        System.out.println("Is duck number: " + duckNumber);
        System.out.println("Digits array equals reversed array: " + arraysEqual);
    }
}
