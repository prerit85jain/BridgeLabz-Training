package eCommercePlatform;

class ProductUtils {
    public static void showFinalPrice(Product product) {
        double discount = 0;
        double tax = 0;

        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
        }

        if (product instanceof Product) {
            discount = product.calculateDiscount();
        }

        double finalPrice = product.getPrice() + tax - discount;

        System.out.println("Product: " + product.getName());
        System.out.println("Base Price: $" + product.getPrice());
        if (product instanceof Taxable) {
            System.out.println("Tax (" + ((Taxable) product).getTaxDetails() + "): $" + tax);
        } else {
            System.out.println("No tax applicable");
        }
        System.out.println("Discount: -$" + discount);
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("------------------------------------");
    }
}