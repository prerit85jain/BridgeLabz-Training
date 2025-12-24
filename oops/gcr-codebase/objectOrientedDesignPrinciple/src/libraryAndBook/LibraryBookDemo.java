package libraryAndBook;

public class LibraryBookDemo {
public static void main(String[] args) {
	
   Book book1 = new Book("1984", "George Orwell");
   Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
   Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

   Library centralLibrary = new Library("Central Library");
   Library communityLibrary = new Library("Community Library");

   centralLibrary.addBook(book1);
   centralLibrary.addBook(book2);

   communityLibrary.addBook(book2);
   communityLibrary.addBook(book3);

   centralLibrary.displayBooks();
   System.out.println();
   communityLibrary.displayBooks();

   System.out.println("\nBooks exist independently outside libraries:");
   System.out.println(book1);
   System.out.println(book2);
   System.out.println(book3);
}
}