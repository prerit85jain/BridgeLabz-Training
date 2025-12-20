package level01;
import java.util.Scanner;

public class TableFrom6To9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int table[] = new int[10];
		if(number>=6 && number<=9) {
			for(int i=0; i<table.length; i++) {
				table[i] = number*(i+1);
			}
			for(int i=0; i<table.length; i++) {
				System.out.println(number + " * "+(i+1)+" = "+table[i]);
			}
		}else {
			System.out.println("Incorrect Input!");
		}
		
		sc.close();
	}
}
