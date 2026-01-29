package aeroVigil;

class FlightUtil {
	
	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
		if(!flightNumber.matches("^FL-[1-9]\\d{3}$")) {
			throw new InvalidFlightException("The flight number "+flightNumber+" is invalid");
		}
		return true;
	}
	
	public boolean validateFightName(String flightName) throws InvalidFlightException {
		
		if(flightName.equalsIgnoreCase("SpiceJet") || flightName.equalsIgnoreCase("Vistara") ||
				flightName.equalsIgnoreCase("IndiGo") || flightName.equalsIgnoreCase("Air Arabia")) {
			return true;
		}else {
			throw new InvalidFlightException("The flight name "+flightName+" is invalid");
		}
	}
	
	public boolean validPassengerCount(int passengerCount, String flightName) throws InvalidFlightException {
		if(passengerCount <= 0)	throw new InvalidFlightException("The passenger count "+passengerCount+" is invalid for "+flightName);
		
		if(flightName.equalsIgnoreCase("SpiceJet") && passengerCount<=396) {return true;}
		else if(flightName.equalsIgnoreCase("Vistara") && passengerCount<=615) {return true;}
		else if(flightName.equalsIgnoreCase("IndiGo") && passengerCount<=230) {return true;}
		else if(flightName.equalsIgnoreCase("Air Arabia") && passengerCount<=130) {return true;}
		else {throw new InvalidFlightException("The passenger count "+passengerCount+" is invalid for "+flightName);}
	}
	
	public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
		if(currentFuelLevel<0) {throw new InvalidFlightException("Invalid fuel level for "+flightName);}
		
		if(flightName.equalsIgnoreCase("SpiceJet") && currentFuelLevel<=200000) {return 200000-currentFuelLevel;}
		else if(flightName.equalsIgnoreCase("Vistara") && currentFuelLevel<=300000) {return 300000-currentFuelLevel;}
		else if(flightName.equalsIgnoreCase("IndiGo") && currentFuelLevel<=250000) {return 250000-currentFuelLevel;}
		else if(flightName.equalsIgnoreCase("Air Arabia") && currentFuelLevel<=150000) {return 150000-currentFuelLevel;}
		else {throw new InvalidFlightException("Invalid fuel level for "+flightName);}
	}
}
