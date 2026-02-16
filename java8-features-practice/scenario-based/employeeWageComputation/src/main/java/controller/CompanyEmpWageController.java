package controller;

import service.CompanyEmpWageService;
import service.EmpWageServiceImp;

public class CompanyEmpWageController {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		CompanyEmpWageService service = new EmpWageServiceImp();
		
		service.addComapny("TCS", 20, 20, 100);
		service.addComapny("Infosys", 25, 22, 110);
		service.addComapny("Wipro", 22, 20, 100);
		
		service.computeEmployesWage();
		
		System.out.println("Total Wage of TCS = " + service.getTotalWageByCompany("TCS"));
        System.out.println("Total Wage of Infosys = " + service.getTotalWageByCompany("Infosys"));
        System.out.println("Total Wage of Wipro = " + service.getTotalWageByCompany("Wipro"));
	}
}
