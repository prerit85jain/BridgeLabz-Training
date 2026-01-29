package aeroVigil;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) throws InvalidFlightException {
		Scanner scanner = new Scanner(System.in);
		try {
			FlightUtil util = new FlightUtil();
			System.out.println("Enter flight details");
			String input = scanner.nextLine();
			
			String[] splitInput = input.trim().split(":");
			
			String flightNumber = splitInput[0];
			String flightName = splitInput[1];
			int passengerCount = Integer.parseInt(splitInput[2]);
			double currentFuelLevel = Double.parseDouble(splitInput[3]);
			
			if(!util.validateFightName(flightName)) {return;}
			if(!util.validateFlightNumber(flightNumber)) {return;}
			if(!util.validPassengerCount(passengerCount, flightName)) {return;}
			double fuelRequired = util.calculateFuelToFillTank(flightName, currentFuelLevel);
			System.out.println("Fuel required to fill the tank: " + fuelRequired + "liters.");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}

}
