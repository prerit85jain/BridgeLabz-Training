package level02;
import java.util.*;
public class FactorUsingFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i=1; i<number/2; i++) {
			if(number%i==0) {
				System.out.print(i+", ");
			}
		}
		System.out.println(number/2);
		sc.close();
	}
}
