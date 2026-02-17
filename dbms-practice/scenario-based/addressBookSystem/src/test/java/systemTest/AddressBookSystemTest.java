package systemTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import model.Contact;
import service.AddressBookImp;
import service.AddressBookService;

public class AddressBookSystemTest {

	@Test
	public void testGetAllContacts() {
		AddressBookService service = new AddressBookImp();
		
		service.addContact(new Contact(
				"Prerit", "Jain", "Ghar", "Kosi", "UP", "281403", "5130000000", "preritjain@gmail.com"));
		
		assertTrue(service.viewAllContacts().size()>0);
	}
}
