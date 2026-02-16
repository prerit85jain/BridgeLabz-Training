package service;

public interface CompanyEmpWageService {

	void addComapny(String companyName, int ratePerHour, int days, int maxHours);
	void computeEmployesWage();
	int getTotalWageByCompany(String companyName);
}
