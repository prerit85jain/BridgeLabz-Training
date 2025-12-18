import java.util.Scanner;

public class IntOperation {
    //  Main Function
    public static void main(String args[]) {
        // Creating scanner object
		Scanner sc = new Scanner(System.in);
        // Taking input of three numbers
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("The results of Int Operations are "+(a + b *c)+", "+(a * b + c)+", "+(c + a / b)+", and "+(a % b + c));
		sc.close();
	}
}
