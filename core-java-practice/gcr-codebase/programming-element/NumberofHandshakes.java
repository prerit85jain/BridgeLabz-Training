import java.util.Scanner;

public class NumberofHandshakes {
    // Main Function
    public static void main(String args[]) {
        //  Creating scanner object
		Scanner sc = new Scanner(System.in);
        // Taking input of number of students
		int students = sc.nextInt();
        // Calculating number of handshakes
		int handshake = (students * (students - 1)) / 2;
		
		System.out.println("The number of possible handshakes are "+handshake);
		sc.close();
	}
}
