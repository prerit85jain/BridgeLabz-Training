import java.util.Scanner;

public class DoubleOpt {
    // Main Function
    public static void main(String[] args) {
        // Creating scanner object
		Scanner sc = new Scanner(System.in);
        // Taking input of three numbers
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();	
        
		System.out.println("The results of Int Operations are "+(a + b *c)+", "+(a * b + c)+", "+(c + a / b)+", and "+(a % b + c));
		sc.close();
	}
}
