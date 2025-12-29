package eCommercePlatform;

class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.05;
    private double discountPercent;

    public Clothing(String productId, String name, double price, double discountPercent) {
        super(productId, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercent / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax @ " + (TAX_RATE * 100) + "%";
    }
}