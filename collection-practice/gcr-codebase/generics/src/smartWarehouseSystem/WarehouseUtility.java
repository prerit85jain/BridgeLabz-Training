package smartWarehouseSystem;

import java.util.List;

class WarehouseUtility {
	public static void displayItems(List<? extends WarehouseItem> items) {
			System.out.println("----- Warehouse Items -----");
			
			for (WarehouseItem item : items) {
				System.out.println(item);
			}
	}
}