package libraryManagementSystem;

class Library {
    private Book head = null;
    private Book tail = null;

    // Add book at beginning
    public void addAtBeginning(Book newBook) {
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        System.out.println("Book added at the beginning.");
    }

    // Add book at end
    public void addAtEnd(Book newBook) {
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        System.out.println("Book added at the end.");
    }

    // Add book at specific position (1-based index)
    public void addAtPosition(Book newBook, int position) {
        if (position <= 1 || head == null) {
            addAtBeginning(newBook);
            return;
        }

        Book temp = head;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(newBook);
        } else {
            newBook.next = temp.next;
            newBook.prev = temp;
            temp.next.prev = newBook;
            temp.next = newBook;
            System.out.println("Book added at position " + position + ".");
        }
    }

    // Remove book by Book ID
    public void removeByBookID(int bookID) {
        Book temp = head;

        while (temp != null && temp.bookID != bookID) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book with ID " + bookID + " not found.");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book with ID " + bookID + " removed.");
    }

    // Search book by Title or Author
    public void search(String keyword) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(keyword) || temp.author.equalsIgnoreCase(keyword)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found with Title or Author: " + keyword);
        }
    }

    // Update availability status
    public void updateAvailability(int bookID, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                temp.isAvailable = status;
                System.out.println("Book availability updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    // Display all books forward
    public void displayForward() {
        System.out.println("Books in forward order:");
        Book temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    // Display all books reverse
    public void displayReverse() {
        System.out.println("Books in reverse order:");
        Book temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    public void countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total books in library: " + count);
    }

    // Print single book details
    private void printBook(Book b) {
        System.out.println("ID: " + b.bookID + ", Title: " + b.title + ", Author: " + b.author +
                ", Genre: " + b.genre + ", Available: " + (b.isAvailable ? "Yes" : "No"));
    }
}