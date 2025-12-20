package level02;
import java.util.*;
public class GreatestFactorUsingFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int greatest = 1;
		for(int i=number-1; i>=1; i--) {
			if(number%i==0 && i>greatest) {
				greatest = i;
			}
		}
		System.out.println(greatest);
		sc.close();
	}
}
