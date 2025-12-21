package level01;
import java.util.Scanner;

public class ArrayIndexOutOfBound {
	
    public static void generateException(String[] names, int index) {
        System.out.println("Attempting to access index: " + index);
        String name = names[index];
        System.out.println("Name at index " + index + ": " + name);
    }

    public static void handleArrayIndexOutOfBounds(String[] names, int index) {
        try {
            generateException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"A", "B", "C", "D"};

        System.out.println("Enter an index greater than (0 to " + (names.length - 1) + "):");
        int index = scanner.nextInt();

//        generateException(names, index);

        handleArrayIndexOutOfBounds(names, index);

        scanner.close();
    }
}