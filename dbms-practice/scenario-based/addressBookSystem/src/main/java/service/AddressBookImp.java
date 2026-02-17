package service;

import java.util.List;

import model.Contact;
import repository.ContactRepository;
import repository.ContactRepositoryImp;

public class AddressBookImp implements AddressBookService {
	
	private ContactRepository repository = new ContactRepositoryImp();

	@Override
	public void addContact(Contact contact) {
		repository.addContact(contact);
	}

	@Override
	public void editContact(String name, Contact contact) {
		repository.updateContact(name, contact);
	}

	@Override
	public void deleteContact(String name) {
		repository.deleteContact(name);
	}

	@Override
	public List<Contact> viewAllContacts() {
		return repository.getAllContacts();
	}

	@Override
	public List<Contact> searchByCity(String city) {
		return repository.getContactsByCity(city);
	}

}
