package healthClinicApp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;

public class Appointment {

	// UC-3.1: Book New Appointment
	public void bookAppointment(int patient_id, int doctor_id, String appointment_date, String appointment_time) throws Exception{
		Connection con = DBConnection.getConnection();
		
		try {
			String checkSql = """
					Select count(*) from appointments
					where doctor_id = ?
					and appointment_date = ?
					and appointment_time = ?
					and status = 'SCHEDULED'
					""";
			
			PreparedStatement ps = con.prepareStatement(checkSql);
			ps.setInt(1, doctor_id);
			ps.setDate(2, Date.valueOf(appointment_date));
			ps.setTime(3, Time.valueOf(appointment_time));
			ResultSet res = ps.executeQuery();
			
			res.next();
			if(res.getInt(1)>0) {
				System.out.println("Slot not Available");
				return;
			}
			
			String insertQuery = "Insert into appointments (patient_id, doctor_id, appointment_date, appointment_time status) values (?, ?, ?, ?)";
			PreparedStatement ps1 = con.prepareStatement(insertQuery);
			ps1.setInt(1, patient_id);
			ps1.setInt(2, doctor_id);
			ps1.setString(3, appointment_date);
			ps1.setString(4, appointment_time);
			ps1.setString(5, "SCHEDULED");
			
			int rowAffected = ps1.executeUpdate();
			if(rowAffected>0) {
				System.out.println("Appointment Scheduled Successfully");
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// UC-3.2: Check Doctor Availability
	public void checkDoctorAvailability(int doctor_id, String appointments_date) throws Exception{
		Connection conn = DBConnection.getConnection();
		
		String checkQuery = """
				Select appointment_time, count(*) as total_bookings from appointments
				where docotr_id = ?
				and appointment_date = ?
				and status = 'SCHEDULED'
				group by appointment_time
				""";
		
		PreparedStatement ps = conn.prepareStatement(checkQuery);
		ResultSet res = ps.executeQuery();
		
		System.out.println("Doctor Availability");
		while(res.next()) {
			System.out.println(res.getTime("appointment_time") +" -> " + res.getInt("total_bookings"));
		}
	}
	
	// UC-3.3: Cancel Appointment
	public void cancelAppointment(int appointment_id) throws Exception{
		
		Connection conn = DBConnection.getConnection();
		
		String updateQuery = "Update appointments set status = 'CANCELLED' where appointment_is = ?";
		
		PreparedStatement ps = conn.prepareStatement(updateQuery);
		ps.setInt(1, appointment_id);
		
		int rowAffected = ps.executeUpdate();
		if(rowAffected>0) {
			System.out.println("Appointment Canceled");
		}
	}
	
	// UC-3.4: Reschedule Appointment
	public void rescheduleAppointment(int appointmentId, int newDoctorId, String newDate, String newTime) throws Exception{
		
		Connection conn = DBConnection.getConnection();
		conn.setAutoCommit(false);
		
		String selectQuery = "Select count(*) from appointments where doctor_id=? and appointment_date=? and appointment_time=? and status='SCHEDULED'";
		
		PreparedStatement ps1 = conn.prepareStatement(selectQuery);
		ps1.setInt(1, newDoctorId);
		ps1.setDate(2, Date.valueOf(newDate));
		ps1.setTime(3, Time.valueOf(newTime));
		
		ResultSet res = ps1.executeQuery();
		res.next();
		
		if(res.getInt(1)>0) {
			System.out.println("Slot Not Available");
			conn.rollback();
			return;
		}
		
		String updateQuery = "Update appointments set docotr_id=?, appointment_date=?, appointment_time=? where appointment_id=?";
		
		PreparedStatement ps2 = conn.prepareStatement(updateQuery);
		ps2.setInt(1, newDoctorId);
		ps2.setDate(2, Date.valueOf(newDate));
		ps2.setTime(3, Time.valueOf(newTime));
		ps2.setInt(4, appointmentId);
		
		int rowAffected = ps2.executeUpdate();
		if(rowAffected>0) {
			conn.commit();
			System.out.println("Appointment rescheduled successfully.");
		}
		conn.setAutoCommit(true);
	}
	
	// UC-3.5: View Daily Appointment Schedule
	public void viewDailyAppointmentSchedule(String date) throws Exception{
		Connection conn = DBConnection.getConnection();
		
		String selectQuery = """
				Select a.appointment_id, p.name as patient_name, d.name as doctor_name, a.appointment_date, a.appointment_time, a.status
				from appointments as a 
				join patients p on a.patient_id = p.patient_id
				join doctors d on a.docotr_id = a.doctor_id
				where appointment_date = ?
				order by a.appointment_time;
				""";
		
		PreparedStatement ps = conn.prepareStatement(selectQuery);
		ps.setDate(1, Date.valueOf(date));
		
		ResultSet res = ps.executeQuery();
		
		System.out.println("Daily Schedule for "+date);
		System.out.println("----------------------------------------------");
		
		while(res.next()) {
			System.out.println("Appointment ID: " + res.getInt("appointment_id"));
            System.out.println("Patient: " + res.getString("patient_name"));
            System.out.println("Doctor: " + res.getString("doctor_name"));
            System.out.println("Time: " + res.getTime("appointment_time"));
            System.out.println("Status: " + res.getString("status"));
    		System.out.println("----------------------------------------------");
		}
	}
}
