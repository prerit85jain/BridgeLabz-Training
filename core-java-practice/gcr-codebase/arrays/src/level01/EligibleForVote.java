package level01;
import java.util.Scanner;

public class EligibleForVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int student[] = new int[10];
		for(int i=0; i<student.length; i++) {
			student[i] = sc.nextInt();
		}
		
		for(int i=0; i<student.length; i++) {
			int age = student[i];
			if(age>=18) {
				System.out.println("The student with the age "+age+" can vote.");
			}else {
				System.out.println("The student with the age "+age+" can vote.");
			}
		}
		sc.close();
	}
}
