package exceptionHandling;

public class InterestCalculator {

    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        double amountGrowth = amount * Math.pow(1 + rate, years);
        return amountGrowth - amount;
    }

    public static void main(String[] args) {
        double amount = 1000.0;
        double rate = 0.05;
        int years = 3;

        try {
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}