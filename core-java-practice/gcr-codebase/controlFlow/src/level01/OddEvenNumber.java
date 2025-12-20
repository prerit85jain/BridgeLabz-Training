package level01;
import java.util.*;
public class OddEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number>0) {
			for(int i=1; i<=number; i++) {
				if(i%2==0) {
					System.out.println("Even");
				}else {
					System.out.println("Odd");
				}
			}
		}else {
			System.out.println("Wrong Input!");
		}
		sc.close();
	}
}
