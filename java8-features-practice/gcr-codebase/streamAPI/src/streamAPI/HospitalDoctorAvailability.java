package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Doctor{
	String name;
	String specialty;
	boolean availableOnWeekend;
	public Doctor(String name, String specialty, boolean availableOnWeekend) {
		this.name = name;
		this.specialty = specialty;
		this.availableOnWeekend = availableOnWeekend;
	}
	
	public String getSpecialty() {return specialty;}
	
}

public class HospitalDoctorAvailability {

	public static void main(String[] args) {
		List<Doctor> doctor = Arrays.asList(
				new Doctor("Dr. A", "Cardiology", true),
                new Doctor("Dr. B", "Neurology", false),
                new Doctor("Dr. C", "Orthopedic", true),
                new Doctor("Dr. D", "Dermatology", true),
                new Doctor("Dr. E", "Pediatrics", false)
                );
		
		doctor.stream().filter(d -> d.availableOnWeekend).sorted(Comparator.comparing(Doctor::getSpecialty))
		.forEach(d -> System.out.println(d.name + " - " + d.specialty));
	}

}
