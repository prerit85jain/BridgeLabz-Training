package libraryManagementSystem;

public class Main{
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B001", "Java Programming", "John Doe"),
            new Magazine("M001", "Science Monthly", "Jane Smith"),
            new DVD("D001", "The Matrix", "Wachowskis")
        };

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                reservableItem.reserveItem("Alice");
                System.out.println("Availability after reservation: " + reservableItem.checkAvailability());
            }
            System.out.println("------------------------------");
        }
    }
}