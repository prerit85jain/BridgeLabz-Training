package healthClinicApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Patient {
	
	
	// UC-1.1: Register New Patient
	public void registerPatient(String name, String dob, String contact, String address, String blood_group) throws Exception {
		
		String insertQuery = "Insert into patients (name, dob, contact, address, blood_group) value (?, ?, ?, ?, ?)";
		
		Connection con = DBConnection.getConnection();
		PreparedStatement preStatement = con.prepareStatement(insertQuery);
		
		preStatement.setString(1, name);
		preStatement.setString(2, dob);
		preStatement.setString(3, contact);
		preStatement.setString(4, address);
		preStatement.setString(5, blood_group);
		
		preStatement.executeUpdate();
		System.out.println("Patient Register Successfully");
		
	}
	
	// UC-1.2: Update Patient Information
	public void updatePatient(int patient_id, String name, String dob, String contact, String address, String blood_group) throws Exception{
		
		String updateQuery = "Update patients set name=?, dob=?, contact=?, address=?, blood_group=?  where patient_id=?";
		
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(updateQuery);
		
		ps = con.prepareStatement(updateQuery);
		
		ps.setString(1, name);
		ps.setString(2, dob);
		ps.setString(3, contact);
		ps.setString(4, address);
		ps.setString(5, blood_group);
		ps.setInt(6, patient_id);

		int rowAffected = ps.executeUpdate();
		
		if(rowAffected > 0) {
			System.out.println("Data Updated Successfully");
		}else {
			System.out.println("Data Not Updated");
		}
	}
	
	// UC-1.3: Search Patient Records
	public void searchPatient(String keyword) throws Exception{
		
		String searchQuery = "Select * from patients where name Like ? or contact = ? or patient_id=?";
		
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(searchQuery);
		
		ps.setString(1, "%"+keyword+"%");
		ps.setString(2, keyword);
		ps.setString(3, keyword);
		
		ResultSet res = ps.executeQuery();
		while(res.next()) {
			System.out.println(res.getInt("patient_id")+" "+res.getString("name"));
		}
	}
	
	
	// UC-1.4: View Patient Visit History
	public void viewPatientVisitHistory(int patient_id) throws Exception{
		
		String joinQuery = "Select v.visit_id, v.visid_date, v.visit_diagnosis, d.name as doctor_name, a.appointment_date, a.appintment_time"
				+ "from visits v join appointments a on v.appointment_id == a.appointment_id"
				+ "join doctors d on v.doctor_id == d.doctor_id"
				+ "where patient_id = ?"
				+ "Order by v.visit_date ASC";
		
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(joinQuery);
		
		ps.setInt(1, patient_id);
		
		ResultSet res = ps.executeQuery();
		
		while(res.next()) {
			System.out.println(res.getString("visit_id"));
		}
	}
}
