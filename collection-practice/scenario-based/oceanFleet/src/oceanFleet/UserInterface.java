package oceanFleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	
	public static Vessel createVessel(String input) {
		String [] splitInput = input.split(":");
		String vesselId = splitInput[0];
		String vesselName = splitInput[1];
		double averageSpeed = Double.parseDouble(splitInput[2]);
		String vesselType = splitInput[3];
		Vessel vessel = new Vessel(vesselId, vesselName, averageSpeed, vesselType);
		return vessel;
	}
	
	public static void printVesselById(Vessel vessel, String vesselId) {
		if(vessel != null) {
			System.out.println(vessel);
		}else {
			System.out.println("Vessel Id "+vesselId+" not forund.");
		}
	}
	
	public static void printHighPerformanceVessels(List<Vessel> vesselList) {
		System.out.println("\nHigh performance vessels are");
		for(Vessel v : vesselList) {
			System.out.println(v);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			VesselUtil util = new VesselUtil(); 
			System.out.println("Enter the number of vessels to be added:");
			int n = in.nextInt();
			in.nextLine();
			
			System.out.println("Enter vessel details");
			for(int i=0; i<n; i++) {
				String input = in.nextLine();
				util.addVesselPerformance(createVessel(input));
			}
			
			System.out.println("Enter the Vessel Id to check speed:");
			String vesselId = in.nextLine();
			printVesselById(util.getVesselById(vesselId), vesselId);
			
			printHighPerformanceVessels(util.getHighPerformanceVessel());

		}catch(Exception e) {
			System.out.println("Error occur: " + e);
		}
		in.close();
	}

}
