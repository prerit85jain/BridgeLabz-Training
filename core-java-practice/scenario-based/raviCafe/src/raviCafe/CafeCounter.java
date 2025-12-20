package raviCafe;
import java.util.Scanner;
public class CafeCounter {
	public static void main(String[] args) {
		// Create Scanner Object
		Scanner scanner = new Scanner(System.in);
		// Coffee options for customers  
		System.out.println("S.No.	Coffee options		Price");
		System.out.println("+---------------------------------+");
		System.out.println("1.	Americano		270");
		System.out.println("2.	Cappucino		270");
		System.out.println("3.	Latte			360");
		System.out.println("4.	Mocha			460");
		System.out.println("Enter exit to quit");
		// Add all the price in total price 
		double totalPrice = 0;
		
		// Infinite loop to take customer demand
		while(true) {
			// take input of coffee
			System.out.print("Enter coffee option: ");
			String coffeeOption = scanner.next();
			
			// Check whether customer want to exit or not
			if(coffeeOption.equalsIgnoreCase("exit")) {
				break;
			}
			// Take input of quantity
			System.out.print("Enter quantity: ");
			int quantity = scanner.nextInt();

			// Generate bill on the basis of coffee choose and quantity
			switch(coffeeOption) {
			case "1":
				System.out.println("You select Americano @ 270");
				totalPrice += 270*quantity;
				break;
				
			case "2":
				System.out.println("You select Cappucino @ 270");
				totalPrice += 270*quantity;
				break;
			
			case "3":
				System.out.println("You select Latte @ 360");
				totalPrice += 360*quantity;
				break;
				
			case "4":
				System.out.println("You select Mocha @ 460");
				totalPrice += 460*quantity;
				break;

			default:
				System.out.println("Invalid option!");
				break;
			}
			System.out.println(); // Adding space to get next option
			System.out.println("Enter next option");
		}
		
		// Adding GST to the bill
		totalPrice = totalPrice + (0.18*totalPrice);
		System.out.printf("Your total bill %10s", totalPrice);
		scanner.close();
	}
}
