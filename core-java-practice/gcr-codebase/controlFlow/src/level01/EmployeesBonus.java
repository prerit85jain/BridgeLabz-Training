package level01;
import java.util.*;
public class EmployeesBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		double year = sc.nextDouble();
		
		if(year>5) {
			System.out.println(5*salary/100);
		}
		sc.close();
	}
}
