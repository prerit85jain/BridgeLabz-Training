package service;

import java.util.List;

import model.Contact;

public interface AddressBookService {
	void addContact(Contact contact);
    void editContact(String name, Contact contact);
    void deleteContact(String name);
    List<Contact> viewAllContacts();
    List<Contact> searchByCity(String city);
}
