package com.prerit.employeeWage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import service.EmpWageServiceImp;

public class EmployeeWageTest {
	
	@Test
	public void givenCompany_totalWages() {
		EmpWageServiceImp service = new EmpWageServiceImp();
		
		service.addComapny("Amazon", 20, 25, 110);
		
		service.computeEmployesWage();
		
		int totalWage = service.getTotalWageByCompany("Amazon");
		
		assertTrue(totalWage>0);
	}
	
	@Test
	public void givenInvalidCompany() {
		EmpWageServiceImp service = new EmpWageServiceImp();
		
		service.addComapny("Google", 30, 20, 100);
		
		service.computeEmployesWage();
		
		int totalWage = service.getTotalWageByCompany("Amazon");
		
		assertEquals(0, totalWage);
	}

}
