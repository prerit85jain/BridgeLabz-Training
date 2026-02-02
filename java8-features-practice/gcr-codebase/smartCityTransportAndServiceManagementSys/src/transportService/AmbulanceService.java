package transportService;

import java.time.LocalTime;

import interfaces.EmergencyService;
import interfaces.TransportService;

public class AmbulanceService implements TransportService, EmergencyService {

	private String route;
	private double fare;
	private LocalTime time;
	
	public AmbulanceService(String route, double fare, LocalTime time) {
		this.route = route;
		this.fare = fare;
		this.time = time;
	}

	@Override
	public String getServiceName() {return "Ambulance";}

	@Override
	public String getRoute() {return route;}

	@Override
	public double getFare() {return fare;}

	@Override
	public LocalTime getDepartureTime() {return time;}
}
