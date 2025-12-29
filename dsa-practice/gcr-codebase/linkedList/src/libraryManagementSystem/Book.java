package libraryManagementSystem;

class Book {
    String title;
    String author;
    String genre;
    int bookID;
    boolean isAvailable;

    Book prev, next;

    public Book(int bookID, String title, String author, String genre, boolean isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}