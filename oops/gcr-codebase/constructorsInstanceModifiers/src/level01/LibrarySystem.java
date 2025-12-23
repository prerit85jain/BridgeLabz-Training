package level01;

class Books {
	private String title;
	private String author;
	private double price;
	private boolean isAvailable;
	
	public Books(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.isAvailable = true;
	}
	
	public boolean borrowBook() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("You have successfully borrowed \"" + title + "\".");
			return true;
		} else {
			System.out.println("Sorry, \"" + title + "\" is currently not available.");
			return false;
		}
	}
	
	public void displayDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: $" + price);
		System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
	}
}
	
public class LibrarySystem {
    public static void main(String[] args) {
        Books book1 = new Books("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Books book2 = new Books("1984", "George Orwell", 8.99);
        
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();

        System.out.println();
        book1.borrowBook();
        book2.borrowBook();

        System.out.println();
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
    }
}
