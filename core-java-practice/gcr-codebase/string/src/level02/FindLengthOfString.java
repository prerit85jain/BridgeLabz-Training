package level02;

import java.util.Scanner;
public class FindLengthOfString{

    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        int lengthWithoutMethod = getStringLength(inputString);

        int lengthWithMethod = inputString.length();
        
        System.out.println("Length of the string using custom method: " + lengthWithoutMethod);
        System.out.println("Length of the string using built-in method: " + lengthWithMethod);

        scanner.close();
    }
}