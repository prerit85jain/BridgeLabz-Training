package multiThreading;

import java.time.LocalDateTime;

public class BankAccount {
	
	private int balance = 10000;
	
	public synchronized void withdraw(String customerName, int amount) {
		System.out.println("["+customerName+"] Attempting to withdraw "+amount);
		
		if(balance >= amount) {
			try {
				Thread.sleep(1500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= amount;
			
			System.out.println("Transaction successful: " + customerName +
					", Amount: " + amount +
					", Balance: " + balance +
					", Time: " + LocalDateTime.now());
		}else {
			System.out.println("Transaction failed: " + customerName +
					", Amount: " + amount +
					", Balance: " + balance +
					", Time: " + LocalDateTime.now());
		}
		
	}
}
