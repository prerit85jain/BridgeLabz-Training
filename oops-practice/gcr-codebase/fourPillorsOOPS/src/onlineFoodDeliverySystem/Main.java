package onlineFoodDeliverySystem;

public class Main{
    public static void main(String[] args) {
        FoodItem[] orderItems = {
            new VegItem("Veg Burger", 5.0, 2, 10),
            new NonVegItem("Chicken Pasta", 8.0, 1, 2.0, 15)
        };

        for (FoodItem item : orderItems) {
            System.out.println(item.getItemDetails());
            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            System.out.println("Total Price: $" + item.calculateTotalPrice());
            System.out.println("----------------------------------");
        }
    }
}