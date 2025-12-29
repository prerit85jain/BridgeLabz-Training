package onlineTicketReservationSystem;

class TicketSystem {
    private Ticket head = null;
    private Ticket tail = null;

    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = tail = newTicket;
            tail.next = head;  // Circular link
        } else {
            tail.next = newTicket;
            newTicket.next = head;
            tail = newTicket;
        }
        System.out.println("Ticket added for " + customerName);
    }

    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket curr = head, prev = tail;
        boolean found = false;

        do {
            if (curr.ticketID == ticketID) {
                found = true;

                if (head == tail && head.ticketID == ticketID) {
                    head = tail = null;
                } 
                else if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } 
                else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                } 
                else {
                    prev.next = curr.next;
                }

                System.out.println("Ticket ID " + ticketID + " removed.");
                return;
            }

            prev = curr;
            curr = curr.next;
        } while (curr != head);

        if (!found) {
            System.out.println("Ticket ID " + ticketID + " not found.");
        }
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        System.out.println("Current Booked Tickets:");
        Ticket temp = head;
        do {
            printTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }

        boolean found = false;
        Ticket temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                printTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No matching ticket found for: " + keyword);
        }
    }

    public void countTickets() {
        if (head == null) {
            System.out.println("Total Booked Tickets: 0");
            return;
        }

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total Booked Tickets: " + count);
    }

    private void printTicket(Ticket t) {
        System.out.println("Ticket ID: " + t.ticketID + ", Customer: " + t.customerName +
                ", Movie: " + t.movieName + ", Seat: " + t.seatNumber + ", Time: " + t.bookingTime);
    }
}