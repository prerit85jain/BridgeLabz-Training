package onlineFoodDeliverySystem;

class NonVegItem extends FoodItem implements Discountable {
    private double extraCharge;
    private double discountPercentage;

    public NonVegItem(String itemName, double price, int quantity, double extraCharge, double discountPercentage) {
        super(itemName, price, quantity);
        this.extraCharge = extraCharge;
        this.discountPercentage = discountPercentage;
    }

    public double calculateTotalPrice() {
        double baseTotal = (getPrice() + extraCharge) * getQuantity();
        baseTotal -= applyDiscount();
        return baseTotal;
    }

    public double applyDiscount() {
        return ((getPrice() + extraCharge) * getQuantity()) * (discountPercentage / 100);
    }

    public String getDiscountDetails() {
        return "Non-Veg Item Discount @ " + discountPercentage + "%";
    }
}