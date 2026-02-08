package healthClinicApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Visit {
	
	// UC-4.1: Record Patient Visit
	public void recordVisit(int appointment_id, String diagnosis, String notes) throws Exception {
		Connection conn = DBConnection.getConnection();
		conn.setAutoCommit(false);
		
		try {
			String insertQuery = "Insert into visits (appointment_id, diagnosis, notes, visit_data) values (?, ?, ?, curdate())";
		
			PreparedStatement ps1 = conn.prepareStatement(insertQuery);
			ps1.setInt(1, appointment_id);
			ps1.setString(2, diagnosis);
			ps1.setString(3, notes);
			
			int rowAffected = ps1.executeUpdate();
			if(rowAffected>0) {
				
				String updateQuery = "Update appointments set status = 'COMPLETED' where appointment_id=?";
				PreparedStatement ps2 = conn.prepareStatement(updateQuery);
				ps2.setInt(1, appointment_id);
				ps2.executeUpdate();
				
				conn.commit();
				System.out.println("Visit Recorded Successfully");
			}else {
				System.out.println("Visit Not Registerd");
			}
		}catch (Exception e) {
			conn.rollback();
			System.out.println("Error in recording visit." + e.getMessage());
		}finally{
			conn.setAutoCommit(true);			
		}
	}
	
	// UC-4.2 View Patient Medical History
	public void viewPatientMedicalHistory(int patient_id) throws Exception{
		Connection conn = DBConnection.getConnection();
		
		String joinQuery = """
				Select v.visit_id, v.visit_date, v.diagnosis, v.notes,
				d.name as doctor_name, a.appointment_date
				from visits as v
				join appointments a on v.appointment_id = a.appointment_id
				join doctors d on v.doctor_id = d.doctor_id
				where a.patient_id=?
				order by v.visit_date DESC
				""";
		
		PreparedStatement ps = conn.prepareStatement(joinQuery);
		ResultSet res = ps.executeQuery();
		System.out.println("Medical History for Patient ID: " + patient_id);
        System.out.println("----------------------------------");

        while (res.next()) {
            System.out.println("Visit ID: " + res.getInt("visit_id"));
            System.out.println("Visit Date: " + res.getDate("visit_date"));
            System.out.println("Doctor: " + res.getString("doctor_name"));
            System.out.println("Diagnosis: " + res.getString("diagnosis"));
            System.out.println("Notes: " + res.getString("notes"));
            System.out.println("----------------------------------");
        }
	}
	
	// UC-4.3: Add Prescription Details
	public void addPrescription(int visit_id, List<String[]> medicines) throws Exception{
		Connection conn = DBConnection.getConnection();
		
		try {
			String insertQuery = "Insert into prescriptions (visit_id, medicine_name, dosage, cost, duration) values (?, ?, ?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(insertQuery);		
			for(String[] med : medicines) {
				ps.setInt(1, visit_id);
				ps.setString(2, med[0]);
				ps.setString(3, med[1]);
				ps.setString(4, med[2]);
				ps.setString(5, med[3]);
				ps.addBatch();
			}
			ps.executeBatch();
			System.out.println("Prescription Added Successfully");
		}catch (Exception e){
			System.out.println("Error In Addding Prescription "+e.getMessage());
		}
		
	}

}
