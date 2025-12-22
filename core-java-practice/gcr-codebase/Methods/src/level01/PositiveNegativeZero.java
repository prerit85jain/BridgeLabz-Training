package level01;

import java.util.Scanner;

public class PositiveNegativeZero {
	
	public static int check(int number) {
		if(number==0) {
			return 0;
		}else if(number>0) {
			return 1;
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println(check(number));
		sc.close();
	}

}
