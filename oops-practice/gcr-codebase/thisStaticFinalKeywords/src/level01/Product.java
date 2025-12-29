package level01;
public class Product {
    private static double discount = 0.10;

    private final String productID;

    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 1) {
            discount = newDiscount;
        } else {
            System.out.println("Invalid discount value. Must be between 0 and 1.");
        }
    }

    public static double getDiscount() {
        return discount;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscountedPrice() {
        return price * (1 - discount);
    }
    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Price after discount: $" + getDiscountedPrice());
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.00, 2, "P001");
        Product product2 = new Product("Smartphone", 800.00, 3, "P002");
        if (product1 instanceof Product) {
            product1.displayProductDetails();
        }
        if (product2 instanceof Product) {
            product2.displayProductDetails();
        }

        Product.updateDiscount(0.20);
        System.out.println("\nAfter updating discount:");
        product1.displayProductDetails();
    }
}