import java.util.Scanner;

public class QuotientReminder {
    // Main Function
    public static void main(String[] args) {
        //  Creating scanner object
		Scanner sc = new Scanner(System.in);
        // Taking input of two numbers
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("The Quotient is "+(num1/num2)+" and Reminder is "+(num1%num2)+" of two number "+num1+" and "+num2);
		sc.close();
	}
}
