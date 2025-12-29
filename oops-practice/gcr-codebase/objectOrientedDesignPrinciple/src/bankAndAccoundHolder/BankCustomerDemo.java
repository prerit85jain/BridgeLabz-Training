package bankAndAccoundHolder;

public class BankCustomerDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank.openAccount(customer1, 500);
        bank.openAccount(customer1, 1000);
        bank.openAccount(customer2, 750);

        bank.showCustomers();

        customer1.viewBalance(1000);
        customer2.viewBalance(1001);
        customer1.viewBalance(999);
    }
}