package smartWarehouseSystem;

public class SmartWarehouseSystem {
	public static void main(String[] args) {
			Storage<Electronics> electronicsStorage = new Storage<>();
			electronicsStorage.addItem(new Electronics("Laptop", 80000, "Dell"));
			electronicsStorage.addItem(new Electronics("Smartphone", 25000, "Samsung"));
			
			Storage<Groceries> groceriesStorage = new Storage<>();
			groceriesStorage.addItem(new Groceries("Rice", 2000, "2025-12-31"));
			groceriesStorage.addItem(new Groceries("Milk", 50, "2024-08-01"));
			
			Storage<Furniture> furnitureStorage = new Storage<>();
			furnitureStorage.addItem(new Furniture("Chair", 1500, "Wood"));
			furnitureStorage.addItem(new Furniture("Sofa", 12000, "Leather"));
			
		WarehouseUtility.displayItems(electronicsStorage.getAllItems());
		WarehouseUtility.displayItems(groceriesStorage.getAllItems());
		WarehouseUtility.displayItems(furnitureStorage.getAllItems());
	}
}