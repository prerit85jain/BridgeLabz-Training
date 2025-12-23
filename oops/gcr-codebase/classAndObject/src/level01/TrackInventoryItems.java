package level01;
// Create class for Item
class Item{
	// Declare require variables 
	private int[] itemCode;
	private String[] itemName;
	private double[] price;
	// Constructor to create object 
	Item(int[] itemCode, String[] itemName, double[] price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	public void displayDetails(int i) {
		System.out.println("Item Details: ");
		System.out.println("Item Code: "+ itemCode[i]);
		System.out.println("Item Name: "+ itemName[i]);
		System.out.println("Price: "+ price[i]);
		System.out.println("+------------------------------+");
	}
	
}
public class TrackInventoryItems {
	public static void main(String[] args) {
		int[] itemCode = {05, 03, 13};
		String[] itemName = {"Copy", "Bag", "Laptop"};
		double[] price = {25, 513, 55000};
		
		Item item1 = new Item(itemCode, itemName, price);
		
		for(int i=0; i<price.length; i++) {
			item1.displayDetails(i);
		}
	}
}
