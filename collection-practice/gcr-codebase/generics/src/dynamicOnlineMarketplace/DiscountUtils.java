package dynamicOnlineMarketplace;

public class DiscountUtils {
    public static <T> void applyDiscount(Product<T> product, double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Invalid discount percentage");
        }
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
    }
}