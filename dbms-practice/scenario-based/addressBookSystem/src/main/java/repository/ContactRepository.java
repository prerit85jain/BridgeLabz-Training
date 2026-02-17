package repository;

import java.util.List;

import model.Contact;

public interface ContactRepository {
	
	void addContact(Contact contact);
	void updateContact(String firstName, Contact contact);
	void deleteContact(String firstName);
	List<Contact> getAllContacts();
	List<Contact> getContactsByCity(String city);

}
