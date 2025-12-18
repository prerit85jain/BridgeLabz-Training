import java.util.Scanner;

public class HeightConvertor {
    // Main Function
    public static void main(String[] args) {
        // Creating scanner object
		Scanner scanner = new Scanner(System.in);
        // Taking input of height in CM
		int cm = scanner.nextInt();
		double inch = cm/2.54; // Convert to inches
		double feet = inch/12; // Convert to feet
		
		System.out.println("Your Height in cm is "+cm+" while in feet is "+feet+" and inches is "+inch);
		scanner.close();
	}
}
