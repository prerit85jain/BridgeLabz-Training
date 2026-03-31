package advanceJUnitTest;

public class BankAccount {
	private double balance;
	
	public BankAccount(double openingAmt) {
		if(openingAmt < 0) {
			throw new IllegalArgumentException("Initial amount cannot be negative");
		}
		balance = openingAmt;
	}
	
	public void deposite(double amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("Deposite amount should be positive");
		}
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("Withdraw amount should be positive");
		}else if(amount > balance) {
			throw new IllegalArgumentException("Insufficient balance");
		}else {
			balance -= amount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
}
