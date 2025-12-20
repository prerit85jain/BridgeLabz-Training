package level02;
import java.util.*;
public class FactorUsingWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i=1;
		while(i<number/2) {
			if(number%i==0) {
				System.out.print(i+", ");
			}
			i++;
		}
		System.out.println(number/2);
		sc.close();
	}
}
