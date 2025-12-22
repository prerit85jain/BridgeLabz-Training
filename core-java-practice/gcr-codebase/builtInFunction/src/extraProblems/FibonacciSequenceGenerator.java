package extraProblems;

import java.util.Scanner;

public class FibonacciSequenceGenerator {
	
	public static int[] generateSequence(int number) {
		int[] sequence = new int[number];
		sequence[0] = 0;
		sequence[1] = 1;		
		for(int i=1; i<number-1; i++) {
			int next = sequence[i]+sequence[i-1];
			sequence[i+1] = next;
		}
		return sequence;
	}
	
	public static void displayResult(int[] sequence) {
		System.out.println("Sequence is: ");
		for(int i=0; i<sequence.length; i++) {
			System.out.print(sequence[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for fibonacci series: ");
		int number = sc.nextInt();
		displayResult(generateSequence(number));
		sc.close();
	}

}
