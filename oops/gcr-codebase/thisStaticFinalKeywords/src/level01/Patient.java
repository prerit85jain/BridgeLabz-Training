package level01;
public class Patient {
    private static String hospitalName = "City Hospital";

    private static int totalPatients = 0;

    private final String patientID;

    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public static String getHospitalName() {
        return hospitalName;
    }

    public static void setHospitalName(String newHospitalName) {
        hospitalName = newHospitalName;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public void displayPatientDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("John Doe", 45, "Flu", "P1001");
        Patient patient2 = new Patient("Jane Smith", 30, "Allergy", "P1002");

        if (patient1 instanceof Patient) {
            patient1.displayPatientDetails();
        }
        if (patient2 instanceof Patient) {
            patient2.displayPatientDetails();
        }

        Patient.getTotalPatients();

        Patient.setHospitalName("Regional Medical Center");
        System.out.println("\nUpdated Hospital Name:");
        patient1.displayPatientDetails();

    }
}