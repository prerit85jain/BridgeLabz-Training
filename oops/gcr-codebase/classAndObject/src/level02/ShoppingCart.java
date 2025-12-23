package level02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
 private List<CartItem> cartItems;

 public ShoppingCart() {
     cartItems = new ArrayList<>();
 }

 public void addItem(CartItem item) {
     for (CartItem ci : cartItems) {
         if (ci.itemName.equalsIgnoreCase(item.itemName)) {
             ci.quantity += item.quantity;
             System.out.println("Updated quantity for " + item.itemName);
             return;
         }
     }
     cartItems.add(item);
     System.out.println(item.itemName + " added to the cart.");
 }

 public void removeItem(String itemName) {
     for (int i = 0; i < cartItems.size(); i++) {
         if (cartItems.get(i).itemName.equalsIgnoreCase(itemName)) {
             cartItems.remove(i);
             System.out.println(itemName + " removed from the cart.");
             return;
         }
     }
     System.out.println(itemName + " not found in the cart.");
 }

 public void displayTotalCost() {
     double total = 0;
     System.out.println("Items in your cart:");
     for (CartItem item : cartItems) {
         System.out.println(item.itemName + " - Quantity: " + item.quantity + " - Unit Price: $" + item.price + " - Total: $" + item.getTotalPrice());
         total += item.getTotalPrice();
     }
     System.out.println("Total Cost: $" + total);
 }

 public static void main(String[] args) {
     ShoppingCart cart = new ShoppingCart();
     Scanner scanner = new Scanner(System.in);
     boolean exit = false;

     while (!exit) {
         System.out.println("\nChoose an operation:");
         System.out.println("1. Add Item to Cart");
         System.out.println("2. Remove Item from Cart");
         System.out.println("3. Display Total Cost");
         System.out.println("4. Exit");
         System.out.print("Enter choice (1-4): ");

         int choice = scanner.nextInt();
         scanner.nextLine();

         switch (choice) {
             case 1:
                 System.out.print("Enter item name: ");
                 String name = scanner.nextLine();
                 System.out.print("Enter price: ");
                 double price = scanner.nextDouble();
                 System.out.print("Enter quantity: ");
                 int quantity = scanner.nextInt();
                 scanner.nextLine();
                 cart.addItem(new CartItem(name, price, quantity));
                 break;
             case 2:
                 System.out.print("Enter item name to remove: ");
                 String removeName = scanner.nextLine();
                 cart.removeItem(removeName);
                 break;
             case 3:
                 cart.displayTotalCost();
                 break;
             case 4:
                 exit = true;
                 System.out.println("Exiting the program. Thank you!");
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     }
     scanner.close();
 }
}