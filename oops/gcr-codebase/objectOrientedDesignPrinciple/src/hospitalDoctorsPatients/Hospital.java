package hospitalDoctorsPatients;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    static class Doctor {
        private String name;
        private List<Patient> patientsSeeing;

        public Doctor(String name) {
            this.name = name;
            this.patientsSeeing = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void consult(Patient patient) {
            if (!patientsSeeing.contains(patient)) {
                patientsSeeing.add(patient);
            }
            System.out.println("Dr. " + name + " is consulting with " + patient.getName());
        }

        public void showPatients() {
            System.out.println("Dr. " + name + " has the following patients:");
            for (Patient p : patientsSeeing) {
                System.out.println(" - " + p.getName());
            }
        }
    }

    static class Patient {
        private String name;
        private List<Doctor> consultingDoctors;

        public Patient(String name) {
            this.name = name;
            this.consultingDoctors = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addDoctor(Doctor doctor) {
            if (!consultingDoctors.contains(doctor)) {
                consultingDoctors.add(doctor);
            }
        }

        public void showDoctors() {
            System.out.println("Patient " + name + " consults with:");
            for (Doctor d : consultingDoctors) {
                System.out.println(" - Dr. " + d.getName());
            }
        }
    }

    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Smith");
        Doctor doctor2 = new Doctor("Johnson");

        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");
        Patient patient3 = new Patient("Charlie");

        doctor1.consult(patient1);
        doctor1.consult(patient2);

        doctor2.consult(patient2);
        doctor2.consult(patient3);

        patient1.addDoctor(doctor1);
        patient2.addDoctor(doctor1);
        patient2.addDoctor(doctor2);
        patient3.addDoctor(doctor2);

        System.out.println("\n--- Doctors and their patients ---");
        doctor1.showPatients();
        doctor2.showPatients();

        System.out.println("\n--- Patients and their doctors ---");
        patient1.showDoctors();
        patient2.showDoctors();
        patient3.showDoctors();
    }
}