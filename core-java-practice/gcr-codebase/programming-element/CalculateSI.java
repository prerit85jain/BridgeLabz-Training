public class CalculateSI {
    public static void main(String[] args) {
        // Variable Declaration
        double principal = 5000;
        double rate = 5;
        double time = 2;

        // Simple Interest Calculation
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
