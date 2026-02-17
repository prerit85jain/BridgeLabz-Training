package controller;

import model.Contact;
import service.AddressBookImp;
import service.AddressBookService;

public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        
        AddressBookService services = new AddressBookImp();
        
        services.addContact(new Contact(
                "Rahul","Sharma","MG Road",
                "Delhi","Delhi","110001",
                "9876543210","rahul@gmail.com"));
        
        services.addContact(new Contact(
                "Amit","Verma","Ring Road",
                "Mumbai","MH","400001",
                "9999999999","amit@gmail.com"));
        
        System.out.println("Contacts in Delhi:");
        services.searchByCity("Delhi").forEach(c ->
                System.out.println(c.firstName + " " + c.city)
        );
    }
}
