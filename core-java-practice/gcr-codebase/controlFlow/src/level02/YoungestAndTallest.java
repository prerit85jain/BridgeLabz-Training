package level02;
import java.util.*;
public class YoungestAndTallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Friend1Age = sc.nextInt();
		int Friend1Height = sc.nextInt();
		int Friend2Age = sc.nextInt();
		int Friend2Height = sc.nextInt();
		int Friend3Age = sc.nextInt();
		int Friend3Height = sc.nextInt();
		
		if(Friend1Age < Friend2Age && Friend1Age<Friend3Age) {
			System.out.println("Friend 1 is youngest");
		}else if(Friend2Age < Friend1Age && Friend2Age<Friend3Age) {
			System.out.println("Friend 2 is youngest");
		}else {
			System.out.println("Friend 3 is youngest");
		}
		if(Friend1Height > Friend2Height && Friend1Height > Friend3Height) {
			System.out.println("Friend 1 is tallest");
		}else if(Friend2Height > Friend1Height && Friend2Height > Friend3Height) {
			System.out.println("Friend 2 is tallest");
		}else {
			System.out.println("Friend 3 is tallest");			
		}
		sc.close();
	}

}
