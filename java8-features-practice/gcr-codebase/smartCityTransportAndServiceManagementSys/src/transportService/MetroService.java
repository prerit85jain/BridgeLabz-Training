package transportService;

import java.time.LocalTime;
import interfaces.TransportService;

public class MetroService implements TransportService {
	
	private String route;
	private double fare;
	private LocalTime time;
	
	public MetroService(String route, double fare, LocalTime time) {
		this.route = route;
		this.fare = fare;
		this.time = time;
	}

	@Override
	public String getServiceName() {return "Metro";}

	@Override
	public String getRoute() {return route;}

	@Override
	public double getFare() {return fare;}

	@Override
	public LocalTime getDepartureTime() {return time;}
	
}
