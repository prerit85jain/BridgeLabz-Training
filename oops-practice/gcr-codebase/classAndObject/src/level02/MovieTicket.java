package level02;

public class MovieTicket {
	String movieName;
	String seatNo;
	double price;
	
	MovieTicket(String movieName){
		this.movieName = movieName;
		this.seatNo = null;
		this.price = 0.0;
	}
	
	private void bookTicket(String seatNo, double price) {
		this.seatNo = seatNo;
		this.price = price;
		System.out.println("Ticket booked for seat "+seatNo+" at $"+price);
	}
	
	public void displayDetails(){
		System.out.println("Movie Details:");
		System.out.printf("Name:\t\t%s",movieName);
		System.out.printf("\nSeat No.:\t%s",seatNo);
		System.out.printf("\nDetails:\t%.2f",price);		
	}
	
	
	public static void main(String[] args) {
		MovieTicket ticket = new MovieTicket("Chhava");
		ticket.bookTicket("A1", 10);
		ticket.displayDetails();
	}

	
}
