package healthClinicApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HealthClinic {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		Patient patient = new Patient();
		Doctor doctor = new Doctor();
		Appointment appointment = new Appointment();
		Visit visit = new Visit();
		Bill bill = new Bill();
		Admin admin = new Admin();
		
		while(true) {
			System.out.println("\n====== HEALTH CLINIC MANAGEMENT SYSTEM ======");
            System.out.println("1. Patient Management (UC-1)");
            System.out.println("2. Doctor Management (UC-2)");
            System.out.println("3. Appointment Management (UC-3)");
            System.out.println("4. Visit & Prescription (UC-4)");
            System.out.println("5. Billing & Payments (UC-5)");
            System.out.println("6. System Administration (UC-6)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {

            case 1:
                System.out.println("\n--- Patient Management ---");
                System.out.println("1. Register Patient");
                System.out.println("2. Update Patient");
                System.out.println("3. Search Patient");
                System.out.println("4. View Patient Visit History");
                int pChoice = sc.nextInt();

                switch (pChoice) {
                    case 1:
                        System.out.print("Name: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.print("DOB (yyyy-mm-dd): ");
                        String dob = sc.nextLine();
                        System.out.print("Contact: ");
                        String contact = sc.nextLine();
                        System.out.print("Address: ");
                        String address = sc.nextLine();
                        System.out.print("Blood Group: ");
                        String bg = sc.nextLine();

                        patient.registerPatient(name, dob, contact, address, bg);
                        break;

                    case 2:
                        System.out.print("Patient ID: ");
                        int pid = sc.nextInt();
                        System.out.print("Name: ");
                        sc.nextLine();
                        String updatedName = sc.nextLine();
                        System.out.print("DOB (yyyy-mm-dd): ");
                        String updatedDob = sc.nextLine();
                        System.out.print("Contact: ");
                        String updatedContact = sc.nextLine();
                        System.out.print("Address: ");
                        String updateAdddress = sc.nextLine();
                        System.out.print("Blood Group: ");
                        String updatedBg = sc.nextLine();
                        sc.nextLine();
                        patient.updatePatient(pid, updatedName, updatedDob, updatedContact, updateAdddress, updatedBg);
                        break;

                    case 3:
                        System.out.print("Search by name or contact: ");
                        sc.nextLine();
                        String key = sc.nextLine();
                        patient.searchPatient(key);
                        break;

                    case 4:
                        System.out.print("Patient ID: ");
                        int pid2 = sc.nextInt();
                        patient.viewPatientVisitHistory(pid2);
                        break;
                }
                break;

            case 2:
                System.out.println("\n--- Doctor Management ---");
                System.out.println("1. Add Doctor");
                System.out.println("2. Update Specialty");
                System.out.println("3. View Doctors by Specialty");
                System.out.println("4. Deactivate Doctor");
                int dChoice = sc.nextInt();

                switch (dChoice) {
                    case 1:
                        sc.nextLine();
                        System.out.print("Doctor Name: ");
                        String dname = sc.nextLine();
                        System.out.print("Contact: ");
                        String dcontact = sc.nextLine();
                        System.out.print("Fee: ");
                        double fee = sc.nextDouble();
                        System.out.print("Specialty ID: ");
                        int sid = sc.nextInt();
                        doctor.registerDoctor(dname, dcontact, fee, sid);
                        break;

                    case 2:
                        System.out.print("Doctor ID: ");
                        int did = sc.nextInt();
                        System.out.print("New Specialty ID: ");
                        int nsid = sc.nextInt();
                        doctor.updateDoctor(did, nsid);
                        break;

                    case 3:
                        sc.nextLine();
                        System.out.print("Specialty Name: ");
                        String sp = sc.nextLine();
                        doctor.viewDoctorBySpecialty(sp);
                        break;

                    case 4:
                        System.out.print("Doctor ID: ");
                        int did2 = sc.nextInt();
                        doctor.deactivateDoctor(did2);
                        break;
                }
                break;

            case 3:
                System.out.println("\n--- Appointment Management ---");
                System.out.println("1. Book Appointment");
                System.out.println("2. Cancel Appointment");
                System.out.println("3. View Daily Schedule");
                int aChoice = sc.nextInt();

                switch (aChoice) {
                    case 1:
                        System.out.print("Patient ID: ");
                        int p = sc.nextInt();
                        System.out.print("Doctor ID: ");
                        int d = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Date (yyyy-mm-dd): ");
                        String date = sc.nextLine();
                        System.out.println("Time (HH-MM): ");
                        String time = sc.nextLine();
                        appointment.bookAppointment(p, d, date, time);
                        break;

                    case 2:
                        System.out.print("Appointment ID: ");
                        int aid = sc.nextInt();
                        appointment.cancelAppointment(aid);
                        break;

                    case 3:
                        sc.nextLine();
                        System.out.print("Date (yyyy-mm-dd): ");
                        String adate = sc.nextLine();
                        appointment.viewDailyAppointmentSchedule(adate);
                        break;
                }
                break;

            case 4:
                System.out.println("\n--- Visit Management ---");
                System.out.println("1. Record Visit");
                System.out.println("2. Add Prescription");
                int vChoice = sc.nextInt();

                switch (vChoice) {
                    case 1:
                        System.out.print("Appointment ID: ");
                        int appId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Diagnosis: ");
                        String diag = sc.nextLine();
                        System.out.print("Notes: ");
                        String notes = sc.nextLine();
                        visit.recordVisit(appId, diag, notes);
                        break;

                    case 2:
                        System.out.print("Visit ID: ");
                        int vid = sc.nextInt();
                        sc.nextLine();
                        
                        List<String[]> medicines = new ArrayList<>();
                        System.out.println("How many medicines to add?");
                        int count = sc.nextInt();
                        sc.nextLine();

                        for (int i = 1; i <= count; i++) {
                            System.out.println("Enter Medicine " + i + " Name:");
                            String name = sc.nextLine();

                            System.out.println("Enter Dosage:");
                            String dosage = sc.nextLine();

                            System.out.println("Enter Cost:");
                            String cost = sc.nextLine();

                            System.out.println("Enter Duration:");
                            String duration = sc.nextLine();

                            medicines.add(new String[]{name, dosage, cost, duration});
                        }

                        visit.addPrescription(vid, medicines);
                        break;
                }
                break;

            case 5:
                System.out.println("\n--- Billing ---");
                System.out.println("1. Generate Bill");
                System.out.println("2. Record Payment");
                System.out.println("3. View Outstanding Bills");
                System.out.println("4. Revenue Report");
                int bChoice = sc.nextInt();

                switch (bChoice) {
                    case 1:
                        System.out.print("Visit ID: ");
                        int v = sc.nextInt();
                        bill.generateBill(v);
                        break;

                    case 2:
                        System.out.print("Bill ID: ");
                        int bid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Payment Mode: ");
                        String mode = sc.nextLine();
                        bill.recordPayment(bid, mode);
                        break;

                    case 3:
                        bill.viewOutstandingBill();
                        break;

                    case 4:
                        sc.nextLine();
                        System.out.print("Start Date (yyyy-mm-dd): ");
                        String s = sc.nextLine();
                        System.out.print("End Date (yyyy-mm-dd): ");
                        String e = sc.nextLine();
                        bill.generateRevenueReport(s, e);
                        break;
                }
                break;

            case 6:
                System.out.println("\n--- System Administration ---");
                System.out.println("1. Add Specialty");
                System.out.println("2. View Audit Logs");
                System.out.println("3. Backup Database");
                int adChoice = sc.nextInt();

                switch (adChoice) {
                    case 1:
                        sc.nextLine();
                        System.out.print("Specialty Name: ");
                        String sn = sc.nextLine();
                        admin.addSpecialty(sn);
                        break;

                    case 2:
                        admin.viewAuditLogs();
                        break;

                    case 3:
                        admin.backupDatabase();
                        break;
                }
                break;

            case 0:
                System.out.println("Exiting system...");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice!");
            }
		}
		
	}
}
