package level02;

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] employees = new double[10][2];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            
            while(true) {
                System.out.print("  Salary: ");
                if(scanner.hasNextDouble()) {
                    double salaryInput = scanner.nextDouble();
                    if(salaryInput > 0) {
                        employees[i][0] = salaryInput;
                        break;
                    } else {
                        System.out.println("  Invalid input! Salary must be positive. Please try again.");
                    }
                } else {
                    System.out.println("  Invalid input! Please enter a numerical value.");
                    scanner.next();
                }
            }
            
            while(true) {
                System.out.print("  Years of service: ");
                if(scanner.hasNextDouble()) {
                    double yearsInput = scanner.nextDouble();
                    if(yearsInput >= 0) {
                        employees[i][1] = yearsInput;
                        break;
                    } else {
                        System.out.println("  Invalid input! Years of service cannot be negative. Please try again.");
                    }
                } else {
                    System.out.println("  Invalid input! Please enter a numerical value.");
                    scanner.next();
                }
            }
        }
        
        for(int i = 0; i < 10; i++) {
            double salary = employees[i][0];
            double years = employees[i][1];
            double calculatedBonus;
            
            if(years > 5) {
                calculatedBonus = salary * 0.05;
            } else {
                calculatedBonus = salary * 0.02;
            }
            bonus[i] = calculatedBonus;
            
            newSalary[i] = salary + calculatedBonus;
            
            totalBonus += calculatedBonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary[i];
        }
        
        System.out.println("\n--- Bonus and Salary Summary ---");
        System.out.printf("Total bonus payout: %.2f\n", totalBonus);
        System.out.printf("Total old salary: %.2f\n", totalOldSalary);
        System.out.printf("Total new salary: %.2f\n", totalNewSalary);
        
        scanner.close();
    }
}