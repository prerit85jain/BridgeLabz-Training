package level01;
import java.util.Scanner;

public class OddEvenArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int evenArray[] = new int[number/2 + 1];
		int oddArray[] = new int[(number/2) + 1];
		int evenIndex = 0;
		int oddIndex = 0;
		for(int i=1; i<=number; i++) {
			if(i%2==0) {
				evenArray[evenIndex] = i;
				evenIndex++;
			}else {
				oddArray[oddIndex] = i;
				oddIndex++;
			}
		}
		for(int i=0; i<evenArray.length; i++) {
			System.out.print(evenArray[i]+" ");
		}
		System.out.println();
		for(int i=0; i<oddArray.length; i++) {
			System.out.print(oddArray[i]+" ");
		}
		sc.close();
	}
}
