package healthClinicApp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class Bill {
	
	// UC-5.1: Generate Bill for Visit
	public void generateBill(int visit_id) throws Exception{
		
		Connection conn = DBConnection.getConnection();
		
		 double total_amount = 0;
		 
		 String selectCostQuery = """
		 		SELECT d.consultation_fee + IFNULL(SUM(p.cost),0) AS total_amount
					FROM visits v
					JOIN appointments a ON v.appointment_id = a.appointment_id
					JOIN doctors d ON a.doctor_id = d.doctor_id
					LEFT JOIN prescriptions p ON v.visit_id = p.visit_id
					WHERE v.visit_id = ?
					GROUP BY d.consultation_fee;
		 		""";
		 PreparedStatement ps1 = conn.prepareStatement(selectCostQuery);
		 
		 ps1.setInt(1, visit_id);
		 ResultSet res = ps1.executeQuery();
		 if(res.next()) {
			 total_amount = res.getDouble("total_amount");
		 }
		 
		 
		 String insertQuery = "Insert into bills (visit_id, total_amount, payment_status, payment_date) values (?, ?, ?, ?)";
		 
		 PreparedStatement ps = conn.prepareStatement(insertQuery);
		 ps.setInt(1, visit_id);
		 ps.setDouble(2, total_amount);
		 ps.setString(3, "UNPAID");
		 ps.setDate(4, Date.valueOf(LocalDate.now()));
		 
		 int rowAffected = ps.executeUpdate();
		 if(rowAffected>0) {
			 System.out.println("Bill Generated Successfully");
		 }else {
			 System.out.println("Bill Not Generated");
		 }
	}
	
	// UC-5.2: Record Payment
	public void recordPayment(int bill_id, String payment_status) throws Exception{
		Connection conn = DBConnection.getConnection();
		try {
			String updateQuery = "Update bills set payment_status = ? where bill_id=?";
			PreparedStatement ps = conn.prepareStatement(updateQuery);
			ps.setString(1, payment_status);
			ps.setInt(2, bill_id);
			
			int rowAffected = ps.executeUpdate();
			if(rowAffected>0) {
				System.out.println("Payment Updated");
			}else {
				System.out.println("Record Not Found");
			}
		}catch (Exception e) {
			System.out.println("Error In Update Payment " + e.getMessage());
		}
	}
	
	// UC-5.3: View Outstanding Bills
	public void viewOutstandingBill() throws Exception{
		Connection conn = DBConnection.getConnection();
		
		String sql = """
		        SELECT b.bill_id, p.name as patient_name, b.total_amount, b.payment_date
		        FROM bills b
		        JOIN visits v ON b.visit_id = v.visit_id
		        JOIN appointments a ON v.appointment_id = a.appointment_id
		        JOIN patients p ON a.patient_id = p.patient_id
		        WHERE b.payment_status = 'UNPAID'
		    """;
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		
	    System.out.println("Outstanding Bills");
	    System.out.println("--------------------------------");

	    while (res.next()) {
	        System.out.println("Bill ID: " + res.getInt("bill_id"));
	        System.out.println("Patient Name: " + res.getString("name"));
	        System.out.println("Amount: " + res.getDouble("total_amount"));
	        System.out.println("Bill Date: " + res.getDate("bill_date"));
	        System.out.println("--------------------------------");
	    }
	}
	
	// UC-5.4: Generate Revenue Report
	public void generateRevenueReport(String startDate, String endDate) throws Exception{
		Connection conn = DBConnection.getConnection();
		
		String sql = """
		        SELECT b.bill_date, SUM(b.total_amount) AS total_revenue
		        FROM bills b
		        WHERE b.status = 'PAID'
		        AND b.bill_date BETWEEN ? AND ?
		        GROUP BY b.bill_date
		    """;
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setDate(1, Date.valueOf(startDate));
		ps.setDate(2, Date.valueOf(endDate));
		
		ResultSet rs = ps.executeQuery();

	    System.out.println("Revenue Report (By Date)");
	    System.out.println("--------------------------------");

	    while (rs.next()) {
	        System.out.println("Date: " + rs.getDate("bill_date"));
	        System.out.println("Total Revenue: " + rs.getDouble("total_revenue"));
	        System.out.println("--------------------------------");
	    }
	}
}
