package level03;

import java.util.Random;
import java.util.Scanner;

public class MatrixManipulationOperations {

	public static int[][] generateMatrix(int row, int col){
		Random rand = new Random();
		int[][] matrix = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				matrix[i][j] = rand.nextInt(9)+1;
			}
		}
		return matrix;
	}
	
	public static void addition(int[][] matrix1, int[][]matrix2){
		int[][] matrix = new int[matrix1.length][matrix1[0].length];
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix1[i].length; j++) {
				matrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("Matrix after addition");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void subtraction(int[][] matrix1, int[][]matrix2){
		int[][] matrix = new int[matrix1.length][matrix1[0].length];
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix1[i].length; j++) {
				matrix[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		System.out.println("Matrix after subtraction");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void multiplication(int[][] matrix1, int[][] matrix2) {
        int rowsA = matrix1.length;
        int colsA = matrix1[0].length;
        int rowsB = matrix2.length;
        int colsB = matrix2[0].length;

        // Check if matrices are compatible for multiplication
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrices are not compatible for multiplication");
        }

        int[][] matrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Matrix after multiplication");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows in matrix: ");
		int row = sc.nextInt();
		System.out.print("Enter number of columns in matrix: ");
		int col = sc.nextInt();
		
		int[][] matrix1 = generateMatrix(row, col);
		int[][] matrix2 = generateMatrix(row, col);
		
		System.out.println("Matrix 1: ");
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix1[0].length; j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix 2: ");
		for(int i=0; i<matrix2.length; i++) {
			for(int j=0; j<matrix2[0].length; j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
		addition(matrix1, matrix2);
		subtraction(matrix1, matrix2);
		multiplication(matrix1, matrix2);
		
		sc.close();
	}

}
