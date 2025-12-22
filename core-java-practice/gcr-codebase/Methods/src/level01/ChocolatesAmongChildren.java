package level01;

import java.util.Scanner;

public class ChocolatesAmongChildren {

	public static int[] distribution(int chocolates, int children) {
		return new int[] {chocolates/children, chocolates%children};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chocolates = sc.nextInt();
		int childrens = sc.nextInt();
		
		int[] result = distribution(chocolates, childrens);
		System.out.println("Chocolates each child has "+result[0]+" and the remaining are "+result[1]);
		sc.close();
	}

}
