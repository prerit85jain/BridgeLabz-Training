package movieManagementSystem;

public class MovieManagementSystem {
    private Node head;
    private Node tail;

    public MovieManagementSystem() {
        this.head = null;
        this.tail = null;
    }

    // Add at the beginning
    public void addAtBeginning(Movie movie) {
        Node newNode = new Node(movie);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at the end
    public void addAtEnd(Movie movie) {
        Node newNode = new Node(movie);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at specific position (0-based index)
    public void addAtPosition(Movie movie, int position) {
        if (position == 0) {
            addAtBeginning(movie);
            return;
        }
        Node newNode = new Node(movie);
        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            // inserting at the end
            tail = newNode;
        }
        temp.next = newNode;
    }

    // Remove by Movie Title
    public void removeByTitle(String title) {
        Node temp = head;
        while (temp != null) {
            if (temp.movie.title.equalsIgnoreCase(title)) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    // removing head
                    head = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    // removing tail
                    tail = temp.prev;
                }
                System.out.println("Movie \"" + title + "\" removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    // Search by Director
    public void searchByDirector(String director) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.movie.director.equalsIgnoreCase(director)) {
                displayMovie(temp.movie);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found for director: " + director);
        }
    }

    // Search by Rating
    public void searchByRating(String rating) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.movie.rating.equalsIgnoreCase(rating)) {
                displayMovie(temp.movie);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found with rating: " + rating);
        }
    }

    // Display all movies forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies to display.");
            return;
        }
        System.out.println("Movies in forward order:");
        Node temp = head;
        while (temp != null) {
            displayMovie(temp.movie);
            temp = temp.next;
        }
    }

    // Display all movies backward
    public void displayBackward() {
        if (tail == null) {
            System.out.println("No movies to display.");
            return;
        }
        System.out.println("Movies in reverse order:");
        Node temp = tail;
        while (temp != null) {
            displayMovie(temp.movie);
            temp = temp.prev;
        }
    }

    // Update a movie's rating based on the title
    public void updateRating(String title, String newRating) {
        Node temp = head;
        while (temp != null) {
            if (temp.movie.title.equalsIgnoreCase(title)) {
                temp.movie.rating = newRating;
                System.out.println("Rating updated for \"" + title + "\"");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    // Utility method to display movie details
    private void displayMovie(Movie movie) {
        System.out.println("Title: " + movie.title + ", Director: " + movie.director +
                ", Year: " + movie.yearOfRelease + ", Rating: " + movie.rating);
    }

    // Main method with example usage
    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();

        // Adding movies
        mms.addAtEnd(new Movie("Inception", "Christopher Nolan", 2010, "A"));
        mms.addAtBeginning(new Movie("The Matrix", "Lana Wachowski", 1999, "A"));
        mms.addAtEnd(new Movie("Interstellar", "Christopher Nolan", 2014, "A"));
        mms.addAtPosition(new Movie("The Dark Knight", "Christopher Nolan", 2008, "A+"), 2);

        // Display movies
        mms.displayForward();
        System.out.println();
        mms.displayBackward();

        // Search by director
        System.out.println("\nMovies directed by Christopher Nolan:");
        mms.searchByDirector("Christopher Nolan");

        // Search by rating
        System.out.println("\nMovies with rating A:");
        mms.searchByRating("A");

        // Update rating
        mms.updateRating("Interstellar", "A+");
        System.out.println("\nAfter rating update:");
        mms.displayForward();

        // Remove a movie
        mms.removeByTitle("The Matrix");
        System.out.println("\nAfter removing 'The Matrix':");
        mms.displayForward();
    }
}