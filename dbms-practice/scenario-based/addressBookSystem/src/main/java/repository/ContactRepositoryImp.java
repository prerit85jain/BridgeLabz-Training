package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Contact;
import util.DBConnection;

public class ContactRepositoryImp implements ContactRepository{

	@Override
	public void addContact(Contact contact) {
		String insert = "Insert into contacts (first_name, last_name, address, city, state, zip, phone, email)"
				+ " values (?, ?, ?, ?, ?, ? ,?, ?)";
		
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(insert);
			ps.setString(1, contact.firstName);
			ps.setString(2, contact.lastName);
			ps.setString(3, contact.address);
			ps.setString(4, contact.city);
			ps.setString(5, contact.state);
			ps.setString(6, contact.zip);
			ps.setString(7, contact.phone);
			ps.setString(8, contact.email);
			
			int rowAffected = ps.executeUpdate();
			if(rowAffected>0) {
				System.out.println("Contact Added");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateContact(String firstName, Contact contact) {
		String update = "Update contacts set address=?, city=?, state=?, zip=?, phone=?, email=? where "
				+ "first_name = ?";
		
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(update);
			ps.setString(1, contact.address);
			ps.setString(2, contact.city);
			ps.setString(3, contact.state);
			ps.setString(4, contact.zip);
			ps.setString(5, contact.phone);
			ps.setString(6, contact.email);
			ps.setString(7, firstName);
			
			int rowAffected = ps.executeUpdate();
			if(rowAffected > 0) {
				System.out.println("Contact Updated");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteContact(String firstName) {
		String delete = "Delete from contacts where first_name=?";
		
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(delete);
			ps.setString(1, firstName);
			
			int rowAffected = ps.executeUpdate();
			if(rowAffected>0) {
				System.out.println("Contact Deleted");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> allContact = new ArrayList<>();
		String select = "Select * from contacts";
		
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(select);
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()) {
				allContact.add(new Contact(
						res.getString("first_name"),
						res.getString("last_name"),
						res.getString("address"),
						res.getString("city"),
						res.getString("state"),
						res.getString("zip"),
						res.getString("phone"),
						res.getString("email")));
			}
			
			return allContact;			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Contact> getContactsByCity(String city) {
		List<Contact> contacts = new ArrayList<>();
		String select = "Select * from contacts where city = ?";
		
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(select);
			ps.setString(1, city);
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()) {
				contacts.add(new Contact(
						res.getString("first_name"),
						res.getString("last_name"),
						res.getString("address"),
						res.getString("city"),
						res.getString("state"),
						res.getString("zip"),
						res.getString("phone"),
						res.getString("email")));
			}
			return contacts;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
