package libraryManagementSystem;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}