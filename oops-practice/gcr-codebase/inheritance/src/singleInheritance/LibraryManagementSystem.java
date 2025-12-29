package singleInheritance;

public class LibraryManagementSystem {

	class Book {
	    String title;
	    int publicationYear;

	    public Book(String title, int publicationYear) {
	        this.title = title;
	        this.publicationYear = publicationYear;
	    }

	    public void displayInfo() {
	        System.out.println("Book Details:");
	        System.out.println("Title: " + title);
	        System.out.println("Publication Year: " + publicationYear);
	    }
	}

	class Author extends Book {
	    private String name;
	    private String bio;

	    public Author(String title, int publicationYear, String name, String bio) {
	        super(title, publicationYear);
	        this.name = name;
	        this.bio = bio;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Author Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Bio: " + bio);
	        System.out.println("------------------------------");
	    }
	}

	public static void main(String[] args) {
		LibraryManagementSystem lms = new LibraryManagementSystem();
		
	    Author author1 = lms.new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald", "American novelist and short story writer.");
	    author1.displayInfo();
	}
}
