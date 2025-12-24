package bankingSystem;

public class Main{
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA1001", "Alice", 5000);
        BankAccount current = new CurrentAccount("CA2001", "Bob", 10000);

        BankAccount[] accounts = {savings, current};

        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());

            System.out.println("Interest: $" + account.calculateInterest());

            account.deposit(200);
            account.withdraw(100);

            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                loanAccount.applyForLoan(5000);
                System.out.println("Loan eligibility amount: $" + loanAccount.calculateLoanEligibility());
            }
            System.out.println("-----------------------------------");
        }
    }
}