package level01;
import java.util.Scanner;

public class ArrayFrom2DTo1D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] array2d = new int[row][col];
		int[] array1d = new int[row*col];
		int index = 0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				array2d[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				array1d[index] = array2d[i][j];
				index++;
			}
		}
		for(int i=0; i<index; i++) {
			System.out.print(array1d[i]+" ");
		}
		sc.close();
	}
}
