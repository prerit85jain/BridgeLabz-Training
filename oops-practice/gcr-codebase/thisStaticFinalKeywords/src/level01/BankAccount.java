package level01;

public class BankAccount {
	static String bankName = "State Bank Of India";
	static int totalAccount = 0;
	
	private String accountHolderName;
	private final int accountNumber;
	private double balance;
	
	static void getTotalAccounts() {
		System.out.println("Total Accounts in this bank are: "+ totalAccount);
		System.out.println("+----------------------------------------+");
	}
	
	BankAccount(String accountHolderName, int accountNumber, double balance){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		totalAccount++;
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Details");
		System.out.println("Bank Name: "+ bankName);
		System.out.println("Account Holder: "+ accountHolderName);
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Balance: "+ balance);
		System.out.println("+-------------------------------------------------------+");
	}
	
	public void getAccountHolder() {
		System.out.println("Account Holder: "+ accountHolderName);
		System.out.println("+----------------------------------------+");
	}
	public void setAccountHolder(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public void getBalance() {
		System.out.println("Balance: "+ balance);
		System.out.println("+----------------------------------------+");
	}
	
	public void deposite(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Successfully Deposite: "+ amount);
		}else {
			System.out.println("Enter valid amount!");			
		}
		System.out.println("+----------------------------------------+");
	}
	
	public void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Enter Valid Amount!");
		}else if(amount > balance) {
			System.out.println("Insufficient Balance");
		}else {
			balance -= amount;
			System.out.println("Successfully Withdrawl: "+ amount);
		}
		System.out.println("+----------------------------------------+");
	}
	
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("Alice", 123456789, 5000);
		
		account1.displayAccountDetails();
		account1.withdraw(100);
		account1.getBalance();
		getTotalAccounts();
	}
	
}
