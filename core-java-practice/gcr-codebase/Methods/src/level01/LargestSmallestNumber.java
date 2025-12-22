package level01;

import java.util.Scanner;
public class LargestSmallestNumber {
	
	public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
		int largest = 0;
		int smallest = 0;
		if(number1>number2 && number1>number3) {
			largest = number1;
		}else if(number2>number1 && number2>number3) {
			largest = number2;			
		}else {
			largest = number3;			
		}
		if(number1<number2 && number1<number3) {
			smallest = number1;
		}else if(number2<number1 && number2<number3) {
			smallest = number2;			
		}else {
			smallest = number3;			
		}
		return new int[] {largest, smallest};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
			
		int[] result = findSmallestAndLargest(num1, num2, num3);
		System.out.println("Largest number is "+result[0]+" Smallest number is "+result[1]);
		sc.close();
	}

}
