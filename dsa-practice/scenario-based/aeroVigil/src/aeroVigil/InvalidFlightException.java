package aeroVigil;

@SuppressWarnings("serial")
class InvalidFlightException extends Exception {
	public InvalidFlightException(String message) {
		super(message);
	}
}
