package level01;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numbers[] = new double[10];
		double total = 0;
		int i=0;
		while(i<10) {
			double num = sc.nextDouble();
			if(num<=0 || i>=10) {
				break;
			}else {
				numbers[i] = num;
			}
			i++;
		}
		
		for(int j=0; j<numbers.length; j++) {
			System.out.println(numbers[j]);
			total += numbers[j];
		}
		System.out.println("Total is "+total);
		sc.close();
	}

}
