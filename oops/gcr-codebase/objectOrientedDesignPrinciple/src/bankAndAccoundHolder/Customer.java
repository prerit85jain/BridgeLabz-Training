package bankAndAccoundHolder;
import java.util.HashMap;
import java.util.Map;

class Customer {
    private String name;
    private Map<Integer, Double> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new HashMap<>();
    }

    public void viewBalance(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Balance for Account " + accountNumber + ": $" + accounts.get(accountNumber));
        } else {
            System.out.println("Account " + accountNumber + " does not exist for " + name);
        }
    }

    public void addAccount(int accountNumber, double initialDeposit) {
        accounts.put(accountNumber, initialDeposit);
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Double> getAccounts() {
        return accounts;
    }
}


