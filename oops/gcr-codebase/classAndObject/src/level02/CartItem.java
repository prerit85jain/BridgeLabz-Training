package level02;
//CartItem.java
public class CartItem {
 String itemName;
 double price;
 int quantity;

 public CartItem(String itemName, double price, int quantity) {
     this.itemName = itemName;
     this.price = price;
     this.quantity = quantity;
 }

 public double getTotalPrice() {
     return price * quantity;
 }
}