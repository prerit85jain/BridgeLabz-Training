package bankingSystem;

class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04;
//    private double loanAmountRequested;

    public SavingsAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Applying for savings loan of $" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 0.5;
    }
}