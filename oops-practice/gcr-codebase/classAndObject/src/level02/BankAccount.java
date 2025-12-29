package level02;

public class BankAccount {

	public String accountHolder;
	public long accountNumber;
	private double balance;
	
	BankAccount(String accountHolder, long accountNumber, double balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposite successfully");
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("Withdraw successfully");
		}else if(balance < amount){
			System.out.println("Insufficient balance");
		}else {
			System.out.println("Invalid amount");			
		}
	}
	
	public void currentBalance() {
		System.out.println("Balance: "+balance);
	}
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Prerit Jain", 90455, 100000);
		account.withdraw(100);
		account.currentBalance();
		account.deposite(500);
		account.currentBalance();
		
		
	}

}
