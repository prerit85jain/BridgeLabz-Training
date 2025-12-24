package level01;
public class Book {
    private static String libraryName = "Central Library";

    private final String isbn;

    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void setLibraryName(String libraryName) {
        Book.libraryName = libraryName;
    }

    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book.displayLibraryName();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "ISBN001");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN002");

        if (book1 instanceof Book) {
            book1.displayBookDetails();
        }
        if (book2 instanceof Book) {
            book2.displayBookDetails();
        }

        Book.setLibraryName("Departmental Library");
        Book.displayLibraryName();

    }
}