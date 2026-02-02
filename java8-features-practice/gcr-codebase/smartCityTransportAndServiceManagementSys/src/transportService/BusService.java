package transportService;

import java.time.LocalTime;
import interfaces.TransportService;

public class BusService implements TransportService {
	
	private String route;
	private double fare;
	private LocalTime time;
	
	public BusService(String route, double fare, LocalTime time) {
		this.route = route;
		this.fare = fare;
		this.time = time;
	}

	@Override
	public String getServiceName() {return "Bus";}

	@Override
	public String getRoute() {return route;}

	@Override
	public double getFare() {return fare;}

	@Override
	public LocalTime getDepartureTime() {return time;}
	
	
}
