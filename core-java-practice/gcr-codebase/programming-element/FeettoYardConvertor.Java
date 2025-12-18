import java.util.Scanner;
public class FeetToYardsConvertor {
    // Main Function
	public static void main(String args[]) {
        //  Creating scanner object
		Scanner sc = new Scanner(System.in);
		// Taking input of distance in feet
		double feet = sc.nextDouble();
		double yard = feet/3; // Convert to yards
		double mile = yard/1760; // Convert to miles
		
		System.out.println("Distance in feet is "+feet+" while in yards is "+yard+" and miles is "+mile);
		sc.close();
	}
}