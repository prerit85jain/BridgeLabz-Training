import java.util.Scanner;

public class SideofSquare{
    // Main Function
    public static void main(String[] args) {
        // Creating scanner object
		Scanner sc = new Scanner(System.in);
        // Taking input of perimeter
		int perimeter = sc.nextInt();
		int side = perimeter/4; // Calculating side of square
		System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
		sc.close();
	}
}