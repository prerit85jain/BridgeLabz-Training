package eCommercePlatform;

import java.util.ArrayList;
import java.util.List;

class Order {
 private static int orderCounter = 1;
 public int orderId;
 private List<Product> products;

 public Order() {
     this.orderId = orderCounter++;
     this.products = new ArrayList<>();
 }

 public void addProduct(Product product) {
     products.add(product);
 }

 public double getTotalPrice() {
     double total = 0;
     for (Product p : products) {
         total += p.getPrice();
     }
     return total;
 }

 public void displayOrder() {
     System.out.println("Order #" + orderId + ":");
     for (Product p : products) {
         System.out.println(" - " + p);
     }
     System.out.println("Total Price: $" + getTotalPrice());
 }
}
