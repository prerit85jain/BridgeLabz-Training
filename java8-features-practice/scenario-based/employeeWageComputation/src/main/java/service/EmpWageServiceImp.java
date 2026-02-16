package service;

import repository.CompanyEmpWageRepository;
import util.AttendanceUtil;
import model.CompanyEmpWage;
import model.DailyWage;

public class EmpWageServiceImp implements CompanyEmpWageService{
	
	public static final int FULL_TIME = 1;
	public static final int PART_TIME = 2;
	public static final int FULL_TIME_HOURS = 8;
	public static final int PART_TIME_HOURS = 4;
	
	private CompanyEmpWageRepository repository = new CompanyEmpWageRepository();

	@Override
	public void addComapny(String companyName, int ratePerHour, int days, int maxHours) {
		repository.addCompany(new CompanyEmpWage(companyName, ratePerHour, days, maxHours));
	}

	@Override
	public void computeEmployesWage() {
		for(CompanyEmpWage company : repository.getCompanies()) {
			int totalHours = 0;
			int totalDays = 0;
			int totalWage = 0;
			
			while(totalHours < company.maxHoursPerMonth && totalDays < company.numOfWorkingDays) {
				totalDays++;
				int empHrs = 0;
				int attendance = AttendanceUtil.getAttendance();
				
				switch(attendance) {
				case FULL_TIME -> empHrs = FULL_TIME_HOURS;
				case PART_TIME -> empHrs = PART_TIME_HOURS;
				default -> empHrs = 0;
				}
				
				totalHours += empHrs;
				int dailyWage = empHrs * company.empRatePerHour;
				totalWage += dailyWage;
				
				company.dailyWages.add(new DailyWage(totalDays, dailyWage));
				
			}
			company.setTotalWage(totalWage);
		}	
	}

	@Override
	public int getTotalWageByCompany(String companyName) {
		CompanyEmpWage company = repository.getCompanyByName(companyName);
		if(company != null) {
			return company.totalWage;
		}
		return 0;
	}

}
