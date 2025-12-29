package libraryManagementSystem;

class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrowerName = "";

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine is currently not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    public String getBorrowerName() {
        return borrowerName;
    }
}