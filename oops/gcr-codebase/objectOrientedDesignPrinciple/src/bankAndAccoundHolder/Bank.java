package bankAndAccoundHolder;

import java.util.ArrayList;

class Bank {
 private String name;
 private ArrayList<Customer> customers;
 private int accountNumberCounter = 1000;

 public Bank(String name) {
     this.name = name;
     this.customers = new ArrayList<>();
 }

 public void openAccount(Customer customer, double initialDeposit) {
     int accountNumber = accountNumberCounter++;
     customer.addAccount(accountNumber, initialDeposit);
     if (!customers.contains(customer)) {
         customers.add(customer);
     }
     System.out.println("Account " + accountNumber + " opened for " + customer.getName() + " with initial deposit $" + initialDeposit);
 }

 public void showCustomers() {
     System.out.println("Customers of " + name + ":");
     for (Customer customer : customers) {
         System.out.println("- " + customer.getName() + " with accounts: " + customer.getAccounts().keySet());
     }
 }
}