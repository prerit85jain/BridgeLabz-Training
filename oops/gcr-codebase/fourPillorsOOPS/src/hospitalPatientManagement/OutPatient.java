package hospitalPatientManagement;
import java.util.ArrayList;
import java.util.List;

class OutPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age);
        this.diagnosis = diagnosis;
        this.consultationFee = consultationFee;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public double calculateBill() {
        return consultationFee;
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