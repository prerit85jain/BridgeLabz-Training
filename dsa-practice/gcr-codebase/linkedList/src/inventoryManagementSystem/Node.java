package inventoryManagementSystem;

class Node {
    Item item;
    Node next;

    Node(Item item) {
        this.item = item;
        this.next = null;
    }
}