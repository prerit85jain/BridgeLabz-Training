package intermediateLevel;

@Author(name = "Prerit")
class Book{
	private String title;
	private int price;
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Title: " + title);
        System.out.println("Price: " + price);
	}
}

public class RetrieveAnnotationAtRuntime {

	public static void main(String[] args) {
		Class<?> clc = Book.class;
		
		if(clc.isAnnotationPresent(Author.class)) {
			Author author = clc.getAnnotation(Author.class);
			System.err.println("Author Name: "+ author.name());
		}
	}

}
