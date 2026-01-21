package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cases.Contact;

public class AddressBook {
	private Scanner scanner = new Scanner(System.in);
	private List<Contact> contacts = new ArrayList<>();
	private int id = 0;
	
	public boolean checkDuplicateName(Contact tempContact) {
		for(Contact contact : contacts) {
			if(contact.equals(tempContact)) {return true;}
		}
		return false;
	}
	
	public void createContact() {
		System.out.print("Enter First Name: ");
		String firstName = scanner.nextLine();
		System.out.print("Enter Last Name: ");
		String lastName = scanner.nextLine();
		Contact tempContact = new Contact(0, firstName, lastName, "", "", "", 0, 0, "");
		if(checkDuplicateName(tempContact)) {
			System.out.println("Contact already present");
			return;
		}
		System.out.print("Enter Address: ");
		String address = scanner.nextLine();
		System.out.print("Enter City: ");
		String city = scanner.nextLine();
		System.out.print("Enter State: ");
		String state = scanner.nextLine();
		System.out.print("Enter ZIP Code: ");
		int zip = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Phone Number: ");
		long phoneNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.print("Enter Email: ");
		String email = scanner.nextLine();
		contacts.add(new Contact(++id, firstName, lastName, address, city, state, zip,
				phoneNumber, email));
		System.out.println("Contact Added Successfully....");
	}
	
	public void displayContacts() {
		System.out.println("\nContact List:");
		for(Contact contact : contacts) {
			contact.display();
		}
	}
	
	public void editContact() {
		System.out.print("Enter ID you want to edit: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		for(Contact contact : contacts) {
			if(id == contact.getID()) {
				System.out.print("Enter First Name: ");
				contact.setFirstName(scanner.nextLine());
				System.out.print("Enter Last Name: ");
				contact.setLastName(scanner.nextLine());
				System.out.print("Enter Address: ");
				contact.setAddress(scanner.nextLine());
				System.out.print("Enter City: ");
				contact.setCity(scanner.nextLine());
				System.out.print("Enter State: ");
				contact.setState(scanner.nextLine());
				System.out.print("Enter ZIP Code: ");
				contact.setZip(scanner.nextInt());
				scanner.nextLine();
				System.out.print("Enter Phone Number: ");
				contact.setPhoneNumber(scanner.nextLong());
				scanner.nextLine();
				System.out.print("Enter Email: ");
				contact.setEmail(scanner.nextLine());
				System.out.println("Details Edit Successfully");
				return;
			}
		}
		System.out.println("ID Not Found :(");
	}
	
	public void deleteContact() {
		System.out.print("Enter ID you want to delete: ");
		int id = scanner.nextInt();
		for(Contact contact : contacts) {
			if(id == contact.getID()) {
				contacts.remove(contact);
				System.out.println("Contact Deleted Successfully");
				return;
			}
		}
		System.out.println("ID Not Found :(");
	}
	
	public void searchByCity(String city) {
		for(Contact contact : contacts) {
			if(contact.getCity().equals(city)) {
				contact.display();
			}
		}
	}

	public void searchByState(String state) {
		for(Contact contact : contacts) {
			if(contact.getState().equals(state)) {
				contact.display();
			}
		}
	}
}
