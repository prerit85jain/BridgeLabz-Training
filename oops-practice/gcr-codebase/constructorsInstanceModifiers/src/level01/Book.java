package level01;
public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.setTitle("The Great Gatsby");
        defaultBook.setAuthor("F. Scott Fitzgerald");
        defaultBook.setPrice(10.99);

        Book paramBook = new Book("1984", "George Orwell", 8.99);

        System.out.println("Default Book:");
        defaultBook.displayDetails();

        System.out.println("\nParameterized Book:");
        paramBook.displayDetails();
    }
}