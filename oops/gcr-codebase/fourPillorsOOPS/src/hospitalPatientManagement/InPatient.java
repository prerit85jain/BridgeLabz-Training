package hospitalPatientManagement;
import java.util.ArrayList;
import java.util.List;

class InPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();
    private double roomChargesPerDay;
    private int stayDays;

    public InPatient(String patientId, String name, int age, String diagnosis, double roomChargesPerDay, int stayDays) {
        super(patientId, name, age);
        this.diagnosis = diagnosis;
        this.roomChargesPerDay = roomChargesPerDay;
        this.stayDays = stayDays;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public double calculateBill() {
        return roomChargesPerDay * stayDays;
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}