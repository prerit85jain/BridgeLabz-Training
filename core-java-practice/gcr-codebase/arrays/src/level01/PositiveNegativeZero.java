package level01;
import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[5];
		for(int i=0; i<5; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			int num = numbers[i];
			if(num>0) {
				System.out.println(num+" is Positive.");
				if(num%2 == 0) {
					System.out.println(num+" is Even.");					
				}else {
					System.out.println(num+" is Odd.");
				}
			}else if(num<0) {
				System.out.println(num+" is Negative.");
			}else {
				System.out.println(num+" is Zero.");
			}
		}
		if(numbers[0]==numbers[4]) {
			System.out.println("First and Last element of array are EQUAL.");
		}else if(numbers[0]>numbers[4]) {
			System.out.println("First element is GREATER than Last element of array.");
		}else {
			System.out.println("First element is SMALLER than Last element of array.");			
		}
		sc.close();
	}
}
