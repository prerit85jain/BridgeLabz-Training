package inventoryManagementSystem;

class Item {
    String itemName;
    int itemID;
    int quantity;
    double price;

    Item(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
    }
}