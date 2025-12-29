package eCommercePlatform;

public class ECommerceDemo {
 public static void main(String[] args) {
     Product laptop = new Product("Laptop", 999.99);
     Product smartphone = new Product("Smartphone", 599.99);
     Product headphones = new Product("Headphones", 199.99);

     Customer customer1 = new Customer("Alice");
     Customer customer2 = new Customer("Bob");

     Order order1 = new Order();
     order1.addProduct(laptop);
     order1.addProduct(headphones);
     customer1.placeOrder(order1);

     Order order2 = new Order();
     order2.addProduct(smartphone);
     customer2.placeOrder(order2);

     System.out.println("\n--- Customer Orders ---");
     customer1.viewOrders();
     customer2.viewOrders();
 }
}