package dynamicOnlineMarketplace;

public class Marketplace {
    public static void main(String[] args) {
        BookCategory bookCategory = new BookCategory();
        ClothingCategory clothingCategory = new ClothingCategory();
        GadgetCategory gadgetCategory = new GadgetCategory();

        Product<BookCategory> book = new Product<>("Java Programming", 50.0, bookCategory);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 20.0, clothingCategory);
        Product<GadgetCategory> phone = new Product<>("Smartphone", 300.0, gadgetCategory);

        DiscountUtils.applyDiscount(book, 10);
        DiscountUtils.applyDiscount(shirt, 20);
        DiscountUtils.applyDiscount(phone, 15);

        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}