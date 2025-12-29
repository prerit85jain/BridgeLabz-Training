package eCommercePlatform;
import java.util.ArrayList;
import java.util.List;

class Customer {
 private String name;
 private List<Order> orders;

 public Customer(String name) {
     this.name = name;
     this.orders = new ArrayList<>();
 }

 public void placeOrder(Order order) {
     orders.add(order);
     System.out.println(name + " placed Order #" + order.orderId);
 }

 public void viewOrders() {
     System.out.println("Orders for " + name + ":");
     for (Order order : orders) {
         order.displayOrder();
         System.out.println();
     }
 }
}
