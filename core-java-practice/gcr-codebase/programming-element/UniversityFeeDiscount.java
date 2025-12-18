import java.util.Scanner;
public class UniversityFeeDiscount {
    // Main Function
	public static void main(String[] args) {
        // Fee charged
		int fee = 125000;

        // Discount percemt
		int discountPercent = 10;
        
		int discount = discountPercent*fee / 100; // Calculate Discount Amount
		
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));
	}

	// Function to calculate discounted fee using scanner
	public static void calculateDiscountedFee() {
		Scanner scanner = new java.util.Scanner(System.in);

		// Input fee charged
		int fee = scanner.nextInt();

		// Input discount percent
		int discountPercent = scanner.nextInt();

		int discount = discountPercent * fee / 100; // Calculate Discount Amount

		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee - discount));
		scanner.close();
	}
}