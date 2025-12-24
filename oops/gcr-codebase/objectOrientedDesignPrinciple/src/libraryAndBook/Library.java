package libraryAndBook;

import java.util.ArrayList;

class Library {
	 private String name;
	 private ArrayList<Book> books;

	 public Library(String name) {
	     this.name = name;
	     this.books = new ArrayList<>();
	 }

	 public void addBook(Book book) {
	     books.add(book);
	 }

	 public void displayBooks() {
	     System.out.println("Library: " + name);
	     for (Book book : books) {
	         System.out.println(" - " + book);
	     }
	 }
}