package model;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWage {
	
	public String companyName;
	public int empRatePerHour;
	public int numOfWorkingDays;
	public int maxHoursPerMonth;
	public int totalWage;
	
	public List<DailyWage> dailyWages = new ArrayList<>();
	
	public CompanyEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.companyName = companyName;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	
	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
}
