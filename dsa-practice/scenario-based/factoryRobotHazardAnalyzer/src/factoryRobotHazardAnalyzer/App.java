package factoryRobotHazardAnalyzer;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			RobotHazardAuditor rha = new RobotHazardAuditor();
			System.out.println("Enter Arm Precision (0.0 - 1.0):");
			double armPrecision = sc.nextDouble();
			
			System.out.println("Enter Worker Density (1 - 20):");
			int workerDensity = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
			String machineryState = sc.nextLine();
			
			System.out.println("Robot Hazard Risk Score: " + rha.CalculateHazardRisk(armPrecision, workerDensity, machineryState));
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
