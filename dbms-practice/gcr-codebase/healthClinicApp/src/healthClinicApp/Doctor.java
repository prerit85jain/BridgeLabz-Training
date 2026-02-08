package healthClinicApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Doctor {

	// UC-2.1: Add Doctor Profile
	public void registerDoctor(String name, String contact, double consultation_fee, int specialty_id) throws Exception {
		
		String insertQuery = "INSERT INTO doctors (name, contact, consultation_fee, specialty_id) VALUES (?, ?, ?, ?)";
		
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(insertQuery);
		 
		 ps.setString(1, name);
		 ps.setString(2, contact);
		 ps.setDouble(3, consultation_fee);
		 ps.setInt(4, specialty_id);
		 
		 int rowAffected = ps.executeUpdate();
		 if(rowAffected > 0) {
			 System.out.println("Doctor Register Successfully");
		 }else {
			 System.out.println("Doctor Not Register");
		 }
	}
	
	
	public void viewAllSpecialties() throws Exception {
		
		Connection con = DBConnection.getConnection();

		String viewSpecialties = "Select * from specialties";
		PreparedStatement psSpecialty = con.prepareStatement(viewSpecialties);
		
		ResultSet res = psSpecialty.executeQuery();
		
		System.out.println("Available Specialties:");
		while(res.next()) {
			System.out.println(res.getString("specialty_id") + ".  " + res.getString("specialty_name"));
		}
	}
	
	// UC-2.2: Assign/Update Doctor Specialty
	public void updateDoctor(int doctor_id, int specialty_id) throws Exception{
		
		Connection con = DBConnection.getConnection();
		
		String checkSpecialty = "Select * from specialties where specialty_id=?";
		PreparedStatement ps1 = con.prepareStatement(checkSpecialty);
		
		ps1.setInt(1, specialty_id);
		ResultSet res = ps1.executeQuery();
		
		if(!res.next()) {
			System.out.println("Specialty Not Found");
			return;
		}
		
		String updateQuery = "Update doctors set specialty_id = ? where doctor_id = ?";
		PreparedStatement ps2 = con.prepareStatement(updateQuery);
		
		ps2.setInt(1, specialty_id);
		ps2.setInt(2, doctor_id);
		
		int rowAffected = ps2.executeUpdate();
		if(rowAffected>0) {
			System.out.println("Data Updated Successfully");
		}else {
			System.out.println("Data Not Updated");
		}
	}
	
	// UC-2.3: View Doctors by Specialty
	public void viewDoctorBySpecialty(String specialty_name) throws Exception {
		
		String joinQuery = """
				Select d.doctor_id, d.name as doctor_name, d.contact, d.consultation_fee,
				s.specialty_name from doctors d
				join specialties s on s.specialty_id = d.specialty_id
				where s.specialty_name = ?
				and d.is_active = true
				""";
		
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(joinQuery);
		
		ResultSet res = ps.executeQuery();
		System.out.println("Doctors for Specialty: "+specialty_name);
		while(res.next()) {
			System.out.println("Doctor ID: " + res.getInt("doctor_id"));
            System.out.println("Name: " + res.getString("doctor_name"));
            System.out.println("Contact: " + res.getString("contact"));
            System.out.println("Fee: " + res.getDouble("consultation_fee"));
            System.out.println("Specialty: " + res.getString("specialty_name"));
            System.out.println("--------------------------------");
		}
	}
	
	// UC-2.4: Deactivate Doctor Profile
	public void deactivateDoctor(int doctor_id) throws Exception {
		
		String checkQuery = """
				Select count(*) from appointments
				where doctor_id = ? 
				and appointment_date >= curdate()
				and status = "SCHEDULED"
				""";
		
		Connection con = DBConnection.getConnection();
		PreparedStatement ps1 = con.prepareStatement(checkQuery);
		
		ps1.setInt(1, doctor_id);
		ResultSet res = ps1.executeQuery();
		res.next();
		if(res.getInt(1)>0) {
			System.out.println("Doctor has  future appoinments. Cannot deactivate");
			return;
		}
		
		String deactivateQuery = "Update doctors set is_active = false where doctor_id=?";
		PreparedStatement ps2 = con.prepareStatement(deactivateQuery);
		
		ps2.setInt(1, doctor_id);
		int rowAffected = ps2.executeUpdate();
		if(rowAffected>0) {
			System.out.println("Doctor Deactivated Successfully");
		}else {
			System.out.println("Doctor Not Found");
		}
	}
}
