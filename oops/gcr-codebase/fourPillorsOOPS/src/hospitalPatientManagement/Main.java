package hospitalPatientManagement;

public class Main{
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient("P001", "Alice", 30, "Flu", 500, 3),
            new OutPatient("P002", "Bob", 45, "Back Pain", 150)
        };

        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            
            if (p instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) p;
                record.addRecord("Initial diagnosis: " + (p instanceof InPatient ? ((InPatient)p).getDiagnosis() : ((OutPatient)p).getDiagnosis()));
                record.viewRecords();
            }

            System.out.println("Bill amount: $" + p.calculateBill());
            System.out.println("------------------------------------");
        }
    }
}