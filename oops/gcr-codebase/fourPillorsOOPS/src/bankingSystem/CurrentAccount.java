package bankingSystem;

class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.01;

    public CurrentAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Applying for current account loan of $" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 0.3;
    }
}