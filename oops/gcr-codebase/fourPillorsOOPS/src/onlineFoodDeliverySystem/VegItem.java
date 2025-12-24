package onlineFoodDeliverySystem;

class VegItem extends FoodItem implements Discountable {
    private double discountPercentage;

    public VegItem(String itemName, double price, int quantity, double discountPercentage) {
        super(itemName, price, quantity);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        total -= applyDiscount();
        return total;
    }

    @Override
    public double applyDiscount() {
        return (getPrice() * getQuantity()) * (discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount @ " + discountPercentage + "%";
    }
}