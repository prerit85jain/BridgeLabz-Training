package level03;

import java.util.Random;

public class BonusCalculator {
	public static int[][] generateEmployeeData() {
	    int[][] employees = new int[10][2];
	    Random rand = new Random();
	
	    for (int i = 0; i < 10; i++) {
	        int salary = 10000 + rand.nextInt(90001);
	        int yearsOfService = 1 + rand.nextInt(15);
	        employees[i][0] = salary;
	        employees[i][1] = yearsOfService;
	    }
	    return employees;
	}
	
	public static double[][] calculateBonus(int[][] employees) {
	    double[][] updatedEmployees = new double[employees.length][3];
	    for (int i = 0; i < employees.length; i++) {
	        int oldSalary = employees[i][0];
	        int years = employees[i][1];
	
	        double bonusPercent = (years > 5) ? 0.05 : 0.02;
	        double bonus = oldSalary * bonusPercent;
	        double newSalary = oldSalary + bonus;
	
	        updatedEmployees[i][0] = oldSalary;
	        updatedEmployees[i][1] = bonus;
	        updatedEmployees[i][2] = newSalary;
	    }
	    return updatedEmployees;
	}
	
	public static void displaySummary(int[][] employees, double[][] updatedEmployees) {
	    double totalOldSalary = 0;
	    double totalNewSalary = 0;
	    double totalBonus = 0;
	
	    System.out.println("---------------------------------------------------------------------------------");
	    System.out.printf("%-10s%-15s%-15s%-15s%-15s\n", "Employee", "Old Salary", "Years of Service", "Bonus", "New Salary");
	    System.out.println("---------------------------------------------------------------------------------");
	    for (int i = 0; i < employees.length; i++) {
	        int oldSalary = employees[i][0];
	        int years = employees[i][1];
	        double bonus = updatedEmployees[i][1];
	        double newSalary = updatedEmployees[i][2];
	
	        totalOldSalary += oldSalary;
	        totalBonus += bonus;
	        totalNewSalary += newSalary;
	
	        System.out.printf("%-10d%-15d%-15d%-15.2f%-15.2f\n", i + 1, oldSalary, years, bonus, newSalary);
	    }
	    System.out.println("---------------------------------------------------------------------------------");
	    System.out.printf("%-10s%-15.2f%-15s%-15.2f%-15.2f\n", "Total", totalOldSalary, "", totalBonus, totalNewSalary);
	}
	
	public static void main(String[] args) {
	    int[][] employees = generateEmployeeData();
	
	    double[][] updatedEmployees = calculateBonus(employees);
	
	    displaySummary(employees, updatedEmployees);
	}
}