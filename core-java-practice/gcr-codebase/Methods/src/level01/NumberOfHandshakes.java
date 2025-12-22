package level01;

import java.util.Scanner;

public class NumberOfHandshakes {
	
	int handshakes(int students) {
		return (students*(students-1))/2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		NumberOfHandshakes hands = new NumberOfHandshakes();
		int totalHandshakes = hands.handshakes(students);
		System.out.println("Total number of handshakes are "+totalHandshakes);
		sc.close();
	}

}
