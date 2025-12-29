package level01;
public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        System.out.println();

        HotelBooking paramBooking = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("Parameterized Booking:");
        paramBooking.displayBooking();

        System.out.println();

        HotelBooking copiedBooking = new HotelBooking(paramBooking);
        System.out.println("Copied Booking:");
        copiedBooking.displayBooking();

        copiedBooking.setGuestName("Jane Smith");
        copiedBooking.setRoomType("Suite");
        copiedBooking.setNights(5);
        System.out.println("\nAfter modifications to copied booking:");
        System.out.println("Original Booking:");
        paramBooking.displayBooking();
        System.out.println("Copied Booking:");
        copiedBooking.displayBooking();
    }
}