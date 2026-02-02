package interfaces;

import java.time.LocalTime;

public interface TransportService {
	
	String getServiceName();
	String getRoute();
	double getFare();
	LocalTime getDepartureTime();
	
	default void printServiceDetails() {
		System.out.println("Service Name: " + getServiceName());
		System.out.println("Route: " + getRoute());
		System.out.println("Fare: " + getFare());
		System.out.println("Time: " + getDepartureTime());
		System.out.println();
	}
	
	static void logService(String msg) {
		System.out.println("Log: " + msg);
	}
}
