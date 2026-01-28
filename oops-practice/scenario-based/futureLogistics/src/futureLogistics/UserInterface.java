package futureLogistics;

import java.util.Scanner;

public class UserInterface {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Goods Transport details");
		String details = scanner.nextLine();
		
		Utility utility = new Utility();
		
		GoodsTransport goodsTransport = utility.parseDetails(details);
		if(goodsTransport == null) {
			return;
		}
		String type = utility.findObjectType(goodsTransport);
		
		
		if(type.equalsIgnoreCase("BrickTransport")) {
			BrickTransport obj = (BrickTransport) goodsTransport;
			System.out.println("Transpoter id : " + goodsTransport.getTransportId());
			System.out.println("Date of transport : " + goodsTransport.getTransportDate());
			System.out.println("Rating of the transport : " + goodsTransport.getTransportRating());
			System.out.println("Quantity of bricks : " + obj.getBrickQuantity());
			System.out.println("Brick price : " + obj.getBrickPrice());
			System.out.println("Vehicle for transport : " + obj.vehicleSelection());
			System.out.println("Total Charge : " + obj.calculateTotalCharge());
		}else if(type.equalsIgnoreCase("TimberTransport")) {
			TimberTransport obj = (TimberTransport) goodsTransport;
			System.out.println("Transpoter id : " + goodsTransport.getTransportId());
			System.out.println("Date of transport : " + goodsTransport.getTransportDate());
			System.out.println("Rating of the transport : " + goodsTransport.getTransportRating());
			System.out.println("Type of the timber : " + obj.getTimberType());
			System.out.println("Timber price per kg : " + obj.getTimberPrice());
			System.out.println("Vehicle for transport : " + obj.vehicleSelection());
			System.out.println("Total Charge : " + obj.calculateTotalCharge());
		}
		scanner.close();
	}

}
