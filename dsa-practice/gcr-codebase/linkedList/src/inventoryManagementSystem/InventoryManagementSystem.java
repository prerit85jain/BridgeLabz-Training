package inventoryManagementSystem;

public class InventoryManagementSystem {
    private Node head = null;

    public void addAtBeginning(Item item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(Item item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addAtPosition(Item item, int position) {
        if (position == 0 || head == null) {
            addAtBeginning(item);
            return;
        }
        Node newNode = new Node(item);
        Node temp = head;
        for (int i = 0; i < position -1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeByItemID(int itemID) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.item.itemID == itemID) {
            head = head.next;
            System.out.println("Item with ID " + itemID + " removed.");
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.item.itemID != itemID) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item with ID " + itemID + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item with ID " + itemID + " removed.");
        }
    }

    public void updateQuantity(int itemID, int newQuantity) {
        Node temp = head;
        while (temp != null) {
            if (temp.item.itemID == itemID) {
                temp.item.quantity = newQuantity;
                System.out.println("Quantity updated for item ID " + itemID);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemID + " not found.");
    }

    public void searchByItemID(int itemID) {
        Node temp = head;
        while (temp != null) {
            if (temp.item.itemID == itemID) {
                displayItem(temp.item);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemID + " not found.");
    }

    public void searchByItemName(String itemName) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.item.itemName.equalsIgnoreCase(itemName)) {
                displayItem(temp.item);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Item with name '" + itemName + "' not found.");
        }
    }

    public void displayTotalInventoryValue() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.item.price * temp.item.quantity;
            temp = temp.next;
        }
        System.out.printf("Total Inventory Value: $%.2f\n", total);
    }

    private void displayItem(Item item) {
        System.out.println("ID: " + item.itemID + ", Name: " + item.itemName +
                ", Quantity: " + item.quantity + ", Price: $" + item.price);
    }

    // Display all items
    public void displayAll() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Inventory Items:");
        Node temp = head;
        while (temp != null) {
            displayItem(temp.item);
            temp = temp.next;
        }
    }

    public void sortByName(boolean ascending) {
        head = mergeSort(head, true, ascending);
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, false, ascending);
    }

    private Node mergeSort(Node head, boolean sortByName, boolean ascending) {
        if (head == null || head.next == null)
            return head;

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head, sortByName, ascending);
        Node right = mergeSort(nextOfMiddle, sortByName, ascending);

        return sortedMerge(left, right, sortByName, ascending);
    }

    private Node getMiddle(Node head) {
        if (head == null)
            return head;
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node sortedMerge(Node a, Node b, boolean sortByName, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;

        int comparison;
        if (sortByName) {
            comparison = a.item.itemName.compareToIgnoreCase(b.item.itemName);
        } else {
            comparison = Double.compare(a.item.price, b.item.price);
        }
        if (ascending) {
            if (comparison <= 0) {
                a.next = sortedMerge(a.next, b, sortByName, ascending);
                return a;
            } else {
                b.next = sortedMerge(a, b.next, sortByName, ascending);
                return b;
            }
        } else {
            if (comparison >= 0) {
                a.next = sortedMerge(a.next, b, sortByName, ascending);
                return a;
            } else {
                b.next = sortedMerge(a, b.next, sortByName, ascending);
                return b;
            }
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        ims.addAtEnd(new Item("Laptop", 101, 5, 1200.50));
        ims.addAtBeginning(new Item("Smartphone", 102, 10, 800.75));
        ims.addAtEnd(new Item("Headphones", 103, 15, 150.25));
        ims.addAtPosition(new Item("Monitor", 104, 7, 300.00), 2);

        ims.displayAll();

        ims.removeByItemID(102);
        System.out.println("\nAfter removing item with ID 102:");
        ims.displayAll();

        ims.updateQuantity(103, 20);
        System.out.println("\nAfter updating quantity of item 103:");
        ims.displayAll();

        System.out.println("\nSearch by Item ID 104:");
        ims.searchByItemID(104);

        System.out.println("\nSearch by Item Name 'Headphones':");
        ims.searchByItemName("Headphones");

        System.out.println("\nTotal Inventory Value:");
        ims.displayTotalInventoryValue();

        ims.sortByName(true);
        System.out.println("\nSorted by Name (ascending):");
        ims.displayAll();

        ims.sortByPrice(false);
        System.out.println("\nSorted by Price (descending):");
        ims.displayAll();
    }
}