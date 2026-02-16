package repository;

import java.util.ArrayList;
import java.util.List;

import model.CompanyEmpWage;

public class CompanyEmpWageRepository {
	
	private List<CompanyEmpWage> companyList = new ArrayList<>();
	
	public void addCompany(CompanyEmpWage company) {
		companyList.add(company);
	}
	
	public List<CompanyEmpWage> getCompanies(){
		return companyList;
	}
	
	public CompanyEmpWage getCompanyByName(String name) {
		for(CompanyEmpWage company : companyList) {
			if(company.companyName.equalsIgnoreCase(name)) {
				return company;
			}
		}
		return null;
	}

}
