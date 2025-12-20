package level01;
import java.util.*;
public class FactorialOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial = 1;
		
		if(number > 0) {
			while(number>1) {
				factorial *= number;
				number--;
			}
			System.out.println("Factorial of "+number+" is "+factorial);			
		}else {
			System.out.println("Wrong Input!");
		}
		
		sc.close();
	}

}
