package eCommercePlatform;

public class Main{
    public static void main(String[] args) {
        Electronics laptop = new Electronics("E001", "Laptop", 1000, 10);
        Clothing tshirt = new Clothing("C001", "T-Shirt", 20, 5);
        Groceries apples = new Groceries("G001", "Apples", 5);

        Product[] products = {laptop, tshirt, apples};

        for (Product product : products) {
            ProductUtils.showFinalPrice(product);
        }
    }
}