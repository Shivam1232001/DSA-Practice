package MathAndGeometry;

import java.util.Arrays;

public class TransposeMatrix {
    public int[][] transpose(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] result = new int[m][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[j][i] = mat[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        TransposeMatrix sol = new TransposeMatrix();

        // Test 1: Square matrix
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Original Matrix:");
        printMatrix(mat1);
        System.out.println("Transposed Matrix:");
        printMatrix(sol.transpose(mat1));

        // Test 2: Rectangular matrix
        int[][] mat2 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("Original Matrix:");
        printMatrix(mat2);
        System.out.println("Transposed Matrix:");
        printMatrix(sol.transpose(mat2));
    }
}
