package eCommercePlatform;

class Electronics extends Product implements Taxable {
    private static final double TAX_RATE = 0.15; // 15% tax
    private double discountPercent;

    public Electronics(String productId, String name, double price, double discountPercent) {
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
        return "Electronics Tax @ " + (TAX_RATE * 100) + "%";
    }
}