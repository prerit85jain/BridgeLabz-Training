package level02;
import java.util.*;
public class GreatestFactorUsingWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int greatest = 1;
		int i=number-1;
		while(i>=1){
			if(number%i==0 && i>greatest) {
				greatest = i;
			}
			i--;
		}
		System.out.println(greatest);
		sc.close();
	}
}
