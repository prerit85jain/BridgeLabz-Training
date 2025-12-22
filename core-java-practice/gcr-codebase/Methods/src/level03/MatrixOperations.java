package level03;
import java.util.*;
public class MatrixOperations{
	public static void main(String[] args) {
        int rows = 2;
        int cols = 2;
        double[][] matrix2x2 = generateMatrix(rows, cols);
        
        System.out.println("Original 2x2 Matrix:");
        displayMatrix(matrix2x2);
        
        System.out.println("Transpose:");
        displayMatrix(transpose(matrix2x2));
        
        System.out.println("Determinant:");
        System.out.println(determinant2x2(matrix2x2));
        
        System.out.println("Inverse:");
        double[][] inv2x2 = inverse2x2(matrix2x2);
        if (inv2x2 != null) {
            displayMatrix(inv2x2);
        } else {
            System.out.println("Matrix is singular, no inverse exists.");
        }

        // Create a 3x3 random matrix
        rows = 3;
        cols = 3;
        double[][] matrix3x3 = generateMatrix(rows, cols);
        
        System.out.println("Original 3x3 Matrix:");
        displayMatrix(matrix3x3);
        
        System.out.println("Transpose:");
        displayMatrix(transpose(matrix3x3));
        
        System.out.println("Determinant:");
        System.out.println(determinant3x3(matrix3x3));
        
        System.out.println("Inverse:");
        double[][] inv3x3 = inverse3x3(matrix3x3);
        if (inv3x3 != null) {
            displayMatrix(inv3x3);
        } else {
            System.out.println("Matrix is singular, no inverse exists.");
        }
    }

    // Method to create a random matrix with given rows and columns
    public static double[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextDouble() * 10; // Random double between 0 and 10
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.3f ", val);
            }
            System.out.println();
        }
    }

    // Method to find the transpose of a matrix
    public static double[][] transpose(double[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        double[][] transposed = new double[colCount][rowCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    // Method to find the determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Not a 2x2 matrix");
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Not a 3x3 matrix");
        }
        double det;
        det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])+ matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return det;
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) {
            return null; // Singular matrix
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) {
            return null; // Singular matrix
        }

        double[][] cofactors = new double[3][3];

        cofactors[0][0] =  (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
        cofactors[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        cofactors[0][2] =  (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);

        cofactors[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        cofactors[1][1] =  (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]);
        cofactors[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);

        cofactors[2][0] =  (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]);
        cofactors[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        cofactors[2][2] =  (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);

        // Transpose of cofactor matrix (adjugate)
        double[][] adjugate = transpose(cofactors);

        // Divide each element by determinant
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjugate[i][j] / det;
            }
        }

        return inverse;
    }
}