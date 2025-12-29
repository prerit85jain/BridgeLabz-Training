package bankingSystem;

interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}