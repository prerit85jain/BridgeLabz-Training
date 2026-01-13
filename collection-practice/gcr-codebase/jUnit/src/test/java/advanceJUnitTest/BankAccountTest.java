package advanceJUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
	
	@Test
	void testdepositIncreaseBalance() {
		BankAccount account = new BankAccount(500);
		account.deposite(500);
		assertEquals(1000.0, account.getBalance());
	}
	
	@Test
	void testWithdrawDecreasesBalance() {
		BankAccount account = new BankAccount(500);
		account.withdraw(250);
		assertEquals(250, account.getBalance());
	}
	
	@Test
	void testWithdrawFailsIfInsufficientFunds() {
		BankAccount account = new BankAccount(500);
		assertThrows(IllegalArgumentException.class, () -> account.withdraw(1000));
	}
	
	@Test
	void testDepositNegativeAmountThrowsException() {
		BankAccount account = new BankAccount(500);
		assertThrows(IllegalArgumentException.class, () -> account.deposite(-1000));
		
	}
	
	@Test
	void testWithdrawNegativeAmountThrowsException() {
		BankAccount account = new BankAccount(500);
		assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
		
	}
}
