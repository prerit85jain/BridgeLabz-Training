package libraryManagementSystem;

public class LibraryManagement {
    public static void main(String[] args) {
        Library lib = new Library();

        // Sample Data
        lib.addAtBeginning(new Book(101, "Harry Potter", "J.K. Rowling", "Fantasy", true));
        lib.addAtEnd(new Book(102, "The Hobbit", "J.R.R. Tolkien", "Fantasy", true));
        lib.addAtPosition(new Book(103, "Inferno", "Dan Brown", "Thriller", false), 2);

        // Functionality Demo
        lib.displayForward();
        lib.displayReverse();

        lib.search("Dan Brown");
        lib.updateAvailability(102, false);

        lib.removeByBookID(103);
        lib.displayForward();
        lib.countBooks();
    }
}