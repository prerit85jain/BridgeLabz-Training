package level01;
import java.util.Scanner;

public class MeanHeightOfFootballTeam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height[] = new double[11];
		double total = 0;
		for(int i=0; i<height.length; i++) {
			height[i] = sc.nextDouble();
			total += height[i]; 
		}
		System.out.println("Mean height of football team is "+(total/11));
		sc.close();
	}
}
