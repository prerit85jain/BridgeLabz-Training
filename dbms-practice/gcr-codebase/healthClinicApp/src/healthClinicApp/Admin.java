package healthClinicApp;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Admin {

	 // UC-6.1 Add Specialty
	public void addSpecialty(String specialtyName) throws Exception{
		 Connection conn = DBConnection.getConnection();
		 
		 String insertQuery = "Insert into specialties (specialty_name) values (?)";
		 
		 PreparedStatement ps = conn.prepareStatement(insertQuery);
		 ps.setString(1, specialtyName);

		 if(ps.executeUpdate() > 0) {
			 System.out.println("Specialty added successfully.");
		 }
	}
	
	// UC-6.1 Update Specialty
	public void updateSpecialty(int specialty_id, String specialty_name) throws Exception {
		Connection conn = DBConnection.getConnection();
		String sql = "UPDATE specialties SET specialty_name = ? WHERE specialty_id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, specialty_name);
        ps.setInt(2, specialty_id);

        if(ps.executeUpdate() > 0) {
        	System.out.println("Specialty updated successfully.");        	
        }
	}
	
	// UC-6.1 Delete Specialty
	public void deleteSpecialty(int specialty_id) throws Exception{
		Connection con = DBConnection.getConnection();
		
		// check foreign key usage
        String checkSql = "SELECT COUNT(*) FROM doctors WHERE specialty_id = ?";
        PreparedStatement ps1 = con.prepareStatement(checkSql);
        ps1.setInt(1, specialty_id);

        ResultSet rs = ps1.executeQuery();
        rs.next();

        if (rs.getInt(1) > 0) {
            System.out.println("Cannot delete specialty. It is assigned to doctors.");
            return;
        }

        String sql = "DELETE FROM specialties WHERE specialty_id = ?";
        PreparedStatement ps2 = con.prepareStatement(sql);
        ps2.setInt(1, specialty_id);

        if(ps2.executeUpdate() > 0) {
        	System.out.println("Specialty deleted successfully.");        	
        }
	}
	
	// UC-6.1 View All Specialties
	public void viewAllSpecialties() throws Exception {

		Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM specialties";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        System.out.println("Specialty List:");
        while (rs.next()) {
            System.out.println(rs.getInt("specialty_id") + " - " +
                               rs.getString("specialty_name"));
        }
    }
	
	// UC-6.2 Database Backup Trigger
	public void backupDatabase() throws Exception {

		Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM patients";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        FileWriter fw = new FileWriter("patients_backup.txt");

        while (rs.next()) {
            fw.write(rs.getInt("patient_id") + "," +
                     rs.getString("name") + "," +
                     rs.getString("contact") + "\n");
        }

        fw.close();
        System.out.println("Database backup created successfully.");
    }
	
	// UC-6.3 View Audit Logs
	public void viewAuditLogs() throws Exception {

		Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM audit_log ORDER BY operation_time DESC";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        System.out.println("System Audit Logs:");
        System.out.println("--------------------------------");

        while (rs.next()) {
            System.out.println("Log ID: " + rs.getInt("log_id"));
            System.out.println("User: " + rs.getString("user_name"));
            System.out.println("Table: " + rs.getString("table_name"));
            System.out.println("Operation: " + rs.getString("operation"));
            System.out.println("Time: " + rs.getTimestamp("operation_time"));
            System.out.println("--------------------------------");
        }
    }
}










