package advanceProblems;

import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class ConvertCSVToObject {

	public static void main(String[] args) throws Exception {
		String fileName = "employee.csv";
		try{
			FileReader reader = new FileReader(fileName);
		
			CsvToBean<Employee> csvToBean = new CsvToBeanBuilder<Employee>(reader).withType(Employee.class).withIgnoreLeadingWhiteSpace(true).build();
		
			List<Employee> employees = csvToBean.parse();
		
			for(Employee emp : employees) {
				System.out.println(emp.getName() + ", " + emp.getDepartment());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
