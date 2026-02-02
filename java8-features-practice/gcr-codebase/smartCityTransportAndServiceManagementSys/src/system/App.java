package system;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import interfaces.*;
import transportService.*;

public class App {
	public static void main(String[] args) {
		List<TransportService> services = Arrays.asList(
				new BusService("Mathura-Kosi", 30, LocalTime.of(9, 30)),
				new MetroService("Sec05-Sec13", 135, LocalTime.of(5, 13)),
				new TexiService("Gate1-Gate3", 15, LocalTime.of(9, 0)),
				new AmbulanceService("GLA-KD Hospital", 0, LocalTime.of(8, 0))
				);
		
		services.forEach(TransportService::printServiceDetails);
		
		System.out.println("\n Filter by Lowest Fare & Earliest Time\n");
		
		services.stream().filter(s->s.getFare()<=50).sorted(Comparator.comparing(TransportService::getDepartureTime))
		.forEach(TransportService::printServiceDetails);
		
		FareCalculator calculator = distance -> distance*10;
		double distance = GeoUtils.calculateDistance(0, 0, 3, 4);
		System.out.println("\nCalculated Fare: " + calculator.calculateFare(distance));
	}
}
