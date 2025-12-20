package level02;
import java.util.*;
public class MultipleBelow100UsingFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>0 && number<100) {
        	for (int i = 100; i >=1; i--) {
        		if (i % number == 0) {
        			System.out.println(i + " is a multiple of " + number);
        		}
            }
        }
        scanner.close();
	}
}
