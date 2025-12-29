package level01;

class Book{
	private String title;
	private String author;
	private double price;
	
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("Display Book Detals: ");
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("Price: "+ price);
		System.out.println("+---------------------------+");
	}
}
public class HandleBookDetails {
	public static void main(String[] args) {
		Book book1 = new Book("Wings Of Fire", "Abdul Kalam.A.P.J", 500);
		
		book1.displayDetails();
	}
}
