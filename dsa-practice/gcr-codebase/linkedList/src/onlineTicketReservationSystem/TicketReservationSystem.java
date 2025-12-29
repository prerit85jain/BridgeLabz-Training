package onlineTicketReservationSystem;

public class TicketReservationSystem {
    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();

        system.addTicket(1, "Alice", "Inception", "A1", "10:00 AM");
        system.addTicket(2, "Bob", "Interstellar", "B2", "12:00 PM");
        system.addTicket(3, "Charlie", "Inception", "C3", "2:00 PM");

        system.displayTickets();

        system.searchTicket("Alice");

        system.searchTicket("Inception");

        system.countTickets();

        system.removeTicket(2);

        system.displayTickets();

        system.countTickets();
    }
}