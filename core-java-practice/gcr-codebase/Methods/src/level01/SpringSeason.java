package level01;
import java.util.Scanner;
public class SpringSeason {

	public static boolean isSpring(String month, int date) {
		if(month.equals("April") || month.equals("May")) {
			return true;
		}else if((month.equals("March") && date>19) || (month.equals("June") && date<21)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		int date = sc.nextInt();
		if(isSpring(month, date)) {
			System.out.println("Its a Spring Season");
		}else {
			System.out.println("Not a Spring Season");
		}
		
		sc.close();
	}

}
