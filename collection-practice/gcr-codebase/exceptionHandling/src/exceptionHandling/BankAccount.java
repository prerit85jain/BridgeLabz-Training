package exceptionHandling;

class InsufficientBalanceException extends Exception {
	 public InsufficientBalanceException(String message) {
	     super(message);
	 }
}

public class BankAccount {

	 private double balance;
	
	 public BankAccount(double initialBalance) {
	     if (initialBalance < 0) {
	         throw new IllegalArgumentException("Initial balance cannot be negative");
	     }
	     this.balance = initialBalance;
	 }
	
	 public void withdraw(double amount) throws InsufficientBalanceException {
	     if (amount < 0) {
	         throw new IllegalArgumentException("Invalid amount!");
	     }
	     if (amount > balance) {
	         throw new InsufficientBalanceException("Insufficient balance!");
	     }
	     balance -= amount;
	     System.out.println("Withdrawal successful, new balance: " + balance);
	 }
	
	 public static void main(String[] args) {
	     BankAccount account = new BankAccount(1000.0);
	
	     double[] testWithdrawals = { 250.0, -50.0, 900.0 };
	
	     for (double amount : testWithdrawals) {
	         try {
	             account.withdraw(amount);
	         } catch (InsufficientBalanceException e) {
	             System.out.println("Insufficient balance!");
	         } catch (IllegalArgumentException e) {
	             System.out.println("Invalid amount!");
	         }
	     }
	 }
}