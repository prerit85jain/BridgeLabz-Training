import java.util.Scanner;
public class PriceCalculator {
	// Main Function
	public static void main(String args[]) {
		//  Creating scanner object
		Scanner sc = new Scanner(System.in);
		// Taking input of price and quantity
		int price = sc.nextInt();
		int quantity = sc.nextInt();
		
		System.out.println("The total purchase price is INR "+(price*quantity)+" if the quantity "+quantity+" and unit price is INR "+price);
		sc.close();
	}
}