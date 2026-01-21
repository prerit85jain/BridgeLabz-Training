package start;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import addressBook.AddressBook;
import cases.Contact;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	private static Map<String, AddressBook> contactBook = new HashMap<>();

	
	static {
		System.out.println("Welcome to Address Book Program.........");
	}
	
	public static void showOptions() {
		System.out.println("\nOptions");
		System.out.println("1. Add New AddressBook");
		System.out.println("2. Add New Contact");
		System.out.println("3. Display All AddressBook");
		System.out.println("4. Display All Contacts");
		System.out.println("5. Edit Contact");
		System.out.println("6. Delete Contact");
		System.out.println("7. Search by City/State");
		System.out.println("9. Exit");		
		System.out.print("Select option: ");
	}
	
	public static void displaycontactBook() {
		System.out.println("Contact Book List:");
		for(Map.Entry<String, AddressBook> book : contactBook.entrySet()) {
			System.out.println("-> "+book.getKey());
		}
	}
	
	public static void createAddressBook(AddressBook addressBook) {
		System.out.print("Enter Address Book Name: ");
		String bookName = scanner.nextLine();
		if(contactBook.containsKey(bookName)) {
			System.out.println("Name Already Present");
		}else {
			contactBook.put(bookName, addressBook);
			System.out.println("Address Book Created Successfully");
		}
	}
	
	public static AddressBook selectAddressBook() {
		displaycontactBook();
		System.out.print("Enter Book Name: ");
		String bookName = scanner.nextLine();
		if(contactBook.isEmpty()) {
			System.out.println("Empty!!");
			return null;
		}else if(!contactBook.containsKey(bookName)) {
			System.out.println("Enter wrong name.");
			return null;
		}else {
			return contactBook.get(bookName);
		}
	}
	
	public static void displayAddressBook() {
		System.out.println("\nAddress Books:");
		if(contactBook.isEmpty()) {
			System.out.println("Empty!!");
			return;
		}
		for(Map.Entry<String, AddressBook> book : contactBook.entrySet()) {
			System.out.println("-> "+book.getKey());
		}
	}
	
	public static void searchByCity() {
		System.out.print("Enter city on which you want to search: ");
		String city = scanner.nextLine();
		System.out.println("\nResult based on " + city + " city");
		for(Map.Entry<String, AddressBook> entry : contactBook.entrySet()) {
			AddressBook book = entry.getValue();
			book.searchByCity(city);
		}
	}
	
	public static void searchByState() {
		System.out.print("Enter state on which you want to search: ");
		String state = scanner.nextLine();
		System.out.println("\n Result based on "+state+" state");
		for(Map.Entry<String, AddressBook> entry : contactBook.entrySet()) {
			AddressBook book = entry.getValue();
			book.searchByState(state);
		}
	}
	
	public static int choiceCityOrState() {
		System.out.println("  -> 1. City");
		System.out.println("  -> 2. State");
		System.out.print("Select on which you want to search: ");
		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}
	
	public static void main(String[] args) {
		boolean status = true;
		while(status) {
			try {
				showOptions();
				int option = scanner.nextInt();
				scanner.nextLine();
				switch(option) {
					case 1 -> {
						AddressBook addressBook = new AddressBook();
						createAddressBook(addressBook);
						break;
					}
					case 2 -> {
						try {
							AddressBook selectBook = selectAddressBook();
							selectBook.createContact();
						}catch(Exception e){
							System.out.println("You can create new");
						}
						break;
					}
					case 3 -> {
						displayAddressBook();
						break;
					}
					case 4 -> {
						AddressBook selectBook = selectAddressBook(); 
						selectBook.displayContacts();
						break;
					}
					case 5 -> {
						AddressBook selectBook = selectAddressBook(); 
						selectBook.editContact();
						break;
					}
					case 6 -> {
						AddressBook selectBook = selectAddressBook(); 
						selectBook.deleteContact();
						break;
					}
					case 7 -> {
						int choice = choiceCityOrState();
						switch(choice) {
							case 1 -> searchByCity();
							case 2 -> searchByState();
						}
						break;
					}
					case 9 -> {
						System.out.println("Thank You :)");
						status = false;
						break;
					}
					default -> {
						System.out.println("Visit Again");
					}
				}
			}catch(Exception e) {
				System.out.println("Invalid input! Please enter a number.");
	            scanner.nextLine();
			}
		}
		scanner.close();
	}
}
